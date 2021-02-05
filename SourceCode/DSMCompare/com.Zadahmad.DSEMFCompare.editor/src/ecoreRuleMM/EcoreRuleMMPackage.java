/**
 */
package ecoreRuleMM;

import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ecoreRuleMM.EcoreRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/2002/EcoreRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreRuleMMPackage eINSTANCE = ecoreRuleMM.impl.EcoreRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EAttributeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EAttribute()
	 * @generated
	 */
	int PATTERN_EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__EANNOTATIONS = EcoreDiffMMPackage.EATTRIBUTE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__NAME = EcoreDiffMMPackage.EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ORDERED = EcoreDiffMMPackage.EATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__UNIQUE = EcoreDiffMMPackage.EATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__LOWER_BOUND = EcoreDiffMMPackage.EATTRIBUTE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__UPPER_BOUND = EcoreDiffMMPackage.EATTRIBUTE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__MANY = EcoreDiffMMPackage.EATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__REQUIRED = EcoreDiffMMPackage.EATTRIBUTE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ETYPE = EcoreDiffMMPackage.EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__EGENERIC_TYPE = EcoreDiffMMPackage.EATTRIBUTE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DIFFE_TYPE = EcoreDiffMMPackage.EATTRIBUTE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.EATTRIBUTE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__CHANGEABLE = EcoreDiffMMPackage.EATTRIBUTE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__VOLATILE = EcoreDiffMMPackage.EATTRIBUTE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__TRANSIENT = EcoreDiffMMPackage.EATTRIBUTE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.EATTRIBUTE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DEFAULT_VALUE = EcoreDiffMMPackage.EATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__UNSETTABLE = EcoreDiffMMPackage.EATTRIBUTE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DERIVED = EcoreDiffMMPackage.EATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ECONTAINING_CLASS = EcoreDiffMMPackage.EATTRIBUTE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.EATTRIBUTE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ID = EcoreDiffMMPackage.EATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__EATTRIBUTE_TYPE = EcoreDiffMMPackage.EATTRIBUTE__EATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Attribute Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE = EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ID_PATTERN = EcoreDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__FILTER = EcoreDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_FEATURE_COUNT = EcoreDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EATTRIBUTE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE___GET_FEATURE_ID = EcoreDiffMMPackage.EATTRIBUTE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE___GET_CONTAINER_CLASS = EcoreDiffMMPackage.EATTRIBUTE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_OPERATION_COUNT = EcoreDiffMMPackage.EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EAnnotationImpl <em>Pattern EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EAnnotationImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EAnnotation()
	 * @generated
	 */
	int PATTERN_EANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__EANNOTATIONS = EcoreDiffMMPackage.EANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EANNOTATION__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__SOURCE = EcoreDiffMMPackage.EANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__DETAILS = EcoreDiffMMPackage.EANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__EMODEL_ELEMENT = EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__CONTENTS = EcoreDiffMMPackage.EANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__REFERENCES = EcoreDiffMMPackage.EANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__DIFFDETAILS = EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS;

	/**
	 * The feature id for the '<em><b>Diffe Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__DIFFE_MODEL_ELEMENT = EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Diffcontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__DIFFCONTENTS = EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS;

	/**
	 * The feature id for the '<em><b>Diffreferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__DIFFREFERENCES = EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__ID_PATTERN = EcoreDiffMMPackage.EANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION__FILTER = EcoreDiffMMPackage.EANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION_FEATURE_COUNT = EcoreDiffMMPackage.EANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EANNOTATION_OPERATION_COUNT = EcoreDiffMMPackage.EANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EClassImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EClass()
	 * @generated
	 */
	int PATTERN_ECLASS = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EANNOTATIONS = EcoreDiffMMPackage.ECLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.ECLASS__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NAME = EcoreDiffMMPackage.ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.ECLASS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__INSTANCE_CLASS = EcoreDiffMMPackage.ECLASS__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DEFAULT_VALUE = EcoreDiffMMPackage.ECLASS__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.ECLASS__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EPACKAGE = EcoreDiffMMPackage.ECLASS__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ETYPE_PARAMETERS = EcoreDiffMMPackage.ECLASS__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_PACKAGE = EcoreDiffMMPackage.ECLASS__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.ECLASS__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ABSTRACT = EcoreDiffMMPackage.ECLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__INTERFACE = EcoreDiffMMPackage.ECLASS__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ESUPER_TYPES = EcoreDiffMMPackage.ECLASS__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EOPERATIONS = EcoreDiffMMPackage.ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_ATTRIBUTES = EcoreDiffMMPackage.ECLASS__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_REFERENCES = EcoreDiffMMPackage.ECLASS__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EREFERENCES = EcoreDiffMMPackage.ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EATTRIBUTES = EcoreDiffMMPackage.ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_CONTAINMENTS = EcoreDiffMMPackage.ECLASS__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_OPERATIONS = EcoreDiffMMPackage.ECLASS__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_STRUCTURAL_FEATURES = EcoreDiffMMPackage.ECLASS__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EID_ATTRIBUTE = EcoreDiffMMPackage.ECLASS__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ESTRUCTURAL_FEATURES = EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EGENERIC_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EALL_GENERIC_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_OPERATIONS = EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffe All Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_ATTRIBUTES = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffe All References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_REFERENCES = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffe References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_REFERENCES = EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffe Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ATTRIBUTES = EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffe All Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_CONTAINMENTS = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>Diffe All Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_OPERATIONS = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffe All Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Diffe All Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe ID Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ID_ATTRIBUTE = EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Diffe Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_STRUCTURAL_FEATURES = EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Diffe Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_GENERIC_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe All Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES = EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ID_PATTERN = EcoreDiffMMPackage.ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__FILTER = EcoreDiffMMPackage.ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_FEATURE_COUNT = EcoreDiffMMPackage.ECLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_EANNOTATION__STRING = EcoreDiffMMPackage.ECLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.ECLASS___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_CLASSIFIER_ID = EcoreDiffMMPackage.ECLASS___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___IS_SUPER_TYPE_OF__ECLASS = EcoreDiffMMPackage.ECLASS___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_FEATURE_COUNT = EcoreDiffMMPackage.ECLASS___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_ESTRUCTURAL_FEATURE__INT = EcoreDiffMMPackage.ECLASS___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE = EcoreDiffMMPackage.ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = EcoreDiffMMPackage.ECLASS___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_OPERATION_COUNT = EcoreDiffMMPackage.ECLASS___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_EOPERATION__INT = EcoreDiffMMPackage.ECLASS___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_OPERATION_ID__EOPERATION = EcoreDiffMMPackage.ECLASS___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_OVERRIDE__EOPERATION = EcoreDiffMMPackage.ECLASS___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = EcoreDiffMMPackage.ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_OPERATION_COUNT = EcoreDiffMMPackage.ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EClassifierImpl <em>Pattern EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EClassifierImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EClassifier()
	 * @generated
	 */
	int PATTERN_ECLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__EANNOTATIONS = EcoreDiffMMPackage.ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.ECLASSIFIER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__NAME = EcoreDiffMMPackage.ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__INSTANCE_CLASS = EcoreDiffMMPackage.ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__DEFAULT_VALUE = EcoreDiffMMPackage.ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__EPACKAGE = EcoreDiffMMPackage.ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__ETYPE_PARAMETERS = EcoreDiffMMPackage.ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__DIFFE_PACKAGE = EcoreDiffMMPackage.ECLASSIFIER__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.ECLASSIFIER__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__ID_PATTERN = EcoreDiffMMPackage.ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER__FILTER = EcoreDiffMMPackage.ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER_FEATURE_COUNT = EcoreDiffMMPackage.ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER___GET_EANNOTATION__STRING = EcoreDiffMMPackage.ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER___GET_CLASSIFIER_ID = EcoreDiffMMPackage.ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Pattern EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASSIFIER_OPERATION_COUNT = EcoreDiffMMPackage.ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EDataTypeImpl <em>Pattern EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EDataTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EDataType()
	 * @generated
	 */
	int PATTERN_EDATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__EANNOTATIONS = EcoreDiffMMPackage.EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EDATA_TYPE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__NAME = EcoreDiffMMPackage.EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__INSTANCE_CLASS = EcoreDiffMMPackage.EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__DEFAULT_VALUE = EcoreDiffMMPackage.EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__EPACKAGE = EcoreDiffMMPackage.EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__ETYPE_PARAMETERS = EcoreDiffMMPackage.EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__DIFFE_PACKAGE = EcoreDiffMMPackage.EDATA_TYPE__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.EDATA_TYPE__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__SERIALIZABLE = EcoreDiffMMPackage.EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__ID_PATTERN = EcoreDiffMMPackage.EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE__FILTER = EcoreDiffMMPackage.EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.EDATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EDATA_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.EDATA_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE___GET_CLASSIFIER_ID = EcoreDiffMMPackage.EDATA_TYPE___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Pattern EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EDATA_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EEnumImpl <em>Pattern EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EEnumImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EEnum()
	 * @generated
	 */
	int PATTERN_EENUM = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__EANNOTATIONS = EcoreDiffMMPackage.EENUM__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EENUM__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__NAME = EcoreDiffMMPackage.EENUM__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.EENUM__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__INSTANCE_CLASS = EcoreDiffMMPackage.EENUM__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__DEFAULT_VALUE = EcoreDiffMMPackage.EENUM__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.EENUM__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__EPACKAGE = EcoreDiffMMPackage.EENUM__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__ETYPE_PARAMETERS = EcoreDiffMMPackage.EENUM__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__DIFFE_PACKAGE = EcoreDiffMMPackage.EENUM__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.EENUM__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__SERIALIZABLE = EcoreDiffMMPackage.EENUM__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__ELITERALS = EcoreDiffMMPackage.EENUM__ELITERALS;

	/**
	 * The feature id for the '<em><b>Diffe Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__DIFFE_LITERALS = EcoreDiffMMPackage.EENUM__DIFFE_LITERALS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__ID_PATTERN = EcoreDiffMMPackage.EENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM__FILTER = EcoreDiffMMPackage.EENUM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_FEATURE_COUNT = EcoreDiffMMPackage.EENUM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EENUM___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.EENUM___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM___GET_CLASSIFIER_ID = EcoreDiffMMPackage.EENUM___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM___GET_EENUM_LITERAL__STRING = EcoreDiffMMPackage.EENUM___GET_EENUM_LITERAL__STRING;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM___GET_EENUM_LITERAL__INT = EcoreDiffMMPackage.EENUM___GET_EENUM_LITERAL__INT;

	/**
	 * The operation id for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = EcoreDiffMMPackage.EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING;

	/**
	 * The number of operations of the '<em>Pattern EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_OPERATION_COUNT = EcoreDiffMMPackage.EENUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EEnumLiteralImpl <em>Pattern EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EEnumLiteralImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EEnumLiteral()
	 * @generated
	 */
	int PATTERN_EENUM_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__EANNOTATIONS = EcoreDiffMMPackage.EENUM_LITERAL__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__NAME = EcoreDiffMMPackage.EENUM_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__VALUE = EcoreDiffMMPackage.EENUM_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__INSTANCE = EcoreDiffMMPackage.EENUM_LITERAL__INSTANCE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__LITERAL = EcoreDiffMMPackage.EENUM_LITERAL__LITERAL;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__EENUM = EcoreDiffMMPackage.EENUM_LITERAL__EENUM;

	/**
	 * The feature id for the '<em><b>Diffe Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__DIFFE_ENUM = EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__ID_PATTERN = EcoreDiffMMPackage.EENUM_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL__FILTER = EcoreDiffMMPackage.EENUM_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL_FEATURE_COUNT = EcoreDiffMMPackage.EENUM_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EENUM_LITERAL___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EENUM_LITERAL_OPERATION_COUNT = EcoreDiffMMPackage.EENUM_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EFactoryImpl <em>Pattern EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EFactoryImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EFactory()
	 * @generated
	 */
	int PATTERN_EFACTORY = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY__EANNOTATIONS = EcoreDiffMMPackage.EFACTORY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EFACTORY__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY__EPACKAGE = EcoreDiffMMPackage.EFACTORY__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY__DIFFE_PACKAGE = EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY__ID_PATTERN = EcoreDiffMMPackage.EFACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY__FILTER = EcoreDiffMMPackage.EFACTORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY_FEATURE_COUNT = EcoreDiffMMPackage.EFACTORY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EFACTORY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY___CREATE__ECLASS = EcoreDiffMMPackage.EFACTORY___CREATE__ECLASS;

	/**
	 * The operation id for the '<em>Create From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING = EcoreDiffMMPackage.EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING;

	/**
	 * The operation id for the '<em>Convert To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT = EcoreDiffMMPackage.EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT;

	/**
	 * The number of operations of the '<em>Pattern EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EFACTORY_OPERATION_COUNT = EcoreDiffMMPackage.EFACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EModelElementImpl <em>Pattern EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EModelElementImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EModelElement()
	 * @generated
	 */
	int PATTERN_EMODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT__EANNOTATIONS = EcoreDiffMMPackage.EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EMODEL_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT__ID_PATTERN = EcoreDiffMMPackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT__FILTER = EcoreDiffMMPackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT_FEATURE_COUNT = EcoreDiffMMPackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EMODEL_ELEMENT_OPERATION_COUNT = EcoreDiffMMPackage.EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_ENamedElementImpl <em>Pattern ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_ENamedElementImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_ENamedElement()
	 * @generated
	 */
	int PATTERN_ENAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT__EANNOTATIONS = EcoreDiffMMPackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.ENAMED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT__NAME = EcoreDiffMMPackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT__ID_PATTERN = EcoreDiffMMPackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT__FILTER = EcoreDiffMMPackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT_FEATURE_COUNT = EcoreDiffMMPackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT___GET_EANNOTATION__STRING = EcoreDiffMMPackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENAMED_ELEMENT_OPERATION_COUNT = EcoreDiffMMPackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EObjectImpl <em>Pattern EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EObjectImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EObject()
	 * @generated
	 */
	int PATTERN_EOBJECT = 10;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT__ID_PATTERN = EcoreDiffMMPackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT__FILTER = EcoreDiffMMPackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT_FEATURE_COUNT = EcoreDiffMMPackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ECLASS = EcoreDiffMMPackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EIS_PROXY = EcoreDiffMMPackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ERESOURCE = EcoreDiffMMPackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ECONTAINER = EcoreDiffMMPackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ECONTAINING_FEATURE = EcoreDiffMMPackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ECONTAINMENT_FEATURE = EcoreDiffMMPackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ECONTENTS = EcoreDiffMMPackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EALL_CONTENTS = EcoreDiffMMPackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ECROSS_REFERENCES = EcoreDiffMMPackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EGET__ESTRUCTURALFEATURE = EcoreDiffMMPackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcoreDiffMMPackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT = EcoreDiffMMPackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EIS_SET__ESTRUCTURALFEATURE = EcoreDiffMMPackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EUNSET__ESTRUCTURALFEATURE = EcoreDiffMMPackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT___EINVOKE__EOPERATION_ELIST = EcoreDiffMMPackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Pattern EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOBJECT_OPERATION_COUNT = EcoreDiffMMPackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EOperationImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EOperation()
	 * @generated
	 */
	int PATTERN_EOPERATION = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EANNOTATIONS = EcoreDiffMMPackage.EOPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EOPERATION__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__NAME = EcoreDiffMMPackage.EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ORDERED = EcoreDiffMMPackage.EOPERATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__UNIQUE = EcoreDiffMMPackage.EOPERATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__LOWER_BOUND = EcoreDiffMMPackage.EOPERATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__UPPER_BOUND = EcoreDiffMMPackage.EOPERATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__MANY = EcoreDiffMMPackage.EOPERATION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__REQUIRED = EcoreDiffMMPackage.EOPERATION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ETYPE = EcoreDiffMMPackage.EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EGENERIC_TYPE = EcoreDiffMMPackage.EOPERATION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_TYPE = EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ECONTAINING_CLASS = EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ETYPE_PARAMETERS = EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EPARAMETERS = EcoreDiffMMPackage.EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EEXCEPTIONS = EcoreDiffMMPackage.EOPERATION__EEXCEPTIONS;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EGENERIC_EXCEPTIONS = EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_PARAMETERS = EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_EXCEPTIONS = EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Diffe Generic Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__DIFFE_GENERIC_EXCEPTIONS = EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ID_PATTERN = EcoreDiffMMPackage.EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__FILTER = EcoreDiffMMPackage.EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_FEATURE_COUNT = EcoreDiffMMPackage.EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EOPERATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION___GET_OPERATION_ID = EcoreDiffMMPackage.EOPERATION___GET_OPERATION_ID;

	/**
	 * The operation id for the '<em>Is Override Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION___IS_OVERRIDE_OF__EOPERATION = EcoreDiffMMPackage.EOPERATION___IS_OVERRIDE_OF__EOPERATION;

	/**
	 * The number of operations of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_OPERATION_COUNT = EcoreDiffMMPackage.EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EPackageImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EPackage()
	 * @generated
	 */
	int PATTERN_EPACKAGE = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__EANNOTATIONS = EcoreDiffMMPackage.EPACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EPACKAGE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__NAME = EcoreDiffMMPackage.EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__NS_URI = EcoreDiffMMPackage.EPACKAGE__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__NS_PREFIX = EcoreDiffMMPackage.EPACKAGE__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__EFACTORY_INSTANCE = EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ECLASSIFIERS = EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ESUBPACKAGES = EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ESUPER_PACKAGE = EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DOMAINSPECIFICDIFFS = EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffe Factory Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFE_FACTORY_INSTANCE = EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>Diffe Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFE_CLASSIFIERS = EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffe Subpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFE_SUBPACKAGES = EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES;

	/**
	 * The feature id for the '<em><b>Diffe Super Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFE_SUPER_PACKAGE = EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFDOMAINSPECIFICDIFFS = EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ID_PATTERN = EcoreDiffMMPackage.EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__FILTER = EcoreDiffMMPackage.EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_FEATURE_COUNT = EcoreDiffMMPackage.EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EPACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE___GET_ECLASSIFIER__STRING = EcoreDiffMMPackage.EPACKAGE___GET_ECLASSIFIER__STRING;

	/**
	 * The number of operations of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_OPERATION_COUNT = EcoreDiffMMPackage.EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EParameterImpl <em>Pattern EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EParameterImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EParameter()
	 * @generated
	 */
	int PATTERN_EPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__EANNOTATIONS = EcoreDiffMMPackage.EPARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EPARAMETER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__NAME = EcoreDiffMMPackage.EPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__ORDERED = EcoreDiffMMPackage.EPARAMETER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__UNIQUE = EcoreDiffMMPackage.EPARAMETER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__LOWER_BOUND = EcoreDiffMMPackage.EPARAMETER__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__UPPER_BOUND = EcoreDiffMMPackage.EPARAMETER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__MANY = EcoreDiffMMPackage.EPARAMETER__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__REQUIRED = EcoreDiffMMPackage.EPARAMETER__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__ETYPE = EcoreDiffMMPackage.EPARAMETER__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__EGENERIC_TYPE = EcoreDiffMMPackage.EPARAMETER__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__DIFFE_TYPE = EcoreDiffMMPackage.EPARAMETER__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.EPARAMETER__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__EOPERATION = EcoreDiffMMPackage.EPARAMETER__EOPERATION;

	/**
	 * The feature id for the '<em><b>Diffe Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__DIFFE_OPERATION = EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__ID_PATTERN = EcoreDiffMMPackage.EPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER__FILTER = EcoreDiffMMPackage.EPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER_FEATURE_COUNT = EcoreDiffMMPackage.EPARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EPARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPARAMETER_OPERATION_COUNT = EcoreDiffMMPackage.EPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EReferenceImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EReference()
	 * @generated
	 */
	int PATTERN_EREFERENCE = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__EANNOTATIONS = EcoreDiffMMPackage.EREFERENCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.EREFERENCE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__NAME = EcoreDiffMMPackage.EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ORDERED = EcoreDiffMMPackage.EREFERENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__UNIQUE = EcoreDiffMMPackage.EREFERENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__LOWER_BOUND = EcoreDiffMMPackage.EREFERENCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__UPPER_BOUND = EcoreDiffMMPackage.EREFERENCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__MANY = EcoreDiffMMPackage.EREFERENCE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__REQUIRED = EcoreDiffMMPackage.EREFERENCE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ETYPE = EcoreDiffMMPackage.EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__EGENERIC_TYPE = EcoreDiffMMPackage.EREFERENCE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_TYPE = EcoreDiffMMPackage.EREFERENCE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.EREFERENCE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__CHANGEABLE = EcoreDiffMMPackage.EREFERENCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__VOLATILE = EcoreDiffMMPackage.EREFERENCE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__TRANSIENT = EcoreDiffMMPackage.EREFERENCE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.EREFERENCE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DEFAULT_VALUE = EcoreDiffMMPackage.EREFERENCE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__UNSETTABLE = EcoreDiffMMPackage.EREFERENCE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DERIVED = EcoreDiffMMPackage.EREFERENCE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ECONTAINING_CLASS = EcoreDiffMMPackage.EREFERENCE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.EREFERENCE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__CONTAINMENT = EcoreDiffMMPackage.EREFERENCE__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__CONTAINER = EcoreDiffMMPackage.EREFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__RESOLVE_PROXIES = EcoreDiffMMPackage.EREFERENCE__RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__EOPPOSITE = EcoreDiffMMPackage.EREFERENCE__EOPPOSITE;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__EREFERENCE_TYPE = EcoreDiffMMPackage.EREFERENCE__EREFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__EKEYS = EcoreDiffMMPackage.EREFERENCE__EKEYS;

	/**
	 * The feature id for the '<em><b>Diffe Opposite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_OPPOSITE = EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Diffe Reference Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_REFERENCE_TYPE = EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__DIFFE_KEYS = EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ID_PATTERN = EcoreDiffMMPackage.EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__FILTER = EcoreDiffMMPackage.EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_FEATURE_COUNT = EcoreDiffMMPackage.EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.EREFERENCE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE___GET_FEATURE_ID = EcoreDiffMMPackage.EREFERENCE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE___GET_CONTAINER_CLASS = EcoreDiffMMPackage.EREFERENCE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_OPERATION_COUNT = EcoreDiffMMPackage.EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EStructuralFeatureImpl <em>Pattern EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EStructuralFeatureImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EStructuralFeature()
	 * @generated
	 */
	int PATTERN_ESTRUCTURAL_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__EANNOTATIONS = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__NAME = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__ORDERED = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__UNIQUE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__LOWER_BOUND = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__UPPER_BOUND = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__MANY = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__REQUIRED = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__ETYPE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__EGENERIC_TYPE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DIFFE_TYPE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__CHANGEABLE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__VOLATILE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__TRANSIENT = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DEFAULT_VALUE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__UNSETTABLE = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DERIVED = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__ID_PATTERN = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE__FILTER = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE_FEATURE_COUNT = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE___GET_FEATURE_ID = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Pattern EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRUCTURAL_FEATURE_OPERATION_COUNT = EcoreDiffMMPackage.ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_ETypedElementImpl <em>Pattern ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_ETypedElementImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_ETypedElement()
	 * @generated
	 */
	int PATTERN_ETYPED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__EANNOTATIONS = EcoreDiffMMPackage.ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__NAME = EcoreDiffMMPackage.ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__ORDERED = EcoreDiffMMPackage.ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__UNIQUE = EcoreDiffMMPackage.ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__LOWER_BOUND = EcoreDiffMMPackage.ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__UPPER_BOUND = EcoreDiffMMPackage.ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__MANY = EcoreDiffMMPackage.ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__REQUIRED = EcoreDiffMMPackage.ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__ETYPE = EcoreDiffMMPackage.ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__EGENERIC_TYPE = EcoreDiffMMPackage.ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__DIFFE_TYPE = EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__ID_PATTERN = EcoreDiffMMPackage.ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT__FILTER = EcoreDiffMMPackage.ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT_FEATURE_COUNT = EcoreDiffMMPackage.ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT___GET_EANNOTATION__STRING = EcoreDiffMMPackage.ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPED_ELEMENT_OPERATION_COUNT = EcoreDiffMMPackage.ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EStringToStringMapEntryImpl <em>Pattern EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EStringToStringMapEntryImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EStringToStringMapEntry()
	 * @generated
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY__KEY = EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY__VALUE = EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY__ID_PATTERN = EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY__FILTER = EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_EGenericTypeImpl <em>Pattern EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_EGenericTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EGenericType()
	 * @generated
	 */
	int PATTERN_EGENERIC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__EUPPER_BOUND = EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__ETYPE_ARGUMENTS = EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__ERAW_TYPE = EcoreDiffMMPackage.EGENERIC_TYPE__ERAW_TYPE;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__ELOWER_BOUND = EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__ETYPE_PARAMETER = EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__ECLASSIFIER = EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER;

	/**
	 * The feature id for the '<em><b>Diffe Upper Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__DIFFE_UPPER_BOUND = EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Diffe Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS = EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Diffe Raw Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__DIFFE_RAW_TYPE = EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Lower Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__DIFFE_LOWER_BOUND = EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__DIFFE_TYPE_PARAMETER = EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Diffe Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__DIFFE_CLASSIFIER = EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__ID_PATTERN = EcoreDiffMMPackage.EGENERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE__FILTER = EcoreDiffMMPackage.EGENERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.EGENERIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.EGENERIC_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The number of operations of the '<em>Pattern EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EGENERIC_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.EGENERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_ETypeParameterImpl <em>Pattern EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_ETypeParameterImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_ETypeParameter()
	 * @generated
	 */
	int PATTERN_ETYPE_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__EANNOTATIONS = EcoreDiffMMPackage.ETYPE_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__NAME = EcoreDiffMMPackage.ETYPE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__EBOUNDS = EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS;

	/**
	 * The feature id for the '<em><b>Diffe Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__DIFFE_BOUNDS = EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__ID_PATTERN = EcoreDiffMMPackage.ETYPE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER__FILTER = EcoreDiffMMPackage.ETYPE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER_FEATURE_COUNT = EcoreDiffMMPackage.ETYPE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER___GET_EANNOTATION__STRING = EcoreDiffMMPackage.ETYPE_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ETYPE_PARAMETER_OPERATION_COUNT = EcoreDiffMMPackage.ETYPE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DomainSpecificDiffImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DomainSpecificDiff()
	 * @generated
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__NAME = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EClassifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EData Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EEnum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EEnum Literal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EFactory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EModel Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff ENamed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EObject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EParameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EStructural Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff ETyped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EGeneric Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EType Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAttributeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAttribute()
	 * @generated
	 */
	int PATTERN_DIFF_EATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EATTRIBUTE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NAME = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ORDERED = EcoreDiffMMPackage.DIFF_EATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__UNIQUE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__LOWER_BOUND = EcoreDiffMMPackage.DIFF_EATTRIBUTE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__UPPER_BOUND = EcoreDiffMMPackage.DIFF_EATTRIBUTE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__MANY = EcoreDiffMMPackage.DIFF_EATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__REQUIRED = EcoreDiffMMPackage.DIFF_EATTRIBUTE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ETYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__EGENERIC_TYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFFE_TYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__CHANGEABLE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__VOLATILE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__TRANSIENT = EcoreDiffMMPackage.DIFF_EATTRIBUTE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__UNSETTABLE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DERIVED = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ECONTAINING_CLASS = EcoreDiffMMPackage.DIFF_EATTRIBUTE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ID = EcoreDiffMMPackage.DIFF_EATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__EATTRIBUTE_TYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__EATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Attribute Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__OPERATION = EcoreDiffMMPackage.DIFF_EATTRIBUTE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_NAME = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_ORDERED = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_ORDERED;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_UNIQUE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_UNIQUE;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_LOWER_BOUND = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_UPPER_BOUND = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_MANY = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_MANY;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_REQUIRED = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_REQUIRED;

	/**
	 * The feature id for the '<em><b>New changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_CHANGEABLE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>New volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_VOLATILE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_VOLATILE;

	/**
	 * The feature id for the '<em><b>New transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_TRANSIENT = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_TRANSIENT;

	/**
	 * The feature id for the '<em><b>New default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>New unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_UNSETTABLE = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_UNSETTABLE;

	/**
	 * The feature id for the '<em><b>New derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_DERIVED = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_DERIVED;

	/**
	 * The feature id for the '<em><b>New iD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_ID = EcoreDiffMMPackage.DIFF_EATTRIBUTE__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__FILTER = EcoreDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EATTRIBUTE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE___GET_FEATURE_ID = EcoreDiffMMPackage.DIFF_EATTRIBUTE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE___GET_CONTAINER_CLASS = EcoreDiffMMPackage.DIFF_EATTRIBUTE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAttribute_eAttributeTypeImpl <em>Pattern Diff EAttribute eAttribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAttribute_eAttributeTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAttribute_eAttributeType()
	 * @generated
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__OPERATION = EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__ETYPE = EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__FILTER = EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAttribute eAttribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EAttribute eAttribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotationImpl <em>Pattern Diff EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotationImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation()
	 * @generated
	 */
	int PATTERN_DIFF_EANNOTATION = 23;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EANNOTATION__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__SOURCE = EcoreDiffMMPackage.DIFF_EANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__DETAILS = EcoreDiffMMPackage.DIFF_EANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__EMODEL_ELEMENT = EcoreDiffMMPackage.DIFF_EANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__CONTENTS = EcoreDiffMMPackage.DIFF_EANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__REFERENCES = EcoreDiffMMPackage.DIFF_EANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__DIFFDETAILS = EcoreDiffMMPackage.DIFF_EANNOTATION__DIFFDETAILS;

	/**
	 * The feature id for the '<em><b>Diffe Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__DIFFE_MODEL_ELEMENT = EcoreDiffMMPackage.DIFF_EANNOTATION__DIFFE_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Diffcontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__DIFFCONTENTS = EcoreDiffMMPackage.DIFF_EANNOTATION__DIFFCONTENTS;

	/**
	 * The feature id for the '<em><b>Diffreferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__DIFFREFERENCES = EcoreDiffMMPackage.DIFF_EANNOTATION__DIFFREFERENCES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__OPERATION = EcoreDiffMMPackage.DIFF_EANNOTATION__OPERATION;

	/**
	 * The feature id for the '<em><b>New source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__NEW_SOURCE = EcoreDiffMMPackage.DIFF_EANNOTATION__NEW_SOURCE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__ID_PATTERN = EcoreDiffMMPackage.DIFF_EANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION__FILTER = EcoreDiffMMPackage.DIFF_EANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern Diff EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_detailsImpl <em>Pattern Diff EAnnotation details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_detailsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_details()
	 * @generated
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS = 24;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS__OPERATION = EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS__ETYPE = EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS__FILTER = EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAnnotation details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EAnnotation details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_DETAILS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_eModelElementImpl <em>Pattern Diff EAnnotation eModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_eModelElementImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_eModelElement()
	 * @generated
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__OPERATION = EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__ETYPE = EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__ID_PATTERN = EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__FILTER = EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAnnotation eModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EAnnotation eModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_contentsImpl <em>Pattern Diff EAnnotation contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_contentsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_contents()
	 * @generated
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS = 26;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS__OPERATION = EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS__ETYPE = EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS__FILTER = EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAnnotation contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EAnnotation contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_CONTENTS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_referencesImpl <em>Pattern Diff EAnnotation references</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_referencesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_references()
	 * @generated
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES = 27;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES__OPERATION = EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES__ETYPE = EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES__ID_PATTERN = EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES__FILTER = EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAnnotation references</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EAnnotation references</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EANNOTATION_REFERENCES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClassImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS = 28;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EANNOTATIONS = EcoreDiffMMPackage.DIFF_ECLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NAME = EcoreDiffMMPackage.DIFF_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.DIFF_ECLASS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__INSTANCE_CLASS = EcoreDiffMMPackage.DIFF_ECLASS__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_ECLASS__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.DIFF_ECLASS__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EPACKAGE = EcoreDiffMMPackage.DIFF_ECLASS__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ETYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_ECLASS__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_PACKAGE = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ABSTRACT = EcoreDiffMMPackage.DIFF_ECLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__INTERFACE = EcoreDiffMMPackage.DIFF_ECLASS__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ESUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EOPERATIONS = EcoreDiffMMPackage.DIFF_ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_ATTRIBUTES = EcoreDiffMMPackage.DIFF_ECLASS__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_REFERENCES = EcoreDiffMMPackage.DIFF_ECLASS__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EREFERENCES = EcoreDiffMMPackage.DIFF_ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EATTRIBUTES = EcoreDiffMMPackage.DIFF_ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_CONTAINMENTS = EcoreDiffMMPackage.DIFF_ECLASS__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_OPERATIONS = EcoreDiffMMPackage.DIFF_ECLASS__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_STRUCTURAL_FEATURES = EcoreDiffMMPackage.DIFF_ECLASS__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EID_ATTRIBUTE = EcoreDiffMMPackage.DIFF_ECLASS__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ESTRUCTURAL_FEATURES = EcoreDiffMMPackage.DIFF_ECLASS__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EGENERIC_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EALL_GENERIC_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_OPERATIONS = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffe All Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_ATTRIBUTES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffe All References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_REFERENCES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffe References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_REFERENCES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_REFERENCES;

	/**
	 * The feature id for the '<em><b>Diffe Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ATTRIBUTES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffe All Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_CONTAINMENTS = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>Diffe All Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_OPERATIONS = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffe All Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Diffe All Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe ID Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ID_ATTRIBUTE = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Diffe Structural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_STRUCTURAL_FEATURES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Diffe Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_GENERIC_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Diffe All Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES = EcoreDiffMMPackage.DIFF_ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_NAME = EcoreDiffMMPackage.DIFF_ECLASS__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_INSTANCE_CLASS_NAME = EcoreDiffMMPackage.DIFF_ECLASS__NEW_INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_INSTANCE_CLASS = EcoreDiffMMPackage.DIFF_ECLASS__NEW_INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_ECLASS__NEW_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_INSTANCE_TYPE_NAME = EcoreDiffMMPackage.DIFF_ECLASS__NEW_INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>New abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_ABSTRACT = EcoreDiffMMPackage.DIFF_ECLASS__NEW_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_INTERFACE = EcoreDiffMMPackage.DIFF_ECLASS__NEW_INTERFACE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_ECLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.DIFF_ECLASS___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_CLASSIFIER_ID = EcoreDiffMMPackage.DIFF_ECLASS___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___IS_SUPER_TYPE_OF__ECLASS = EcoreDiffMMPackage.DIFF_ECLASS___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_ESTRUCTURAL_FEATURE__INT = EcoreDiffMMPackage.DIFF_ECLASS___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE = EcoreDiffMMPackage.DIFF_ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = EcoreDiffMMPackage.DIFF_ECLASS___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_EOPERATION__INT = EcoreDiffMMPackage.DIFF_ECLASS___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_OPERATION_ID__EOPERATION = EcoreDiffMMPackage.DIFF_ECLASS___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_OVERRIDE__EOPERATION = EcoreDiffMMPackage.DIFF_ECLASS___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = EcoreDiffMMPackage.DIFF_ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eSuperTypesImpl <em>Pattern Diff EClass eSuper Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eSuperTypesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eSuperTypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES = 29;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eSuper Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eSuper Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPER_TYPES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eOperationsImpl <em>Pattern Diff EClass eOperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eOperationsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eOperations()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS = 30;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eOperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eOperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllAttributesImpl <em>Pattern Diff EClass eAll Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllAttributesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllAttributes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES = 31;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllReferencesImpl <em>Pattern Diff EClass eAll References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllReferencesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllReferences()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES = 32;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_REFERENCES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eReferencesImpl <em>Pattern Diff EClass eReferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eReferencesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eReferences()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES = 33;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eReferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eReferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAttributesImpl <em>Pattern Diff EClass eAttributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAttributesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAttributes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES = 34;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAttributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAttributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllContainmentsImpl <em>Pattern Diff EClass eAll Containments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllContainmentsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllContainments()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS = 35;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll Containments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll Containments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllOperationsImpl <em>Pattern Diff EClass eAll Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllOperationsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllOperations()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS = 36;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_OPERATIONS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllStructuralFeaturesImpl <em>Pattern Diff EClass eAll Structural Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllStructuralFeaturesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllStructuralFeatures()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES = 37;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll Structural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll Structural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllSuperTypesImpl <em>Pattern Diff EClass eAll Super Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllSuperTypesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllSuperTypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES = 38;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eIDAttributeImpl <em>Pattern Diff EClass eID Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eIDAttributeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eIDAttribute()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE = 39;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eID Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eID Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EID_ATTRIBUTE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eStructuralFeaturesImpl <em>Pattern Diff EClass eStructural Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eStructuralFeaturesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eStructuralFeatures()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES = 40;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eStructural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eStructural Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eGenericSuperTypesImpl <em>Pattern Diff EClass eGeneric Super Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eGenericSuperTypesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eGenericSuperTypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES = 41;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eGeneric Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eGeneric Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllGenericSuperTypesImpl <em>Pattern Diff EClass eAll Generic Super Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllGenericSuperTypesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllGenericSuperTypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES = 42;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__OPERATION = EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__ETYPE = EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__FILTER = EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eAll Generic Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eAll Generic Super Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClassifier_ePackageImpl <em>Pattern Diff EClassifier ePackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClassifier_ePackageImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClassifier_ePackage()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE = 43;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE__OPERATION = EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE__ETYPE = EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE__FILTER = EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClassifier ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClassifier ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_EPACKAGE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEClassifier_eTypeParametersImpl <em>Pattern Diff EClassifier eType Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEClassifier_eTypeParametersImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClassifier_eTypeParameters()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS = 44;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__OPERATION = EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__ETYPE = EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__FILTER = EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClassifier eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClassifier eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEDataTypeImpl <em>Pattern Diff EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEDataTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEDataType()
	 * @generated
	 */
	int PATTERN_DIFF_EDATA_TYPE = 45;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EDATA_TYPE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NAME = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.DIFF_EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__INSTANCE_CLASS = EcoreDiffMMPackage.DIFF_EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.DIFF_EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__EPACKAGE = EcoreDiffMMPackage.DIFF_EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__ETYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__DIFFE_PACKAGE = EcoreDiffMMPackage.DIFF_EDATA_TYPE__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_EDATA_TYPE__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__SERIALIZABLE = EcoreDiffMMPackage.DIFF_EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__OPERATION = EcoreDiffMMPackage.DIFF_EDATA_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NEW_NAME = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NEW_INSTANCE_CLASS_NAME = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NEW_INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NEW_INSTANCE_CLASS = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NEW_INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NEW_DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NEW_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NEW_INSTANCE_TYPE_NAME = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NEW_INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>New serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__NEW_SERIALIZABLE = EcoreDiffMMPackage.DIFF_EDATA_TYPE__NEW_SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE__FILTER = EcoreDiffMMPackage.DIFF_EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EDATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EDATA_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.DIFF_EDATA_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE___GET_CLASSIFIER_ID = EcoreDiffMMPackage.DIFF_EDATA_TYPE___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Pattern Diff EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EDATA_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnumImpl <em>Pattern Diff EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEEnumImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnum()
	 * @generated
	 */
	int PATTERN_DIFF_EENUM = 46;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EENUM__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EENUM__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NAME = EcoreDiffMMPackage.DIFF_EENUM__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__INSTANCE_CLASS_NAME = EcoreDiffMMPackage.DIFF_EENUM__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__INSTANCE_CLASS = EcoreDiffMMPackage.DIFF_EENUM__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EENUM__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__INSTANCE_TYPE_NAME = EcoreDiffMMPackage.DIFF_EENUM__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__EPACKAGE = EcoreDiffMMPackage.DIFF_EENUM__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__ETYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_EENUM__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__DIFFE_PACKAGE = EcoreDiffMMPackage.DIFF_EENUM__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_EENUM__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__SERIALIZABLE = EcoreDiffMMPackage.DIFF_EENUM__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__ELITERALS = EcoreDiffMMPackage.DIFF_EENUM__ELITERALS;

	/**
	 * The feature id for the '<em><b>Diffe Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__DIFFE_LITERALS = EcoreDiffMMPackage.DIFF_EENUM__DIFFE_LITERALS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__OPERATION = EcoreDiffMMPackage.DIFF_EENUM__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NEW_NAME = EcoreDiffMMPackage.DIFF_EENUM__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NEW_INSTANCE_CLASS_NAME = EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NEW_INSTANCE_CLASS = EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NEW_DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EENUM__NEW_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NEW_INSTANCE_TYPE_NAME = EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>New serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__NEW_SERIALIZABLE = EcoreDiffMMPackage.DIFF_EENUM__NEW_SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__ID_PATTERN = EcoreDiffMMPackage.DIFF_EENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM__FILTER = EcoreDiffMMPackage.DIFF_EENUM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EENUM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EENUM___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.DIFF_EENUM___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM___GET_CLASSIFIER_ID = EcoreDiffMMPackage.DIFF_EENUM___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM___GET_EENUM_LITERAL__STRING = EcoreDiffMMPackage.DIFF_EENUM___GET_EENUM_LITERAL__STRING;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM___GET_EENUM_LITERAL__INT = EcoreDiffMMPackage.DIFF_EENUM___GET_EENUM_LITERAL__INT;

	/**
	 * The operation id for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = EcoreDiffMMPackage.DIFF_EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING;

	/**
	 * The number of operations of the '<em>Pattern Diff EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EENUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnum_eLiteralsImpl <em>Pattern Diff EEnum eLiterals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEEnum_eLiteralsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnum_eLiterals()
	 * @generated
	 */
	int PATTERN_DIFF_EENUM_ELITERALS = 47;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_ELITERALS__OPERATION = EcoreDiffMMPackage.DIFF_EENUM_ELITERALS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_ELITERALS__ETYPE = EcoreDiffMMPackage.DIFF_EENUM_ELITERALS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_ELITERALS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EENUM_ELITERALS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_ELITERALS__FILTER = EcoreDiffMMPackage.DIFF_EENUM_ELITERALS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EEnum eLiterals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_ELITERALS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EENUM_ELITERALS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EEnum eLiterals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_ELITERALS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EENUM_ELITERALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnumLiteralImpl <em>Pattern Diff EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEEnumLiteralImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnumLiteral()
	 * @generated
	 */
	int PATTERN_DIFF_EENUM_LITERAL = 48;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__NAME = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__VALUE = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__INSTANCE = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__INSTANCE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__LITERAL = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__LITERAL;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__EENUM = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__EENUM;

	/**
	 * The feature id for the '<em><b>Diffe Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__DIFFE_ENUM = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__DIFFE_ENUM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__OPERATION = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__NEW_NAME = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__NEW_VALUE = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__NEW_INSTANCE = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_INSTANCE;

	/**
	 * The feature id for the '<em><b>New literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__NEW_LITERAL = EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_LITERAL;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__ID_PATTERN = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL__FILTER = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EENUM_LITERAL___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern Diff EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnumLiteral_eEnumImpl <em>Pattern Diff EEnum Literal eEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEEnumLiteral_eEnumImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnumLiteral_eEnum()
	 * @generated
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM = 49;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM__OPERATION = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM__ETYPE = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM__ID_PATTERN = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM__FILTER = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EEnum Literal eEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EEnum Literal eEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EENUM_LITERAL_EENUM_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEFactoryImpl <em>Pattern Diff EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEFactoryImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEFactory()
	 * @generated
	 */
	int PATTERN_DIFF_EFACTORY = 50;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EFACTORY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EFACTORY__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__EPACKAGE = EcoreDiffMMPackage.DIFF_EFACTORY__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Diffe Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__DIFFE_PACKAGE = EcoreDiffMMPackage.DIFF_EFACTORY__DIFFE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__OPERATION = EcoreDiffMMPackage.DIFF_EFACTORY__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__ID_PATTERN = EcoreDiffMMPackage.DIFF_EFACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY__FILTER = EcoreDiffMMPackage.DIFF_EFACTORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EFACTORY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EFACTORY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY___CREATE__ECLASS = EcoreDiffMMPackage.DIFF_EFACTORY___CREATE__ECLASS;

	/**
	 * The operation id for the '<em>Create From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING = EcoreDiffMMPackage.DIFF_EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING;

	/**
	 * The operation id for the '<em>Convert To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT = EcoreDiffMMPackage.DIFF_EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT;

	/**
	 * The number of operations of the '<em>Pattern Diff EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EFACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEFactory_ePackageImpl <em>Pattern Diff EFactory ePackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEFactory_ePackageImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEFactory_ePackage()
	 * @generated
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE = 51;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE__OPERATION = EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE__ETYPE = EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE__FILTER = EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EFactory ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EFactory ePackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EFACTORY_EPACKAGE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEModelElement_eAnnotationsImpl <em>Pattern Diff EModel Element eAnnotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEModelElement_eAnnotationsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEModelElement_eAnnotations()
	 * @generated
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS = 52;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__OPERATION = EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__ETYPE = EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__FILTER = EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EModel Element eAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EModel Element eAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEObjectImpl <em>Pattern Diff EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEObjectImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEObject()
	 * @generated
	 */
	int PATTERN_DIFF_EOBJECT = 53;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT__OPERATION = EcoreDiffMMPackage.DIFF_EOBJECT__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT__FILTER = EcoreDiffMMPackage.DIFF_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ECLASS = EcoreDiffMMPackage.DIFF_EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EIS_PROXY = EcoreDiffMMPackage.DIFF_EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ERESOURCE = EcoreDiffMMPackage.DIFF_EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ECONTAINER = EcoreDiffMMPackage.DIFF_EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ECONTAINING_FEATURE = EcoreDiffMMPackage.DIFF_EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ECONTAINMENT_FEATURE = EcoreDiffMMPackage.DIFF_EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ECONTENTS = EcoreDiffMMPackage.DIFF_EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EALL_CONTENTS = EcoreDiffMMPackage.DIFF_EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ECROSS_REFERENCES = EcoreDiffMMPackage.DIFF_EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EGET__ESTRUCTURALFEATURE = EcoreDiffMMPackage.DIFF_EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcoreDiffMMPackage.DIFF_EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT = EcoreDiffMMPackage.DIFF_EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EIS_SET__ESTRUCTURALFEATURE = EcoreDiffMMPackage.DIFF_EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EUNSET__ESTRUCTURALFEATURE = EcoreDiffMMPackage.DIFF_EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT___EINVOKE__EOPERATION_ELIST = EcoreDiffMMPackage.DIFF_EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Pattern Diff EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOBJECT_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEOperationImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION = 54;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EOPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NAME = EcoreDiffMMPackage.DIFF_EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ORDERED = EcoreDiffMMPackage.DIFF_EOPERATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__UNIQUE = EcoreDiffMMPackage.DIFF_EOPERATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__LOWER_BOUND = EcoreDiffMMPackage.DIFF_EOPERATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__UPPER_BOUND = EcoreDiffMMPackage.DIFF_EOPERATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__MANY = EcoreDiffMMPackage.DIFF_EOPERATION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__REQUIRED = EcoreDiffMMPackage.DIFF_EOPERATION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ETYPE = EcoreDiffMMPackage.DIFF_EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EGENERIC_TYPE = EcoreDiffMMPackage.DIFF_EOPERATION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_TYPE = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ECONTAINING_CLASS = EcoreDiffMMPackage.DIFF_EOPERATION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ETYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_EOPERATION__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EPARAMETERS = EcoreDiffMMPackage.DIFF_EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EEXCEPTIONS = EcoreDiffMMPackage.DIFF_EOPERATION__EEXCEPTIONS;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EGENERIC_EXCEPTIONS = EcoreDiffMMPackage.DIFF_EOPERATION__EGENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_TYPE_PARAMETERS = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_PARAMETERS = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffe Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_EXCEPTIONS = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Diffe Generic Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFFE_GENERIC_EXCEPTIONS = EcoreDiffMMPackage.DIFF_EOPERATION__DIFFE_GENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__OPERATION = EcoreDiffMMPackage.DIFF_EOPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_NAME = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_ORDERED = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_ORDERED;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_UNIQUE = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_UNIQUE;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_LOWER_BOUND = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_UPPER_BOUND = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_MANY = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_MANY;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_REQUIRED = EcoreDiffMMPackage.DIFF_EOPERATION__NEW_REQUIRED;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__FILTER = EcoreDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EOPERATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION___GET_OPERATION_ID = EcoreDiffMMPackage.DIFF_EOPERATION___GET_OPERATION_ID;

	/**
	 * The operation id for the '<em>Is Override Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION___IS_OVERRIDE_OF__EOPERATION = EcoreDiffMMPackage.DIFF_EOPERATION___IS_OVERRIDE_OF__EOPERATION;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eContainingClassImpl <em>Pattern Diff EOperation eContaining Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eContainingClassImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eContainingClass()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS = 55;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__OPERATION = EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__ETYPE = EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__FILTER = EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eTypeParametersImpl <em>Pattern Diff EOperation eType Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eTypeParametersImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eTypeParameters()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS = 56;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__OPERATION = EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__ETYPE = EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__FILTER = EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation eType Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eParametersImpl <em>Pattern Diff EOperation eParameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eParametersImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eParameters()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS = 57;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS__OPERATION = EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS__ETYPE = EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS__FILTER = EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation eParameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation eParameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EPARAMETERS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eExceptionsImpl <em>Pattern Diff EOperation eExceptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eExceptionsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eExceptions()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS = 58;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS__OPERATION = EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS__ETYPE = EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS__FILTER = EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation eExceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation eExceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EEXCEPTIONS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eGenericExceptionsImpl <em>Pattern Diff EOperation eGeneric Exceptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eGenericExceptionsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eGenericExceptions()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS = 59;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION = EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE = EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__FILTER = EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation eGeneric Exceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation eGeneric Exceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEPackageImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE = 60;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EPACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EPACKAGE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NAME = EcoreDiffMMPackage.DIFF_EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NS_URI = EcoreDiffMMPackage.DIFF_EPACKAGE__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NS_PREFIX = EcoreDiffMMPackage.DIFF_EPACKAGE__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__EFACTORY_INSTANCE = EcoreDiffMMPackage.DIFF_EPACKAGE__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ECLASSIFIERS = EcoreDiffMMPackage.DIFF_EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ESUBPACKAGES = EcoreDiffMMPackage.DIFF_EPACKAGE__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ESUPER_PACKAGE = EcoreDiffMMPackage.DIFF_EPACKAGE__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DOMAINSPECIFICDIFFS = EcoreDiffMMPackage.DIFF_EPACKAGE__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffe Factory Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFE_FACTORY_INSTANCE = EcoreDiffMMPackage.DIFF_EPACKAGE__DIFFE_FACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>Diffe Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFE_CLASSIFIERS = EcoreDiffMMPackage.DIFF_EPACKAGE__DIFFE_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffe Subpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFE_SUBPACKAGES = EcoreDiffMMPackage.DIFF_EPACKAGE__DIFFE_SUBPACKAGES;

	/**
	 * The feature id for the '<em><b>Diffe Super Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFE_SUPER_PACKAGE = EcoreDiffMMPackage.DIFF_EPACKAGE__DIFFE_SUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFDOMAINSPECIFICDIFFS = EcoreDiffMMPackage.DIFF_EPACKAGE__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__OPERATION = EcoreDiffMMPackage.DIFF_EPACKAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NAME = EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NS_URI = EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_URI;

	/**
	 * The feature id for the '<em><b>New ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NS_PREFIX = EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_PREFIX;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__FILTER = EcoreDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EPACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE___GET_ECLASSIFIER__STRING = EcoreDiffMMPackage.DIFF_EPACKAGE___GET_ECLASSIFIER__STRING;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eFactoryInstanceImpl <em>Pattern Diff EPackage eFactory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eFactoryInstanceImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eFactoryInstance()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE = 61;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__OPERATION = EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__ETYPE = EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__FILTER = EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eFactory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eFactory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eClassifiersImpl <em>Pattern Diff EPackage eClassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eClassifiersImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eClassifiers()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = 62;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__OPERATION = EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eClassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eClassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eSubpackagesImpl <em>Pattern Diff EPackage eSubpackages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eSubpackagesImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eSubpackages()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES = 63;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__OPERATION = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__ETYPE = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__FILTER = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eSubpackages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eSubpackages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUBPACKAGES_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eSuperPackageImpl <em>Pattern Diff EPackage eSuper Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eSuperPackageImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eSuperPackage()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE = 64;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__OPERATION = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__ETYPE = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__FILTER = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eSuper Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eSuper Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl <em>Pattern Diff EPackage domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = 65;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION = EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE = EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__FILTER = EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEParameterImpl <em>Pattern Diff EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEParameterImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEParameter()
	 * @generated
	 */
	int PATTERN_DIFF_EPARAMETER = 66;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EPARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EPARAMETER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NAME = EcoreDiffMMPackage.DIFF_EPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__ORDERED = EcoreDiffMMPackage.DIFF_EPARAMETER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__UNIQUE = EcoreDiffMMPackage.DIFF_EPARAMETER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__LOWER_BOUND = EcoreDiffMMPackage.DIFF_EPARAMETER__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__UPPER_BOUND = EcoreDiffMMPackage.DIFF_EPARAMETER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__MANY = EcoreDiffMMPackage.DIFF_EPARAMETER__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__REQUIRED = EcoreDiffMMPackage.DIFF_EPARAMETER__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__ETYPE = EcoreDiffMMPackage.DIFF_EPARAMETER__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__EGENERIC_TYPE = EcoreDiffMMPackage.DIFF_EPARAMETER__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__DIFFE_TYPE = EcoreDiffMMPackage.DIFF_EPARAMETER__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.DIFF_EPARAMETER__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__EOPERATION = EcoreDiffMMPackage.DIFF_EPARAMETER__EOPERATION;

	/**
	 * The feature id for the '<em><b>Diffe Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__DIFFE_OPERATION = EcoreDiffMMPackage.DIFF_EPARAMETER__DIFFE_OPERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__OPERATION = EcoreDiffMMPackage.DIFF_EPARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_NAME = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_ORDERED = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_ORDERED;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_UNIQUE = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UNIQUE;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_LOWER_BOUND = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_UPPER_BOUND = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_MANY = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_MANY;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__NEW_REQUIRED = EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_REQUIRED;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER__FILTER = EcoreDiffMMPackage.DIFF_EPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EPARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern Diff EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEParameter_eOperationImpl <em>Pattern Diff EParameter eOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEParameter_eOperationImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEParameter_eOperation()
	 * @generated
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION = 67;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION__OPERATION = EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION__ETYPE = EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION__ID_PATTERN = EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION__FILTER = EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EParameter eOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EParameter eOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPARAMETER_EOPERATION_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEReferenceImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE = 68;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__EANNOTATIONS = EcoreDiffMMPackage.DIFF_EREFERENCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NAME = EcoreDiffMMPackage.DIFF_EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ORDERED = EcoreDiffMMPackage.DIFF_EREFERENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__UNIQUE = EcoreDiffMMPackage.DIFF_EREFERENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__LOWER_BOUND = EcoreDiffMMPackage.DIFF_EREFERENCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__UPPER_BOUND = EcoreDiffMMPackage.DIFF_EREFERENCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__MANY = EcoreDiffMMPackage.DIFF_EREFERENCE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__REQUIRED = EcoreDiffMMPackage.DIFF_EREFERENCE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ETYPE = EcoreDiffMMPackage.DIFF_EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__EGENERIC_TYPE = EcoreDiffMMPackage.DIFF_EREFERENCE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_TYPE = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_GENERIC_TYPE = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__CHANGEABLE = EcoreDiffMMPackage.DIFF_EREFERENCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__VOLATILE = EcoreDiffMMPackage.DIFF_EREFERENCE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__TRANSIENT = EcoreDiffMMPackage.DIFF_EREFERENCE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.DIFF_EREFERENCE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EREFERENCE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__UNSETTABLE = EcoreDiffMMPackage.DIFF_EREFERENCE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DERIVED = EcoreDiffMMPackage.DIFF_EREFERENCE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ECONTAINING_CLASS = EcoreDiffMMPackage.DIFF_EREFERENCE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_CONTAINING_CLASS = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__CONTAINMENT = EcoreDiffMMPackage.DIFF_EREFERENCE__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__CONTAINER = EcoreDiffMMPackage.DIFF_EREFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__RESOLVE_PROXIES = EcoreDiffMMPackage.DIFF_EREFERENCE__RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__EOPPOSITE = EcoreDiffMMPackage.DIFF_EREFERENCE__EOPPOSITE;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__EREFERENCE_TYPE = EcoreDiffMMPackage.DIFF_EREFERENCE__EREFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__EKEYS = EcoreDiffMMPackage.DIFF_EREFERENCE__EKEYS;

	/**
	 * The feature id for the '<em><b>Diffe Opposite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_OPPOSITE = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Diffe Reference Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_REFERENCE_TYPE = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFFE_KEYS = EcoreDiffMMPackage.DIFF_EREFERENCE__DIFFE_KEYS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__OPERATION = EcoreDiffMMPackage.DIFF_EREFERENCE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_NAME = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_ORDERED = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_ORDERED;

	/**
	 * The feature id for the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_UNIQUE = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNIQUE;

	/**
	 * The feature id for the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_LOWER_BOUND = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_UPPER_BOUND = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_MANY = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_MANY;

	/**
	 * The feature id for the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_REQUIRED = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_REQUIRED;

	/**
	 * The feature id for the '<em><b>New changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_CHANGEABLE = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>New volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_VOLATILE = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_VOLATILE;

	/**
	 * The feature id for the '<em><b>New transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_TRANSIENT = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_TRANSIENT;

	/**
	 * The feature id for the '<em><b>New default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_DEFAULT_VALUE = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>New unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_UNSETTABLE = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNSETTABLE;

	/**
	 * The feature id for the '<em><b>New derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_DERIVED = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DERIVED;

	/**
	 * The feature id for the '<em><b>New containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_CONTAINMENT = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>New container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_CONTAINER = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>New resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_RESOLVE_PROXIES = EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__FILTER = EcoreDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_EREFERENCE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE___GET_FEATURE_ID = EcoreDiffMMPackage.DIFF_EREFERENCE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE___GET_CONTAINER_CLASS = EcoreDiffMMPackage.DIFF_EREFERENCE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEReference_eOppositeImpl <em>Pattern Diff EReference eOpposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEReference_eOppositeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference_eOpposite()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE = 69;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE__OPERATION = EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE__ETYPE = EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE__FILTER = EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference eOpposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference eOpposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EOPPOSITE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEReference_eReferenceTypeImpl <em>Pattern Diff EReference eReference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEReference_eReferenceTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference_eReferenceType()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__OPERATION = EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__ETYPE = EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__FILTER = EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference eReference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference eReference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEReference_eKeysImpl <em>Pattern Diff EReference eKeys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEReference_eKeysImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference_eKeys()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS = 71;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS__OPERATION = EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS__ETYPE = EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS__FILTER = EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference eKeys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference eKeys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_EKEYS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEStructuralFeature_eContainingClassImpl <em>Pattern Diff EStructural Feature eContaining Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEStructuralFeature_eContainingClassImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEStructuralFeature_eContainingClass()
	 * @generated
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS = 72;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__OPERATION = EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__ETYPE = EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__FILTER = EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EStructural Feature eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EStructural Feature eContaining Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffETypedElement_eTypeImpl <em>Pattern Diff ETyped Element eType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffETypedElement_eTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypedElement_eType()
	 * @generated
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE = 73;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__OPERATION = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__ETYPE = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__FILTER = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff ETyped Element eType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff ETyped Element eType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_ETYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffETypedElement_eGenericTypeImpl <em>Pattern Diff ETyped Element eGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffETypedElement_eGenericTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypedElement_eGenericType()
	 * @generated
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__OPERATION = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__ETYPE = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__FILTER = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff ETyped Element eGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff ETyped Element eGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEStringToStringMapEntryImpl <em>Pattern Diff EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEStringToStringMapEntryImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEStringToStringMapEntry()
	 * @generated
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY = 75;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__KEY = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__VALUE = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__OPERATION = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY__OPERATION;

	/**
	 * The feature id for the '<em><b>New key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__NEW_KEY = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY__NEW_KEY;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__NEW_VALUE = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__ID_PATTERN = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__FILTER = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericTypeImpl <em>Pattern Diff EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE = 76;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__EUPPER_BOUND = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__EUPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__ETYPE_ARGUMENTS = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__ETYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__ERAW_TYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__ERAW_TYPE;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__ELOWER_BOUND = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__ELOWER_BOUND;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__ETYPE_PARAMETER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__ETYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__ECLASSIFIER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__ECLASSIFIER;

	/**
	 * The feature id for the '<em><b>Diffe Upper Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__DIFFE_UPPER_BOUND = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__DIFFE_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Diffe Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Diffe Raw Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__DIFFE_RAW_TYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__DIFFE_RAW_TYPE;

	/**
	 * The feature id for the '<em><b>Diffe Lower Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__DIFFE_LOWER_BOUND = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__DIFFE_LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Diffe Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__DIFFE_TYPE_PARAMETER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__DIFFE_TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Diffe Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__DIFFE_CLASSIFIER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__DIFFE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE___IS_INSTANCE__OBJECT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eUpperBoundImpl <em>Pattern Diff EGeneric Type eUpper Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eUpperBoundImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eUpperBound()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND = 77;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__ETYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type eUpper Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type eUpper Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeArgumentsImpl <em>Pattern Diff EGeneric Type eType Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeArgumentsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eTypeArguments()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS = 78;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__ETYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type eType Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type eType Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eRawTypeImpl <em>Pattern Diff EGeneric Type eRaw Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eRawTypeImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eRawType()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__ETYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type eRaw Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type eRaw Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eLowerBoundImpl <em>Pattern Diff EGeneric Type eLower Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eLowerBoundImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eLowerBound()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND = 80;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__ETYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type eLower Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type eLower Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeParameterImpl <em>Pattern Diff EGeneric Type eType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeParameterImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eTypeParameter()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER = 81;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__ETYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type eType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type eType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eClassifierImpl <em>Pattern Diff EGeneric Type eClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eClassifierImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eClassifier()
	 * @generated
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER = 82;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__OPERATION = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__ETYPE = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__ID_PATTERN = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__FILTER = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EGeneric Type eClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EGeneric Type eClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffETypeParameterImpl <em>Pattern Diff EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffETypeParameterImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypeParameter()
	 * @generated
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER = 83;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__EANNOTATIONS = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__DIFFE_ANNOTATIONS = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__DIFFE_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__NAME = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__EBOUNDS = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__EBOUNDS;

	/**
	 * The feature id for the '<em><b>Diffe Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__DIFFE_BOUNDS = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__DIFFE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__OPERATION = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__NEW_NAME = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__ID_PATTERN = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER__FILTER = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER___GET_EANNOTATION__STRING = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Pattern Diff EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.Pattern_DiffETypeParameter_eBoundsImpl <em>Pattern Diff EType Parameter eBounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.Pattern_DiffETypeParameter_eBoundsImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypeParameter_eBounds()
	 * @generated
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS = 84;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__OPERATION = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__ETYPE = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__ID_PATTERN = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__FILTER = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EType Parameter eBounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS_FEATURE_COUNT = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EType Parameter eBounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS_OPERATION_COUNT = EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreRuleMM.impl.RuleImpl
	 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EAttribute <em>Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EAttribute</em>'.
	 * @see ecoreRuleMM.Pattern_EAttribute
	 * @generated
	 */
	EClass getPattern_EAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EAttribute#getID_Pattern()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EAttribute#isFilter()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EAnnotation <em>Pattern EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EAnnotation</em>'.
	 * @see ecoreRuleMM.Pattern_EAnnotation
	 * @generated
	 */
	EClass getPattern_EAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EAnnotation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EAnnotation#getID_Pattern()
	 * @see #getPattern_EAnnotation()
	 * @generated
	 */
	EAttribute getPattern_EAnnotation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EAnnotation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EAnnotation#isFilter()
	 * @see #getPattern_EAnnotation()
	 * @generated
	 */
	EAttribute getPattern_EAnnotation_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EClass <em>Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EClass</em>'.
	 * @see ecoreRuleMM.Pattern_EClass
	 * @generated
	 */
	EClass getPattern_EClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EClass#getID_Pattern()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EClass#isFilter()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EClassifier <em>Pattern EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EClassifier</em>'.
	 * @see ecoreRuleMM.Pattern_EClassifier
	 * @generated
	 */
	EClass getPattern_EClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EClassifier#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EClassifier#getID_Pattern()
	 * @see #getPattern_EClassifier()
	 * @generated
	 */
	EAttribute getPattern_EClassifier_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EClassifier#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EClassifier#isFilter()
	 * @see #getPattern_EClassifier()
	 * @generated
	 */
	EAttribute getPattern_EClassifier_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EDataType <em>Pattern EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EData Type</em>'.
	 * @see ecoreRuleMM.Pattern_EDataType
	 * @generated
	 */
	EClass getPattern_EDataType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EDataType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EDataType#getID_Pattern()
	 * @see #getPattern_EDataType()
	 * @generated
	 */
	EAttribute getPattern_EDataType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EDataType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EDataType#isFilter()
	 * @see #getPattern_EDataType()
	 * @generated
	 */
	EAttribute getPattern_EDataType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EEnum <em>Pattern EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EEnum</em>'.
	 * @see ecoreRuleMM.Pattern_EEnum
	 * @generated
	 */
	EClass getPattern_EEnum();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EEnum#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EEnum#getID_Pattern()
	 * @see #getPattern_EEnum()
	 * @generated
	 */
	EAttribute getPattern_EEnum_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EEnum#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EEnum#isFilter()
	 * @see #getPattern_EEnum()
	 * @generated
	 */
	EAttribute getPattern_EEnum_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EEnumLiteral <em>Pattern EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EEnum Literal</em>'.
	 * @see ecoreRuleMM.Pattern_EEnumLiteral
	 * @generated
	 */
	EClass getPattern_EEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EEnumLiteral#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EEnumLiteral#getID_Pattern()
	 * @see #getPattern_EEnumLiteral()
	 * @generated
	 */
	EAttribute getPattern_EEnumLiteral_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EEnumLiteral#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EEnumLiteral#isFilter()
	 * @see #getPattern_EEnumLiteral()
	 * @generated
	 */
	EAttribute getPattern_EEnumLiteral_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EFactory <em>Pattern EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EFactory</em>'.
	 * @see ecoreRuleMM.Pattern_EFactory
	 * @generated
	 */
	EClass getPattern_EFactory();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EFactory#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EFactory#getID_Pattern()
	 * @see #getPattern_EFactory()
	 * @generated
	 */
	EAttribute getPattern_EFactory_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EFactory#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EFactory#isFilter()
	 * @see #getPattern_EFactory()
	 * @generated
	 */
	EAttribute getPattern_EFactory_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EModelElement <em>Pattern EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EModel Element</em>'.
	 * @see ecoreRuleMM.Pattern_EModelElement
	 * @generated
	 */
	EClass getPattern_EModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EModelElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EModelElement#getID_Pattern()
	 * @see #getPattern_EModelElement()
	 * @generated
	 */
	EAttribute getPattern_EModelElement_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EModelElement#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EModelElement#isFilter()
	 * @see #getPattern_EModelElement()
	 * @generated
	 */
	EAttribute getPattern_EModelElement_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_ENamedElement <em>Pattern ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern ENamed Element</em>'.
	 * @see ecoreRuleMM.Pattern_ENamedElement
	 * @generated
	 */
	EClass getPattern_ENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_ENamedElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_ENamedElement#getID_Pattern()
	 * @see #getPattern_ENamedElement()
	 * @generated
	 */
	EAttribute getPattern_ENamedElement_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_ENamedElement#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_ENamedElement#isFilter()
	 * @see #getPattern_ENamedElement()
	 * @generated
	 */
	EAttribute getPattern_ENamedElement_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EObject <em>Pattern EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EObject</em>'.
	 * @see ecoreRuleMM.Pattern_EObject
	 * @generated
	 */
	EClass getPattern_EObject();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EObject#getID_Pattern()
	 * @see #getPattern_EObject()
	 * @generated
	 */
	EAttribute getPattern_EObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EObject#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EObject#isFilter()
	 * @see #getPattern_EObject()
	 * @generated
	 */
	EAttribute getPattern_EObject_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EOperation <em>Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EOperation</em>'.
	 * @see ecoreRuleMM.Pattern_EOperation
	 * @generated
	 */
	EClass getPattern_EOperation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EOperation#getID_Pattern()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EOperation#isFilter()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EPackage <em>Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EPackage</em>'.
	 * @see ecoreRuleMM.Pattern_EPackage
	 * @generated
	 */
	EClass getPattern_EPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EPackage#getID_Pattern()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EPackage#isFilter()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EParameter <em>Pattern EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EParameter</em>'.
	 * @see ecoreRuleMM.Pattern_EParameter
	 * @generated
	 */
	EClass getPattern_EParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EParameter#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EParameter#getID_Pattern()
	 * @see #getPattern_EParameter()
	 * @generated
	 */
	EAttribute getPattern_EParameter_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EParameter#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EParameter#isFilter()
	 * @see #getPattern_EParameter()
	 * @generated
	 */
	EAttribute getPattern_EParameter_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EReference <em>Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EReference</em>'.
	 * @see ecoreRuleMM.Pattern_EReference
	 * @generated
	 */
	EClass getPattern_EReference();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EReference#getID_Pattern()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EReference#isFilter()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EStructuralFeature <em>Pattern EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EStructural Feature</em>'.
	 * @see ecoreRuleMM.Pattern_EStructuralFeature
	 * @generated
	 */
	EClass getPattern_EStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EStructuralFeature#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EStructuralFeature#getID_Pattern()
	 * @see #getPattern_EStructuralFeature()
	 * @generated
	 */
	EAttribute getPattern_EStructuralFeature_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EStructuralFeature#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EStructuralFeature#isFilter()
	 * @see #getPattern_EStructuralFeature()
	 * @generated
	 */
	EAttribute getPattern_EStructuralFeature_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_ETypedElement <em>Pattern ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern ETyped Element</em>'.
	 * @see ecoreRuleMM.Pattern_ETypedElement
	 * @generated
	 */
	EClass getPattern_ETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_ETypedElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_ETypedElement#getID_Pattern()
	 * @see #getPattern_ETypedElement()
	 * @generated
	 */
	EAttribute getPattern_ETypedElement_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_ETypedElement#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_ETypedElement#isFilter()
	 * @see #getPattern_ETypedElement()
	 * @generated
	 */
	EAttribute getPattern_ETypedElement_Filter();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Pattern EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="ID_Pattern filter" 
	 *        ID_PatternId="true" ID_PatternDataType="org.eclipse.emf.ecore.EInt" ID_PatternRequired="true"
	 *        filterDataType="org.eclipse.emf.ecore.EBoolean" filterRequired="true" superTypes="ecoreDiffMM.EStringToStringMapEntry"
	 * @generated
	 */
	EClass getPattern_EStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPattern_EStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getPattern_EStringToStringMapEntry_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPattern_EStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getPattern_EStringToStringMapEntry_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_EGenericType <em>Pattern EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EGeneric Type</em>'.
	 * @see ecoreRuleMM.Pattern_EGenericType
	 * @generated
	 */
	EClass getPattern_EGenericType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EGenericType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_EGenericType#getID_Pattern()
	 * @see #getPattern_EGenericType()
	 * @generated
	 */
	EAttribute getPattern_EGenericType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_EGenericType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_EGenericType#isFilter()
	 * @see #getPattern_EGenericType()
	 * @generated
	 */
	EAttribute getPattern_EGenericType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_ETypeParameter <em>Pattern EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EType Parameter</em>'.
	 * @see ecoreRuleMM.Pattern_ETypeParameter
	 * @generated
	 */
	EClass getPattern_ETypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_ETypeParameter#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_ETypeParameter#getID_Pattern()
	 * @see #getPattern_ETypeParameter()
	 * @generated
	 */
	EAttribute getPattern_ETypeParameter_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_ETypeParameter#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_ETypeParameter#isFilter()
	 * @see #getPattern_ETypeParameter()
	 * @generated
	 */
	EAttribute getPattern_ETypeParameter_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Domain Specific Diff</em>'.
	 * @see ecoreRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	EClass getPattern_DomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DomainSpecificDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DomainSpecificDiff#getID_Pattern()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DomainSpecificDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DomainSpecificDiff#isFilter()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAttribute <em>Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAttribute</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute
	 * @generated
	 */
	EClass getPattern_DiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute#getID_Pattern()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute#isFilter()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType <em>Pattern Diff EAttribute eAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAttribute eAttribute Type</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType
	 * @generated
	 */
	EClass getPattern_DiffEAttribute_eAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType#getID_Pattern()
	 * @see #getPattern_DiffEAttribute_eAttributeType()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_eAttributeType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType#isFilter()
	 * @see #getPattern_DiffEAttribute_eAttributeType()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_eAttributeType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAnnotation <em>Pattern Diff EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAnnotation</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation
	 * @generated
	 */
	EClass getPattern_DiffEAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation#getID_Pattern()
	 * @see #getPattern_DiffEAnnotation()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation#isFilter()
	 * @see #getPattern_DiffEAnnotation()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_details <em>Pattern Diff EAnnotation details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAnnotation details</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_details
	 * @generated
	 */
	EClass getPattern_DiffEAnnotation_details();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_details#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_details#getID_Pattern()
	 * @see #getPattern_DiffEAnnotation_details()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_details_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_details#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_details#isFilter()
	 * @see #getPattern_DiffEAnnotation_details()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_details_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement <em>Pattern Diff EAnnotation eModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAnnotation eModel Element</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement
	 * @generated
	 */
	EClass getPattern_DiffEAnnotation_eModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement#getID_Pattern()
	 * @see #getPattern_DiffEAnnotation_eModelElement()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_eModelElement_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement#isFilter()
	 * @see #getPattern_DiffEAnnotation_eModelElement()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_eModelElement_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_contents <em>Pattern Diff EAnnotation contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAnnotation contents</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_contents
	 * @generated
	 */
	EClass getPattern_DiffEAnnotation_contents();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_contents#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_contents#getID_Pattern()
	 * @see #getPattern_DiffEAnnotation_contents()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_contents_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_contents#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_contents#isFilter()
	 * @see #getPattern_DiffEAnnotation_contents()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_contents_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_references <em>Pattern Diff EAnnotation references</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAnnotation references</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_references
	 * @generated
	 */
	EClass getPattern_DiffEAnnotation_references();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_references#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_references#getID_Pattern()
	 * @see #getPattern_DiffEAnnotation_references()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_references_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEAnnotation_references#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_references#isFilter()
	 * @see #getPattern_DiffEAnnotation_references()
	 * @generated
	 */
	EAttribute getPattern_DiffEAnnotation_references_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass <em>Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass
	 * @generated
	 */
	EClass getPattern_DiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass#getID_Pattern()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass#isFilter()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eSuperTypes <em>Pattern Diff EClass eSuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eSuper Types</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eSuperTypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eSuperTypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eSuperTypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eSuperTypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eSuperTypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eSuperTypes#isFilter()
	 * @see #getPattern_DiffEClass_eSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eSuperTypes_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eOperations <em>Pattern Diff EClass eOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eOperations</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eOperations
	 * @generated
	 */
	EClass getPattern_DiffEClass_eOperations();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eOperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eOperations#getID_Pattern()
	 * @see #getPattern_DiffEClass_eOperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eOperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eOperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eOperations#isFilter()
	 * @see #getPattern_DiffEClass_eOperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eOperations_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllAttributes <em>Pattern Diff EClass eAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll Attributes</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllAttributes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllAttributes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllAttributes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllAttributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllAttributes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllAttributes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllAttributes#isFilter()
	 * @see #getPattern_DiffEClass_eAllAttributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllAttributes_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllReferences <em>Pattern Diff EClass eAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll References</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllReferences
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllReferences();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllReferences#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllReferences#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllReferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllReferences_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllReferences#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllReferences#isFilter()
	 * @see #getPattern_DiffEClass_eAllReferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllReferences_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eReferences <em>Pattern Diff EClass eReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eReferences</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eReferences
	 * @generated
	 */
	EClass getPattern_DiffEClass_eReferences();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eReferences#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eReferences#getID_Pattern()
	 * @see #getPattern_DiffEClass_eReferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eReferences_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eReferences#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eReferences#isFilter()
	 * @see #getPattern_DiffEClass_eReferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eReferences_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAttributes <em>Pattern Diff EClass eAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAttributes</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAttributes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAttributes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAttributes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAttributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAttributes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAttributes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAttributes#isFilter()
	 * @see #getPattern_DiffEClass_eAttributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAttributes_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllContainments <em>Pattern Diff EClass eAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll Containments</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllContainments
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllContainments();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllContainments#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllContainments#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllContainments()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllContainments_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllContainments#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllContainments#isFilter()
	 * @see #getPattern_DiffEClass_eAllContainments()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllContainments_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllOperations <em>Pattern Diff EClass eAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll Operations</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllOperations
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllOperations();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllOperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllOperations#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllOperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllOperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllOperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllOperations#isFilter()
	 * @see #getPattern_DiffEClass_eAllOperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllOperations_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures <em>Pattern Diff EClass eAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll Structural Features</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllStructuralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllStructuralFeatures()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllStructuralFeatures_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures#isFilter()
	 * @see #getPattern_DiffEClass_eAllStructuralFeatures()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllStructuralFeatures_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes <em>Pattern Diff EClass eAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll Super Types</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllSuperTypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes#isFilter()
	 * @see #getPattern_DiffEClass_eAllSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllSuperTypes_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eIDAttribute <em>Pattern Diff EClass eID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eID Attribute</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eIDAttribute
	 * @generated
	 */
	EClass getPattern_DiffEClass_eIDAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eIDAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eIDAttribute#getID_Pattern()
	 * @see #getPattern_DiffEClass_eIDAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eIDAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eIDAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eIDAttribute#isFilter()
	 * @see #getPattern_DiffEClass_eIDAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eIDAttribute_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures <em>Pattern Diff EClass eStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eStructural Features</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures
	 * @generated
	 */
	EClass getPattern_DiffEClass_eStructuralFeatures();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#getID_Pattern()
	 * @see #getPattern_DiffEClass_eStructuralFeatures()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eStructuralFeatures_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#isFilter()
	 * @see #getPattern_DiffEClass_eStructuralFeatures()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eStructuralFeatures_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes <em>Pattern Diff EClass eGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eGeneric Super Types</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eGenericSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eGenericSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eGenericSuperTypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes#isFilter()
	 * @see #getPattern_DiffEClass_eGenericSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eGenericSuperTypes_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes <em>Pattern Diff EClass eAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eAll Generic Super Types</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eAllGenericSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eAllGenericSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllGenericSuperTypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes#isFilter()
	 * @see #getPattern_DiffEClass_eAllGenericSuperTypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eAllGenericSuperTypes_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClassifier_ePackage <em>Pattern Diff EClassifier ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClassifier ePackage</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_ePackage
	 * @generated
	 */
	EClass getPattern_DiffEClassifier_ePackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClassifier_ePackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_ePackage#getID_Pattern()
	 * @see #getPattern_DiffEClassifier_ePackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEClassifier_ePackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClassifier_ePackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_ePackage#isFilter()
	 * @see #getPattern_DiffEClassifier_ePackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEClassifier_ePackage_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters <em>Pattern Diff EClassifier eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClassifier eType Parameters</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters
	 * @generated
	 */
	EClass getPattern_DiffEClassifier_eTypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters#getID_Pattern()
	 * @see #getPattern_DiffEClassifier_eTypeParameters()
	 * @generated
	 */
	EAttribute getPattern_DiffEClassifier_eTypeParameters_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters#isFilter()
	 * @see #getPattern_DiffEClassifier_eTypeParameters()
	 * @generated
	 */
	EAttribute getPattern_DiffEClassifier_eTypeParameters_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEDataType <em>Pattern Diff EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EData Type</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEDataType
	 * @generated
	 */
	EClass getPattern_DiffEDataType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEDataType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEDataType#getID_Pattern()
	 * @see #getPattern_DiffEDataType()
	 * @generated
	 */
	EAttribute getPattern_DiffEDataType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEDataType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEDataType#isFilter()
	 * @see #getPattern_DiffEDataType()
	 * @generated
	 */
	EAttribute getPattern_DiffEDataType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEEnum <em>Pattern Diff EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EEnum</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnum
	 * @generated
	 */
	EClass getPattern_DiffEEnum();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnum#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnum#getID_Pattern()
	 * @see #getPattern_DiffEEnum()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnum_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnum#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnum#isFilter()
	 * @see #getPattern_DiffEEnum()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnum_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEEnum_eLiterals <em>Pattern Diff EEnum eLiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EEnum eLiterals</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnum_eLiterals
	 * @generated
	 */
	EClass getPattern_DiffEEnum_eLiterals();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnum_eLiterals#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnum_eLiterals#getID_Pattern()
	 * @see #getPattern_DiffEEnum_eLiterals()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnum_eLiterals_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnum_eLiterals#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnum_eLiterals#isFilter()
	 * @see #getPattern_DiffEEnum_eLiterals()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnum_eLiterals_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral <em>Pattern Diff EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EEnum Literal</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral
	 * @generated
	 */
	EClass getPattern_DiffEEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral#getID_Pattern()
	 * @see #getPattern_DiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnumLiteral_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral#isFilter()
	 * @see #getPattern_DiffEEnumLiteral()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnumLiteral_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum <em>Pattern Diff EEnum Literal eEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EEnum Literal eEnum</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum
	 * @generated
	 */
	EClass getPattern_DiffEEnumLiteral_eEnum();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#getID_Pattern()
	 * @see #getPattern_DiffEEnumLiteral_eEnum()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnumLiteral_eEnum_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#isFilter()
	 * @see #getPattern_DiffEEnumLiteral_eEnum()
	 * @generated
	 */
	EAttribute getPattern_DiffEEnumLiteral_eEnum_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEFactory <em>Pattern Diff EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EFactory</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEFactory
	 * @generated
	 */
	EClass getPattern_DiffEFactory();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEFactory#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEFactory#getID_Pattern()
	 * @see #getPattern_DiffEFactory()
	 * @generated
	 */
	EAttribute getPattern_DiffEFactory_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEFactory#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEFactory#isFilter()
	 * @see #getPattern_DiffEFactory()
	 * @generated
	 */
	EAttribute getPattern_DiffEFactory_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEFactory_ePackage <em>Pattern Diff EFactory ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EFactory ePackage</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEFactory_ePackage
	 * @generated
	 */
	EClass getPattern_DiffEFactory_ePackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEFactory_ePackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEFactory_ePackage#getID_Pattern()
	 * @see #getPattern_DiffEFactory_ePackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEFactory_ePackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEFactory_ePackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEFactory_ePackage#isFilter()
	 * @see #getPattern_DiffEFactory_ePackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEFactory_ePackage_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations <em>Pattern Diff EModel Element eAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EModel Element eAnnotations</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations
	 * @generated
	 */
	EClass getPattern_DiffEModelElement_eAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations#getID_Pattern()
	 * @see #getPattern_DiffEModelElement_eAnnotations()
	 * @generated
	 */
	EAttribute getPattern_DiffEModelElement_eAnnotations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations#isFilter()
	 * @see #getPattern_DiffEModelElement_eAnnotations()
	 * @generated
	 */
	EAttribute getPattern_DiffEModelElement_eAnnotations_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEObject <em>Pattern Diff EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EObject</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEObject
	 * @generated
	 */
	EClass getPattern_DiffEObject();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEObject#getID_Pattern()
	 * @see #getPattern_DiffEObject()
	 * @generated
	 */
	EAttribute getPattern_DiffEObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEObject#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEObject#isFilter()
	 * @see #getPattern_DiffEObject()
	 * @generated
	 */
	EAttribute getPattern_DiffEObject_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEOperation <em>Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation
	 * @generated
	 */
	EClass getPattern_DiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation#getID_Pattern()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation#isFilter()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEOperation_eContainingClass <em>Pattern Diff EOperation eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation eContaining Class</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eContainingClass
	 * @generated
	 */
	EClass getPattern_DiffEOperation_eContainingClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eContainingClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eContainingClass#getID_Pattern()
	 * @see #getPattern_DiffEOperation_eContainingClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eContainingClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eContainingClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eContainingClass#isFilter()
	 * @see #getPattern_DiffEOperation_eContainingClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eContainingClass_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters <em>Pattern Diff EOperation eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation eType Parameters</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters
	 * @generated
	 */
	EClass getPattern_DiffEOperation_eTypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters#getID_Pattern()
	 * @see #getPattern_DiffEOperation_eTypeParameters()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eTypeParameters_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters#isFilter()
	 * @see #getPattern_DiffEOperation_eTypeParameters()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eTypeParameters_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEOperation_eParameters <em>Pattern Diff EOperation eParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation eParameters</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eParameters
	 * @generated
	 */
	EClass getPattern_DiffEOperation_eParameters();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eParameters#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eParameters#getID_Pattern()
	 * @see #getPattern_DiffEOperation_eParameters()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eParameters_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eParameters#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eParameters#isFilter()
	 * @see #getPattern_DiffEOperation_eParameters()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eParameters_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEOperation_eExceptions <em>Pattern Diff EOperation eExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation eExceptions</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eExceptions
	 * @generated
	 */
	EClass getPattern_DiffEOperation_eExceptions();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eExceptions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eExceptions#getID_Pattern()
	 * @see #getPattern_DiffEOperation_eExceptions()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eExceptions_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eExceptions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eExceptions#isFilter()
	 * @see #getPattern_DiffEOperation_eExceptions()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eExceptions_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions <em>Pattern Diff EOperation eGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation eGeneric Exceptions</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions
	 * @generated
	 */
	EClass getPattern_DiffEOperation_eGenericExceptions();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions#getID_Pattern()
	 * @see #getPattern_DiffEOperation_eGenericExceptions()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eGenericExceptions_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions#isFilter()
	 * @see #getPattern_DiffEOperation_eGenericExceptions()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_eGenericExceptions_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEPackage <em>Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage
	 * @generated
	 */
	EClass getPattern_DiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage#getID_Pattern()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage#isFilter()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance <em>Pattern Diff EPackage eFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eFactory Instance</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eFactoryInstance();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eFactoryInstance()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eFactoryInstance_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance#isFilter()
	 * @see #getPattern_DiffEPackage_eFactoryInstance()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eFactoryInstance_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEPackage_eClassifiers <em>Pattern Diff EPackage eClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eClassifiers</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eClassifiers
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eClassifiers();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eClassifiers#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eClassifiers#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eClassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eClassifiers_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eClassifiers#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eClassifiers#isFilter()
	 * @see #getPattern_DiffEPackage_eClassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eClassifiers_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEPackage_eSubpackages <em>Pattern Diff EPackage eSubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eSubpackages</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSubpackages
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eSubpackages();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eSubpackages#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSubpackages#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eSubpackages()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eSubpackages_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eSubpackages#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSubpackages#isFilter()
	 * @see #getPattern_DiffEPackage_eSubpackages()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eSubpackages_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage <em>Pattern Diff EPackage eSuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eSuper Package</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eSuperPackage();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eSuperPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eSuperPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage#isFilter()
	 * @see #getPattern_DiffEPackage_eSuperPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eSuperPackage_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs <em>Pattern Diff EPackage domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage domainspecificdiffs</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs
	 * @generated
	 */
	EClass getPattern_DiffEPackage_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs#getID_Pattern()
	 * @see #getPattern_DiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs#isFilter()
	 * @see #getPattern_DiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_domainspecificdiffs_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEParameter <em>Pattern Diff EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EParameter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEParameter
	 * @generated
	 */
	EClass getPattern_DiffEParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEParameter#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEParameter#getID_Pattern()
	 * @see #getPattern_DiffEParameter()
	 * @generated
	 */
	EAttribute getPattern_DiffEParameter_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEParameter#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEParameter#isFilter()
	 * @see #getPattern_DiffEParameter()
	 * @generated
	 */
	EAttribute getPattern_DiffEParameter_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEParameter_eOperation <em>Pattern Diff EParameter eOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EParameter eOperation</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEParameter_eOperation
	 * @generated
	 */
	EClass getPattern_DiffEParameter_eOperation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEParameter_eOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEParameter_eOperation#getID_Pattern()
	 * @see #getPattern_DiffEParameter_eOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEParameter_eOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEParameter_eOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEParameter_eOperation#isFilter()
	 * @see #getPattern_DiffEParameter_eOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEParameter_eOperation_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEReference <em>Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference
	 * @generated
	 */
	EClass getPattern_DiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference#getID_Pattern()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference#isFilter()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEReference_eOpposite <em>Pattern Diff EReference eOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference eOpposite</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eOpposite
	 * @generated
	 */
	EClass getPattern_DiffEReference_eOpposite();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference_eOpposite#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eOpposite#getID_Pattern()
	 * @see #getPattern_DiffEReference_eOpposite()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_eOpposite_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference_eOpposite#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eOpposite#isFilter()
	 * @see #getPattern_DiffEReference_eOpposite()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_eOpposite_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEReference_eReferenceType <em>Pattern Diff EReference eReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference eReference Type</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eReferenceType
	 * @generated
	 */
	EClass getPattern_DiffEReference_eReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference_eReferenceType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eReferenceType#getID_Pattern()
	 * @see #getPattern_DiffEReference_eReferenceType()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_eReferenceType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference_eReferenceType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eReferenceType#isFilter()
	 * @see #getPattern_DiffEReference_eReferenceType()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_eReferenceType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEReference_eKeys <em>Pattern Diff EReference eKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference eKeys</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eKeys
	 * @generated
	 */
	EClass getPattern_DiffEReference_eKeys();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference_eKeys#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eKeys#getID_Pattern()
	 * @see #getPattern_DiffEReference_eKeys()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_eKeys_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEReference_eKeys#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eKeys#isFilter()
	 * @see #getPattern_DiffEReference_eKeys()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_eKeys_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass <em>Pattern Diff EStructural Feature eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EStructural Feature eContaining Class</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass
	 * @generated
	 */
	EClass getPattern_DiffEStructuralFeature_eContainingClass();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass#getID_Pattern()
	 * @see #getPattern_DiffEStructuralFeature_eContainingClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEStructuralFeature_eContainingClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass#isFilter()
	 * @see #getPattern_DiffEStructuralFeature_eContainingClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEStructuralFeature_eContainingClass_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffETypedElement_eType <em>Pattern Diff ETyped Element eType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff ETyped Element eType</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eType
	 * @generated
	 */
	EClass getPattern_DiffETypedElement_eType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypedElement_eType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eType#getID_Pattern()
	 * @see #getPattern_DiffETypedElement_eType()
	 * @generated
	 */
	EAttribute getPattern_DiffETypedElement_eType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypedElement_eType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eType#isFilter()
	 * @see #getPattern_DiffETypedElement_eType()
	 * @generated
	 */
	EAttribute getPattern_DiffETypedElement_eType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffETypedElement_eGenericType <em>Pattern Diff ETyped Element eGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff ETyped Element eGeneric Type</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eGenericType
	 * @generated
	 */
	EClass getPattern_DiffETypedElement_eGenericType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypedElement_eGenericType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eGenericType#getID_Pattern()
	 * @see #getPattern_DiffETypedElement_eGenericType()
	 * @generated
	 */
	EAttribute getPattern_DiffETypedElement_eGenericType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypedElement_eGenericType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eGenericType#isFilter()
	 * @see #getPattern_DiffETypedElement_eGenericType()
	 * @generated
	 */
	EAttribute getPattern_DiffETypedElement_eGenericType_Filter();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Pattern Diff EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="ID_Pattern filter" 
	 *        ID_PatternId="true" ID_PatternDataType="org.eclipse.emf.ecore.EInt" ID_PatternRequired="true"
	 *        filterDataType="org.eclipse.emf.ecore.EBoolean" filterRequired="true" superTypes="ecoreDiffMM.DiffEStringToStringMapEntry"
	 * @generated
	 */
	EClass getPattern_DiffEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPattern_DiffEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getPattern_DiffEStringToStringMapEntry_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPattern_DiffEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getPattern_DiffEStringToStringMapEntry_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType <em>Pattern Diff EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType
	 * @generated
	 */
	EClass getPattern_DiffEGenericType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType#getID_Pattern()
	 * @see #getPattern_DiffEGenericType()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType#isFilter()
	 * @see #getPattern_DiffEGenericType()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound <em>Pattern Diff EGeneric Type eUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type eUpper Bound</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound
	 * @generated
	 */
	EClass getPattern_DiffEGenericType_eUpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound#getID_Pattern()
	 * @see #getPattern_DiffEGenericType_eUpperBound()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eUpperBound_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound#isFilter()
	 * @see #getPattern_DiffEGenericType_eUpperBound()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eUpperBound_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments <em>Pattern Diff EGeneric Type eType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type eType Arguments</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments
	 * @generated
	 */
	EClass getPattern_DiffEGenericType_eTypeArguments();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments#getID_Pattern()
	 * @see #getPattern_DiffEGenericType_eTypeArguments()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eTypeArguments_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments#isFilter()
	 * @see #getPattern_DiffEGenericType_eTypeArguments()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eTypeArguments_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eRawType <em>Pattern Diff EGeneric Type eRaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type eRaw Type</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eRawType
	 * @generated
	 */
	EClass getPattern_DiffEGenericType_eRawType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eRawType#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eRawType#getID_Pattern()
	 * @see #getPattern_DiffEGenericType_eRawType()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eRawType_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eRawType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eRawType#isFilter()
	 * @see #getPattern_DiffEGenericType_eRawType()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eRawType_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound <em>Pattern Diff EGeneric Type eLower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type eLower Bound</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound
	 * @generated
	 */
	EClass getPattern_DiffEGenericType_eLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound#getID_Pattern()
	 * @see #getPattern_DiffEGenericType_eLowerBound()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eLowerBound_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound#isFilter()
	 * @see #getPattern_DiffEGenericType_eLowerBound()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eLowerBound_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter <em>Pattern Diff EGeneric Type eType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type eType Parameter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter
	 * @generated
	 */
	EClass getPattern_DiffEGenericType_eTypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter#getID_Pattern()
	 * @see #getPattern_DiffEGenericType_eTypeParameter()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eTypeParameter_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter#isFilter()
	 * @see #getPattern_DiffEGenericType_eTypeParameter()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eTypeParameter_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eClassifier <em>Pattern Diff EGeneric Type eClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EGeneric Type eClassifier</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eClassifier
	 * @generated
	 */
	EClass getPattern_DiffEGenericType_eClassifier();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eClassifier#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eClassifier#getID_Pattern()
	 * @see #getPattern_DiffEGenericType_eClassifier()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eClassifier_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffEGenericType_eClassifier#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eClassifier#isFilter()
	 * @see #getPattern_DiffEGenericType_eClassifier()
	 * @generated
	 */
	EAttribute getPattern_DiffEGenericType_eClassifier_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffETypeParameter <em>Pattern Diff EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EType Parameter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter
	 * @generated
	 */
	EClass getPattern_DiffETypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypeParameter#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter#getID_Pattern()
	 * @see #getPattern_DiffETypeParameter()
	 * @generated
	 */
	EAttribute getPattern_DiffETypeParameter_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypeParameter#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter#isFilter()
	 * @see #getPattern_DiffETypeParameter()
	 * @generated
	 */
	EAttribute getPattern_DiffETypeParameter_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Pattern_DiffETypeParameter_eBounds <em>Pattern Diff EType Parameter eBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EType Parameter eBounds</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter_eBounds
	 * @generated
	 */
	EClass getPattern_DiffETypeParameter_eBounds();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypeParameter_eBounds#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter_eBounds#getID_Pattern()
	 * @see #getPattern_DiffETypeParameter_eBounds()
	 * @generated
	 */
	EAttribute getPattern_DiffETypeParameter_eBounds_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Pattern_DiffETypeParameter_eBounds#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter_eBounds#isFilter()
	 * @see #getPattern_DiffETypeParameter_eBounds()
	 * @generated
	 */
	EAttribute getPattern_DiffETypeParameter_eBounds_Filter();

	/**
	 * Returns the meta object for class '{@link ecoreRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ecoreRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link ecoreRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ecoreRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see ecoreRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreRuleMM.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see ecoreRuleMM.Rule#getPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreRuleMMFactory getEcoreRuleMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EAttributeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EAttribute()
		 * @generated
		 */
		EClass PATTERN_EATTRIBUTE = eINSTANCE.getPattern_EAttribute();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__ID_PATTERN = eINSTANCE.getPattern_EAttribute_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__FILTER = eINSTANCE.getPattern_EAttribute_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EAnnotationImpl <em>Pattern EAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EAnnotationImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EAnnotation()
		 * @generated
		 */
		EClass PATTERN_EANNOTATION = eINSTANCE.getPattern_EAnnotation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EANNOTATION__ID_PATTERN = eINSTANCE.getPattern_EAnnotation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EANNOTATION__FILTER = eINSTANCE.getPattern_EAnnotation_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EClassImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EClass()
		 * @generated
		 */
		EClass PATTERN_ECLASS = eINSTANCE.getPattern_EClass();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__ID_PATTERN = eINSTANCE.getPattern_EClass_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__FILTER = eINSTANCE.getPattern_EClass_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EClassifierImpl <em>Pattern EClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EClassifierImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EClassifier()
		 * @generated
		 */
		EClass PATTERN_ECLASSIFIER = eINSTANCE.getPattern_EClassifier();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASSIFIER__ID_PATTERN = eINSTANCE.getPattern_EClassifier_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASSIFIER__FILTER = eINSTANCE.getPattern_EClassifier_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EDataTypeImpl <em>Pattern EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EDataTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EDataType()
		 * @generated
		 */
		EClass PATTERN_EDATA_TYPE = eINSTANCE.getPattern_EDataType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EDATA_TYPE__ID_PATTERN = eINSTANCE.getPattern_EDataType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EDATA_TYPE__FILTER = eINSTANCE.getPattern_EDataType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EEnumImpl <em>Pattern EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EEnumImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EEnum()
		 * @generated
		 */
		EClass PATTERN_EENUM = eINSTANCE.getPattern_EEnum();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EENUM__ID_PATTERN = eINSTANCE.getPattern_EEnum_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EENUM__FILTER = eINSTANCE.getPattern_EEnum_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EEnumLiteralImpl <em>Pattern EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EEnumLiteralImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EEnumLiteral()
		 * @generated
		 */
		EClass PATTERN_EENUM_LITERAL = eINSTANCE.getPattern_EEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EENUM_LITERAL__ID_PATTERN = eINSTANCE.getPattern_EEnumLiteral_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EENUM_LITERAL__FILTER = eINSTANCE.getPattern_EEnumLiteral_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EFactoryImpl <em>Pattern EFactory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EFactoryImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EFactory()
		 * @generated
		 */
		EClass PATTERN_EFACTORY = eINSTANCE.getPattern_EFactory();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EFACTORY__ID_PATTERN = eINSTANCE.getPattern_EFactory_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EFACTORY__FILTER = eINSTANCE.getPattern_EFactory_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EModelElementImpl <em>Pattern EModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EModelElementImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EModelElement()
		 * @generated
		 */
		EClass PATTERN_EMODEL_ELEMENT = eINSTANCE.getPattern_EModelElement();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EMODEL_ELEMENT__ID_PATTERN = eINSTANCE.getPattern_EModelElement_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EMODEL_ELEMENT__FILTER = eINSTANCE.getPattern_EModelElement_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_ENamedElementImpl <em>Pattern ENamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_ENamedElementImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_ENamedElement()
		 * @generated
		 */
		EClass PATTERN_ENAMED_ELEMENT = eINSTANCE.getPattern_ENamedElement();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ENAMED_ELEMENT__ID_PATTERN = eINSTANCE.getPattern_ENamedElement_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ENAMED_ELEMENT__FILTER = eINSTANCE.getPattern_ENamedElement_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EObjectImpl <em>Pattern EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EObjectImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EObject()
		 * @generated
		 */
		EClass PATTERN_EOBJECT = eINSTANCE.getPattern_EObject();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOBJECT__ID_PATTERN = eINSTANCE.getPattern_EObject_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOBJECT__FILTER = eINSTANCE.getPattern_EObject_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EOperationImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EOperation()
		 * @generated
		 */
		EClass PATTERN_EOPERATION = eINSTANCE.getPattern_EOperation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__ID_PATTERN = eINSTANCE.getPattern_EOperation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__FILTER = eINSTANCE.getPattern_EOperation_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EPackageImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EPackage()
		 * @generated
		 */
		EClass PATTERN_EPACKAGE = eINSTANCE.getPattern_EPackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__ID_PATTERN = eINSTANCE.getPattern_EPackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__FILTER = eINSTANCE.getPattern_EPackage_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EParameterImpl <em>Pattern EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EParameterImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EParameter()
		 * @generated
		 */
		EClass PATTERN_EPARAMETER = eINSTANCE.getPattern_EParameter();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPARAMETER__ID_PATTERN = eINSTANCE.getPattern_EParameter_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPARAMETER__FILTER = eINSTANCE.getPattern_EParameter_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EReferenceImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EReference()
		 * @generated
		 */
		EClass PATTERN_EREFERENCE = eINSTANCE.getPattern_EReference();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__ID_PATTERN = eINSTANCE.getPattern_EReference_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__FILTER = eINSTANCE.getPattern_EReference_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EStructuralFeatureImpl <em>Pattern EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EStructuralFeatureImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EStructuralFeature()
		 * @generated
		 */
		EClass PATTERN_ESTRUCTURAL_FEATURE = eINSTANCE.getPattern_EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ESTRUCTURAL_FEATURE__ID_PATTERN = eINSTANCE.getPattern_EStructuralFeature_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ESTRUCTURAL_FEATURE__FILTER = eINSTANCE.getPattern_EStructuralFeature_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_ETypedElementImpl <em>Pattern ETyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_ETypedElementImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_ETypedElement()
		 * @generated
		 */
		EClass PATTERN_ETYPED_ELEMENT = eINSTANCE.getPattern_ETypedElement();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ETYPED_ELEMENT__ID_PATTERN = eINSTANCE.getPattern_ETypedElement_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ETYPED_ELEMENT__FILTER = eINSTANCE.getPattern_ETypedElement_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EStringToStringMapEntryImpl <em>Pattern EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EStringToStringMapEntryImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EStringToStringMapEntry()
		 * @generated
		 */
		EClass PATTERN_ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getPattern_EStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ESTRING_TO_STRING_MAP_ENTRY__ID_PATTERN = eINSTANCE.getPattern_EStringToStringMapEntry_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ESTRING_TO_STRING_MAP_ENTRY__FILTER = eINSTANCE.getPattern_EStringToStringMapEntry_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_EGenericTypeImpl <em>Pattern EGeneric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_EGenericTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_EGenericType()
		 * @generated
		 */
		EClass PATTERN_EGENERIC_TYPE = eINSTANCE.getPattern_EGenericType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EGENERIC_TYPE__ID_PATTERN = eINSTANCE.getPattern_EGenericType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EGENERIC_TYPE__FILTER = eINSTANCE.getPattern_EGenericType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_ETypeParameterImpl <em>Pattern EType Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_ETypeParameterImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_ETypeParameter()
		 * @generated
		 */
		EClass PATTERN_ETYPE_PARAMETER = eINSTANCE.getPattern_ETypeParameter();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ETYPE_PARAMETER__ID_PATTERN = eINSTANCE.getPattern_ETypeParameter_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ETYPE_PARAMETER__FILTER = eINSTANCE.getPattern_ETypeParameter_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DomainSpecificDiffImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DomainSpecificDiff()
		 * @generated
		 */
		EClass PATTERN_DOMAIN_SPECIFIC_DIFF = eINSTANCE.getPattern_DomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = eINSTANCE.getPattern_DomainSpecificDiff_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = eINSTANCE.getPattern_DomainSpecificDiff_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAttributeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAttribute()
		 * @generated
		 */
		EClass PATTERN_DIFF_EATTRIBUTE = eINSTANCE.getPattern_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__ID_PATTERN = eINSTANCE.getPattern_DiffEAttribute_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__FILTER = eINSTANCE.getPattern_DiffEAttribute_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAttribute_eAttributeTypeImpl <em>Pattern Diff EAttribute eAttribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAttribute_eAttributeTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAttribute_eAttributeType()
		 * @generated
		 */
		EClass PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE = eINSTANCE.getPattern_DiffEAttribute_eAttributeType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__ID_PATTERN = eINSTANCE.getPattern_DiffEAttribute_eAttributeType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__FILTER = eINSTANCE.getPattern_DiffEAttribute_eAttributeType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotationImpl <em>Pattern Diff EAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotationImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation()
		 * @generated
		 */
		EClass PATTERN_DIFF_EANNOTATION = eINSTANCE.getPattern_DiffEAnnotation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION__ID_PATTERN = eINSTANCE.getPattern_DiffEAnnotation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION__FILTER = eINSTANCE.getPattern_DiffEAnnotation_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_detailsImpl <em>Pattern Diff EAnnotation details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_detailsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_details()
		 * @generated
		 */
		EClass PATTERN_DIFF_EANNOTATION_DETAILS = eINSTANCE.getPattern_DiffEAnnotation_details();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_DETAILS__ID_PATTERN = eINSTANCE.getPattern_DiffEAnnotation_details_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_DETAILS__FILTER = eINSTANCE.getPattern_DiffEAnnotation_details_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_eModelElementImpl <em>Pattern Diff EAnnotation eModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_eModelElementImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_eModelElement()
		 * @generated
		 */
		EClass PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT = eINSTANCE.getPattern_DiffEAnnotation_eModelElement();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__ID_PATTERN = eINSTANCE.getPattern_DiffEAnnotation_eModelElement_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__FILTER = eINSTANCE.getPattern_DiffEAnnotation_eModelElement_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_contentsImpl <em>Pattern Diff EAnnotation contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_contentsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_contents()
		 * @generated
		 */
		EClass PATTERN_DIFF_EANNOTATION_CONTENTS = eINSTANCE.getPattern_DiffEAnnotation_contents();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_CONTENTS__ID_PATTERN = eINSTANCE.getPattern_DiffEAnnotation_contents_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_CONTENTS__FILTER = eINSTANCE.getPattern_DiffEAnnotation_contents_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEAnnotation_referencesImpl <em>Pattern Diff EAnnotation references</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEAnnotation_referencesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEAnnotation_references()
		 * @generated
		 */
		EClass PATTERN_DIFF_EANNOTATION_REFERENCES = eINSTANCE.getPattern_DiffEAnnotation_references();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_REFERENCES__ID_PATTERN = eINSTANCE.getPattern_DiffEAnnotation_references_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EANNOTATION_REFERENCES__FILTER = eINSTANCE.getPattern_DiffEAnnotation_references_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClassImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS = eINSTANCE.getPattern_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__FILTER = eINSTANCE.getPattern_DiffEClass_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eSuperTypesImpl <em>Pattern Diff EClass eSuper Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eSuperTypesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eSuperTypes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_ESUPER_TYPES = eINSTANCE.getPattern_DiffEClass_eSuperTypes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPER_TYPES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eSuperTypes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPER_TYPES__FILTER = eINSTANCE.getPattern_DiffEClass_eSuperTypes_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eOperationsImpl <em>Pattern Diff EClass eOperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eOperationsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eOperations()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EOPERATIONS = eINSTANCE.getPattern_DiffEClass_eOperations();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eOperations_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = eINSTANCE.getPattern_DiffEClass_eOperations_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllAttributesImpl <em>Pattern Diff EClass eAll Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllAttributesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllAttributes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES = eINSTANCE.getPattern_DiffEClass_eAllAttributes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllAttributes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__FILTER = eINSTANCE.getPattern_DiffEClass_eAllAttributes_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllReferencesImpl <em>Pattern Diff EClass eAll References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllReferencesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllReferences()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_REFERENCES = eINSTANCE.getPattern_DiffEClass_eAllReferences();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_REFERENCES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllReferences_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_REFERENCES__FILTER = eINSTANCE.getPattern_DiffEClass_eAllReferences_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eReferencesImpl <em>Pattern Diff EClass eReferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eReferencesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eReferences()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EREFERENCES = eINSTANCE.getPattern_DiffEClass_eReferences();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eReferences_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = eINSTANCE.getPattern_DiffEClass_eReferences_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAttributesImpl <em>Pattern Diff EClass eAttributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAttributesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAttributes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getPattern_DiffEClass_eAttributes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAttributes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = eINSTANCE.getPattern_DiffEClass_eAttributes_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllContainmentsImpl <em>Pattern Diff EClass eAll Containments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllContainmentsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllContainments()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS = eINSTANCE.getPattern_DiffEClass_eAllContainments();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllContainments_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__FILTER = eINSTANCE.getPattern_DiffEClass_eAllContainments_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllOperationsImpl <em>Pattern Diff EClass eAll Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllOperationsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllOperations()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_OPERATIONS = eINSTANCE.getPattern_DiffEClass_eAllOperations();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_OPERATIONS__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllOperations_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_OPERATIONS__FILTER = eINSTANCE.getPattern_DiffEClass_eAllOperations_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllStructuralFeaturesImpl <em>Pattern Diff EClass eAll Structural Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllStructuralFeaturesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllStructuralFeatures()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES = eINSTANCE.getPattern_DiffEClass_eAllStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllStructuralFeatures_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__FILTER = eINSTANCE.getPattern_DiffEClass_eAllStructuralFeatures_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllSuperTypesImpl <em>Pattern Diff EClass eAll Super Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllSuperTypesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllSuperTypes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES = eINSTANCE.getPattern_DiffEClass_eAllSuperTypes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllSuperTypes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__FILTER = eINSTANCE.getPattern_DiffEClass_eAllSuperTypes_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eIDAttributeImpl <em>Pattern Diff EClass eID Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eIDAttributeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eIDAttribute()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EID_ATTRIBUTE = eINSTANCE.getPattern_DiffEClass_eIDAttribute();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eIDAttribute_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__FILTER = eINSTANCE.getPattern_DiffEClass_eIDAttribute_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eStructuralFeaturesImpl <em>Pattern Diff EClass eStructural Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eStructuralFeaturesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eStructuralFeatures()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES = eINSTANCE.getPattern_DiffEClass_eStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eStructuralFeatures_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__FILTER = eINSTANCE.getPattern_DiffEClass_eStructuralFeatures_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eGenericSuperTypesImpl <em>Pattern Diff EClass eGeneric Super Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eGenericSuperTypesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eGenericSuperTypes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES = eINSTANCE.getPattern_DiffEClass_eGenericSuperTypes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eGenericSuperTypes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__FILTER = eINSTANCE.getPattern_DiffEClass_eGenericSuperTypes_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClass_eAllGenericSuperTypesImpl <em>Pattern Diff EClass eAll Generic Super Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClass_eAllGenericSuperTypesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClass_eAllGenericSuperTypes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES = eINSTANCE.getPattern_DiffEClass_eAllGenericSuperTypes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eAllGenericSuperTypes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__FILTER = eINSTANCE.getPattern_DiffEClass_eAllGenericSuperTypes_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClassifier_ePackageImpl <em>Pattern Diff EClassifier ePackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClassifier_ePackageImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClassifier_ePackage()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASSIFIER_EPACKAGE = eINSTANCE.getPattern_DiffEClassifier_ePackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASSIFIER_EPACKAGE__ID_PATTERN = eINSTANCE.getPattern_DiffEClassifier_ePackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASSIFIER_EPACKAGE__FILTER = eINSTANCE.getPattern_DiffEClassifier_ePackage_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEClassifier_eTypeParametersImpl <em>Pattern Diff EClassifier eType Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEClassifier_eTypeParametersImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEClassifier_eTypeParameters()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS = eINSTANCE.getPattern_DiffEClassifier_eTypeParameters();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__ID_PATTERN = eINSTANCE.getPattern_DiffEClassifier_eTypeParameters_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__FILTER = eINSTANCE.getPattern_DiffEClassifier_eTypeParameters_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEDataTypeImpl <em>Pattern Diff EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEDataTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEDataType()
		 * @generated
		 */
		EClass PATTERN_DIFF_EDATA_TYPE = eINSTANCE.getPattern_DiffEDataType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EDATA_TYPE__ID_PATTERN = eINSTANCE.getPattern_DiffEDataType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EDATA_TYPE__FILTER = eINSTANCE.getPattern_DiffEDataType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnumImpl <em>Pattern Diff EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEEnumImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnum()
		 * @generated
		 */
		EClass PATTERN_DIFF_EENUM = eINSTANCE.getPattern_DiffEEnum();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM__ID_PATTERN = eINSTANCE.getPattern_DiffEEnum_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM__FILTER = eINSTANCE.getPattern_DiffEEnum_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnum_eLiteralsImpl <em>Pattern Diff EEnum eLiterals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEEnum_eLiteralsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnum_eLiterals()
		 * @generated
		 */
		EClass PATTERN_DIFF_EENUM_ELITERALS = eINSTANCE.getPattern_DiffEEnum_eLiterals();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM_ELITERALS__ID_PATTERN = eINSTANCE.getPattern_DiffEEnum_eLiterals_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM_ELITERALS__FILTER = eINSTANCE.getPattern_DiffEEnum_eLiterals_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnumLiteralImpl <em>Pattern Diff EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEEnumLiteralImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnumLiteral()
		 * @generated
		 */
		EClass PATTERN_DIFF_EENUM_LITERAL = eINSTANCE.getPattern_DiffEEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM_LITERAL__ID_PATTERN = eINSTANCE.getPattern_DiffEEnumLiteral_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM_LITERAL__FILTER = eINSTANCE.getPattern_DiffEEnumLiteral_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEEnumLiteral_eEnumImpl <em>Pattern Diff EEnum Literal eEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEEnumLiteral_eEnumImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEEnumLiteral_eEnum()
		 * @generated
		 */
		EClass PATTERN_DIFF_EENUM_LITERAL_EENUM = eINSTANCE.getPattern_DiffEEnumLiteral_eEnum();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM_LITERAL_EENUM__ID_PATTERN = eINSTANCE.getPattern_DiffEEnumLiteral_eEnum_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EENUM_LITERAL_EENUM__FILTER = eINSTANCE.getPattern_DiffEEnumLiteral_eEnum_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEFactoryImpl <em>Pattern Diff EFactory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEFactoryImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEFactory()
		 * @generated
		 */
		EClass PATTERN_DIFF_EFACTORY = eINSTANCE.getPattern_DiffEFactory();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EFACTORY__ID_PATTERN = eINSTANCE.getPattern_DiffEFactory_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EFACTORY__FILTER = eINSTANCE.getPattern_DiffEFactory_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEFactory_ePackageImpl <em>Pattern Diff EFactory ePackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEFactory_ePackageImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEFactory_ePackage()
		 * @generated
		 */
		EClass PATTERN_DIFF_EFACTORY_EPACKAGE = eINSTANCE.getPattern_DiffEFactory_ePackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EFACTORY_EPACKAGE__ID_PATTERN = eINSTANCE.getPattern_DiffEFactory_ePackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EFACTORY_EPACKAGE__FILTER = eINSTANCE.getPattern_DiffEFactory_ePackage_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEModelElement_eAnnotationsImpl <em>Pattern Diff EModel Element eAnnotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEModelElement_eAnnotationsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEModelElement_eAnnotations()
		 * @generated
		 */
		EClass PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS = eINSTANCE.getPattern_DiffEModelElement_eAnnotations();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__ID_PATTERN = eINSTANCE.getPattern_DiffEModelElement_eAnnotations_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__FILTER = eINSTANCE.getPattern_DiffEModelElement_eAnnotations_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEObjectImpl <em>Pattern Diff EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEObjectImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEObject()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOBJECT = eINSTANCE.getPattern_DiffEObject();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOBJECT__ID_PATTERN = eINSTANCE.getPattern_DiffEObject_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOBJECT__FILTER = eINSTANCE.getPattern_DiffEObject_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEOperationImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION = eINSTANCE.getPattern_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__FILTER = eINSTANCE.getPattern_DiffEOperation_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eContainingClassImpl <em>Pattern Diff EOperation eContaining Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eContainingClassImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eContainingClass()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS = eINSTANCE.getPattern_DiffEOperation_eContainingClass();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_eContainingClass_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__FILTER = eINSTANCE.getPattern_DiffEOperation_eContainingClass_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eTypeParametersImpl <em>Pattern Diff EOperation eType Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eTypeParametersImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eTypeParameters()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS = eINSTANCE.getPattern_DiffEOperation_eTypeParameters();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_eTypeParameters_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__FILTER = eINSTANCE.getPattern_DiffEOperation_eTypeParameters_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eParametersImpl <em>Pattern Diff EOperation eParameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eParametersImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eParameters()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION_EPARAMETERS = eINSTANCE.getPattern_DiffEOperation_eParameters();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_EPARAMETERS__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_eParameters_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_EPARAMETERS__FILTER = eINSTANCE.getPattern_DiffEOperation_eParameters_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eExceptionsImpl <em>Pattern Diff EOperation eExceptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eExceptionsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eExceptions()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION_EEXCEPTIONS = eINSTANCE.getPattern_DiffEOperation_eExceptions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_EEXCEPTIONS__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_eExceptions_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_EEXCEPTIONS__FILTER = eINSTANCE.getPattern_DiffEOperation_eExceptions_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEOperation_eGenericExceptionsImpl <em>Pattern Diff EOperation eGeneric Exceptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEOperation_eGenericExceptionsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEOperation_eGenericExceptions()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS = eINSTANCE.getPattern_DiffEOperation_eGenericExceptions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_eGenericExceptions_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__FILTER = eINSTANCE.getPattern_DiffEOperation_eGenericExceptions_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEPackageImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE = eINSTANCE.getPattern_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__FILTER = eINSTANCE.getPattern_DiffEPackage_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eFactoryInstanceImpl <em>Pattern Diff EPackage eFactory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eFactoryInstanceImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eFactoryInstance()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE = eINSTANCE.getPattern_DiffEPackage_eFactoryInstance();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_eFactoryInstance_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__FILTER = eINSTANCE.getPattern_DiffEPackage_eFactoryInstance_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eClassifiersImpl <em>Pattern Diff EPackage eClassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eClassifiersImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eClassifiers()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getPattern_DiffEPackage_eClassifiers();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_eClassifiers_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = eINSTANCE.getPattern_DiffEPackage_eClassifiers_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eSubpackagesImpl <em>Pattern Diff EPackage eSubpackages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eSubpackagesImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eSubpackages()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_ESUBPACKAGES = eINSTANCE.getPattern_DiffEPackage_eSubpackages();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_eSubpackages_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__FILTER = eINSTANCE.getPattern_DiffEPackage_eSubpackages_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_eSuperPackageImpl <em>Pattern Diff EPackage eSuper Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_eSuperPackageImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_eSuperPackage()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE = eINSTANCE.getPattern_DiffEPackage_eSuperPackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_eSuperPackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__FILTER = eINSTANCE.getPattern_DiffEPackage_eSuperPackage_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl <em>Pattern Diff EPackage domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEPackage_domainspecificdiffs()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = eINSTANCE.getPattern_DiffEPackage_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__FILTER = eINSTANCE.getPattern_DiffEPackage_domainspecificdiffs_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEParameterImpl <em>Pattern Diff EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEParameterImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEParameter()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPARAMETER = eINSTANCE.getPattern_DiffEParameter();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPARAMETER__ID_PATTERN = eINSTANCE.getPattern_DiffEParameter_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPARAMETER__FILTER = eINSTANCE.getPattern_DiffEParameter_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEParameter_eOperationImpl <em>Pattern Diff EParameter eOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEParameter_eOperationImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEParameter_eOperation()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPARAMETER_EOPERATION = eINSTANCE.getPattern_DiffEParameter_eOperation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPARAMETER_EOPERATION__ID_PATTERN = eINSTANCE.getPattern_DiffEParameter_eOperation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPARAMETER_EOPERATION__FILTER = eINSTANCE.getPattern_DiffEParameter_eOperation_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEReferenceImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference()
		 * @generated
		 */
		EClass PATTERN_DIFF_EREFERENCE = eINSTANCE.getPattern_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__ID_PATTERN = eINSTANCE.getPattern_DiffEReference_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__FILTER = eINSTANCE.getPattern_DiffEReference_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEReference_eOppositeImpl <em>Pattern Diff EReference eOpposite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEReference_eOppositeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference_eOpposite()
		 * @generated
		 */
		EClass PATTERN_DIFF_EREFERENCE_EOPPOSITE = eINSTANCE.getPattern_DiffEReference_eOpposite();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE_EOPPOSITE__ID_PATTERN = eINSTANCE.getPattern_DiffEReference_eOpposite_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE_EOPPOSITE__FILTER = eINSTANCE.getPattern_DiffEReference_eOpposite_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEReference_eReferenceTypeImpl <em>Pattern Diff EReference eReference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEReference_eReferenceTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference_eReferenceType()
		 * @generated
		 */
		EClass PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE = eINSTANCE.getPattern_DiffEReference_eReferenceType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__ID_PATTERN = eINSTANCE.getPattern_DiffEReference_eReferenceType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__FILTER = eINSTANCE.getPattern_DiffEReference_eReferenceType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEReference_eKeysImpl <em>Pattern Diff EReference eKeys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEReference_eKeysImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEReference_eKeys()
		 * @generated
		 */
		EClass PATTERN_DIFF_EREFERENCE_EKEYS = eINSTANCE.getPattern_DiffEReference_eKeys();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE_EKEYS__ID_PATTERN = eINSTANCE.getPattern_DiffEReference_eKeys_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE_EKEYS__FILTER = eINSTANCE.getPattern_DiffEReference_eKeys_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEStructuralFeature_eContainingClassImpl <em>Pattern Diff EStructural Feature eContaining Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEStructuralFeature_eContainingClassImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEStructuralFeature_eContainingClass()
		 * @generated
		 */
		EClass PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS = eINSTANCE.getPattern_DiffEStructuralFeature_eContainingClass();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__ID_PATTERN = eINSTANCE.getPattern_DiffEStructuralFeature_eContainingClass_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__FILTER = eINSTANCE.getPattern_DiffEStructuralFeature_eContainingClass_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffETypedElement_eTypeImpl <em>Pattern Diff ETyped Element eType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffETypedElement_eTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypedElement_eType()
		 * @generated
		 */
		EClass PATTERN_DIFF_ETYPED_ELEMENT_ETYPE = eINSTANCE.getPattern_DiffETypedElement_eType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__ID_PATTERN = eINSTANCE.getPattern_DiffETypedElement_eType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__FILTER = eINSTANCE.getPattern_DiffETypedElement_eType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffETypedElement_eGenericTypeImpl <em>Pattern Diff ETyped Element eGeneric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffETypedElement_eGenericTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypedElement_eGenericType()
		 * @generated
		 */
		EClass PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE = eINSTANCE.getPattern_DiffETypedElement_eGenericType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__ID_PATTERN = eINSTANCE.getPattern_DiffETypedElement_eGenericType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__FILTER = eINSTANCE.getPattern_DiffETypedElement_eGenericType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEStringToStringMapEntryImpl <em>Pattern Diff EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEStringToStringMapEntryImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEStringToStringMapEntry()
		 * @generated
		 */
		EClass PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getPattern_DiffEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__ID_PATTERN = eINSTANCE.getPattern_DiffEStringToStringMapEntry_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__FILTER = eINSTANCE.getPattern_DiffEStringToStringMapEntry_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericTypeImpl <em>Pattern Diff EGeneric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE = eINSTANCE.getPattern_DiffEGenericType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE__FILTER = eINSTANCE.getPattern_DiffEGenericType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eUpperBoundImpl <em>Pattern Diff EGeneric Type eUpper Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eUpperBoundImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eUpperBound()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND = eINSTANCE.getPattern_DiffEGenericType_eUpperBound();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_eUpperBound_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__FILTER = eINSTANCE.getPattern_DiffEGenericType_eUpperBound_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeArgumentsImpl <em>Pattern Diff EGeneric Type eType Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeArgumentsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eTypeArguments()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS = eINSTANCE.getPattern_DiffEGenericType_eTypeArguments();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_eTypeArguments_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__FILTER = eINSTANCE.getPattern_DiffEGenericType_eTypeArguments_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eRawTypeImpl <em>Pattern Diff EGeneric Type eRaw Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eRawTypeImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eRawType()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE = eINSTANCE.getPattern_DiffEGenericType_eRawType();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_eRawType_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__FILTER = eINSTANCE.getPattern_DiffEGenericType_eRawType_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eLowerBoundImpl <em>Pattern Diff EGeneric Type eLower Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eLowerBoundImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eLowerBound()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND = eINSTANCE.getPattern_DiffEGenericType_eLowerBound();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_eLowerBound_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__FILTER = eINSTANCE.getPattern_DiffEGenericType_eLowerBound_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeParameterImpl <em>Pattern Diff EGeneric Type eType Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eTypeParameterImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eTypeParameter()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER = eINSTANCE.getPattern_DiffEGenericType_eTypeParameter();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_eTypeParameter_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__FILTER = eINSTANCE.getPattern_DiffEGenericType_eTypeParameter_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffEGenericType_eClassifierImpl <em>Pattern Diff EGeneric Type eClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffEGenericType_eClassifierImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffEGenericType_eClassifier()
		 * @generated
		 */
		EClass PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER = eINSTANCE.getPattern_DiffEGenericType_eClassifier();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__ID_PATTERN = eINSTANCE.getPattern_DiffEGenericType_eClassifier_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__FILTER = eINSTANCE.getPattern_DiffEGenericType_eClassifier_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffETypeParameterImpl <em>Pattern Diff EType Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffETypeParameterImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypeParameter()
		 * @generated
		 */
		EClass PATTERN_DIFF_ETYPE_PARAMETER = eINSTANCE.getPattern_DiffETypeParameter();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPE_PARAMETER__ID_PATTERN = eINSTANCE.getPattern_DiffETypeParameter_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPE_PARAMETER__FILTER = eINSTANCE.getPattern_DiffETypeParameter_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.Pattern_DiffETypeParameter_eBoundsImpl <em>Pattern Diff EType Parameter eBounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.Pattern_DiffETypeParameter_eBoundsImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getPattern_DiffETypeParameter_eBounds()
		 * @generated
		 */
		EClass PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS = eINSTANCE.getPattern_DiffETypeParameter_eBounds();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__ID_PATTERN = eINSTANCE.getPattern_DiffETypeParameter_eBounds_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__FILTER = eINSTANCE.getPattern_DiffETypeParameter_eBounds_Filter();

		/**
		 * The meta object literal for the '{@link ecoreRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreRuleMM.impl.RuleImpl
		 * @see ecoreRuleMM.impl.EcoreRuleMMPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONSTRAINTS = eINSTANCE.getRule_Constraints();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERN = eINSTANCE.getRule_Pattern();

	}

} //EcoreRuleMMPackage
