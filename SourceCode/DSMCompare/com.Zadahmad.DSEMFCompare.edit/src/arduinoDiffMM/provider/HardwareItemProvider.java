/**
 */
package arduinoDiffMM.provider;


import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Hardware;

import arduinoRuleMM.ArduinoRuleMMFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arduinoDiffMM.Hardware} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareItemProvider(AdapterFactory adapterFactory) {
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

			addPlatformsPropertyDescriptor(object);
			addModulesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Platforms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hardware_platforms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hardware_platforms_feature", "_UI_Hardware_type"),
				 ArduinoDiffMMPackage.Literals.HARDWARE__PLATFORMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hardware_modules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hardware_modules_feature", "_UI_Hardware_type"),
				 ArduinoDiffMMPackage.Literals.HARDWARE__MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.HARDWARE__CONNECTORS);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFPLATFORMS);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFMODULES);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFCONNECTORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Hardware.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hardware"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Hardware)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Hardware_type") :
			getString("_UI_Hardware_type") + " " + label;
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

		switch (notification.getFeatureID(Hardware.class)) {
			case ArduinoDiffMMPackage.HARDWARE__CONNECTORS:
			case ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS:
			case ArduinoDiffMMPackage.HARDWARE__DIFFMODULES:
			case ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__CONNECTORS,
				 ArduinoDiffMMFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__CONNECTORS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__CONNECTORS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Connector()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__CONNECTORS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFPLATFORMS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffHardware_platforms()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFPLATFORMS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffHardware_platforms()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFMODULES,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffHardware_modules()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFMODULES,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffHardware_modules()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFCONNECTORS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffHardware_connectors()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.HARDWARE__DIFFCONNECTORS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffHardware_connectors()));
	}

}
