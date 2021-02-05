/**
 */
package arduinoDiffMM.provider;


import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DomainSpecificDiff;

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

/**
 * This is the item provider adapter for a {@link arduinoDiffMM.DomainSpecificDiff} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainSpecificDiffItemProvider 
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
	public DomainSpecificDiffItemProvider(AdapterFactory adapterFactory) {
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
			addDomainSpecificDiff_HardwarePropertyDescriptor(object);
			addDomainSpecificDiff_PlatformPropertyDescriptor(object);
			addDomainSpecificDiff_ModulePropertyDescriptor(object);
			addDomainSpecificDiff_DigitalPinPropertyDescriptor(object);
			addDomainSpecificDiff_PinPropertyDescriptor(object);
			addDomainSpecificDiff_AnalogPinPropertyDescriptor(object);
			addDomainSpecificDiff_SketchPropertyDescriptor(object);
			addDomainSpecificDiff_InstructionPropertyDescriptor(object);
			addDomainSpecificDiff_StatusPropertyDescriptor(object);
			addDomainSpecificDiff_LevelPropertyDescriptor(object);
			addDomainSpecificDiff_ModuleInstructionPropertyDescriptor(object);
			addDomainSpecificDiff_ControlPropertyDescriptor(object);
			addDomainSpecificDiff_UtilitiesPropertyDescriptor(object);
			addDomainSpecificDiff_IOPropertyDescriptor(object);
			addDomainSpecificDiff_DelayPropertyDescriptor(object);
			addDomainSpecificDiff_InputModulePropertyDescriptor(object);
			addDomainSpecificDiff_OutputModulePropertyDescriptor(object);
			addDomainSpecificDiff_NamedElementPropertyDescriptor(object);
			addDomainSpecificDiff_ConnectorPropertyDescriptor(object);
			addDomainSpecificDiff_RepeatPropertyDescriptor(object);
			addDomainSpecificDiff_SensorPropertyDescriptor(object);
			addDomainSpecificDiff_WhilePropertyDescriptor(object);
			addDomainSpecificDiff_MathOperatorPropertyDescriptor(object);
			addDomainSpecificDiff_VariablePropertyDescriptor(object);
			addDomainSpecificDiff_SetPropertyDescriptor(object);
			addDomainSpecificDiff_NumericalOperatorPropertyDescriptor(object);
			addDomainSpecificDiff_BooleanOperatorPropertyDescriptor(object);
			addDomainSpecificDiff_ValuePropertyDescriptor(object);
			addDomainSpecificDiff_ConstantPropertyDescriptor(object);
			addDomainSpecificDiff_IfPropertyDescriptor(object);
			addDomainSpecificDiff_FunctionPropertyDescriptor(object);
			addDomainSpecificDiff_ParameterDefinitionPropertyDescriptor(object);
			addDomainSpecificDiff_ParameterPropertyDescriptor(object);
			addDomainSpecificDiff_FunctionCallPropertyDescriptor(object);
			addDomainSpecificDiff_ParameterCallPropertyDescriptor(object);
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
				 getString("_UI_DomainSpecificDiff_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_name_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Hardware feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_HardwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Hardware_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Hardware_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Platform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_PlatformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Platform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Platform_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Module_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Module_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Digital Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_DigitalPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_DigitalPin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_DigitalPin_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_PinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Pin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Pin_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Analog Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_AnalogPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_AnalogPin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_AnalogPin_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Sketch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_SketchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Sketch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Sketch_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Instruction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_InstructionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Instruction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Instruction_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_StatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Status_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_LevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Level_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Module Instruction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ModuleInstructionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_ModuleInstruction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_ModuleInstruction_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Control_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Control_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Utilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_UtilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Utilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Utilities_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff IO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_IOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_IO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_IO_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_DelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Delay_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Input Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_InputModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_InputModule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_InputModule_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Output Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_OutputModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_OutputModule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_OutputModule_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Named Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_NamedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_NamedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_NamedElement_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Connector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Connector_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Repeat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_RepeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Repeat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Repeat_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_SensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Sensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Sensor_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff While feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_WhilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_While_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_While_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Math Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_MathOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_MathOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_MathOperator_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_VariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Variable_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_SetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Set_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Set_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Numerical Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_NumericalOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_NumericalOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_NumericalOperator_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Boolean Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_BooleanOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_BooleanOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_BooleanOperator_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Value_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Constant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Constant_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff If feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_IfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_If_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_If_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_FunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Function_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Parameter Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ParameterDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_ParameterDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_ParameterDefinition_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Parameter_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Function Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_FunctionCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_FunctionCall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_FunctionCall_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Parameter Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ParameterCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_ParameterCall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_ParameterCall_feature", "_UI_DomainSpecificDiff_type"),
				 ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DomainSpecificDiff.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DomainSpecificDiff"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DomainSpecificDiff)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DomainSpecificDiff_type") :
			getString("_UI_DomainSpecificDiff_type") + " " + label;
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

		switch (notification.getFeatureID(DomainSpecificDiff.class)) {
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
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
		return ArduinoRuleMMEditPlugin.INSTANCE;
	}

}
