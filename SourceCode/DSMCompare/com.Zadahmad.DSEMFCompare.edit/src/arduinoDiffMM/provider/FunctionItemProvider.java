/**
 */
package arduinoDiffMM.provider;


import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Function;

import arduinoRuleMM.ArduinoRuleMMFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

/**
 * This is the item provider adapter for a {@link arduinoDiffMM.Function} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemProvider 
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
	public FunctionItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Function_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_name_feature", "_UI_Function_type"),
				 ArduinoDiffMMPackage.Literals.FUNCTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.FUNCTION__PARAM_DEFS);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.FUNCTION__DIFFPARAM_DEFS);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.FUNCTION__DIFFINSTRUCTIONS);
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
	 * This returns Function.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Function"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Function)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Function_type") :
			getString("_UI_Function_type") + " " + label;
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

		switch (notification.getFeatureID(Function.class)) {
			case ArduinoDiffMMPackage.FUNCTION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS:
			case ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS:
			case ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS:
			case ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS:
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
				(ArduinoDiffMMPackage.Literals.FUNCTION__PARAM_DEFS,
				 ArduinoDiffMMFactory.eINSTANCE.createParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__PARAM_DEFS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__PARAM_DEFS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_ParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__PARAM_DEFS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createSketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createStatus()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createSet()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createNumericalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffSketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffStatus()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffDelay()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffSet()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffNumericalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffIf()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Sketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Status()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Level()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Delay()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Repeat()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Sensor()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_While()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Variable()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Set()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_NumericalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_BooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_Constant()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_If()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_FunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_ParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffSketch()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffStatus()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffDelay()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffSet()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffNumericalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffIf()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__INSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__DIFFPARAM_DEFS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffFunction_paramDefs()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__DIFFPARAM_DEFS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffFunction_paramDefs()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__DIFFINSTRUCTIONS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffFunction_instructions()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.FUNCTION__DIFFINSTRUCTIONS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffFunction_instructions()));
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
