/**
 */
package ecoreDiffMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecoreDiffMM.EcoreDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/2002/EcoreDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreDiffMMPackage eINSTANCE = ecoreDiffMM.impl.EcoreDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EModelElementImpl <em>EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EModelElementImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEModelElement()
	 * @generated
	 */
	int EMODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__EANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__DIFFE_ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT___GET_EANNOTATION__STRING = 0;

	/**
	 * The number of operations of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.ENamedElementImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getENamedElement()
	 * @generated
	 */
	int ENAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__DIFFE_ANNOTATIONS = EMODEL_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__NAME = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT___GET_EANNOTATION__STRING = EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_OPERATION_COUNT = EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.ETypedElementImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getETypedElement()
	 * @generated
	 */
	int ETYPED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__DIFFE_ANNOTATIONS = ENAMED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ORDERED = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UNIQUE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__LOWER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UPPER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__MANY = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__REQUIRED = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ETYPE = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EGENERIC_TYPE = ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__DIFFE_TYPE = ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__DIFFE_GENERIC_TYPE = ENAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EStructuralFeatureImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEStructuralFeature()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DIFFE_ANNOTATIONS = ETYPED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DIFFE_TYPE = ETYPED_ELEMENT__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DIFFE_GENERIC_TYPE = ETYPED_ELEMENT__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__CHANGEABLE = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__VOLATILE = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__TRANSIENT = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNSETTABLE = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DERIVED = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING = ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE___GET_FEATURE_ID = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS = ETYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EAttributeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DIFFE_ANNOTATIONS = ESTRUCTURAL_FEATURE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__MANY = ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DIFFE_TYPE = ESTRUCTURAL_FEATURE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DIFFE_GENERIC_TYPE = ESTRUCTURAL_FEATURE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DIFFE_CONTAINING_CLASS = ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ID = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EATTRIBUTE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diffe Attribute Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE___GET_EANNOTATION__STRING = ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE___GET_FEATURE_ID = ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE___GET_CONTAINER_CLASS = ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EAnnotationImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEAnnotation()
	 * @generated
	 */
	int EANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DIFFE_ANNOTATIONS = EMODEL_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__SOURCE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EMODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__CONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__REFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diffdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DIFFDETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diffe Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DIFFE_MODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffcontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DIFFCONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffreferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DIFFREFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION___GET_EANNOTATION__STRING = EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_OPERATION_COUNT = EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EClassifierImpl <em>EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EClassifierImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEClassifier()
	 * @generated
	 */
	int ECLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__DIFFE_ANNOTATIONS = ENAMED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__DEFAULT_VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_TYPE_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EPACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__ETYPE_PARAMETERS = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__DIFFE_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__DIFFE_TYPE_PARAMETERS = ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER___IS_INSTANCE__OBJECT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER___GET_CLASSIFIER_ID = ENAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EClassImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ANNOTATIONS = ECLASSIFIER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_PACKAGE = ECLASSIFIER__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_TYPE_PARAMETERS = ECLASSIFIER__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ABSTRACT = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INTERFACE = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EOPERATIONS = ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_ATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_REFERENCES = ECLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EREFERENCES = ECLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_CONTAINMENTS = ECLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_OPERATIONS = ECLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_STRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EID_ATTRIBUTE = ECLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESTRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EGENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_GENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Diffe Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Diffe Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_OPERATIONS = ECLASSIFIER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Diffe All Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_ATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Diffe All References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_REFERENCES = ECLASSIFIER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Diffe References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_REFERENCES = ECLASSIFIER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Diffe Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Diffe All Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_CONTAINMENTS = ECLASSIFIER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Diffe All Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_OPERATIONS = ECLASSIFIER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Diffe All Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Diffe All Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Diffe ID Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ID_ATTRIBUTE = ECLASSIFIER_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Diffe Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_STRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Diffe Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_GENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Diffe All Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 30;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_EANNOTATION__STRING = ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___IS_INSTANCE__OBJECT = ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_CLASSIFIER_ID = ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___IS_SUPER_TYPE_OF__ECLASS = ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_FEATURE_COUNT = ECLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_ESTRUCTURAL_FEATURE__INT = ECLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE = ECLASSIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = ECLASSIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_EOPERATION__INT = ECLASSIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_OPERATION_ID__EOPERATION = ECLASSIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_OVERRIDE__EOPERATION = ECLASSIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = ECLASSIFIER_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EDataTypeImpl <em>EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EDataTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__DIFFE_ANNOTATIONS = ECLASSIFIER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__DIFFE_PACKAGE = ECLASSIFIER__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__DIFFE_TYPE_PARAMETERS = ECLASSIFIER__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__SERIALIZABLE = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE___GET_EANNOTATION__STRING = ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE___IS_INSTANCE__OBJECT = ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE___GET_CLASSIFIER_ID = ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EEnumImpl <em>EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EEnumImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEEnum()
	 * @generated
	 */
	int EENUM = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EANNOTATIONS = EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DIFFE_ANNOTATIONS = EDATA_TYPE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__NAME = EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS_NAME = EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS = EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DEFAULT_VALUE = EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_TYPE_NAME = EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EPACKAGE = EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ETYPE_PARAMETERS = EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DIFFE_PACKAGE = EDATA_TYPE__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DIFFE_TYPE_PARAMETERS = EDATA_TYPE__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__SERIALIZABLE = EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ELITERALS = EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffe Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DIFFE_LITERALS = EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EANNOTATION__STRING = EDATA_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___IS_INSTANCE__OBJECT = EDATA_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_CLASSIFIER_ID = EDATA_TYPE___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EENUM_LITERAL__STRING = EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EENUM_LITERAL__INT = EDATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = EDATA_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EEnumLiteralImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEEnumLiteral()
	 * @generated
	 */
	int EENUM_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__DIFFE_ANNOTATIONS = ENAMED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__LITERAL = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EENUM = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diffe Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__DIFFE_ENUM = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EFactoryImpl <em>EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EFactoryImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEFactory()
	 * @generated
	 */
	int EFACTORY = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__DIFFE_ANNOTATIONS = EMODEL_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EPACKAGE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__DIFFE_PACKAGE = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___GET_EANNOTATION__STRING = EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___CREATE__ECLASS = EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING = EMODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Convert To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT = EMODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_OPERATION_COUNT = EMODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EObjectImpl <em>EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EObjectImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 10;

	/**
	 * The number of structural features of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ECLASS = 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EIS_PROXY = 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ERESOURCE = 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ECONTAINER = 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ECONTAINING_FEATURE = 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ECONTAINMENT_FEATURE = 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ECONTENTS = 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EALL_CONTENTS = 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ECROSS_REFERENCES = 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EGET__ESTRUCTURALFEATURE = 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT = 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EIS_SET__ESTRUCTURALFEATURE = 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EUNSET__ESTRUCTURALFEATURE = 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EINVOKE__EOPERATION_ELIST = 14;

	/**
	 * The number of operations of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_OPERATION_COUNT = 15;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EOperationImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_ANNOTATIONS = ETYPED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_TYPE = ETYPED_ELEMENT__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_GENERIC_TYPE = ETYPED_ELEMENT__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE_PARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EPARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EEXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_EXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_CONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_TYPE_PARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffe Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_PARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffe Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_EXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Diffe Generic Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__DIFFE_GENERIC_EXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION___GET_EANNOTATION__STRING = ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION___GET_OPERATION_ID = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Override Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION___IS_OVERRIDE_OF__EOPERATION = ETYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EPackageImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFE_ANNOTATIONS = ENAMED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_URI = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_PREFIX = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EFACTORY_INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUBPACKAGES = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUPER_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DOMAINSPECIFICDIFFS = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffe Factory Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFE_FACTORY_INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffe Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFE_CLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Diffe Subpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFE_SUBPACKAGES = ENAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Diffe Super Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFE_SUPER_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFDOMAINSPECIFICDIFFS = ENAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE___GET_ECLASSIFIER__STRING = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EParameterImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEParameter()
	 * @generated
	 */
	int EPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__DIFFE_ANNOTATIONS = ETYPED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__DIFFE_TYPE = ETYPED_ELEMENT__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__DIFFE_GENERIC_TYPE = ETYPED_ELEMENT__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EOPERATION = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffe Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__DIFFE_OPERATION = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER___GET_EANNOTATION__STRING = ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EReferenceImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_ANNOTATIONS = ESTRUCTURAL_FEATURE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__MANY = ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_TYPE = ESTRUCTURAL_FEATURE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_GENERIC_TYPE = ESTRUCTURAL_FEATURE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_CONTAINING_CLASS = ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINMENT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINER = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__RESOLVE_PROXIES = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EOPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EREFERENCE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EKEYS = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diffe Opposite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_OPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffe Reference Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_REFERENCE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffe Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DIFFE_KEYS = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE___GET_EANNOTATION__STRING = ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE___GET_FEATURE_ID = ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE___GET_CONTAINER_CLASS = ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_OPERATION_COUNT = ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EStringToStringMapEntryImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEStringToStringMapEntry()
	 * @generated
	 */
	int ESTRING_TO_STRING_MAP_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EGenericTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEGenericType()
	 * @generated
	 */
	int EGENERIC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__EUPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ERAW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ELOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ECLASSIFIER = 5;

	/**
	 * The feature id for the '<em><b>Diffe Upper Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__DIFFE_UPPER_BOUND = 6;

	/**
	 * The feature id for the '<em><b>Diffe Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS = 7;

	/**
	 * The feature id for the '<em><b>Diffe Raw Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__DIFFE_RAW_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Diffe Lower Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__DIFFE_LOWER_BOUND = 9;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__DIFFE_TYPE_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Diffe Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__DIFFE_CLASSIFIER = 11;

	/**
	 * The number of structural features of the '<em>EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE___IS_INSTANCE__OBJECT = 0;

	/**
	 * The number of operations of the '<em>EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.ETypeParameterImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getETypeParameter()
	 * @generated
	 */
	int ETYPE_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__DIFFE_ANNOTATIONS = ENAMED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EBOUNDS = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffe Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__DIFFE_BOUNDS = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DomainSpecificDiffImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDomainSpecificDiff()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_DIFF = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EClassifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EData Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EEnum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM = 6;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EEnum Literal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EFactory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY = 8;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EModel Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff ENamed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EObject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT = 11;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EParameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EStructural Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff ETyped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EGeneric Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EType Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER = 18;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAttributeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAttribute()
	 * @generated
	 */
	int DIFF_EATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__EANNOTATIONS = EATTRIBUTE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFFE_ANNOTATIONS = EATTRIBUTE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NAME = EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ORDERED = EATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__UNIQUE = EATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__LOWER_BOUND = EATTRIBUTE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__UPPER_BOUND = EATTRIBUTE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__MANY = EATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__REQUIRED = EATTRIBUTE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ETYPE = EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__EGENERIC_TYPE = EATTRIBUTE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFFE_TYPE = EATTRIBUTE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFFE_GENERIC_TYPE = EATTRIBUTE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__CHANGEABLE = EATTRIBUTE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__VOLATILE = EATTRIBUTE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__TRANSIENT = EATTRIBUTE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DEFAULT_VALUE_LITERAL = EATTRIBUTE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DEFAULT_VALUE = EATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__UNSETTABLE = EATTRIBUTE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DERIVED = EATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ECONTAINING_CLASS = EATTRIBUTE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFFE_CONTAINING_CLASS = EATTRIBUTE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ID = EATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__EATTRIBUTE_TYPE = EATTRIBUTE__EATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Attribute Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE = EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__OPERATION = EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_NAME = EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_ORDERED = EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_UNIQUE = EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_LOWER_BOUND = EATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_UPPER_BOUND = EATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_MANY = EATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_REQUIRED = EATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_CHANGEABLE = EATTRIBUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_VOLATILE = EATTRIBUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_TRANSIENT = EATTRIBUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_DEFAULT_VALUE_LITERAL = EATTRIBUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_DEFAULT_VALUE = EATTRIBUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_UNSETTABLE = EATTRIBUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>New derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_DERIVED = EATTRIBUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New iD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_ID = EATTRIBUTE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_FEATURE_COUNT = EATTRIBUTE_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE___GET_EANNOTATION__STRING = EATTRIBUTE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE___GET_FEATURE_ID = EATTRIBUTE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE___GET_CONTAINER_CLASS = EATTRIBUTE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_OPERATION_COUNT = EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAttribute_eAttributeTypeImpl <em>Diff EAttribute eAttribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAttribute_eAttributeTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAttribute_eAttributeType()
	 * @generated
	 */
	int DIFF_EATTRIBUTE_EATTRIBUTE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EAttribute eAttribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EAttribute eAttribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAnnotationImpl <em>Diff EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAnnotationImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAnnotation()
	 * @generated
	 */
	int DIFF_EANNOTATION = 23;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__EANNOTATIONS = EANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__DIFFE_ANNOTATIONS = EANNOTATION__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__SOURCE = EANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__DETAILS = EANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__EMODEL_ELEMENT = EANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__CONTENTS = EANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__REFERENCES = EANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__DIFFDETAILS = EANNOTATION__DIFFDETAILS;

	/**
	 * The feature id for the '<em><b>Diffe Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__DIFFE_MODEL_ELEMENT = EANNOTATION__DIFFE_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Diffcontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__DIFFCONTENTS = EANNOTATION__DIFFCONTENTS;

	/**
	 * The feature id for the '<em><b>Diffreferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__DIFFREFERENCES = EANNOTATION__DIFFREFERENCES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__OPERATION = EANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION__NEW_SOURCE = EANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_FEATURE_COUNT = EANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION___GET_EANNOTATION__STRING = EANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Diff EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_OPERATION_COUNT = EANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAnnotation_detailsImpl <em>Diff EAnnotation details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAnnotation_detailsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAnnotation_details()
	 * @generated
	 */
	int DIFF_EANNOTATION_DETAILS = 24;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_DETAILS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_DETAILS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EAnnotation details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_DETAILS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EAnnotation details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAnnotation_eModelElementImpl <em>Diff EAnnotation eModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAnnotation_eModelElementImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAnnotation_eModelElement()
	 * @generated
	 */
	int DIFF_EANNOTATION_EMODEL_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_EMODEL_ELEMENT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_EMODEL_ELEMENT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EAnnotation eModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_EMODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EAnnotation eModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_EMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAnnotation_contentsImpl <em>Diff EAnnotation contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAnnotation_contentsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAnnotation_contents()
	 * @generated
	 */
	int DIFF_EANNOTATION_CONTENTS = 26;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_CONTENTS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_CONTENTS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EAnnotation contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_CONTENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EAnnotation contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_CONTENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEAnnotation_referencesImpl <em>Diff EAnnotation references</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEAnnotation_referencesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEAnnotation_references()
	 * @generated
	 */
	int DIFF_EANNOTATION_REFERENCES = 27;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_REFERENCES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_REFERENCES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EAnnotation references</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EAnnotation references</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EANNOTATION_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClassImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass()
	 * @generated
	 */
	int DIFF_ECLASS = 28;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EANNOTATIONS = ECLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ANNOTATIONS = ECLASS__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__INSTANCE_CLASS_NAME = ECLASS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__INSTANCE_CLASS = ECLASS__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DEFAULT_VALUE = ECLASS__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__INSTANCE_TYPE_NAME = ECLASS__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EPACKAGE = ECLASS__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__ETYPE_PARAMETERS = ECLASS__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_PACKAGE = ECLASS__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_TYPE_PARAMETERS = ECLASS__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__ABSTRACT = ECLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__INTERFACE = ECLASS__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__ESUPER_TYPES = ECLASS__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EOPERATIONS = ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_ATTRIBUTES = ECLASS__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_REFERENCES = ECLASS__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EREFERENCES = ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EATTRIBUTES = ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_CONTAINMENTS = ECLASS__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_OPERATIONS = ECLASS__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_STRUCTURAL_FEATURES = ECLASS__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_SUPER_TYPES = ECLASS__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EID_ATTRIBUTE = ECLASS__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__ESTRUCTURAL_FEATURES = ECLASS__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EGENERIC_SUPER_TYPES = ECLASS__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EALL_GENERIC_SUPER_TYPES = ECLASS__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_SUPER_TYPES = ECLASS__DIFFE_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_OPERATIONS = ECLASS__DIFFE_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffe All Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_ATTRIBUTES = ECLASS__DIFFE_ALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffe All References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_REFERENCES = ECLASS__DIFFE_ALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffe References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_REFERENCES = ECLASS__DIFFE_REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffe Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ATTRIBUTES = ECLASS__DIFFE_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffe All Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_CONTAINMENTS = ECLASS__DIFFE_ALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>Diffe All Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_OPERATIONS = ECLASS__DIFFE_ALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffe All Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES = ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Diffe All Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_SUPER_TYPES = ECLASS__DIFFE_ALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe ID Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ID_ATTRIBUTE = ECLASS__DIFFE_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Diffe Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_STRUCTURAL_FEATURES = ECLASS__DIFFE_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Diffe Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_GENERIC_SUPER_TYPES = ECLASS__DIFFE_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe All Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES = ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__OPERATION = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_NAME = ECLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_INSTANCE_CLASS_NAME = ECLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_INSTANCE_CLASS = ECLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_DEFAULT_VALUE = ECLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_INSTANCE_TYPE_NAME = ECLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_ABSTRACT = ECLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_INTERFACE = ECLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_EANNOTATION__STRING = ECLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___IS_INSTANCE__OBJECT = ECLASS___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_CLASSIFIER_ID = ECLASS___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___IS_SUPER_TYPE_OF__ECLASS = ECLASS___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_FEATURE_COUNT = ECLASS___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_ESTRUCTURAL_FEATURE__INT = ECLASS___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE = ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = ECLASS___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_OPERATION_COUNT = ECLASS___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_EOPERATION__INT = ECLASS___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_OPERATION_ID__EOPERATION = ECLASS___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_OVERRIDE__EOPERATION = ECLASS___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eSuperTypesImpl <em>Diff EClass eSuper Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eSuperTypesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eSuperTypes()
	 * @generated
	 */
	int DIFF_ECLASS_ESUPER_TYPES = 29;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPER_TYPES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPER_TYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eSuper Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPER_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eSuper Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPER_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eOperationsImpl <em>Diff EClass eOperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eOperationsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eOperations()
	 * @generated
	 */
	int DIFF_ECLASS_EOPERATIONS = 30;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eOperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eOperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllAttributesImpl <em>Diff EClass eAll Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllAttributesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllAttributes()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_ATTRIBUTES = 31;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_ATTRIBUTES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_ATTRIBUTES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllReferencesImpl <em>Diff EClass eAll References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllReferencesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllReferences()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_REFERENCES = 32;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_REFERENCES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_REFERENCES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eReferencesImpl <em>Diff EClass eReferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eReferencesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eReferences()
	 * @generated
	 */
	int DIFF_ECLASS_EREFERENCES = 33;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eReferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eReferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAttributesImpl <em>Diff EClass eAttributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAttributesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAttributes()
	 * @generated
	 */
	int DIFF_ECLASS_EATTRIBUTES = 34;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAttributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAttributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllContainmentsImpl <em>Diff EClass eAll Containments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllContainmentsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllContainments()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_CONTAINMENTS = 35;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_CONTAINMENTS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_CONTAINMENTS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll Containments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_CONTAINMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll Containments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_CONTAINMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllOperationsImpl <em>Diff EClass eAll Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllOperationsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllOperations()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_OPERATIONS = 36;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_OPERATIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_OPERATIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_OPERATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllStructuralFeaturesImpl <em>Diff EClass eAll Structural Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllStructuralFeaturesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllStructuralFeatures()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_STRUCTURAL_FEATURES = 37;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll Structural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll Structural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllSuperTypesImpl <em>Diff EClass eAll Super Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllSuperTypesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllSuperTypes()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_SUPER_TYPES = 38;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_SUPER_TYPES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_SUPER_TYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_SUPER_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_SUPER_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eIDAttributeImpl <em>Diff EClass eID Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eIDAttributeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eIDAttribute()
	 * @generated
	 */
	int DIFF_ECLASS_EID_ATTRIBUTE = 39;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EID_ATTRIBUTE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EID_ATTRIBUTE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eID Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EID_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eID Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EID_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eStructuralFeaturesImpl <em>Diff EClass eStructural Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eStructuralFeaturesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eStructuralFeatures()
	 * @generated
	 */
	int DIFF_ECLASS_ESTRUCTURAL_FEATURES = 40;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESTRUCTURAL_FEATURES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESTRUCTURAL_FEATURES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eStructural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESTRUCTURAL_FEATURES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eStructural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESTRUCTURAL_FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eGenericSuperTypesImpl <em>Diff EClass eGeneric Super Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eGenericSuperTypesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eGenericSuperTypes()
	 * @generated
	 */
	int DIFF_ECLASS_EGENERIC_SUPER_TYPES = 41;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EGENERIC_SUPER_TYPES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EGENERIC_SUPER_TYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eGeneric Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EGENERIC_SUPER_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eGeneric Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EGENERIC_SUPER_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClass_eAllGenericSuperTypesImpl <em>Diff EClass eAll Generic Super Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClass_eAllGenericSuperTypesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClass_eAllGenericSuperTypes()
	 * @generated
	 */
	int DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES = 42;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eAll Generic Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eAll Generic Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClassifier_ePackageImpl <em>Diff EClassifier ePackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClassifier_ePackageImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClassifier_ePackage()
	 * @generated
	 */
	int DIFF_ECLASSIFIER_EPACKAGE = 43;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_EPACKAGE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_EPACKAGE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClassifier ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_EPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClassifier ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEClassifier_eTypeParametersImpl <em>Diff EClassifier eType Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEClassifier_eTypeParametersImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEClassifier_eTypeParameters()
	 * @generated
	 */
	int DIFF_ECLASSIFIER_ETYPE_PARAMETERS = 44;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_ETYPE_PARAMETERS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_ETYPE_PARAMETERS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClassifier eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_ETYPE_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClassifier eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASSIFIER_ETYPE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEDataTypeImpl <em>Diff EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEDataTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEDataType()
	 * @generated
	 */
	int DIFF_EDATA_TYPE = 45;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__EANNOTATIONS = EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__DIFFE_ANNOTATIONS = EDATA_TYPE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NAME = EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__INSTANCE_CLASS_NAME = EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__INSTANCE_CLASS = EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__DEFAULT_VALUE = EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__INSTANCE_TYPE_NAME = EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__EPACKAGE = EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__ETYPE_PARAMETERS = EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__DIFFE_PACKAGE = EDATA_TYPE__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__DIFFE_TYPE_PARAMETERS = EDATA_TYPE__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__SERIALIZABLE = EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__OPERATION = EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NEW_NAME = EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NEW_INSTANCE_CLASS_NAME = EDATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NEW_INSTANCE_CLASS = EDATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NEW_DEFAULT_VALUE = EDATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NEW_INSTANCE_TYPE_NAME = EDATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE__NEW_SERIALIZABLE = EDATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Diff EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE___GET_EANNOTATION__STRING = EDATA_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE___IS_INSTANCE__OBJECT = EDATA_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE___GET_CLASSIFIER_ID = EDATA_TYPE___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Diff EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EDATA_TYPE_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEEnumImpl <em>Diff EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEEnumImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEEnum()
	 * @generated
	 */
	int DIFF_EENUM = 46;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__EANNOTATIONS = EENUM__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__DIFFE_ANNOTATIONS = EENUM__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NAME = EENUM__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__INSTANCE_CLASS_NAME = EENUM__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__INSTANCE_CLASS = EENUM__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__DEFAULT_VALUE = EENUM__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__INSTANCE_TYPE_NAME = EENUM__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__EPACKAGE = EENUM__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__ETYPE_PARAMETERS = EENUM__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__DIFFE_PACKAGE = EENUM__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__DIFFE_TYPE_PARAMETERS = EENUM__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__SERIALIZABLE = EENUM__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__ELITERALS = EENUM__ELITERALS;

	/**
	 * The feature id for the '<em><b>Diffe Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__DIFFE_LITERALS = EENUM__DIFFE_LITERALS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__OPERATION = EENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NEW_NAME = EENUM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NEW_INSTANCE_CLASS_NAME = EENUM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NEW_INSTANCE_CLASS = EENUM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NEW_DEFAULT_VALUE = EENUM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NEW_INSTANCE_TYPE_NAME = EENUM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM__NEW_SERIALIZABLE = EENUM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Diff EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_FEATURE_COUNT = EENUM_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM___GET_EANNOTATION__STRING = EENUM___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM___IS_INSTANCE__OBJECT = EENUM___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM___GET_CLASSIFIER_ID = EENUM___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM___GET_EENUM_LITERAL__STRING = EENUM___GET_EENUM_LITERAL__STRING;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM___GET_EENUM_LITERAL__INT = EENUM___GET_EENUM_LITERAL__INT;

	/**
	 * The operation id for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING;

	/**
	 * The number of operations of the '<em>Diff EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_OPERATION_COUNT = EENUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEEnum_eLiteralsImpl <em>Diff EEnum eLiterals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEEnum_eLiteralsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEEnum_eLiterals()
	 * @generated
	 */
	int DIFF_EENUM_ELITERALS = 47;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_ELITERALS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_ELITERALS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EEnum eLiterals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_ELITERALS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EEnum eLiterals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_ELITERALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEEnumLiteralImpl <em>Diff EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEEnumLiteralImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEEnumLiteral()
	 * @generated
	 */
	int DIFF_EENUM_LITERAL = 48;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__EANNOTATIONS = EENUM_LITERAL__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__DIFFE_ANNOTATIONS = EENUM_LITERAL__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__NAME = EENUM_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__VALUE = EENUM_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__INSTANCE = EENUM_LITERAL__INSTANCE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__LITERAL = EENUM_LITERAL__LITERAL;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__EENUM = EENUM_LITERAL__EENUM;

	/**
	 * The feature id for the '<em><b>Diffe Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__DIFFE_ENUM = EENUM_LITERAL__DIFFE_ENUM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__OPERATION = EENUM_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__NEW_NAME = EENUM_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__NEW_VALUE = EENUM_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__NEW_INSTANCE = EENUM_LITERAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL__NEW_LITERAL = EENUM_LITERAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Diff EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL_FEATURE_COUNT = EENUM_LITERAL_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL___GET_EANNOTATION__STRING = EENUM_LITERAL___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Diff EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL_OPERATION_COUNT = EENUM_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEEnumLiteral_eEnumImpl <em>Diff EEnum Literal eEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEEnumLiteral_eEnumImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEEnumLiteral_eEnum()
	 * @generated
	 */
	int DIFF_EENUM_LITERAL_EENUM = 49;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL_EENUM__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL_EENUM__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EEnum Literal eEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL_EENUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EEnum Literal eEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EENUM_LITERAL_EENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEFactoryImpl <em>Diff EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEFactoryImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEFactory()
	 * @generated
	 */
	int DIFF_EFACTORY = 50;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY__EANNOTATIONS = EFACTORY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY__DIFFE_ANNOTATIONS = EFACTORY__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY__EPACKAGE = EFACTORY__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY__DIFFE_PACKAGE = EFACTORY__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY__OPERATION = EFACTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY_FEATURE_COUNT = EFACTORY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY___GET_EANNOTATION__STRING = EFACTORY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY___CREATE__ECLASS = EFACTORY___CREATE__ECLASS;

	/**
	 * The operation id for the '<em>Create From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING = EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING;

	/**
	 * The operation id for the '<em>Convert To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT = EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT;

	/**
	 * The number of operations of the '<em>Diff EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY_OPERATION_COUNT = EFACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEFactory_ePackageImpl <em>Diff EFactory ePackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEFactory_ePackageImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEFactory_ePackage()
	 * @generated
	 */
	int DIFF_EFACTORY_EPACKAGE = 51;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY_EPACKAGE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY_EPACKAGE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EFactory ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY_EPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EFactory ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EFACTORY_EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEModelElement_eAnnotationsImpl <em>Diff EModel Element eAnnotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEModelElement_eAnnotationsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEModelElement_eAnnotations()
	 * @generated
	 */
	int DIFF_EMODEL_ELEMENT_EANNOTATIONS = 52;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EMODEL_ELEMENT_EANNOTATIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EMODEL_ELEMENT_EANNOTATIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EModel Element eAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EMODEL_ELEMENT_EANNOTATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EModel Element eAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EMODEL_ELEMENT_EANNOTATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEObjectImpl <em>Diff EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEObjectImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEObject()
	 * @generated
	 */
	int DIFF_EOBJECT = 53;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT__OPERATION = EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT_FEATURE_COUNT = EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ECLASS = EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EIS_PROXY = EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ERESOURCE = EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ECONTAINER = EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ECONTAINING_FEATURE = EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ECONTAINMENT_FEATURE = EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ECONTENTS = EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EALL_CONTENTS = EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ECROSS_REFERENCES = EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EGET__ESTRUCTURALFEATURE = EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT = EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EIS_SET__ESTRUCTURALFEATURE = EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EUNSET__ESTRUCTURALFEATURE = EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT___EINVOKE__EOPERATION_ELIST = EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Diff EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOBJECT_OPERATION_COUNT = EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEOperationImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEOperation()
	 * @generated
	 */
	int DIFF_EOPERATION = 54;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EANNOTATIONS = EOPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_ANNOTATIONS = EOPERATION__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NAME = EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ORDERED = EOPERATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__UNIQUE = EOPERATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__LOWER_BOUND = EOPERATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__UPPER_BOUND = EOPERATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__MANY = EOPERATION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__REQUIRED = EOPERATION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ETYPE = EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EGENERIC_TYPE = EOPERATION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_TYPE = EOPERATION__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_GENERIC_TYPE = EOPERATION__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ECONTAINING_CLASS = EOPERATION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ETYPE_PARAMETERS = EOPERATION__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EPARAMETERS = EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EEXCEPTIONS = EOPERATION__EEXCEPTIONS;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EGENERIC_EXCEPTIONS = EOPERATION__EGENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_CONTAINING_CLASS = EOPERATION__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_TYPE_PARAMETERS = EOPERATION__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_PARAMETERS = EOPERATION__DIFFE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_EXCEPTIONS = EOPERATION__DIFFE_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Diffe Generic Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFFE_GENERIC_EXCEPTIONS = EOPERATION__DIFFE_GENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__OPERATION = EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_NAME = EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_ORDERED = EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_UNIQUE = EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_LOWER_BOUND = EOPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_UPPER_BOUND = EOPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_MANY = EOPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_REQUIRED = EOPERATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_FEATURE_COUNT = EOPERATION_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION___GET_EANNOTATION__STRING = EOPERATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION___GET_OPERATION_ID = EOPERATION___GET_OPERATION_ID;

	/**
	 * The operation id for the '<em>Is Override Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION___IS_OVERRIDE_OF__EOPERATION = EOPERATION___IS_OVERRIDE_OF__EOPERATION;

	/**
	 * The number of operations of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_OPERATION_COUNT = EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEOperation_eContainingClassImpl <em>Diff EOperation eContaining Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEOperation_eContainingClassImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEOperation_eContainingClass()
	 * @generated
	 */
	int DIFF_EOPERATION_ECONTAINING_CLASS = 55;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ECONTAINING_CLASS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ECONTAINING_CLASS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EOperation eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ECONTAINING_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EOperation eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ECONTAINING_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEOperation_eTypeParametersImpl <em>Diff EOperation eType Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEOperation_eTypeParametersImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEOperation_eTypeParameters()
	 * @generated
	 */
	int DIFF_EOPERATION_ETYPE_PARAMETERS = 56;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ETYPE_PARAMETERS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ETYPE_PARAMETERS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EOperation eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ETYPE_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EOperation eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_ETYPE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEOperation_eParametersImpl <em>Diff EOperation eParameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEOperation_eParametersImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEOperation_eParameters()
	 * @generated
	 */
	int DIFF_EOPERATION_EPARAMETERS = 57;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EPARAMETERS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EPARAMETERS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EOperation eParameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EPARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EOperation eParameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EPARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEOperation_eExceptionsImpl <em>Diff EOperation eExceptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEOperation_eExceptionsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEOperation_eExceptions()
	 * @generated
	 */
	int DIFF_EOPERATION_EEXCEPTIONS = 58;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EEXCEPTIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EEXCEPTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EOperation eExceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EEXCEPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EOperation eExceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EEXCEPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEOperation_eGenericExceptionsImpl <em>Diff EOperation eGeneric Exceptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEOperation_eGenericExceptionsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEOperation_eGenericExceptions()
	 * @generated
	 */
	int DIFF_EOPERATION_EGENERIC_EXCEPTIONS = 59;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EOperation eGeneric Exceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EGENERIC_EXCEPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EOperation eGeneric Exceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_EGENERIC_EXCEPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEPackageImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEPackage()
	 * @generated
	 */
	int DIFF_EPACKAGE = 60;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__EANNOTATIONS = EPACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFE_ANNOTATIONS = EPACKAGE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NAME = EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NS_URI = EPACKAGE__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NS_PREFIX = EPACKAGE__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__EFACTORY_INSTANCE = EPACKAGE__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__ECLASSIFIERS = EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__ESUBPACKAGES = EPACKAGE__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__ESUPER_PACKAGE = EPACKAGE__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DOMAINSPECIFICDIFFS = EPACKAGE__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffe Factory Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFE_FACTORY_INSTANCE = EPACKAGE__DIFFE_FACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>Diffe Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFE_CLASSIFIERS = EPACKAGE__DIFFE_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffe Subpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFE_SUBPACKAGES = EPACKAGE__DIFFE_SUBPACKAGES;

	/**
	 * The feature id for the '<em><b>Diffe Super Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFE_SUPER_PACKAGE = EPACKAGE__DIFFE_SUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFDOMAINSPECIFICDIFFS = EPACKAGE__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__OPERATION = EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NEW_NAME = EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NEW_NS_URI = EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NEW_NS_PREFIX = EPACKAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_FEATURE_COUNT = EPACKAGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE___GET_EANNOTATION__STRING = EPACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE___GET_ECLASSIFIER__STRING = EPACKAGE___GET_ECLASSIFIER__STRING;

	/**
	 * The number of operations of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_OPERATION_COUNT = EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEPackage_eFactoryInstanceImpl <em>Diff EPackage eFactory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEPackage_eFactoryInstanceImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEPackage_eFactoryInstance()
	 * @generated
	 */
	int DIFF_EPACKAGE_EFACTORY_INSTANCE = 61;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_EFACTORY_INSTANCE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_EFACTORY_INSTANCE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage eFactory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_EFACTORY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage eFactory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_EFACTORY_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEPackage_eClassifiersImpl <em>Diff EPackage eClassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEPackage_eClassifiersImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEPackage_eClassifiers()
	 * @generated
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS = 62;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage eClassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage eClassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEPackage_eSubpackagesImpl <em>Diff EPackage eSubpackages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEPackage_eSubpackagesImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEPackage_eSubpackages()
	 * @generated
	 */
	int DIFF_EPACKAGE_ESUBPACKAGES = 63;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUBPACKAGES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUBPACKAGES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage eSubpackages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUBPACKAGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage eSubpackages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUBPACKAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEPackage_eSuperPackageImpl <em>Diff EPackage eSuper Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEPackage_eSuperPackageImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEPackage_eSuperPackage()
	 * @generated
	 */
	int DIFF_EPACKAGE_ESUPER_PACKAGE = 64;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUPER_PACKAGE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUPER_PACKAGE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage eSuper Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUPER_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage eSuper Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ESUPER_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEPackage_domainspecificdiffsImpl <em>Diff EPackage domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEPackage_domainspecificdiffsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = 65;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEParameterImpl <em>Diff EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEParameterImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEParameter()
	 * @generated
	 */
	int DIFF_EPARAMETER = 66;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__EANNOTATIONS = EPARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__DIFFE_ANNOTATIONS = EPARAMETER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NAME = EPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__ORDERED = EPARAMETER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__UNIQUE = EPARAMETER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__LOWER_BOUND = EPARAMETER__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__UPPER_BOUND = EPARAMETER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__MANY = EPARAMETER__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__REQUIRED = EPARAMETER__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__ETYPE = EPARAMETER__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__EGENERIC_TYPE = EPARAMETER__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__DIFFE_TYPE = EPARAMETER__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__DIFFE_GENERIC_TYPE = EPARAMETER__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__EOPERATION = EPARAMETER__EOPERATION;

	/**
	 * The feature id for the '<em><b>Diffe Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__DIFFE_OPERATION = EPARAMETER__DIFFE_OPERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__OPERATION = EPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_NAME = EPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_ORDERED = EPARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_UNIQUE = EPARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_LOWER_BOUND = EPARAMETER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_UPPER_BOUND = EPARAMETER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_MANY = EPARAMETER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER__NEW_REQUIRED = EPARAMETER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Diff EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER_FEATURE_COUNT = EPARAMETER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER___GET_EANNOTATION__STRING = EPARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Diff EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER_OPERATION_COUNT = EPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEParameter_eOperationImpl <em>Diff EParameter eOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEParameter_eOperationImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEParameter_eOperation()
	 * @generated
	 */
	int DIFF_EPARAMETER_EOPERATION = 67;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER_EOPERATION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER_EOPERATION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EParameter eOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER_EOPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EParameter eOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPARAMETER_EOPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEReferenceImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEReference()
	 * @generated
	 */
	int DIFF_EREFERENCE = 68;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__EANNOTATIONS = EREFERENCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_ANNOTATIONS = EREFERENCE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NAME = EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__ORDERED = EREFERENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__UNIQUE = EREFERENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__LOWER_BOUND = EREFERENCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__UPPER_BOUND = EREFERENCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__MANY = EREFERENCE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__REQUIRED = EREFERENCE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__ETYPE = EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__EGENERIC_TYPE = EREFERENCE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_TYPE = EREFERENCE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_GENERIC_TYPE = EREFERENCE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__CHANGEABLE = EREFERENCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__VOLATILE = EREFERENCE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__TRANSIENT = EREFERENCE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DEFAULT_VALUE_LITERAL = EREFERENCE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DEFAULT_VALUE = EREFERENCE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__UNSETTABLE = EREFERENCE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DERIVED = EREFERENCE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__ECONTAINING_CLASS = EREFERENCE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_CONTAINING_CLASS = EREFERENCE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__CONTAINMENT = EREFERENCE__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__CONTAINER = EREFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__RESOLVE_PROXIES = EREFERENCE__RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__EOPPOSITE = EREFERENCE__EOPPOSITE;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__EREFERENCE_TYPE = EREFERENCE__EREFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__EKEYS = EREFERENCE__EKEYS;

	/**
	 * The feature id for the '<em><b>Diffe Opposite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_OPPOSITE = EREFERENCE__DIFFE_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Diffe Reference Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_REFERENCE_TYPE = EREFERENCE__DIFFE_REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFFE_KEYS = EREFERENCE__DIFFE_KEYS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__OPERATION = EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_NAME = EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_ORDERED = EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_UNIQUE = EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_LOWER_BOUND = EREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_UPPER_BOUND = EREFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_MANY = EREFERENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_REQUIRED = EREFERENCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_CHANGEABLE = EREFERENCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_VOLATILE = EREFERENCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_TRANSIENT = EREFERENCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL = EREFERENCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_DEFAULT_VALUE = EREFERENCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_UNSETTABLE = EREFERENCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>New derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_DERIVED = EREFERENCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_CONTAINMENT = EREFERENCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>New container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_CONTAINER = EREFERENCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>New resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_RESOLVE_PROXIES = EREFERENCE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_FEATURE_COUNT = EREFERENCE_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE___GET_EANNOTATION__STRING = EREFERENCE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE___GET_FEATURE_ID = EREFERENCE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE___GET_CONTAINER_CLASS = EREFERENCE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_OPERATION_COUNT = EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEReference_eOppositeImpl <em>Diff EReference eOpposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEReference_eOppositeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEReference_eOpposite()
	 * @generated
	 */
	int DIFF_EREFERENCE_EOPPOSITE = 69;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EOPPOSITE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EOPPOSITE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EReference eOpposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EOPPOSITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EReference eOpposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EOPPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEReference_eReferenceTypeImpl <em>Diff EReference eReference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEReference_eReferenceTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEReference_eReferenceType()
	 * @generated
	 */
	int DIFF_EREFERENCE_EREFERENCE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EREFERENCE_TYPE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EREFERENCE_TYPE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EReference eReference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EREFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EReference eReference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEReference_eKeysImpl <em>Diff EReference eKeys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEReference_eKeysImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEReference_eKeys()
	 * @generated
	 */
	int DIFF_EREFERENCE_EKEYS = 71;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EKEYS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EKEYS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EReference eKeys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EKEYS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EReference eKeys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_EKEYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEStructuralFeature_eContainingClassImpl <em>Diff EStructural Feature eContaining Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEStructuralFeature_eContainingClassImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEStructuralFeature_eContainingClass()
	 * @generated
	 */
	int DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS = 72;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EStructural Feature eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EStructural Feature eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffETypedElement_eTypeImpl <em>Diff ETyped Element eType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffETypedElement_eTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffETypedElement_eType()
	 * @generated
	 */
	int DIFF_ETYPED_ELEMENT_ETYPE = 73;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_ETYPE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_ETYPE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff ETyped Element eType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_ETYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff ETyped Element eType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_ETYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffETypedElement_eGenericTypeImpl <em>Diff ETyped Element eGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffETypedElement_eGenericTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffETypedElement_eGenericType()
	 * @generated
	 */
	int DIFF_ETYPED_ELEMENT_EGENERIC_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff ETyped Element eGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff ETyped Element eGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEStringToStringMapEntryImpl <em>Diff EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEStringToStringMapEntryImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEStringToStringMapEntry()
	 * @generated
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY = 75;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY__KEY = ESTRING_TO_STRING_MAP_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY__VALUE = ESTRING_TO_STRING_MAP_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY__OPERATION = ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY__NEW_KEY = ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY__NEW_VALUE = ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericTypeImpl <em>Diff EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE = 76;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__EUPPER_BOUND = EGENERIC_TYPE__EUPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__ETYPE_ARGUMENTS = EGENERIC_TYPE__ETYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__ERAW_TYPE = EGENERIC_TYPE__ERAW_TYPE;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__ELOWER_BOUND = EGENERIC_TYPE__ELOWER_BOUND;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__ETYPE_PARAMETER = EGENERIC_TYPE__ETYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__ECLASSIFIER = EGENERIC_TYPE__ECLASSIFIER;

	/**
	 * The feature id for the '<em><b>Diffe Upper Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__DIFFE_UPPER_BOUND = EGENERIC_TYPE__DIFFE_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Diffe Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS = EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Diffe Raw Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__DIFFE_RAW_TYPE = EGENERIC_TYPE__DIFFE_RAW_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Lower Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__DIFFE_LOWER_BOUND = EGENERIC_TYPE__DIFFE_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__DIFFE_TYPE_PARAMETER = EGENERIC_TYPE__DIFFE_TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Diffe Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__DIFFE_CLASSIFIER = EGENERIC_TYPE__DIFFE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE__OPERATION = EGENERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_FEATURE_COUNT = EGENERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE___IS_INSTANCE__OBJECT = EGENERIC_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_OPERATION_COUNT = EGENERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericType_eUpperBoundImpl <em>Diff EGeneric Type eUpper Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericType_eUpperBoundImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType_eUpperBound()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE_EUPPER_BOUND = 77;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_EUPPER_BOUND__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_EUPPER_BOUND__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type eUpper Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_EUPPER_BOUND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type eUpper Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_EUPPER_BOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericType_eTypeArgumentsImpl <em>Diff EGeneric Type eType Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericType_eTypeArgumentsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType_eTypeArguments()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS = 78;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type eType Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type eType Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericType_eRawTypeImpl <em>Diff EGeneric Type eRaw Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericType_eRawTypeImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType_eRawType()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE_ERAW_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ERAW_TYPE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ERAW_TYPE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type eRaw Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ERAW_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type eRaw Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ERAW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericType_eLowerBoundImpl <em>Diff EGeneric Type eLower Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericType_eLowerBoundImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType_eLowerBound()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE_ELOWER_BOUND = 80;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ELOWER_BOUND__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ELOWER_BOUND__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type eLower Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ELOWER_BOUND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type eLower Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ELOWER_BOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericType_eTypeParameterImpl <em>Diff EGeneric Type eType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericType_eTypeParameterImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType_eTypeParameter()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_PARAMETER = 81;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type eType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type eType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffEGenericType_eClassifierImpl <em>Diff EGeneric Type eClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffEGenericType_eClassifierImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffEGenericType_eClassifier()
	 * @generated
	 */
	int DIFF_EGENERIC_TYPE_ECLASSIFIER = 82;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ECLASSIFIER__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ECLASSIFIER__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EGeneric Type eClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ECLASSIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EGeneric Type eClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EGENERIC_TYPE_ECLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffETypeParameterImpl <em>Diff EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffETypeParameterImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffETypeParameter()
	 * @generated
	 */
	int DIFF_ETYPE_PARAMETER = 83;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__EANNOTATIONS = ETYPE_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__DIFFE_ANNOTATIONS = ETYPE_PARAMETER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__NAME = ETYPE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__EBOUNDS = ETYPE_PARAMETER__EBOUNDS;

	/**
	 * The feature id for the '<em><b>Diffe Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__DIFFE_BOUNDS = ETYPE_PARAMETER__DIFFE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__OPERATION = ETYPE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER__NEW_NAME = ETYPE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER_FEATURE_COUNT = ETYPE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER___GET_EANNOTATION__STRING = ETYPE_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Diff EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER_OPERATION_COUNT = ETYPE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.impl.DiffETypeParameter_eBoundsImpl <em>Diff EType Parameter eBounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.DiffETypeParameter_eBoundsImpl
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getDiffETypeParameter_eBounds()
	 * @generated
	 */
	int DIFF_ETYPE_PARAMETER_EBOUNDS = 84;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER_EBOUNDS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER_EBOUNDS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EType Parameter eBounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER_EBOUNDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EType Parameter eBounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ETYPE_PARAMETER_EBOUNDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.ClassOp <em>Class Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.ClassOp
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getClassOp()
	 * @generated
	 */
	int CLASS_OP = 85;

	/**
	 * The meta object id for the '{@link ecoreDiffMM.AscOp <em>Asc Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.AscOp
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getAscOp()
	 * @generated
	 */
	int ASC_OP = 86;

	/**
	 * The meta object id for the '<em>EBig Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEBigDecimal()
	 * @generated
	 */
	int EBIG_DECIMAL = 87;

	/**
	 * The meta object id for the '<em>EBig Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEBigInteger()
	 * @generated
	 */
	int EBIG_INTEGER = 88;

	/**
	 * The meta object id for the '<em>EBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEBoolean()
	 * @generated
	 */
	int EBOOLEAN = 89;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 90;

	/**
	 * The meta object id for the '<em>EByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEByte()
	 * @generated
	 */
	int EBYTE = 91;

	/**
	 * The meta object id for the '<em>EByte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEByteArray()
	 * @generated
	 */
	int EBYTE_ARRAY = 92;

	/**
	 * The meta object id for the '<em>EByte Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEByteObject()
	 * @generated
	 */
	int EBYTE_OBJECT = 93;

	/**
	 * The meta object id for the '<em>EChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEChar()
	 * @generated
	 */
	int ECHAR = 94;

	/**
	 * The meta object id for the '<em>ECharacter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getECharacterObject()
	 * @generated
	 */
	int ECHARACTER_OBJECT = 95;

	/**
	 * The meta object id for the '<em>EDate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEDate()
	 * @generated
	 */
	int EDATE = 96;

	/**
	 * The meta object id for the '<em>EDiagnostic Chain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEDiagnosticChain()
	 * @generated
	 */
	int EDIAGNOSTIC_CHAIN = 97;

	/**
	 * The meta object id for the '<em>EDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEDouble()
	 * @generated
	 */
	int EDOUBLE = 98;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 99;

	/**
	 * The meta object id for the '<em>EE List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEEList()
	 * @generated
	 */
	int EE_LIST = 100;

	/**
	 * The meta object id for the '<em>EEnumerator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEEnumerator()
	 * @generated
	 */
	int EENUMERATOR = 101;

	/**
	 * The meta object id for the '<em>EFeature Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEFeatureMap()
	 * @generated
	 */
	int EFEATURE_MAP = 102;

	/**
	 * The meta object id for the '<em>EFeature Map Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEFeatureMapEntry()
	 * @generated
	 */
	int EFEATURE_MAP_ENTRY = 103;

	/**
	 * The meta object id for the '<em>EFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEFloat()
	 * @generated
	 */
	int EFLOAT = 104;

	/**
	 * The meta object id for the '<em>EFloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEFloatObject()
	 * @generated
	 */
	int EFLOAT_OBJECT = 105;

	/**
	 * The meta object id for the '<em>EInt</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEInt()
	 * @generated
	 */
	int EINT = 106;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 107;

	/**
	 * The meta object id for the '<em>EJava Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEJavaClass()
	 * @generated
	 */
	int EJAVA_CLASS = 108;

	/**
	 * The meta object id for the '<em>EJava Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEJavaObject()
	 * @generated
	 */
	int EJAVA_OBJECT = 109;

	/**
	 * The meta object id for the '<em>ELong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getELong()
	 * @generated
	 */
	int ELONG = 110;

	/**
	 * The meta object id for the '<em>ELong Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getELongObject()
	 * @generated
	 */
	int ELONG_OBJECT = 111;

	/**
	 * The meta object id for the '<em>EMap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEMap()
	 * @generated
	 */
	int EMAP = 112;

	/**
	 * The meta object id for the '<em>EResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEResource()
	 * @generated
	 */
	int ERESOURCE = 113;

	/**
	 * The meta object id for the '<em>EResource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEResourceSet()
	 * @generated
	 */
	int ERESOURCE_SET = 114;

	/**
	 * The meta object id for the '<em>EShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEShort()
	 * @generated
	 */
	int ESHORT = 115;

	/**
	 * The meta object id for the '<em>EShort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEShortObject()
	 * @generated
	 */
	int ESHORT_OBJECT = 116;

	/**
	 * The meta object id for the '<em>EString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 117;

	/**
	 * The meta object id for the '<em>ETree Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getETreeIterator()
	 * @generated
	 */
	int ETREE_ITERATOR = 118;

	/**
	 * The meta object id for the '<em>EInvocation Target Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.InvocationTargetException
	 * @see ecoreDiffMM.impl.EcoreDiffMMPackageImpl#getEInvocationTargetException()
	 * @generated
	 */
	int EINVOCATION_TARGET_EXCEPTION = 119;


	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see ecoreDiffMM.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EAttribute#isID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ecoreDiffMM.EAttribute#isID()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_ID();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EAttribute#getEAttributeType <em>EAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute Type</em>'.
	 * @see ecoreDiffMM.EAttribute#getEAttributeType()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_EAttributeType();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EAttribute#getDiffeAttributeType <em>Diffe Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Attribute Type</em>'.
	 * @see ecoreDiffMM.EAttribute#getDiffeAttributeType()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_DiffeAttributeType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnnotation</em>'.
	 * @see ecoreDiffMM.EAnnotation
	 * @generated
	 */
	EClass getEAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see ecoreDiffMM.EAnnotation#getSource()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EAttribute getEAnnotation_Source();

	/**
	 * Returns the meta object for the map '{@link ecoreDiffMM.EAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see ecoreDiffMM.EAnnotation#getDetails()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Details();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EModel Element</em>'.
	 * @see ecoreDiffMM.EAnnotation#getEModelElement()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_EModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EAnnotation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ecoreDiffMM.EAnnotation#getContents()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Contents();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see ecoreDiffMM.EAnnotation#getReferences()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_References();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EAnnotation#getDiffdetails <em>Diffdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdetails</em>'.
	 * @see ecoreDiffMM.EAnnotation#getDiffdetails()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Diffdetails();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EAnnotation#getDiffeModelElement <em>Diffe Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Model Element</em>'.
	 * @see ecoreDiffMM.EAnnotation#getDiffeModelElement()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_DiffeModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EAnnotation#getDiffcontents <em>Diffcontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffcontents</em>'.
	 * @see ecoreDiffMM.EAnnotation#getDiffcontents()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Diffcontents();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EAnnotation#getDiffreferences <em>Diffreferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffreferences</em>'.
	 * @see ecoreDiffMM.EAnnotation#getDiffreferences()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Diffreferences();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see ecoreDiffMM.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ecoreDiffMM.EClass#isAbstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EClass#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see ecoreDiffMM.EClass#isInterface()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Interface();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getESuperTypes <em>ESuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESuper Types</em>'.
	 * @see ecoreDiffMM.EClass#getESuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_ESuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOperations</em>'.
	 * @see ecoreDiffMM.EClass#getEOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EOperations();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllAttributes <em>EAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Attributes</em>'.
	 * @see ecoreDiffMM.EClass#getEAllAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllAttributes();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllReferences <em>EAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll References</em>'.
	 * @see ecoreDiffMM.EClass#getEAllReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllReferences();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEReferences <em>EReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReferences</em>'.
	 * @see ecoreDiffMM.EClass#getEReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EReferences();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAttributes <em>EAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAttributes</em>'.
	 * @see ecoreDiffMM.EClass#getEAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAttributes();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllContainments <em>EAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Containments</em>'.
	 * @see ecoreDiffMM.EClass#getEAllContainments()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllContainments();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllOperations <em>EAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Operations</em>'.
	 * @see ecoreDiffMM.EClass#getEAllOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllOperations();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Structural Features</em>'.
	 * @see ecoreDiffMM.EClass#getEAllStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllStructuralFeatures();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllSuperTypes <em>EAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getEAllSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllSuperTypes();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EClass#getEIDAttribute <em>EID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EID Attribute</em>'.
	 * @see ecoreDiffMM.EClass#getEIDAttribute()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EIDAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
	 * @see ecoreDiffMM.EClass#getEStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EStructuralFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getEGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EGenericSuperTypes();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Generic Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getEAllGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllGenericSuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeSuperTypes <em>Diffe Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeSuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeOperations <em>Diffe Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Operations</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllAttributes <em>Diffe All Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All Attributes</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllReferences <em>Diffe All References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All References</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeReferences <em>Diffe References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe References</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAttributes <em>Diffe Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Attributes</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllContainments <em>Diffe All Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All Containments</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllContainments()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllContainments();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllOperations <em>Diffe All Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All Operations</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllStructuralFeatures <em>Diffe All Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All Structural Features</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllStructuralFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllSuperTypes <em>Diffe All Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllSuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeIDAttribute <em>Diffe ID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe ID Attribute</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeIDAttribute()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeIDAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeStructuralFeatures <em>Diffe Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Structural Features</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeStructuralFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeGenericSuperTypes <em>Diffe Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Generic Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeGenericSuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClass#getDiffeAllGenericSuperTypes <em>Diffe All Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe All Generic Super Types</em>'.
	 * @see ecoreDiffMM.EClass#getDiffeAllGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_DiffeAllGenericSuperTypes();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#isSuperTypeOf(ecoreDiffMM.EClass) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see ecoreDiffMM.EClass#isSuperTypeOf(ecoreDiffMM.EClass)
	 * @generated
	 */
	EOperation getEClass__IsSuperTypeOf__EClass();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getFeatureCount() <em>Get Feature Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Count</em>' operation.
	 * @see ecoreDiffMM.EClass#getFeatureCount()
	 * @generated
	 */
	EOperation getEClass__GetFeatureCount();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getEStructuralFeature(int) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see ecoreDiffMM.EClass#getEStructuralFeature(int)
	 * @generated
	 */
	EOperation getEClass__GetEStructuralFeature__int();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getFeatureID(ecoreDiffMM.EStructuralFeature) <em>Get Feature ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature ID</em>' operation.
	 * @see ecoreDiffMM.EClass#getFeatureID(ecoreDiffMM.EStructuralFeature)
	 * @generated
	 */
	EOperation getEClass__GetFeatureID__EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getEStructuralFeature(java.lang.String) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see ecoreDiffMM.EClass#getEStructuralFeature(java.lang.String)
	 * @generated
	 */
	EOperation getEClass__GetEStructuralFeature__String();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getOperationCount() <em>Get Operation Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation Count</em>' operation.
	 * @see ecoreDiffMM.EClass#getOperationCount()
	 * @generated
	 */
	EOperation getEClass__GetOperationCount();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getEOperation(int) <em>Get EOperation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EOperation</em>' operation.
	 * @see ecoreDiffMM.EClass#getEOperation(int)
	 * @generated
	 */
	EOperation getEClass__GetEOperation__int();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getOperationID(ecoreDiffMM.EOperation) <em>Get Operation ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation ID</em>' operation.
	 * @see ecoreDiffMM.EClass#getOperationID(ecoreDiffMM.EOperation)
	 * @generated
	 */
	EOperation getEClass__GetOperationID__EOperation();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getOverride(ecoreDiffMM.EOperation) <em>Get Override</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Override</em>' operation.
	 * @see ecoreDiffMM.EClass#getOverride(ecoreDiffMM.EOperation)
	 * @generated
	 */
	EOperation getEClass__GetOverride__EOperation();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClass#getFeatureType(ecoreDiffMM.EStructuralFeature) <em>Get Feature Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Type</em>' operation.
	 * @see ecoreDiffMM.EClass#getFeatureType(ecoreDiffMM.EStructuralFeature)
	 * @generated
	 */
	EOperation getEClass__GetFeatureType__EStructuralFeature();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier</em>'.
	 * @see ecoreDiffMM.EClassifier
	 * @generated
	 */
	EClass getEClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EClassifier#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see ecoreDiffMM.EClassifier#getInstanceClassName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EClassifier#getInstanceClass <em>Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class</em>'.
	 * @see ecoreDiffMM.EClassifier#getInstanceClass()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EClassifier#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see ecoreDiffMM.EClassifier#getDefaultValue()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type Name</em>'.
	 * @see ecoreDiffMM.EClassifier#getInstanceTypeName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceTypeName();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EPackage</em>'.
	 * @see ecoreDiffMM.EClassifier#getEPackage()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClassifier#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see ecoreDiffMM.EClassifier#getETypeParameters()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_ETypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClassifier#getDiffePackage <em>Diffe Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Package</em>'.
	 * @see ecoreDiffMM.EClassifier#getDiffePackage()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_DiffePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EClassifier#getDiffeTypeParameters <em>Diffe Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Type Parameters</em>'.
	 * @see ecoreDiffMM.EClassifier#getDiffeTypeParameters()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_DiffeTypeParameters();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClassifier#isInstance(java.lang.Object) <em>Is Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Instance</em>' operation.
	 * @see ecoreDiffMM.EClassifier#isInstance(java.lang.Object)
	 * @generated
	 */
	EOperation getEClassifier__IsInstance__Object();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EClassifier#getClassifierID() <em>Get Classifier ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classifier ID</em>' operation.
	 * @see ecoreDiffMM.EClassifier#getClassifierID()
	 * @generated
	 */
	EOperation getEClassifier__GetClassifierID();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type</em>'.
	 * @see ecoreDiffMM.EDataType
	 * @generated
	 */
	EClass getEDataType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EDataType#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see ecoreDiffMM.EDataType#isSerializable()
	 * @see #getEDataType()
	 * @generated
	 */
	EAttribute getEDataType_Serializable();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum</em>'.
	 * @see ecoreDiffMM.EEnum
	 * @generated
	 */
	EClass getEEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELiterals</em>'.
	 * @see ecoreDiffMM.EEnum#getELiterals()
	 * @see #getEEnum()
	 * @generated
	 */
	EReference getEEnum_ELiterals();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EEnum#getDiffeLiterals <em>Diffe Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Literals</em>'.
	 * @see ecoreDiffMM.EEnum#getDiffeLiterals()
	 * @see #getEEnum()
	 * @generated
	 */
	EReference getEEnum_DiffeLiterals();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EEnum#getEEnumLiteral(java.lang.String) <em>Get EEnum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal</em>' operation.
	 * @see ecoreDiffMM.EEnum#getEEnumLiteral(java.lang.String)
	 * @generated
	 */
	EOperation getEEnum__GetEEnumLiteral__String();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EEnum#getEEnumLiteral(int) <em>Get EEnum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal</em>' operation.
	 * @see ecoreDiffMM.EEnum#getEEnumLiteral(int)
	 * @generated
	 */
	EOperation getEEnum__GetEEnumLiteral__int();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EEnum#getEEnumLiteralByLiteral(java.lang.String) <em>Get EEnum Literal By Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * @see ecoreDiffMM.EEnum#getEEnumLiteralByLiteral(java.lang.String)
	 * @generated
	 */
	EOperation getEEnum__GetEEnumLiteralByLiteral__String();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal</em>'.
	 * @see ecoreDiffMM.EEnumLiteral
	 * @generated
	 */
	EClass getEEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecoreDiffMM.EEnumLiteral#getValue()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EEnumLiteral#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see ecoreDiffMM.EEnumLiteral#getInstance()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Instance();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see ecoreDiffMM.EEnumLiteral#getLiteral()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Literal();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EEnum</em>'.
	 * @see ecoreDiffMM.EEnumLiteral#getEEnum()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EReference getEEnumLiteral_EEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EEnumLiteral#getDiffeEnum <em>Diffe Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Enum</em>'.
	 * @see ecoreDiffMM.EEnumLiteral#getDiffeEnum()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EReference getEEnumLiteral_DiffeEnum();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFactory</em>'.
	 * @see ecoreDiffMM.EFactory
	 * @generated
	 */
	EClass getEFactory();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see ecoreDiffMM.EFactory#getEPackage()
	 * @see #getEFactory()
	 * @generated
	 */
	EReference getEFactory_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EFactory#getDiffePackage <em>Diffe Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Package</em>'.
	 * @see ecoreDiffMM.EFactory#getDiffePackage()
	 * @see #getEFactory()
	 * @generated
	 */
	EReference getEFactory_DiffePackage();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EFactory#create(ecoreDiffMM.EClass) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see ecoreDiffMM.EFactory#create(ecoreDiffMM.EClass)
	 * @generated
	 */
	EOperation getEFactory__Create__EClass();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EFactory#createFromString(ecoreDiffMM.EDataType, java.lang.String) <em>Create From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create From String</em>' operation.
	 * @see ecoreDiffMM.EFactory#createFromString(ecoreDiffMM.EDataType, java.lang.String)
	 * @generated
	 */
	EOperation getEFactory__CreateFromString__EDataType_String();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EFactory#convertToString(ecoreDiffMM.EDataType, java.lang.Object) <em>Convert To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To String</em>' operation.
	 * @see ecoreDiffMM.EFactory#convertToString(ecoreDiffMM.EDataType, java.lang.Object)
	 * @generated
	 */
	EOperation getEFactory__ConvertToString__EDataType_Object();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EModel Element</em>'.
	 * @see ecoreDiffMM.EModelElement
	 * @generated
	 */
	EClass getEModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAnnotations</em>'.
	 * @see ecoreDiffMM.EModelElement#getEAnnotations()
	 * @see #getEModelElement()
	 * @generated
	 */
	EReference getEModelElement_EAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EModelElement#getDiffeAnnotations <em>Diffe Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Annotations</em>'.
	 * @see ecoreDiffMM.EModelElement#getDiffeAnnotations()
	 * @see #getEModelElement()
	 * @generated
	 */
	EReference getEModelElement_DiffeAnnotations();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EAnnotation</em>' operation.
	 * @see ecoreDiffMM.EModelElement#getEAnnotation(java.lang.String)
	 * @generated
	 */
	EOperation getEModelElement__GetEAnnotation__String();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element</em>'.
	 * @see ecoreDiffMM.ENamedElement
	 * @generated
	 */
	EClass getENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreDiffMM.ENamedElement#getName()
	 * @see #getENamedElement()
	 * @generated
	 */
	EAttribute getENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject</em>'.
	 * @see ecoreDiffMM.EObject
	 * @generated
	 */
	EClass getEObject();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eClass() <em>EClass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EClass</em>' operation.
	 * @see ecoreDiffMM.EObject#eClass()
	 * @generated
	 */
	EOperation getEObject__EClass();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eIsProxy() <em>EIs Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EIs Proxy</em>' operation.
	 * @see ecoreDiffMM.EObject#eIsProxy()
	 * @generated
	 */
	EOperation getEObject__EIsProxy();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eResource() <em>EResource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EResource</em>' operation.
	 * @see ecoreDiffMM.EObject#eResource()
	 * @generated
	 */
	EOperation getEObject__EResource();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eContainer() <em>EContainer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EContainer</em>' operation.
	 * @see ecoreDiffMM.EObject#eContainer()
	 * @generated
	 */
	EOperation getEObject__EContainer();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eContainingFeature() <em>EContaining Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EContaining Feature</em>' operation.
	 * @see ecoreDiffMM.EObject#eContainingFeature()
	 * @generated
	 */
	EOperation getEObject__EContainingFeature();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eContainmentFeature() <em>EContainment Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EContainment Feature</em>' operation.
	 * @see ecoreDiffMM.EObject#eContainmentFeature()
	 * @generated
	 */
	EOperation getEObject__EContainmentFeature();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eContents() <em>EContents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EContents</em>' operation.
	 * @see ecoreDiffMM.EObject#eContents()
	 * @generated
	 */
	EOperation getEObject__EContents();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eAllContents() <em>EAll Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EAll Contents</em>' operation.
	 * @see ecoreDiffMM.EObject#eAllContents()
	 * @generated
	 */
	EOperation getEObject__EAllContents();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eCrossReferences() <em>ECross References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>ECross References</em>' operation.
	 * @see ecoreDiffMM.EObject#eCrossReferences()
	 * @generated
	 */
	EOperation getEObject__ECrossReferences();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eGet(ecoreDiffMM.EStructuralFeature) <em>EGet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EGet</em>' operation.
	 * @see ecoreDiffMM.EObject#eGet(ecoreDiffMM.EStructuralFeature)
	 * @generated
	 */
	EOperation getEObject__EGet__EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eGet(ecoreDiffMM.EStructuralFeature, boolean) <em>EGet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EGet</em>' operation.
	 * @see ecoreDiffMM.EObject#eGet(ecoreDiffMM.EStructuralFeature, boolean)
	 * @generated
	 */
	EOperation getEObject__EGet__EStructuralFeature_boolean();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eSet(ecoreDiffMM.EStructuralFeature, java.lang.Object) <em>ESet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>ESet</em>' operation.
	 * @see ecoreDiffMM.EObject#eSet(ecoreDiffMM.EStructuralFeature, java.lang.Object)
	 * @generated
	 */
	EOperation getEObject__ESet__EStructuralFeature_Object();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eIsSet(ecoreDiffMM.EStructuralFeature) <em>EIs Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EIs Set</em>' operation.
	 * @see ecoreDiffMM.EObject#eIsSet(ecoreDiffMM.EStructuralFeature)
	 * @generated
	 */
	EOperation getEObject__EIsSet__EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eUnset(ecoreDiffMM.EStructuralFeature) <em>EUnset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EUnset</em>' operation.
	 * @see ecoreDiffMM.EObject#eUnset(ecoreDiffMM.EStructuralFeature)
	 * @generated
	 */
	EOperation getEObject__EUnset__EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EObject#eInvoke(ecoreDiffMM.EOperation, org.eclipse.emf.common.util.EList) <em>EInvoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EInvoke</em>' operation.
	 * @see ecoreDiffMM.EObject#eInvoke(ecoreDiffMM.EOperation, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEObject__EInvoke__EOperation_EList();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see ecoreDiffMM.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see ecoreDiffMM.EOperation#getEContainingClass()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see ecoreDiffMM.EOperation#getETypeParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_ETypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EParameters</em>'.
	 * @see ecoreDiffMM.EOperation#getEParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EParameters();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EOperation#getEExceptions <em>EExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EExceptions</em>'.
	 * @see ecoreDiffMM.EOperation#getEExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Exceptions</em>'.
	 * @see ecoreDiffMM.EOperation#getEGenericExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EGenericExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getDiffeContainingClass <em>Diffe Containing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Containing Class</em>'.
	 * @see ecoreDiffMM.EOperation#getDiffeContainingClass()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_DiffeContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getDiffeTypeParameters <em>Diffe Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Type Parameters</em>'.
	 * @see ecoreDiffMM.EOperation#getDiffeTypeParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_DiffeTypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getDiffeParameters <em>Diffe Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Parameters</em>'.
	 * @see ecoreDiffMM.EOperation#getDiffeParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_DiffeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getDiffeExceptions <em>Diffe Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Exceptions</em>'.
	 * @see ecoreDiffMM.EOperation#getDiffeExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_DiffeExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EOperation#getDiffeGenericExceptions <em>Diffe Generic Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Generic Exceptions</em>'.
	 * @see ecoreDiffMM.EOperation#getDiffeGenericExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_DiffeGenericExceptions();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EOperation#getOperationID() <em>Get Operation ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation ID</em>' operation.
	 * @see ecoreDiffMM.EOperation#getOperationID()
	 * @generated
	 */
	EOperation getEOperation__GetOperationID();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EOperation#isOverrideOf(ecoreDiffMM.EOperation) <em>Is Override Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Override Of</em>' operation.
	 * @see ecoreDiffMM.EOperation#isOverrideOf(ecoreDiffMM.EOperation)
	 * @generated
	 */
	EOperation getEOperation__IsOverrideOf__EOperation();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see ecoreDiffMM.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EPackage#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see ecoreDiffMM.EPackage#getNsURI()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EPackage#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see ecoreDiffMM.EPackage#getNsPrefix()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsPrefix();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFactory Instance</em>'.
	 * @see ecoreDiffMM.EPackage#getEFactoryInstance()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EFactoryInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
	 * @see ecoreDiffMM.EPackage#getEClassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESubpackages</em>'.
	 * @see ecoreDiffMM.EPackage#getESubpackages()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESubpackages();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ESuper Package</em>'.
	 * @see ecoreDiffMM.EPackage#getESuperPackage()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESuperPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see ecoreDiffMM.EPackage#getDomainspecificdiffs()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getDiffeFactoryInstance <em>Diffe Factory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Factory Instance</em>'.
	 * @see ecoreDiffMM.EPackage#getDiffeFactoryInstance()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_DiffeFactoryInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getDiffeClassifiers <em>Diffe Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Classifiers</em>'.
	 * @see ecoreDiffMM.EPackage#getDiffeClassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_DiffeClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getDiffeSubpackages <em>Diffe Subpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Subpackages</em>'.
	 * @see ecoreDiffMM.EPackage#getDiffeSubpackages()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_DiffeSubpackages();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getDiffeSuperPackage <em>Diffe Super Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Super Package</em>'.
	 * @see ecoreDiffMM.EPackage#getDiffeSuperPackage()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_DiffeSuperPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EPackage#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see ecoreDiffMM.EPackage#getDiffdomainspecificdiffs()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EPackage#getEClassifier(java.lang.String) <em>Get EClassifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EClassifier</em>' operation.
	 * @see ecoreDiffMM.EPackage#getEClassifier(java.lang.String)
	 * @generated
	 */
	EOperation getEPackage__GetEClassifier__String();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see ecoreDiffMM.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EOperation</em>'.
	 * @see ecoreDiffMM.EParameter#getEOperation()
	 * @see #getEParameter()
	 * @generated
	 */
	EReference getEParameter_EOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EParameter#getDiffeOperation <em>Diffe Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Operation</em>'.
	 * @see ecoreDiffMM.EParameter#getDiffeOperation()
	 * @see #getEParameter()
	 * @generated
	 */
	EReference getEParameter_DiffeOperation();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see ecoreDiffMM.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see ecoreDiffMM.EReference#isContainment()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Containment();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EReference#isContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see ecoreDiffMM.EReference#isContainer()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Container();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EReference#isResolveProxies <em>Resolve Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Proxies</em>'.
	 * @see ecoreDiffMM.EReference#isResolveProxies()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_ResolveProxies();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EReference#getEOpposite <em>EOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOpposite</em>'.
	 * @see ecoreDiffMM.EReference#getEOpposite()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EOpposite();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EReference#getEReferenceType <em>EReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Type</em>'.
	 * @see ecoreDiffMM.EReference#getEReferenceType()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EReferenceType();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.EReference#getEKeys <em>EKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EKeys</em>'.
	 * @see ecoreDiffMM.EReference#getEKeys()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EKeys();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EReference#getDiffeOpposite <em>Diffe Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Opposite</em>'.
	 * @see ecoreDiffMM.EReference#getDiffeOpposite()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_DiffeOpposite();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EReference#getDiffeReferenceType <em>Diffe Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Reference Type</em>'.
	 * @see ecoreDiffMM.EReference#getDiffeReferenceType()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_DiffeReferenceType();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EReference#getDiffeKeys <em>Diffe Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Keys</em>'.
	 * @see ecoreDiffMM.EReference#getDiffeKeys()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_DiffeKeys();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature</em>'.
	 * @see ecoreDiffMM.EStructuralFeature
	 * @generated
	 */
	EClass getEStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#isChangeable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#isVolatile()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#isTransient()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Transient();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#getDefaultValueLiteral()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#getDefaultValue()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#isUnsettable <em>Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#isUnsettable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Unsettable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.EStructuralFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#isDerived()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Derived();

	/**
	 * Returns the meta object for the container reference '{@link ecoreDiffMM.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#getEContainingClass()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EReference getEStructuralFeature_EContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EStructuralFeature#getDiffeContainingClass <em>Diffe Containing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Containing Class</em>'.
	 * @see ecoreDiffMM.EStructuralFeature#getDiffeContainingClass()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EReference getEStructuralFeature_DiffeContainingClass();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EStructuralFeature#getFeatureID() <em>Get Feature ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature ID</em>' operation.
	 * @see ecoreDiffMM.EStructuralFeature#getFeatureID()
	 * @generated
	 */
	EOperation getEStructuralFeature__GetFeatureID();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EStructuralFeature#getContainerClass() <em>Get Container Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container Class</em>' operation.
	 * @see ecoreDiffMM.EStructuralFeature#getContainerClass()
	 * @generated
	 */
	EOperation getEStructuralFeature__GetContainerClass();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETyped Element</em>'.
	 * @see ecoreDiffMM.ETypedElement
	 * @generated
	 */
	EClass getETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ETypedElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see ecoreDiffMM.ETypedElement#isOrdered()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ETypedElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ecoreDiffMM.ETypedElement#isUnique()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Unique();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ETypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ecoreDiffMM.ETypedElement#getLowerBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ETypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ecoreDiffMM.ETypedElement#getUpperBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ETypedElement#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see ecoreDiffMM.ETypedElement#isMany()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Many();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.ETypedElement#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see ecoreDiffMM.ETypedElement#isRequired()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Required();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.ETypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.ETypedElement#getEType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EType();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreDiffMM.ETypedElement#getEGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EGeneric Type</em>'.
	 * @see ecoreDiffMM.ETypedElement#getEGenericType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EGenericType();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.ETypedElement#getDiffeType <em>Diffe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Type</em>'.
	 * @see ecoreDiffMM.ETypedElement#getDiffeType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_DiffeType();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.ETypedElement#getDiffeGenericType <em>Diffe Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Generic Type</em>'.
	 * @see ecoreDiffMM.ETypedElement#getDiffeGenericType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_DiffeGenericType();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="ecoreDiffMM.EString"
	 *        valueDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	EClass getEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGeneric Type</em>'.
	 * @see ecoreDiffMM.EGenericType
	 * @generated
	 */
	EClass getEGenericType();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreDiffMM.EGenericType#getEUpperBound <em>EUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EUpper Bound</em>'.
	 * @see ecoreDiffMM.EGenericType#getEUpperBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EUpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getETypeArguments <em>EType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Arguments</em>'.
	 * @see ecoreDiffMM.EGenericType#getETypeArguments()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeArguments();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EGenericType#getERawType <em>ERaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ERaw Type</em>'.
	 * @see ecoreDiffMM.EGenericType#getERawType()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ERawType();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreDiffMM.EGenericType#getELowerBound <em>ELower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELower Bound</em>'.
	 * @see ecoreDiffMM.EGenericType#getELowerBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ELowerBound();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EGenericType#getETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType Parameter</em>'.
	 * @see ecoreDiffMM.EGenericType#getETypeParameter()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeParameter();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.EGenericType#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see ecoreDiffMM.EGenericType#getEClassifier()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getDiffeUpperBound <em>Diffe Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Upper Bound</em>'.
	 * @see ecoreDiffMM.EGenericType#getDiffeUpperBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_DiffeUpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getDiffeTypeArguments <em>Diffe Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Type Arguments</em>'.
	 * @see ecoreDiffMM.EGenericType#getDiffeTypeArguments()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_DiffeTypeArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getDiffeRawType <em>Diffe Raw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Raw Type</em>'.
	 * @see ecoreDiffMM.EGenericType#getDiffeRawType()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_DiffeRawType();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getDiffeLowerBound <em>Diffe Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Lower Bound</em>'.
	 * @see ecoreDiffMM.EGenericType#getDiffeLowerBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_DiffeLowerBound();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getDiffeTypeParameter <em>Diffe Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Type Parameter</em>'.
	 * @see ecoreDiffMM.EGenericType#getDiffeTypeParameter()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_DiffeTypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.EGenericType#getDiffeClassifier <em>Diffe Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Classifier</em>'.
	 * @see ecoreDiffMM.EGenericType#getDiffeClassifier()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_DiffeClassifier();

	/**
	 * Returns the meta object for the '{@link ecoreDiffMM.EGenericType#isInstance(java.lang.Object) <em>Is Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Instance</em>' operation.
	 * @see ecoreDiffMM.EGenericType#isInstance(java.lang.Object)
	 * @generated
	 */
	EOperation getEGenericType__IsInstance__Object();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.ETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType Parameter</em>'.
	 * @see ecoreDiffMM.ETypeParameter
	 * @generated
	 */
	EClass getETypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.ETypeParameter#getEBounds <em>EBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBounds</em>'.
	 * @see ecoreDiffMM.ETypeParameter#getEBounds()
	 * @see #getETypeParameter()
	 * @generated
	 */
	EReference getETypeParameter_EBounds();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreDiffMM.ETypeParameter#getDiffeBounds <em>Diffe Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffe Bounds</em>'.
	 * @see ecoreDiffMM.ETypeParameter#getDiffeBounds()
	 * @see #getETypeParameter()
	 * @generated
	 */
	EReference getETypeParameter_DiffeBounds();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAttribute <em>Domain Specific Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EAttribute</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAttribute()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EAttribute();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAnnotation <em>Domain Specific Diff EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EAnnotation</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAnnotation()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClass <em>Domain Specific Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EClass</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClass()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EClass();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClassifier <em>Domain Specific Diff EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EClassifier</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClassifier()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EClassifier();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EDataType <em>Domain Specific Diff EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EData Type</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EDataType()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EDataType();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EEnum <em>Domain Specific Diff EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EEnum</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EEnum()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EEnum();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EEnumLiteral <em>Domain Specific Diff EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EEnum Literal</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EEnumLiteral()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EEnumLiteral();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EFactory <em>Domain Specific Diff EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EFactory</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EFactory()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EFactory();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EModelElement <em>Domain Specific Diff EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EModel Element</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EModelElement()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EModelElement();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ENamedElement <em>Domain Specific Diff ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff ENamed Element</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ENamedElement()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_ENamedElement();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EObject <em>Domain Specific Diff EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EObject</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EObject()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EObject();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EOperation <em>Domain Specific Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EOperation</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EOperation()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EOperation();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EParameter <em>Domain Specific Diff EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EParameter</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EParameter()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EParameter();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EReference <em>Domain Specific Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EReference</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EReference()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EReference();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EStructuralFeature <em>Domain Specific Diff EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EStructural Feature</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EStructuralFeature()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EStructuralFeature();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ETypedElement <em>Domain Specific Diff ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff ETyped Element</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ETypedElement()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_ETypedElement();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EGenericType <em>Domain Specific Diff EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EGeneric Type</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EGenericType()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EGenericType();

	/**
	 * Returns the meta object for the reference list '{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ETypeParameter <em>Domain Specific Diff EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EType Parameter</em>'.
	 * @see ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ETypeParameter()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_ETypeParameter();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAttribute <em>Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAttribute</em>'.
	 * @see ecoreDiffMM.DiffEAttribute
	 * @generated
	 */
	EClass getDiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#getOperation()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#getNew_name()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_ordered <em>New ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ordered</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_ordered()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_ordered();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_unique <em>New unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unique</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_unique()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_unique();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#getNew_lowerBound <em>New lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lower Bound</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#getNew_lowerBound()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_lowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#getNew_upperBound <em>New upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New upper Bound</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#getNew_upperBound()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_upperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_many <em>New many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New many</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_many()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_many();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_required <em>New required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New required</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_required()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_required();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_changeable <em>New changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New changeable</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_changeable()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_changeable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_volatile <em>New volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New volatile</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_volatile()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_volatile();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_transient <em>New transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New transient</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_transient()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_transient();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#getNew_defaultValueLiteral <em>New default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value Literal</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#getNew_defaultValueLiteral()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_defaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#getNew_defaultValue <em>New default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#getNew_defaultValue()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_defaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_unsettable <em>New unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unsettable</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_unsettable()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_unsettable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_derived <em>New derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New derived</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_derived()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_derived();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute#isNew_iD <em>New iD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New iD</em>'.
	 * @see ecoreDiffMM.DiffEAttribute#isNew_iD()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_iD();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAttribute_eAttributeType <em>Diff EAttribute eAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAttribute eAttribute Type</em>'.
	 * @see ecoreDiffMM.DiffEAttribute_eAttributeType
	 * @generated
	 */
	EClass getDiffEAttribute_eAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAttribute_eAttributeType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAttribute_eAttributeType#getOperation()
	 * @see #getDiffEAttribute_eAttributeType()
	 * @generated
	 */
	EAttribute getDiffEAttribute_eAttributeType_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEAttribute_eAttributeType#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEAttribute_eAttributeType#getEType()
	 * @see #getDiffEAttribute_eAttributeType()
	 * @generated
	 */
	EReference getDiffEAttribute_eAttributeType_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAnnotation <em>Diff EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAnnotation</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation
	 * @generated
	 */
	EClass getDiffEAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAnnotation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation#getOperation()
	 * @see #getDiffEAnnotation()
	 * @generated
	 */
	EAttribute getDiffEAnnotation_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAnnotation#getNew_source <em>New source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New source</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation#getNew_source()
	 * @see #getDiffEAnnotation()
	 * @generated
	 */
	EAttribute getDiffEAnnotation_New_source();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAnnotation_details <em>Diff EAnnotation details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAnnotation details</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_details
	 * @generated
	 */
	EClass getDiffEAnnotation_details();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAnnotation_details#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_details#getOperation()
	 * @see #getDiffEAnnotation_details()
	 * @generated
	 */
	EAttribute getDiffEAnnotation_details_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEAnnotation_details#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_details#getEType()
	 * @see #getDiffEAnnotation_details()
	 * @generated
	 */
	EReference getDiffEAnnotation_details_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAnnotation_eModelElement <em>Diff EAnnotation eModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAnnotation eModel Element</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_eModelElement
	 * @generated
	 */
	EClass getDiffEAnnotation_eModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAnnotation_eModelElement#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_eModelElement#getOperation()
	 * @see #getDiffEAnnotation_eModelElement()
	 * @generated
	 */
	EAttribute getDiffEAnnotation_eModelElement_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEAnnotation_eModelElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_eModelElement#getEType()
	 * @see #getDiffEAnnotation_eModelElement()
	 * @generated
	 */
	EReference getDiffEAnnotation_eModelElement_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAnnotation_contents <em>Diff EAnnotation contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAnnotation contents</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_contents
	 * @generated
	 */
	EClass getDiffEAnnotation_contents();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAnnotation_contents#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_contents#getOperation()
	 * @see #getDiffEAnnotation_contents()
	 * @generated
	 */
	EAttribute getDiffEAnnotation_contents_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEAnnotation_contents#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_contents#getEType()
	 * @see #getDiffEAnnotation_contents()
	 * @generated
	 */
	EReference getDiffEAnnotation_contents_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEAnnotation_references <em>Diff EAnnotation references</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAnnotation references</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_references
	 * @generated
	 */
	EClass getDiffEAnnotation_references();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEAnnotation_references#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_references#getOperation()
	 * @see #getDiffEAnnotation_references()
	 * @generated
	 */
	EAttribute getDiffEAnnotation_references_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEAnnotation_references#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEAnnotation_references#getEType()
	 * @see #getDiffEAnnotation_references()
	 * @generated
	 */
	EReference getDiffEAnnotation_references_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass <em>Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass</em>'.
	 * @see ecoreDiffMM.DiffEClass
	 * @generated
	 */
	EClass getDiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass#getOperation()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEClass#getNew_name()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#getNew_instanceClassName <em>New instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Class Name</em>'.
	 * @see ecoreDiffMM.DiffEClass#getNew_instanceClassName()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_instanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#getNew_instanceClass <em>New instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Class</em>'.
	 * @see ecoreDiffMM.DiffEClass#getNew_instanceClass()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_instanceClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#getNew_defaultValue <em>New default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value</em>'.
	 * @see ecoreDiffMM.DiffEClass#getNew_defaultValue()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_defaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#getNew_instanceTypeName <em>New instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Type Name</em>'.
	 * @see ecoreDiffMM.DiffEClass#getNew_instanceTypeName()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_instanceTypeName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#isNew_abstract <em>New abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New abstract</em>'.
	 * @see ecoreDiffMM.DiffEClass#isNew_abstract()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_abstract();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass#isNew_interface <em>New interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New interface</em>'.
	 * @see ecoreDiffMM.DiffEClass#isNew_interface()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_interface();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eSuperTypes <em>Diff EClass eSuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eSuper Types</em>'.
	 * @see ecoreDiffMM.DiffEClass_eSuperTypes
	 * @generated
	 */
	EClass getDiffEClass_eSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eSuperTypes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eSuperTypes#getOperation()
	 * @see #getDiffEClass_eSuperTypes()
	 * @generated
	 */
	EAttribute getDiffEClass_eSuperTypes_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eSuperTypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eSuperTypes#getEType()
	 * @see #getDiffEClass_eSuperTypes()
	 * @generated
	 */
	EReference getDiffEClass_eSuperTypes_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eOperations <em>Diff EClass eOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eOperations</em>'.
	 * @see ecoreDiffMM.DiffEClass_eOperations
	 * @generated
	 */
	EClass getDiffEClass_eOperations();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eOperations#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eOperations#getOperation()
	 * @see #getDiffEClass_eOperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eOperations_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eOperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eOperations#getEType()
	 * @see #getDiffEClass_eOperations()
	 * @generated
	 */
	EReference getDiffEClass_eOperations_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllAttributes <em>Diff EClass eAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll Attributes</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllAttributes
	 * @generated
	 */
	EClass getDiffEClass_eAllAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllAttributes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllAttributes#getOperation()
	 * @see #getDiffEClass_eAllAttributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllAttributes_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllAttributes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllAttributes#getEType()
	 * @see #getDiffEClass_eAllAttributes()
	 * @generated
	 */
	EReference getDiffEClass_eAllAttributes_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllReferences <em>Diff EClass eAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll References</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllReferences
	 * @generated
	 */
	EClass getDiffEClass_eAllReferences();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllReferences#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllReferences#getOperation()
	 * @see #getDiffEClass_eAllReferences()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllReferences_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllReferences#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllReferences#getEType()
	 * @see #getDiffEClass_eAllReferences()
	 * @generated
	 */
	EReference getDiffEClass_eAllReferences_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eReferences <em>Diff EClass eReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eReferences</em>'.
	 * @see ecoreDiffMM.DiffEClass_eReferences
	 * @generated
	 */
	EClass getDiffEClass_eReferences();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eReferences#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eReferences#getOperation()
	 * @see #getDiffEClass_eReferences()
	 * @generated
	 */
	EAttribute getDiffEClass_eReferences_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eReferences#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eReferences#getEType()
	 * @see #getDiffEClass_eReferences()
	 * @generated
	 */
	EReference getDiffEClass_eReferences_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAttributes <em>Diff EClass eAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAttributes</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAttributes
	 * @generated
	 */
	EClass getDiffEClass_eAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAttributes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAttributes#getOperation()
	 * @see #getDiffEClass_eAttributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eAttributes_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAttributes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAttributes#getEType()
	 * @see #getDiffEClass_eAttributes()
	 * @generated
	 */
	EReference getDiffEClass_eAttributes_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllContainments <em>Diff EClass eAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll Containments</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllContainments
	 * @generated
	 */
	EClass getDiffEClass_eAllContainments();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllContainments#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllContainments#getOperation()
	 * @see #getDiffEClass_eAllContainments()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllContainments_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllContainments#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllContainments#getEType()
	 * @see #getDiffEClass_eAllContainments()
	 * @generated
	 */
	EReference getDiffEClass_eAllContainments_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllOperations <em>Diff EClass eAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll Operations</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllOperations
	 * @generated
	 */
	EClass getDiffEClass_eAllOperations();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllOperations#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllOperations#getOperation()
	 * @see #getDiffEClass_eAllOperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllOperations_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllOperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllOperations#getEType()
	 * @see #getDiffEClass_eAllOperations()
	 * @generated
	 */
	EReference getDiffEClass_eAllOperations_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllStructuralFeatures <em>Diff EClass eAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll Structural Features</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllStructuralFeatures
	 * @generated
	 */
	EClass getDiffEClass_eAllStructuralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllStructuralFeatures#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllStructuralFeatures#getOperation()
	 * @see #getDiffEClass_eAllStructuralFeatures()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllStructuralFeatures_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllStructuralFeatures#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllStructuralFeatures#getEType()
	 * @see #getDiffEClass_eAllStructuralFeatures()
	 * @generated
	 */
	EReference getDiffEClass_eAllStructuralFeatures_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllSuperTypes <em>Diff EClass eAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll Super Types</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllSuperTypes
	 * @generated
	 */
	EClass getDiffEClass_eAllSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllSuperTypes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllSuperTypes#getOperation()
	 * @see #getDiffEClass_eAllSuperTypes()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllSuperTypes_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllSuperTypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllSuperTypes#getEType()
	 * @see #getDiffEClass_eAllSuperTypes()
	 * @generated
	 */
	EReference getDiffEClass_eAllSuperTypes_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eIDAttribute <em>Diff EClass eID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eID Attribute</em>'.
	 * @see ecoreDiffMM.DiffEClass_eIDAttribute
	 * @generated
	 */
	EClass getDiffEClass_eIDAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eIDAttribute#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eIDAttribute#getOperation()
	 * @see #getDiffEClass_eIDAttribute()
	 * @generated
	 */
	EAttribute getDiffEClass_eIDAttribute_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eIDAttribute#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eIDAttribute#getEType()
	 * @see #getDiffEClass_eIDAttribute()
	 * @generated
	 */
	EReference getDiffEClass_eIDAttribute_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eStructuralFeatures <em>Diff EClass eStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eStructural Features</em>'.
	 * @see ecoreDiffMM.DiffEClass_eStructuralFeatures
	 * @generated
	 */
	EClass getDiffEClass_eStructuralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eStructuralFeatures#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eStructuralFeatures#getOperation()
	 * @see #getDiffEClass_eStructuralFeatures()
	 * @generated
	 */
	EAttribute getDiffEClass_eStructuralFeatures_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eStructuralFeatures#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eStructuralFeatures#getEType()
	 * @see #getDiffEClass_eStructuralFeatures()
	 * @generated
	 */
	EReference getDiffEClass_eStructuralFeatures_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eGenericSuperTypes <em>Diff EClass eGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eGeneric Super Types</em>'.
	 * @see ecoreDiffMM.DiffEClass_eGenericSuperTypes
	 * @generated
	 */
	EClass getDiffEClass_eGenericSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eGenericSuperTypes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eGenericSuperTypes#getOperation()
	 * @see #getDiffEClass_eGenericSuperTypes()
	 * @generated
	 */
	EAttribute getDiffEClass_eGenericSuperTypes_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eGenericSuperTypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eGenericSuperTypes#getEType()
	 * @see #getDiffEClass_eGenericSuperTypes()
	 * @generated
	 */
	EReference getDiffEClass_eGenericSuperTypes_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClass_eAllGenericSuperTypes <em>Diff EClass eAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eAll Generic Super Types</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllGenericSuperTypes
	 * @generated
	 */
	EClass getDiffEClass_eAllGenericSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClass_eAllGenericSuperTypes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllGenericSuperTypes#getOperation()
	 * @see #getDiffEClass_eAllGenericSuperTypes()
	 * @generated
	 */
	EAttribute getDiffEClass_eAllGenericSuperTypes_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClass_eAllGenericSuperTypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClass_eAllGenericSuperTypes#getEType()
	 * @see #getDiffEClass_eAllGenericSuperTypes()
	 * @generated
	 */
	EReference getDiffEClass_eAllGenericSuperTypes_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClassifier_ePackage <em>Diff EClassifier ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClassifier ePackage</em>'.
	 * @see ecoreDiffMM.DiffEClassifier_ePackage
	 * @generated
	 */
	EClass getDiffEClassifier_ePackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClassifier_ePackage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClassifier_ePackage#getOperation()
	 * @see #getDiffEClassifier_ePackage()
	 * @generated
	 */
	EAttribute getDiffEClassifier_ePackage_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClassifier_ePackage#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClassifier_ePackage#getEType()
	 * @see #getDiffEClassifier_ePackage()
	 * @generated
	 */
	EReference getDiffEClassifier_ePackage_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEClassifier_eTypeParameters <em>Diff EClassifier eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClassifier eType Parameters</em>'.
	 * @see ecoreDiffMM.DiffEClassifier_eTypeParameters
	 * @generated
	 */
	EClass getDiffEClassifier_eTypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEClassifier_eTypeParameters#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEClassifier_eTypeParameters#getOperation()
	 * @see #getDiffEClassifier_eTypeParameters()
	 * @generated
	 */
	EAttribute getDiffEClassifier_eTypeParameters_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEClassifier_eTypeParameters#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEClassifier_eTypeParameters#getEType()
	 * @see #getDiffEClassifier_eTypeParameters()
	 * @generated
	 */
	EReference getDiffEClassifier_eTypeParameters_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEDataType <em>Diff EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EData Type</em>'.
	 * @see ecoreDiffMM.DiffEDataType
	 * @generated
	 */
	EClass getDiffEDataType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEDataType#getOperation()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEDataType#getNew_name()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#getNew_instanceClassName <em>New instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Class Name</em>'.
	 * @see ecoreDiffMM.DiffEDataType#getNew_instanceClassName()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_New_instanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#getNew_instanceClass <em>New instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Class</em>'.
	 * @see ecoreDiffMM.DiffEDataType#getNew_instanceClass()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_New_instanceClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#getNew_defaultValue <em>New default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value</em>'.
	 * @see ecoreDiffMM.DiffEDataType#getNew_defaultValue()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_New_defaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#getNew_instanceTypeName <em>New instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Type Name</em>'.
	 * @see ecoreDiffMM.DiffEDataType#getNew_instanceTypeName()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_New_instanceTypeName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEDataType#isNew_serializable <em>New serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New serializable</em>'.
	 * @see ecoreDiffMM.DiffEDataType#isNew_serializable()
	 * @see #getDiffEDataType()
	 * @generated
	 */
	EAttribute getDiffEDataType_New_serializable();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEEnum <em>Diff EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EEnum</em>'.
	 * @see ecoreDiffMM.DiffEEnum
	 * @generated
	 */
	EClass getDiffEEnum();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEEnum#getOperation()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEEnum#getNew_name()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#getNew_instanceClassName <em>New instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Class Name</em>'.
	 * @see ecoreDiffMM.DiffEEnum#getNew_instanceClassName()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_New_instanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#getNew_instanceClass <em>New instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Class</em>'.
	 * @see ecoreDiffMM.DiffEEnum#getNew_instanceClass()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_New_instanceClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#getNew_defaultValue <em>New default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value</em>'.
	 * @see ecoreDiffMM.DiffEEnum#getNew_defaultValue()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_New_defaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#getNew_instanceTypeName <em>New instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance Type Name</em>'.
	 * @see ecoreDiffMM.DiffEEnum#getNew_instanceTypeName()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_New_instanceTypeName();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum#isNew_serializable <em>New serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New serializable</em>'.
	 * @see ecoreDiffMM.DiffEEnum#isNew_serializable()
	 * @see #getDiffEEnum()
	 * @generated
	 */
	EAttribute getDiffEEnum_New_serializable();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEEnum_eLiterals <em>Diff EEnum eLiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EEnum eLiterals</em>'.
	 * @see ecoreDiffMM.DiffEEnum_eLiterals
	 * @generated
	 */
	EClass getDiffEEnum_eLiterals();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnum_eLiterals#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEEnum_eLiterals#getOperation()
	 * @see #getDiffEEnum_eLiterals()
	 * @generated
	 */
	EAttribute getDiffEEnum_eLiterals_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEEnum_eLiterals#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEEnum_eLiterals#getEType()
	 * @see #getDiffEEnum_eLiterals()
	 * @generated
	 */
	EReference getDiffEEnum_eLiterals_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEEnumLiteral <em>Diff EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EEnum Literal</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral
	 * @generated
	 */
	EClass getDiffEEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnumLiteral#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral#getOperation()
	 * @see #getDiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getDiffEEnumLiteral_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral#getNew_name()
	 * @see #getDiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getDiffEEnumLiteral_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral#getNew_value()
	 * @see #getDiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getDiffEEnumLiteral_New_value();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_instance <em>New instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New instance</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral#getNew_instance()
	 * @see #getDiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getDiffEEnumLiteral_New_instance();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_literal <em>New literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New literal</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral#getNew_literal()
	 * @see #getDiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getDiffEEnumLiteral_New_literal();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEEnumLiteral_eEnum <em>Diff EEnum Literal eEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EEnum Literal eEnum</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral_eEnum
	 * @generated
	 */
	EClass getDiffEEnumLiteral_eEnum();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEEnumLiteral_eEnum#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral_eEnum#getOperation()
	 * @see #getDiffEEnumLiteral_eEnum()
	 * @generated
	 */
	EAttribute getDiffEEnumLiteral_eEnum_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEEnumLiteral_eEnum#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEEnumLiteral_eEnum#getEType()
	 * @see #getDiffEEnumLiteral_eEnum()
	 * @generated
	 */
	EReference getDiffEEnumLiteral_eEnum_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEFactory <em>Diff EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EFactory</em>'.
	 * @see ecoreDiffMM.DiffEFactory
	 * @generated
	 */
	EClass getDiffEFactory();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEFactory#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEFactory#getOperation()
	 * @see #getDiffEFactory()
	 * @generated
	 */
	EAttribute getDiffEFactory_Operation();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEFactory_ePackage <em>Diff EFactory ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EFactory ePackage</em>'.
	 * @see ecoreDiffMM.DiffEFactory_ePackage
	 * @generated
	 */
	EClass getDiffEFactory_ePackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEFactory_ePackage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEFactory_ePackage#getOperation()
	 * @see #getDiffEFactory_ePackage()
	 * @generated
	 */
	EAttribute getDiffEFactory_ePackage_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEFactory_ePackage#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEFactory_ePackage#getEType()
	 * @see #getDiffEFactory_ePackage()
	 * @generated
	 */
	EReference getDiffEFactory_ePackage_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEModelElement_eAnnotations <em>Diff EModel Element eAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EModel Element eAnnotations</em>'.
	 * @see ecoreDiffMM.DiffEModelElement_eAnnotations
	 * @generated
	 */
	EClass getDiffEModelElement_eAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEModelElement_eAnnotations#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEModelElement_eAnnotations#getOperation()
	 * @see #getDiffEModelElement_eAnnotations()
	 * @generated
	 */
	EAttribute getDiffEModelElement_eAnnotations_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEModelElement_eAnnotations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEModelElement_eAnnotations#getEType()
	 * @see #getDiffEModelElement_eAnnotations()
	 * @generated
	 */
	EReference getDiffEModelElement_eAnnotations_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEObject <em>Diff EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EObject</em>'.
	 * @see ecoreDiffMM.DiffEObject
	 * @generated
	 */
	EClass getDiffEObject();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEObject#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEObject#getOperation()
	 * @see #getDiffEObject()
	 * @generated
	 */
	EAttribute getDiffEObject_Operation();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEOperation <em>Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation</em>'.
	 * @see ecoreDiffMM.DiffEOperation
	 * @generated
	 */
	EClass getDiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEOperation#getOperation()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEOperation#getNew_name()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#isNew_ordered <em>New ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ordered</em>'.
	 * @see ecoreDiffMM.DiffEOperation#isNew_ordered()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_ordered();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#isNew_unique <em>New unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unique</em>'.
	 * @see ecoreDiffMM.DiffEOperation#isNew_unique()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_unique();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#getNew_lowerBound <em>New lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lower Bound</em>'.
	 * @see ecoreDiffMM.DiffEOperation#getNew_lowerBound()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_lowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#getNew_upperBound <em>New upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New upper Bound</em>'.
	 * @see ecoreDiffMM.DiffEOperation#getNew_upperBound()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_upperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#isNew_many <em>New many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New many</em>'.
	 * @see ecoreDiffMM.DiffEOperation#isNew_many()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_many();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation#isNew_required <em>New required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New required</em>'.
	 * @see ecoreDiffMM.DiffEOperation#isNew_required()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_required();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEOperation_eContainingClass <em>Diff EOperation eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation eContaining Class</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eContainingClass
	 * @generated
	 */
	EClass getDiffEOperation_eContainingClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation_eContainingClass#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eContainingClass#getOperation()
	 * @see #getDiffEOperation_eContainingClass()
	 * @generated
	 */
	EAttribute getDiffEOperation_eContainingClass_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEOperation_eContainingClass#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eContainingClass#getEType()
	 * @see #getDiffEOperation_eContainingClass()
	 * @generated
	 */
	EReference getDiffEOperation_eContainingClass_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEOperation_eTypeParameters <em>Diff EOperation eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation eType Parameters</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eTypeParameters
	 * @generated
	 */
	EClass getDiffEOperation_eTypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation_eTypeParameters#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eTypeParameters#getOperation()
	 * @see #getDiffEOperation_eTypeParameters()
	 * @generated
	 */
	EAttribute getDiffEOperation_eTypeParameters_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEOperation_eTypeParameters#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eTypeParameters#getEType()
	 * @see #getDiffEOperation_eTypeParameters()
	 * @generated
	 */
	EReference getDiffEOperation_eTypeParameters_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEOperation_eParameters <em>Diff EOperation eParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation eParameters</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eParameters
	 * @generated
	 */
	EClass getDiffEOperation_eParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation_eParameters#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eParameters#getOperation()
	 * @see #getDiffEOperation_eParameters()
	 * @generated
	 */
	EAttribute getDiffEOperation_eParameters_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEOperation_eParameters#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eParameters#getEType()
	 * @see #getDiffEOperation_eParameters()
	 * @generated
	 */
	EReference getDiffEOperation_eParameters_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEOperation_eExceptions <em>Diff EOperation eExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation eExceptions</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eExceptions
	 * @generated
	 */
	EClass getDiffEOperation_eExceptions();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation_eExceptions#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eExceptions#getOperation()
	 * @see #getDiffEOperation_eExceptions()
	 * @generated
	 */
	EAttribute getDiffEOperation_eExceptions_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEOperation_eExceptions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eExceptions#getEType()
	 * @see #getDiffEOperation_eExceptions()
	 * @generated
	 */
	EReference getDiffEOperation_eExceptions_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEOperation_eGenericExceptions <em>Diff EOperation eGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation eGeneric Exceptions</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eGenericExceptions
	 * @generated
	 */
	EClass getDiffEOperation_eGenericExceptions();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEOperation_eGenericExceptions#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eGenericExceptions#getOperation()
	 * @see #getDiffEOperation_eGenericExceptions()
	 * @generated
	 */
	EAttribute getDiffEOperation_eGenericExceptions_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEOperation_eGenericExceptions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEOperation_eGenericExceptions#getEType()
	 * @see #getDiffEOperation_eGenericExceptions()
	 * @generated
	 */
	EReference getDiffEOperation_eGenericExceptions_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEPackage <em>Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage</em>'.
	 * @see ecoreDiffMM.DiffEPackage
	 * @generated
	 */
	EClass getDiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEPackage#getOperation()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEPackage#getNew_name()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage#getNew_nsURI <em>New ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ns URI</em>'.
	 * @see ecoreDiffMM.DiffEPackage#getNew_nsURI()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_nsURI();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage#getNew_nsPrefix <em>New ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ns Prefix</em>'.
	 * @see ecoreDiffMM.DiffEPackage#getNew_nsPrefix()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_nsPrefix();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEPackage_eFactoryInstance <em>Diff EPackage eFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eFactory Instance</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eFactoryInstance
	 * @generated
	 */
	EClass getDiffEPackage_eFactoryInstance();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage_eFactoryInstance#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eFactoryInstance#getOperation()
	 * @see #getDiffEPackage_eFactoryInstance()
	 * @generated
	 */
	EAttribute getDiffEPackage_eFactoryInstance_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEPackage_eFactoryInstance#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eFactoryInstance#getEType()
	 * @see #getDiffEPackage_eFactoryInstance()
	 * @generated
	 */
	EReference getDiffEPackage_eFactoryInstance_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEPackage_eClassifiers <em>Diff EPackage eClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eClassifiers</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eClassifiers
	 * @generated
	 */
	EClass getDiffEPackage_eClassifiers();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage_eClassifiers#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eClassifiers#getOperation()
	 * @see #getDiffEPackage_eClassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eClassifiers_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEPackage_eClassifiers#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eClassifiers#getEType()
	 * @see #getDiffEPackage_eClassifiers()
	 * @generated
	 */
	EReference getDiffEPackage_eClassifiers_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEPackage_eSubpackages <em>Diff EPackage eSubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eSubpackages</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eSubpackages
	 * @generated
	 */
	EClass getDiffEPackage_eSubpackages();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage_eSubpackages#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eSubpackages#getOperation()
	 * @see #getDiffEPackage_eSubpackages()
	 * @generated
	 */
	EAttribute getDiffEPackage_eSubpackages_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEPackage_eSubpackages#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eSubpackages#getEType()
	 * @see #getDiffEPackage_eSubpackages()
	 * @generated
	 */
	EReference getDiffEPackage_eSubpackages_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEPackage_eSuperPackage <em>Diff EPackage eSuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eSuper Package</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eSuperPackage
	 * @generated
	 */
	EClass getDiffEPackage_eSuperPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage_eSuperPackage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eSuperPackage#getOperation()
	 * @see #getDiffEPackage_eSuperPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_eSuperPackage_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEPackage_eSuperPackage#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEPackage_eSuperPackage#getEType()
	 * @see #getDiffEPackage_eSuperPackage()
	 * @generated
	 */
	EReference getDiffEPackage_eSuperPackage_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs <em>Diff EPackage domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage domainspecificdiffs</em>'.
	 * @see ecoreDiffMM.DiffEPackage_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffEPackage_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEPackage_domainspecificdiffs#getOperation()
	 * @see #getDiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffEPackage_domainspecificdiffs_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEPackage_domainspecificdiffs#getEType()
	 * @see #getDiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffEPackage_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEParameter <em>Diff EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EParameter</em>'.
	 * @see ecoreDiffMM.DiffEParameter
	 * @generated
	 */
	EClass getDiffEParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEParameter#getOperation()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEParameter#getNew_name()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#isNew_ordered <em>New ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ordered</em>'.
	 * @see ecoreDiffMM.DiffEParameter#isNew_ordered()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_ordered();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#isNew_unique <em>New unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unique</em>'.
	 * @see ecoreDiffMM.DiffEParameter#isNew_unique()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_unique();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#getNew_lowerBound <em>New lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lower Bound</em>'.
	 * @see ecoreDiffMM.DiffEParameter#getNew_lowerBound()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_lowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#getNew_upperBound <em>New upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New upper Bound</em>'.
	 * @see ecoreDiffMM.DiffEParameter#getNew_upperBound()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_upperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#isNew_many <em>New many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New many</em>'.
	 * @see ecoreDiffMM.DiffEParameter#isNew_many()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_many();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter#isNew_required <em>New required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New required</em>'.
	 * @see ecoreDiffMM.DiffEParameter#isNew_required()
	 * @see #getDiffEParameter()
	 * @generated
	 */
	EAttribute getDiffEParameter_New_required();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEParameter_eOperation <em>Diff EParameter eOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EParameter eOperation</em>'.
	 * @see ecoreDiffMM.DiffEParameter_eOperation
	 * @generated
	 */
	EClass getDiffEParameter_eOperation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEParameter_eOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEParameter_eOperation#getOperation()
	 * @see #getDiffEParameter_eOperation()
	 * @generated
	 */
	EAttribute getDiffEParameter_eOperation_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEParameter_eOperation#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEParameter_eOperation#getEType()
	 * @see #getDiffEParameter_eOperation()
	 * @generated
	 */
	EReference getDiffEParameter_eOperation_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEReference <em>Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference</em>'.
	 * @see ecoreDiffMM.DiffEReference
	 * @generated
	 */
	EClass getDiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEReference#getOperation()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffEReference#getNew_name()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_ordered <em>New ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ordered</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_ordered()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_ordered();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_unique <em>New unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unique</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_unique()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_unique();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#getNew_lowerBound <em>New lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lower Bound</em>'.
	 * @see ecoreDiffMM.DiffEReference#getNew_lowerBound()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_lowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#getNew_upperBound <em>New upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New upper Bound</em>'.
	 * @see ecoreDiffMM.DiffEReference#getNew_upperBound()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_upperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_many <em>New many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New many</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_many()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_many();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_required <em>New required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New required</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_required()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_required();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_changeable <em>New changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New changeable</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_changeable()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_changeable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_volatile <em>New volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New volatile</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_volatile()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_volatile();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_transient <em>New transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New transient</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_transient()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_transient();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#getNew_defaultValueLiteral <em>New default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value Literal</em>'.
	 * @see ecoreDiffMM.DiffEReference#getNew_defaultValueLiteral()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_defaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#getNew_defaultValue <em>New default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New default Value</em>'.
	 * @see ecoreDiffMM.DiffEReference#getNew_defaultValue()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_defaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_unsettable <em>New unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unsettable</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_unsettable()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_unsettable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_derived <em>New derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New derived</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_derived()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_derived();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_containment <em>New containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New containment</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_containment()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_containment();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_container <em>New container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New container</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_container()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_container();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference#isNew_resolveProxies <em>New resolve Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New resolve Proxies</em>'.
	 * @see ecoreDiffMM.DiffEReference#isNew_resolveProxies()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_resolveProxies();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEReference_eOpposite <em>Diff EReference eOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference eOpposite</em>'.
	 * @see ecoreDiffMM.DiffEReference_eOpposite
	 * @generated
	 */
	EClass getDiffEReference_eOpposite();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference_eOpposite#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEReference_eOpposite#getOperation()
	 * @see #getDiffEReference_eOpposite()
	 * @generated
	 */
	EAttribute getDiffEReference_eOpposite_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEReference_eOpposite#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEReference_eOpposite#getEType()
	 * @see #getDiffEReference_eOpposite()
	 * @generated
	 */
	EReference getDiffEReference_eOpposite_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEReference_eReferenceType <em>Diff EReference eReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference eReference Type</em>'.
	 * @see ecoreDiffMM.DiffEReference_eReferenceType
	 * @generated
	 */
	EClass getDiffEReference_eReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference_eReferenceType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEReference_eReferenceType#getOperation()
	 * @see #getDiffEReference_eReferenceType()
	 * @generated
	 */
	EAttribute getDiffEReference_eReferenceType_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEReference_eReferenceType#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEReference_eReferenceType#getEType()
	 * @see #getDiffEReference_eReferenceType()
	 * @generated
	 */
	EReference getDiffEReference_eReferenceType_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEReference_eKeys <em>Diff EReference eKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference eKeys</em>'.
	 * @see ecoreDiffMM.DiffEReference_eKeys
	 * @generated
	 */
	EClass getDiffEReference_eKeys();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEReference_eKeys#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEReference_eKeys#getOperation()
	 * @see #getDiffEReference_eKeys()
	 * @generated
	 */
	EAttribute getDiffEReference_eKeys_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEReference_eKeys#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEReference_eKeys#getEType()
	 * @see #getDiffEReference_eKeys()
	 * @generated
	 */
	EReference getDiffEReference_eKeys_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEStructuralFeature_eContainingClass <em>Diff EStructural Feature eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EStructural Feature eContaining Class</em>'.
	 * @see ecoreDiffMM.DiffEStructuralFeature_eContainingClass
	 * @generated
	 */
	EClass getDiffEStructuralFeature_eContainingClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEStructuralFeature_eContainingClass#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEStructuralFeature_eContainingClass#getOperation()
	 * @see #getDiffEStructuralFeature_eContainingClass()
	 * @generated
	 */
	EAttribute getDiffEStructuralFeature_eContainingClass_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEStructuralFeature_eContainingClass#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEStructuralFeature_eContainingClass#getEType()
	 * @see #getDiffEStructuralFeature_eContainingClass()
	 * @generated
	 */
	EReference getDiffEStructuralFeature_eContainingClass_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffETypedElement_eType <em>Diff ETyped Element eType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff ETyped Element eType</em>'.
	 * @see ecoreDiffMM.DiffETypedElement_eType
	 * @generated
	 */
	EClass getDiffETypedElement_eType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffETypedElement_eType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffETypedElement_eType#getOperation()
	 * @see #getDiffETypedElement_eType()
	 * @generated
	 */
	EAttribute getDiffETypedElement_eType_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffETypedElement_eType#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffETypedElement_eType#getEType()
	 * @see #getDiffETypedElement_eType()
	 * @generated
	 */
	EReference getDiffETypedElement_eType_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffETypedElement_eGenericType <em>Diff ETyped Element eGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff ETyped Element eGeneric Type</em>'.
	 * @see ecoreDiffMM.DiffETypedElement_eGenericType
	 * @generated
	 */
	EClass getDiffETypedElement_eGenericType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffETypedElement_eGenericType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffETypedElement_eGenericType#getOperation()
	 * @see #getDiffETypedElement_eGenericType()
	 * @generated
	 */
	EAttribute getDiffETypedElement_eGenericType_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffETypedElement_eGenericType#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffETypedElement_eGenericType#getEType()
	 * @see #getDiffETypedElement_eGenericType()
	 * @generated
	 */
	EReference getDiffETypedElement_eGenericType_EType();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Diff EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="operation new_key new_value" 
	 *        operationDataType="ecoreDiffMM.ClassOp" operationRequired="true"
	 *        new_keyDataType="ecoreDiffMM.EString"
	 *        new_valueDataType="ecoreDiffMM.EString" superTypes="ecoreDiffMM.EStringToStringMapEntry"
	 * @generated
	 */
	EClass getDiffEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDiffEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getDiffEStringToStringMapEntry_Operation();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>New key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDiffEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getDiffEStringToStringMapEntry_New_key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDiffEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getDiffEStringToStringMapEntry_New_value();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType <em>Diff EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type</em>'.
	 * @see ecoreDiffMM.DiffEGenericType
	 * @generated
	 */
	EClass getDiffEGenericType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType#getOperation()
	 * @see #getDiffEGenericType()
	 * @generated
	 */
	EAttribute getDiffEGenericType_Operation();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType_eUpperBound <em>Diff EGeneric Type eUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type eUpper Bound</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eUpperBound
	 * @generated
	 */
	EClass getDiffEGenericType_eUpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType_eUpperBound#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eUpperBound#getOperation()
	 * @see #getDiffEGenericType_eUpperBound()
	 * @generated
	 */
	EAttribute getDiffEGenericType_eUpperBound_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEGenericType_eUpperBound#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eUpperBound#getEType()
	 * @see #getDiffEGenericType_eUpperBound()
	 * @generated
	 */
	EReference getDiffEGenericType_eUpperBound_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType_eTypeArguments <em>Diff EGeneric Type eType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type eType Arguments</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeArguments
	 * @generated
	 */
	EClass getDiffEGenericType_eTypeArguments();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType_eTypeArguments#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeArguments#getOperation()
	 * @see #getDiffEGenericType_eTypeArguments()
	 * @generated
	 */
	EAttribute getDiffEGenericType_eTypeArguments_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEGenericType_eTypeArguments#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeArguments#getEType()
	 * @see #getDiffEGenericType_eTypeArguments()
	 * @generated
	 */
	EReference getDiffEGenericType_eTypeArguments_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType_eRawType <em>Diff EGeneric Type eRaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type eRaw Type</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eRawType
	 * @generated
	 */
	EClass getDiffEGenericType_eRawType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType_eRawType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eRawType#getOperation()
	 * @see #getDiffEGenericType_eRawType()
	 * @generated
	 */
	EAttribute getDiffEGenericType_eRawType_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEGenericType_eRawType#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eRawType#getEType()
	 * @see #getDiffEGenericType_eRawType()
	 * @generated
	 */
	EReference getDiffEGenericType_eRawType_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType_eLowerBound <em>Diff EGeneric Type eLower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type eLower Bound</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eLowerBound
	 * @generated
	 */
	EClass getDiffEGenericType_eLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType_eLowerBound#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eLowerBound#getOperation()
	 * @see #getDiffEGenericType_eLowerBound()
	 * @generated
	 */
	EAttribute getDiffEGenericType_eLowerBound_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEGenericType_eLowerBound#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eLowerBound#getEType()
	 * @see #getDiffEGenericType_eLowerBound()
	 * @generated
	 */
	EReference getDiffEGenericType_eLowerBound_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType_eTypeParameter <em>Diff EGeneric Type eType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type eType Parameter</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeParameter
	 * @generated
	 */
	EClass getDiffEGenericType_eTypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType_eTypeParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeParameter#getOperation()
	 * @see #getDiffEGenericType_eTypeParameter()
	 * @generated
	 */
	EAttribute getDiffEGenericType_eTypeParameter_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEGenericType_eTypeParameter#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeParameter#getEType()
	 * @see #getDiffEGenericType_eTypeParameter()
	 * @generated
	 */
	EReference getDiffEGenericType_eTypeParameter_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffEGenericType_eClassifier <em>Diff EGeneric Type eClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EGeneric Type eClassifier</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eClassifier
	 * @generated
	 */
	EClass getDiffEGenericType_eClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffEGenericType_eClassifier#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eClassifier#getOperation()
	 * @see #getDiffEGenericType_eClassifier()
	 * @generated
	 */
	EAttribute getDiffEGenericType_eClassifier_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffEGenericType_eClassifier#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffEGenericType_eClassifier#getEType()
	 * @see #getDiffEGenericType_eClassifier()
	 * @generated
	 */
	EReference getDiffEGenericType_eClassifier_EType();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffETypeParameter <em>Diff EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EType Parameter</em>'.
	 * @see ecoreDiffMM.DiffETypeParameter
	 * @generated
	 */
	EClass getDiffETypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffETypeParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffETypeParameter#getOperation()
	 * @see #getDiffETypeParameter()
	 * @generated
	 */
	EAttribute getDiffETypeParameter_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffETypeParameter#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see ecoreDiffMM.DiffETypeParameter#getNew_name()
	 * @see #getDiffETypeParameter()
	 * @generated
	 */
	EAttribute getDiffETypeParameter_New_name();

	/**
	 * Returns the meta object for class '{@link ecoreDiffMM.DiffETypeParameter_eBounds <em>Diff EType Parameter eBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EType Parameter eBounds</em>'.
	 * @see ecoreDiffMM.DiffETypeParameter_eBounds
	 * @generated
	 */
	EClass getDiffETypeParameter_eBounds();

	/**
	 * Returns the meta object for the attribute '{@link ecoreDiffMM.DiffETypeParameter_eBounds#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see ecoreDiffMM.DiffETypeParameter_eBounds#getOperation()
	 * @see #getDiffETypeParameter_eBounds()
	 * @generated
	 */
	EAttribute getDiffETypeParameter_eBounds_Operation();

	/**
	 * Returns the meta object for the reference '{@link ecoreDiffMM.DiffETypeParameter_eBounds#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see ecoreDiffMM.DiffETypeParameter_eBounds#getEType()
	 * @see #getDiffETypeParameter_eBounds()
	 * @generated
	 */
	EReference getDiffETypeParameter_eBounds_EType();

	/**
	 * Returns the meta object for enum '{@link ecoreDiffMM.ClassOp <em>Class Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Op</em>'.
	 * @see ecoreDiffMM.ClassOp
	 * @generated
	 */
	EEnum getClassOp();

	/**
	 * Returns the meta object for enum '{@link ecoreDiffMM.AscOp <em>Asc Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Op</em>'.
	 * @see ecoreDiffMM.AscOp
	 * @generated
	 */
	EEnum getAscOp();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>EBig Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#decimal'"
	 * @generated
	 */
	EDataType getEBigDecimal();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>EBig Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#integer'"
	 * @generated
	 */
	EDataType getEBigInteger();

	/**
	 * Returns the meta object for data type '<em>EBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#boolean'"
	 * @generated
	 */
	EDataType getEBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>EBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="baseType='EBoolean' name='EBoolean:Object'"
	 * @generated
	 */
	EDataType getEBooleanObject();

	/**
	 * Returns the meta object for data type '<em>EByte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte</em>'.
	 * @model instanceClass="byte"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#byte'"
	 * @generated
	 */
	EDataType getEByte();

	/**
	 * Returns the meta object for data type '<em>EByte Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Array</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#hexBinary'"
	 * @generated
	 */
	EDataType getEByteArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>EByte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Object</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 *        extendedMetaData="baseType='EByte' name='EByte:Object'"
	 * @generated
	 */
	EDataType getEByteObject();

	/**
	 * Returns the meta object for data type '<em>EChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EChar</em>'.
	 * @model instanceClass="char"
	 * @generated
	 */
	EDataType getEChar();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>ECharacter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ECharacter Object</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        extendedMetaData="baseType='EChar' name='EChar:Object'"
	 * @generated
	 */
	EDataType getECharacterObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>EDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDate</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getEDate();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.DiagnosticChain <em>EDiagnostic Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDiagnostic Chain</em>'.
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @model instanceClass="org.eclipse.emf.common.util.DiagnosticChain" serializeable="false"
	 * @generated
	 */
	EDataType getEDiagnosticChain();

	/**
	 * Returns the meta object for data type '<em>EDouble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#double'"
	 * @generated
	 */
	EDataType getEDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>EDouble Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="baseType='EDouble' name='EDouble:Object'"
	 * @generated
	 */
	EDataType getEDoubleObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EE List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EE List</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" serializeable="false" typeParameters="E"
	 * @generated
	 */
	EDataType getEEList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>EEnumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EEnumerator</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator" serializeable="false"
	 * @generated
	 */
	EDataType getEEnumerator();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap <em>EFeature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap" serializeable="false"
	 * @generated
	 */
	EDataType getEFeatureMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap.Entry <em>EFeature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map Entry</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap$Entry" serializeable="false"
	 * @generated
	 */
	EDataType getEFeatureMapEntry();

	/**
	 * Returns the meta object for data type '<em>EFloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 * @generated
	 */
	EDataType getEFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>EFloat Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="baseType='EFloat' name='EFloat:Object'"
	 * @generated
	 */
	EDataType getEFloatObject();

	/**
	 * Returns the meta object for data type '<em>EInt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInt</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#int'"
	 * @generated
	 */
	EDataType getEInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="baseType='EInt' name='EInt:Object'"
	 * @generated
	 */
	EDataType getEIntegerObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>EJava Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 * @generated
	 */
	EDataType getEJavaClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EJava Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getEJavaObject();

	/**
	 * Returns the meta object for data type '<em>ELong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#long'"
	 * @generated
	 */
	EDataType getELong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>ELong Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="baseType='ELong' name='ELong:Object'"
	 * @generated
	 */
	EDataType getELongObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>EMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMap</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" serializeable="false" typeParameters="K V"
	 * @generated
	 */
	EDataType getEMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>EResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource" serializeable="false"
	 * @generated
	 */
	EDataType getEResource();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>EResource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet" serializeable="false"
	 * @generated
	 */
	EDataType getEResourceSet();

	/**
	 * Returns the meta object for data type '<em>EShort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#short'"
	 * @generated
	 */
	EDataType getEShort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>EShort Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="baseType='EShort' name='EShort:Object'"
	 * @generated
	 */
	EDataType getEShortObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 * @generated
	 */
	EDataType getEString();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.TreeIterator <em>ETree Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ETree Iterator</em>'.
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @model instanceClass="org.eclipse.emf.common.util.TreeIterator" serializeable="false" typeParameters="E"
	 * @generated
	 */
	EDataType getETreeIterator();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.InvocationTargetException <em>EInvocation Target Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInvocation Target Exception</em>'.
	 * @see java.lang.reflect.InvocationTargetException
	 * @model instanceClass="java.lang.reflect.InvocationTargetException" serializeable="false"
	 * @generated
	 */
	EDataType getEInvocationTargetException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreDiffMMFactory getEcoreDiffMMFactory();

} //EcoreDiffMMPackage
