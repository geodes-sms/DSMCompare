/**
 */
package arduinoDiffMM.provider;


import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Sensor;

import arduinoRuleMM.ArduinoRuleMMFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arduinoDiffMM.Sensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorItemProvider extends ModuleInstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
			addLeftPropertyDescriptor(object);
			addRightPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Value_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Value_value_feature", "_UI_Value_type"),
				 ArduinoDiffMMPackage.Literals.VALUE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MathOperator_left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MathOperator_left_feature", "_UI_MathOperator_type"),
				 ArduinoDiffMMPackage.Literals.MATH_OPERATOR__LEFT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MathOperator_right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MathOperator_right_feature", "_UI_MathOperator_type"),
				 ArduinoDiffMMPackage.Literals.MATH_OPERATOR__RIGHT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MathOperator_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MathOperator_operator_feature", "_UI_MathOperator_type"),
				 ArduinoDiffMMPackage.Literals.MATH_OPERATOR__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sensor_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sensor_status_feature", "_UI_Sensor_type"),
				 ArduinoDiffMMPackage.Literals.SENSOR__STATUS,
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
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.MATH_OPERATOR__DIFFLEFT);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.MATH_OPERATOR__DIFFRIGHT);
			childrenFeatures.add(ArduinoDiffMMPackage.Literals.SENSOR__DIFFSTATUS);
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
	 * This returns Sensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sensor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sensor)object).getValue();
		return label == null || label.length() == 0 ?
			getString("_UI_Sensor_type") :
			getString("_UI_Sensor_type") + " " + label;
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

		switch (notification.getFeatureID(Sensor.class)) {
			case ArduinoDiffMMPackage.SENSOR__VALUE:
			case ArduinoDiffMMPackage.SENSOR__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFLEFT:
			case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT:
			case ArduinoDiffMMPackage.SENSOR__DIFFSTATUS:
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
				(ArduinoDiffMMPackage.Literals.MATH_OPERATOR__DIFFLEFT,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffMathOperator_left()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.MATH_OPERATOR__DIFFLEFT,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffMathOperator_left()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.MATH_OPERATOR__DIFFRIGHT,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffMathOperator_right()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.MATH_OPERATOR__DIFFRIGHT,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffMathOperator_right()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.SENSOR__DIFFSTATUS,
				 ArduinoDiffMMFactory.eINSTANCE.createDiffSensor_status()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoDiffMMPackage.Literals.SENSOR__DIFFSTATUS,
				 ArduinoRuleMMFactory.eINSTANCE.createPattern_DiffSensor_status()));
	}

}
