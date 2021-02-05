/**
 */
package refactoring;

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
 * @see refactoring.RefactoringFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoring";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringPackage eINSTANCE = refactoring.impl.RefactoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoring.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring.impl.EAttributeImpl
	 * @see refactoring.impl.RefactoringPackageImpl#getEAttribute()
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
	 * The meta object id for the '{@link refactoring.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring.impl.EClassImpl
	 * @see refactoring.impl.RefactoringPackageImpl#getEClass()
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
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring.impl.EOperationImpl
	 * @see refactoring.impl.RefactoringPackageImpl#getEOperation()
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
	 * The meta object id for the '{@link refactoring.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring.impl.EPackageImpl
	 * @see refactoring.impl.RefactoringPackageImpl#getEPackage()
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
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring.impl.EReferenceImpl
	 * @see refactoring.impl.RefactoringPackageImpl#getEReference()
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
	 * Returns the meta object for class '{@link refactoring.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see refactoring.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring.EAttribute#getName()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EAttribute#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoring.EAttribute#getEtype()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Etype();

	/**
	 * Returns the meta object for class '{@link refactoring.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see refactoring.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring.EClass#getName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring.EClass#getEattributes <em>Eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eattributes</em>'.
	 * @see refactoring.EClass#getEattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring.EClass#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoring.EClass#getEoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring.EClass#getEreferences <em>Ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ereferences</em>'.
	 * @see refactoring.EClass#getEreferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoring.EClass#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoring.EClass#getEsupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Esupertypes();

	/**
	 * Returns the meta object for class '{@link refactoring.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see refactoring.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EOperation#getEparameters <em>Eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters</em>'.
	 * @see refactoring.EOperation#getEparameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring.EOperation#getName()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EOperation#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoring.EOperation#getEtype()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Etype();

	/**
	 * Returns the meta object for class '{@link refactoring.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see refactoring.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring.EPackage#getEclassifiers <em>Eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclassifiers</em>'.
	 * @see refactoring.EPackage#getEclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring.EPackage#getName()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_Name();

	/**
	 * Returns the meta object for class '{@link refactoring.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see refactoring.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring.EReference#getName()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring.EReference#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoring.EReference#getEtype()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Etype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringFactory getRefactoringFactory();

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
		 * The meta object literal for the '{@link refactoring.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring.impl.EAttributeImpl
		 * @see refactoring.impl.RefactoringPackageImpl#getEAttribute()
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
		 * The meta object literal for the '{@link refactoring.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring.impl.EClassImpl
		 * @see refactoring.impl.RefactoringPackageImpl#getEClass()
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
		 * The meta object literal for the '{@link refactoring.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring.impl.EOperationImpl
		 * @see refactoring.impl.RefactoringPackageImpl#getEOperation()
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
		 * The meta object literal for the '{@link refactoring.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring.impl.EPackageImpl
		 * @see refactoring.impl.RefactoringPackageImpl#getEPackage()
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
		 * The meta object literal for the '{@link refactoring.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring.impl.EReferenceImpl
		 * @see refactoring.impl.RefactoringPackageImpl#getEReference()
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

	}

} //RefactoringPackage
