/**
 */
package refactoringDiffMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see refactoringDiffMM.RefactoringDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoringDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoringDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoringDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringDiffMMPackage eINSTANCE = refactoringDiffMM.impl.RefactoringDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EAttributeImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EClassImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EOPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EREFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPERTYPES = 4;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFEATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFEOPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFEREFERENCES = 7;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFESUPERTYPES = 8;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EOperationImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 2;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EPARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE = 2;

	/**
	 * The number of structural features of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EPackageImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DOMAINSPECIFICDIFFS = 2;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFECLASSIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFDOMAINSPECIFICDIFFS = 4;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EReferenceImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DomainSpecificDiffImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDomainSpecificDiff()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_DIFF = 5;

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
	 * The feature id for the '<em><b>Domain Specific Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEAttributeImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEAttribute()
	 * @generated
	 */
	int DIFF_EATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NAME = EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ETYPE = EATTRIBUTE__ETYPE;

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
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_ETYPE = EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_FEATURE_COUNT = EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_OPERATION_COUNT = EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClassImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass()
	 * @generated
	 */
	int DIFF_ECLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EATTRIBUTES = ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EOPERATIONS = ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EREFERENCES = ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__ESUPERTYPES = ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFEATTRIBUTES = ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFEOPERATIONS = ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFEREFERENCES = ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFESUPERTYPES = ECLASS__DIFFESUPERTYPES;

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
	 * The number of structural features of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_eattributesImpl <em>Diff EClass eattributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_eattributesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eattributes()
	 * @generated
	 */
	int DIFF_ECLASS_EATTRIBUTES = 8;

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
	 * The number of structural features of the '<em>Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_eoperationsImpl <em>Diff EClass eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_eoperationsImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eoperations()
	 * @generated
	 */
	int DIFF_ECLASS_EOPERATIONS = 9;

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
	 * The number of structural features of the '<em>Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_ereferencesImpl <em>Diff EClass ereferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_ereferencesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_ereferences()
	 * @generated
	 */
	int DIFF_ECLASS_EREFERENCES = 10;

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
	 * The number of structural features of the '<em>Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_esupertypesImpl <em>Diff EClass esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_esupertypesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_esupertypes()
	 * @generated
	 */
	int DIFF_ECLASS_ESUPERTYPES = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEOperationImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEOperation()
	 * @generated
	 */
	int DIFF_EOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EPARAMETERS = EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NAME = EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ETYPE = EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__OPERATION = EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_EPARAMETERS = EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_NAME = EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_ETYPE = EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_FEATURE_COUNT = EOPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_OPERATION_COUNT = EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackageImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage()
	 * @generated
	 */
	int DIFF_EPACKAGE = 13;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__ECLASSIFIERS = EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NAME = EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DOMAINSPECIFICDIFFS = EPACKAGE__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFECLASSIFIERS = EPACKAGE__DIFFECLASSIFIERS;

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
	 * The number of structural features of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_FEATURE_COUNT = EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_OPERATION_COUNT = EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl <em>Diff EPackage eclassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_eclassifiers()
	 * @generated
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS = 14;

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
	 * The number of structural features of the '<em>Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackage_domainspecificdiffsImpl <em>Diff EPackage domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackage_domainspecificdiffsImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = 15;

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
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEReferenceImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEReference()
	 * @generated
	 */
	int DIFF_EREFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NAME = EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__ETYPE = EREFERENCE__ETYPE;

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
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_ETYPE = EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_FEATURE_COUNT = EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_OPERATION_COUNT = EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.ClassOp <em>Class Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.ClassOp
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getClassOp()
	 * @generated
	 */
	int CLASS_OP = 17;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.AscOp <em>Asc Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.AscOp
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getAscOp()
	 * @generated
	 */
	int ASC_OP = 18;


	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see refactoringDiffMM.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EAttribute#getName()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EAttribute#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringDiffMM.EAttribute#getEtype()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see refactoringDiffMM.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EClass#getName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getEattributes <em>Eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eattributes</em>'.
	 * @see refactoringDiffMM.EClass#getEattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoringDiffMM.EClass#getEoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getEreferences <em>Ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ereferences</em>'.
	 * @see refactoringDiffMM.EClass#getEreferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.EClass#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoringDiffMM.EClass#getEsupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffeattributes <em>Diffeattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeattributes</em>'.
	 * @see refactoringDiffMM.EClass#getDiffeattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffeattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoringDiffMM.EClass#getDiffeoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffereferences <em>Differeferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Differeferences</em>'.
	 * @see refactoringDiffMM.EClass#getDiffereferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Differeferences();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoringDiffMM.EClass#getDiffesupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffesupertypes();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see refactoringDiffMM.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getEparameters <em>Eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters</em>'.
	 * @see refactoringDiffMM.EOperation#getEparameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EOperation#getName()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringDiffMM.EOperation#getEtype()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see refactoringDiffMM.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getEclassifiers <em>Eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclassifiers</em>'.
	 * @see refactoringDiffMM.EPackage#getEclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EPackage#getName()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see refactoringDiffMM.EPackage#getDomainspecificdiffs()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeclassifiers</em>'.
	 * @see refactoringDiffMM.EPackage#getDiffeclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffeclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see refactoringDiffMM.EPackage#getDiffdomainspecificdiffs()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see refactoringDiffMM.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EReference#getName()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EReference#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringDiffMM.EReference#getEtype()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see refactoringDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAttribute <em>Domain Specific Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EAttribute</em>'.
	 * @see refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAttribute()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClass <em>Domain Specific Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EClass</em>'.
	 * @see refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClass()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EOperation <em>Domain Specific Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EOperation</em>'.
	 * @see refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EOperation()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EReference <em>Domain Specific Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff EReference</em>'.
	 * @see refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EReference()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_EReference();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEAttribute <em>Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAttribute</em>'.
	 * @see refactoringDiffMM.DiffEAttribute
	 * @generated
	 */
	EClass getDiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getOperation()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_Operation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNew_name()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNew_etype <em>New etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNew_etype()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass <em>Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass</em>'.
	 * @see refactoringDiffMM.DiffEClass
	 * @generated
	 */
	EClass getDiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEClass#getOperation()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_Operation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_name()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_name();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_eattributes <em>Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eattributes</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes
	 * @generated
	 */
	EClass getDiffEClass_eattributes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getOperation()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_Operation();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_eattributes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getEType()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EReference getDiffEClass_eattributes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_eoperations <em>Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eoperations</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations
	 * @generated
	 */
	EClass getDiffEClass_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getOperation()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_Operation();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getEType()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EReference getDiffEClass_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_ereferences <em>Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass ereferences</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences
	 * @generated
	 */
	EClass getDiffEClass_ereferences();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getOperation()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_Operation();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_ereferences#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getEType()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EReference getDiffEClass_ereferences_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_esupertypes <em>Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass esupertypes</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes
	 * @generated
	 */
	EClass getDiffEClass_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getOperation()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_Operation();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getEType()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EReference getDiffEClass_esupertypes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEOperation <em>Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation</em>'.
	 * @see refactoringDiffMM.DiffEOperation
	 * @generated
	 */
	EClass getDiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getOperation()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_Operation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_eparameters <em>New eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New eparameters</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_eparameters()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_name()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_etype <em>New etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_etype()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage <em>Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage</em>'.
	 * @see refactoringDiffMM.DiffEPackage
	 * @generated
	 */
	EClass getDiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getOperation()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_Operation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getNew_name()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_name();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage_eclassifiers <em>Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eclassifiers</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers
	 * @generated
	 */
	EClass getDiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getOperation()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_Operation();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getEType()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EReference getDiffEPackage_eclassifiers_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage_domainspecificdiffs <em>Diff EPackage domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage domainspecificdiffs</em>'.
	 * @see refactoringDiffMM.DiffEPackage_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffEPackage_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_domainspecificdiffs#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEPackage_domainspecificdiffs#getOperation()
	 * @see #getDiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffEPackage_domainspecificdiffs_Operation();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEPackage_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEPackage_domainspecificdiffs#getEType()
	 * @see #getDiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffEPackage_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEReference <em>Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference</em>'.
	 * @see refactoringDiffMM.DiffEReference
	 * @generated
	 */
	EClass getDiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see refactoringDiffMM.DiffEReference#getOperation()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_Operation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNew_name()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNew_etype <em>New etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNew_etype()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_etype();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.ClassOp <em>Class Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Op</em>'.
	 * @see refactoringDiffMM.ClassOp
	 * @generated
	 */
	EEnum getClassOp();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.AscOp <em>Asc Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Op</em>'.
	 * @see refactoringDiffMM.AscOp
	 * @generated
	 */
	EEnum getAscOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringDiffMMFactory getRefactoringDiffMMFactory();

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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EAttributeImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__NAME = eINSTANCE.getEAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__ETYPE = eINSTANCE.getEAttribute_Etype();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EClassImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__NAME = eINSTANCE.getEClass_Name();

		/**
		 * The meta object literal for the '<em><b>Eattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EATTRIBUTES = eINSTANCE.getEClass_Eattributes();

		/**
		 * The meta object literal for the '<em><b>Eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EOPERATIONS = eINSTANCE.getEClass_Eoperations();

		/**
		 * The meta object literal for the '<em><b>Ereferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EREFERENCES = eINSTANCE.getEClass_Ereferences();

		/**
		 * The meta object literal for the '<em><b>Esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESUPERTYPES = eINSTANCE.getEClass_Esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diffeattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFEATTRIBUTES = eINSTANCE.getEClass_Diffeattributes();

		/**
		 * The meta object literal for the '<em><b>Diffeoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFEOPERATIONS = eINSTANCE.getEClass_Diffeoperations();

		/**
		 * The meta object literal for the '<em><b>Differeferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFEREFERENCES = eINSTANCE.getEClass_Differeferences();

		/**
		 * The meta object literal for the '<em><b>Diffesupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFESUPERTYPES = eINSTANCE.getEClass_Diffesupertypes();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EOperationImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEOperation()
		 * @generated
		 */
		EClass EOPERATION = eINSTANCE.getEOperation();

		/**
		 * The meta object literal for the '<em><b>Eparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__EPARAMETERS = eINSTANCE.getEOperation_Eparameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__NAME = eINSTANCE.getEOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__ETYPE = eINSTANCE.getEOperation_Etype();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EPackageImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEPackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEPackage();

		/**
		 * The meta object literal for the '<em><b>Eclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ECLASSIFIERS = eINSTANCE.getEPackage_Eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NAME = eINSTANCE.getEPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Domainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__DOMAINSPECIFICDIFFS = eINSTANCE.getEPackage_Domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Diffeclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__DIFFECLASSIFIERS = eINSTANCE.getEPackage_Diffeclassifiers();

		/**
		 * The meta object literal for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__DIFFDOMAINSPECIFICDIFFS = eINSTANCE.getEPackage_Diffdomainspecificdiffs();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EReferenceImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEReference()
		 * @generated
		 */
		EClass EREFERENCE = eINSTANCE.getEReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__NAME = eINSTANCE.getEReference_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__ETYPE = eINSTANCE.getEReference_Etype();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DomainSpecificDiffImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDomainSpecificDiff()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_DIFF = eINSTANCE.getDomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_DIFF__NAME = eINSTANCE.getDomainSpecificDiff_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff EAttribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff EClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_EClass();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff EOperation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_EOperation();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff EReference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_EReference();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEAttributeImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEAttribute()
		 * @generated
		 */
		EClass DIFF_EATTRIBUTE = eINSTANCE.getDiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__OPERATION = eINSTANCE.getDiffEAttribute_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_NAME = eINSTANCE.getDiffEAttribute_New_name();

		/**
		 * The meta object literal for the '<em><b>New etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_ETYPE = eINSTANCE.getDiffEAttribute_New_etype();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClassImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass()
		 * @generated
		 */
		EClass DIFF_ECLASS = eINSTANCE.getDiffEClass();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__OPERATION = eINSTANCE.getDiffEClass_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_NAME = eINSTANCE.getDiffEClass_New_name();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_eattributesImpl <em>Diff EClass eattributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_eattributesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eattributes()
		 * @generated
		 */
		EClass DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getDiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__OPERATION = eINSTANCE.getDiffEClass_eattributes_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EATTRIBUTES__ETYPE = eINSTANCE.getDiffEClass_eattributes_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_eoperationsImpl <em>Diff EClass eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_eoperationsImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eoperations()
		 * @generated
		 */
		EClass DIFF_ECLASS_EOPERATIONS = eINSTANCE.getDiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__OPERATION = eINSTANCE.getDiffEClass_eoperations_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EOPERATIONS__ETYPE = eINSTANCE.getDiffEClass_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_ereferencesImpl <em>Diff EClass ereferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_ereferencesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_ereferences()
		 * @generated
		 */
		EClass DIFF_ECLASS_EREFERENCES = eINSTANCE.getDiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__OPERATION = eINSTANCE.getDiffEClass_ereferences_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EREFERENCES__ETYPE = eINSTANCE.getDiffEClass_ereferences_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_esupertypesImpl <em>Diff EClass esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_esupertypesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_esupertypes()
		 * @generated
		 */
		EClass DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getDiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__OPERATION = eINSTANCE.getDiffEClass_esupertypes_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_ESUPERTYPES__ETYPE = eINSTANCE.getDiffEClass_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEOperationImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEOperation()
		 * @generated
		 */
		EClass DIFF_EOPERATION = eINSTANCE.getDiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__OPERATION = eINSTANCE.getDiffEOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>New eparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_EPARAMETERS = eINSTANCE.getDiffEOperation_New_eparameters();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_NAME = eINSTANCE.getDiffEOperation_New_name();

		/**
		 * The meta object literal for the '<em><b>New etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_ETYPE = eINSTANCE.getDiffEOperation_New_etype();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackageImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage()
		 * @generated
		 */
		EClass DIFF_EPACKAGE = eINSTANCE.getDiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__OPERATION = eINSTANCE.getDiffEPackage_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__NEW_NAME = eINSTANCE.getDiffEPackage_New_name();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl <em>Diff EPackage eclassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_eclassifiers()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getDiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__OPERATION = eINSTANCE.getDiffEPackage_eclassifiers_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = eINSTANCE.getDiffEPackage_eclassifiers_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackage_domainspecificdiffsImpl <em>Diff EPackage domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackage_domainspecificdiffsImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_domainspecificdiffs()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = eINSTANCE.getDiffEPackage_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION = eINSTANCE.getDiffEPackage_domainspecificdiffs_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE = eINSTANCE.getDiffEPackage_domainspecificdiffs_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEReferenceImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEReference()
		 * @generated
		 */
		EClass DIFF_EREFERENCE = eINSTANCE.getDiffEReference();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__OPERATION = eINSTANCE.getDiffEReference_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_NAME = eINSTANCE.getDiffEReference_New_name();

		/**
		 * The meta object literal for the '<em><b>New etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_ETYPE = eINSTANCE.getDiffEReference_New_etype();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.ClassOp <em>Class Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.ClassOp
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getClassOp()
		 * @generated
		 */
		EEnum CLASS_OP = eINSTANCE.getClassOp();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.AscOp <em>Asc Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.AscOp
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getAscOp()
		 * @generated
		 */
		EEnum ASC_OP = eINSTANCE.getAscOp();

	}

} //RefactoringDiffMMPackage
