/**
 */
package arduinoDiffMM.provider;


import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Project;

import arduinoRuleMM.ArduinoRuleMMFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arduinoDiffMM.Project} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectItemProvider 
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
	public ProjectItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__HARDWARE);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__SKETCH);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__MODULES);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__PLATFORM);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__DOMAINSPECIFICDIFFS);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__DIFFHARDWARE);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__DIFFSKETCH);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__DIFFMODULES);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__DIFFPLATFORM);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.PROJECT__DIFFDOMAINSPECIFICDIFFS);
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
	 * This returns Project.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Project"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Project_type");
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

		switch (notification.getFeatureID(Project.class)) {
			case ArduinoDiffMMPackage.PROJECT__HARDWARE:
			case ArduinoDiffMMPackage.PROJECT__SKETCH:
			case ArduinoDiffMMPackage.PROJECT__MODULES:
			case ArduinoDiffMMPackage.PROJECT__PLATFORM:
			case ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS:
			case ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE:
			case ArduinoDiffMMPackage.PROJECT__DIFFSKETCH:
			case ArduinoDiffMMPackage.PROJECT__DIFFMODULES:
			case ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM:
			case ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS:
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
				(ArduinoDiffMMPackage.Literals.PROJECT__HARDWARE,
				 ArduinoDiffMMFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__HARDWARE,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffHardware()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__HARDWARE,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Hardware()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__HARDWARE,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffHardware()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__SKETCH,
				 ArduinoDiffMMFactory.eINSTANCE.createSketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__SKETCH,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffSketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__SKETCH,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Sketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__SKETCH,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffSketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoDiffMMFactory.eINSTANCE.createInputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoDiffMMFactory.eINSTANCE.createOutputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffInputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffOutputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_InputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_OutputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffInputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__MODULES,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffOutputModule()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__PLATFORM,
				 ArduinoDiffMMFactory.eINSTANCE.createPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__PLATFORM,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__PLATFORM,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Platform()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__PLATFORM,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DOMAINSPECIFICDIFFS,
				 ArduinoDiffMMFactory.eINSTANCE.createDomainSpecificDiff()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DOMAINSPECIFICDIFFS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DomainSpecificDiff()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFHARDWARE,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffProject_hardware()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFHARDWARE,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffProject_hardware()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFSKETCH,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffProject_sketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFSKETCH,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffProject_sketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFMODULES,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffProject_modules()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFMODULES,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffProject_modules()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFPLATFORM,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffProject_platform()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFPLATFORM,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffProject_platform()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFDOMAINSPECIFICDIFFS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffProject_domainspecificdiffs()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.PROJECT__DIFFDOMAINSPECIFICDIFFS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffProject_domainspecificdiffs()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArduinoRuleMMEditPlugin.INSTANCE;
	}

}
