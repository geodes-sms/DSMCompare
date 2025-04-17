/**
 */
package refactoringDiffMM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringDiffMM.SemanticObject;

/**
 * This is the item provider adapter for a {@link refactoringDiffMM.SemanticObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticObjectItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSemanticObject_DiffEAttributePropertyDescriptor(object);
			addSemanticObject_DiffEClassPropertyDescriptor(object);
			addSemanticObject_DiffEClass_eattributesPropertyDescriptor(object);
			addSemanticObject_DiffEClass_eoperationsPropertyDescriptor(object);
			addSemanticObject_DiffEClass_ereferencesPropertyDescriptor(object);
			addSemanticObject_DiffEClass_esupertypesPropertyDescriptor(object);
			addSemanticObject_DiffEClass_interfacesPropertyDescriptor(object);
			addSemanticObject_DiffEClass_nested_classesPropertyDescriptor(object);
			addSemanticObject_DiffEClass_nested_interfacesPropertyDescriptor(object);
			addSemanticObject_DiffEOperationPropertyDescriptor(object);
			addSemanticObject_DiffEPackagePropertyDescriptor(object);
			addSemanticObject_DiffEPackage_eclassifiersPropertyDescriptor(object);
			addSemanticObject_DiffEPackage_interfacesPropertyDescriptor(object);
			addSemanticObject_DiffEPackage_testPropertyDescriptor(object);
			addSemanticObject_DiffEReferencePropertyDescriptor(object);
			addSemanticObject_DiffInterfacePropertyDescriptor(object);
			addSemanticObject_DiffInterface_eoperationsPropertyDescriptor(object);
			addSemanticObject_DiffInterface_esupertypesPropertyDescriptor(object);
			addSemanticObject_DifftestAssociationsPropertyDescriptor(object);
			addSemanticObject_DifftestAssociations_multiPropertyDescriptor(object);
			addSemanticObject_DifftestAssociations_singlePropertyDescriptor(object);
			addSemanticObject_EAttributePropertyDescriptor(object);
			addSemanticObject_EClassPropertyDescriptor(object);
			addSemanticObject_EOperationPropertyDescriptor(object);
			addSemanticObject_EPackagePropertyDescriptor(object);
			addSemanticObject_EReferencePropertyDescriptor(object);
			addSemanticObject_InterfacePropertyDescriptor(object);
			addSemanticObject_testAssociationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_name_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EAttribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEAttribute_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass eattributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_eattributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_eattributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_eattributes_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass eoperations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_eoperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_eoperations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_eoperations_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass ereferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_ereferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_ereferences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_ereferences_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass esupertypes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_esupertypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_esupertypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_esupertypes_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_interfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_interfaces_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass nested classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_nested_classesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_nested_classes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_nested_classes_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EClass nested interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEClass_nested_interfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEClass_nested_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEClass_nested_interfaces_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EOperation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEOperation_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EPackage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEPackage_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EPackage eclassifiers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEPackage_eclassifiersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEPackage_eclassifiers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEPackage_eclassifiers_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EPackage interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEPackage_interfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEPackage_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEPackage_interfaces_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EPackage test feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEPackage_testPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEPackage_test_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEPackage_test_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff EReference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEReference_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffInterface_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Interface eoperations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffInterface_eoperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffInterface_eoperations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffInterface_eoperations_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Interface esupertypes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffInterface_esupertypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffInterface_esupertypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffInterface_esupertypes_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Difftest Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DifftestAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DifftestAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DifftestAssociations_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Difftest Associations multi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DifftestAssociations_multiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DifftestAssociations_multi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DifftestAssociations_multi_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Difftest Associations single feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DifftestAssociations_singlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DifftestAssociations_single_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DifftestAssociations_single_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object EAttribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_EAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_EAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_EAttribute_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_EClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_EClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_EClass_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object EOperation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_EOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_EOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_EOperation_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object EPackage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_EPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_EPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_EPackage_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object EReference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_EReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_EReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_EReference_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_InterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_Interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_Interface_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object test Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_testAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_testAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_testAssociations_feature", "_UI_SemanticObject_type"),
				 RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SemanticObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SemanticObject_type") :
			getString("_UI_SemanticObject_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SemanticObject.class)) {
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RefactoringDiffMMEditPlugin.INSTANCE;
	}

}
