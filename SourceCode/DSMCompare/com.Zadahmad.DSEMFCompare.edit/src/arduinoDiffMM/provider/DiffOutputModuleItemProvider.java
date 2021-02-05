/**
 */
package arduinoDiffMM.provider;


import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffOutputModule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arduinoDiffMM.DiffOutputModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffOutputModuleItemProvider extends OutputModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffOutputModuleItemProvider(AdapterFactory adapterFactory) {
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

			addOperationPropertyDescriptor(object);
			addNew_namePropertyDescriptor(object);
			addNew_kindPropertyDescriptor(object);
			addNew_imagePropertyDescriptor(object);
			addNew_levelPropertyDescriptor(object);
			addNew_libraryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffOutputModule_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffOutputModule_operation_feature", "_UI_DiffOutputModule_type"),
				 ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE__OPERATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffOutputModule_new_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffOutputModule_new_name_feature", "_UI_DiffOutputModule_type"),
				 ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE__NEW_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_kindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffOutputModule_new_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffOutputModule_new_kind_feature", "_UI_DiffOutputModule_type"),
				 ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE__NEW_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_imagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffOutputModule_new_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffOutputModule_new_image_feature", "_UI_DiffOutputModule_type"),
				 ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE__NEW_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffOutputModule_new_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffOutputModule_new_level_feature", "_UI_DiffOutputModule_type"),
				 ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE__NEW_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New library feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_libraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffOutputModule_new_library_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffOutputModule_new_library_feature", "_UI_DiffOutputModule_type"),
				 ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE__NEW_LIBRARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiffOutputModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffOutputModule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffOutputModule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffOutputModule_type") :
			getString("_UI_DiffOutputModule_type") + " " + label;
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

		switch (notification.getFeatureID(DiffOutputModule.class)) {
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION:
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME:
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND:
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE:
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL:
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY:
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

}
