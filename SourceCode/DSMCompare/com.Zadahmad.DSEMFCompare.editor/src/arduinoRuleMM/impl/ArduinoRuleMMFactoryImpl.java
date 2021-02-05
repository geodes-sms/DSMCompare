/**
 */
package arduinoRuleMM.impl;

import arduinoRuleMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoRuleMMFactoryImpl extends EFactoryImpl implements ArduinoRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoRuleMMFactory init() {
		try {
			ArduinoRuleMMFactory theArduinoRuleMMFactory = (ArduinoRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoRuleMMPackage.eNS_URI);
			if (theArduinoRuleMMFactory != null) {
				return theArduinoRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoRuleMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArduinoRuleMMPackage.PATTERN_HARDWARE: return createPattern_Hardware();
			case ArduinoRuleMMPackage.PATTERN_PLATFORM: return createPattern_Platform();
			case ArduinoRuleMMPackage.PATTERN_DIGITAL_PIN: return createPattern_DigitalPin();
			case ArduinoRuleMMPackage.PATTERN_ANALOG_PIN: return createPattern_AnalogPin();
			case ArduinoRuleMMPackage.PATTERN_SKETCH: return createPattern_Sketch();
			case ArduinoRuleMMPackage.PATTERN_PROJECT: return createPattern_Project();
			case ArduinoRuleMMPackage.PATTERN_STATUS: return createPattern_Status();
			case ArduinoRuleMMPackage.PATTERN_LEVEL: return createPattern_Level();
			case ArduinoRuleMMPackage.PATTERN_DELAY: return createPattern_Delay();
			case ArduinoRuleMMPackage.PATTERN_INPUT_MODULE: return createPattern_InputModule();
			case ArduinoRuleMMPackage.PATTERN_OUTPUT_MODULE: return createPattern_OutputModule();
			case ArduinoRuleMMPackage.PATTERN_CONNECTOR: return createPattern_Connector();
			case ArduinoRuleMMPackage.PATTERN_REPEAT: return createPattern_Repeat();
			case ArduinoRuleMMPackage.PATTERN_SENSOR: return createPattern_Sensor();
			case ArduinoRuleMMPackage.PATTERN_WHILE: return createPattern_While();
			case ArduinoRuleMMPackage.PATTERN_VARIABLE: return createPattern_Variable();
			case ArduinoRuleMMPackage.PATTERN_SET: return createPattern_Set();
			case ArduinoRuleMMPackage.PATTERN_NUMERICAL_OPERATOR: return createPattern_NumericalOperator();
			case ArduinoRuleMMPackage.PATTERN_BOOLEAN_OPERATOR: return createPattern_BooleanOperator();
			case ArduinoRuleMMPackage.PATTERN_CONSTANT: return createPattern_Constant();
			case ArduinoRuleMMPackage.PATTERN_IF: return createPattern_If();
			case ArduinoRuleMMPackage.PATTERN_FUNCTION: return createPattern_Function();
			case ArduinoRuleMMPackage.PATTERN_PARAMETER_DEFINITION: return createPattern_ParameterDefinition();
			case ArduinoRuleMMPackage.PATTERN_FUNCTION_CALL: return createPattern_FunctionCall();
			case ArduinoRuleMMPackage.PATTERN_PARAMETER_CALL: return createPattern_ParameterCall();
			case ArduinoRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: return createPattern_DomainSpecificDiff();
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE: return createPattern_DiffHardware();
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE_PLATFORMS: return createPattern_DiffHardware_platforms();
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE_MODULES: return createPattern_DiffHardware_modules();
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE_CONNECTORS: return createPattern_DiffHardware_connectors();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PLATFORM: return createPattern_DiffPlatform();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PLATFORM_DIGITAL_PINS: return createPattern_DiffPlatform_digitalPins();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PLATFORM_ANALOG_PINS: return createPattern_DiffPlatform_analogPins();
			case ArduinoRuleMMPackage.PATTERN_DIFF_DIGITAL_PIN: return createPattern_DiffDigitalPin();
			case ArduinoRuleMMPackage.PATTERN_DIFF_ANALOG_PIN: return createPattern_DiffAnalogPin();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH: return createPattern_DiffSketch();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH_HARDWARE: return createPattern_DiffSketch_hardware();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH_INSTRUCTIONS: return createPattern_DiffSketch_instructions();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH_FUNCTIONS: return createPattern_DiffSketch_functions();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT: return createPattern_DiffProject();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_HARDWARE: return createPattern_DiffProject_hardware();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_SKETCH: return createPattern_DiffProject_sketch();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_MODULES: return createPattern_DiffProject_modules();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_PLATFORM: return createPattern_DiffProject_platform();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS: return createPattern_DiffProject_domainspecificdiffs();
			case ArduinoRuleMMPackage.PATTERN_DIFF_INSTRUCTION_PREVIOUS: return createPattern_DiffInstruction_previous();
			case ArduinoRuleMMPackage.PATTERN_DIFF_INSTRUCTION_NEXT: return createPattern_DiffInstruction_next();
			case ArduinoRuleMMPackage.PATTERN_DIFF_STATUS: return createPattern_DiffStatus();
			case ArduinoRuleMMPackage.PATTERN_DIFF_STATUS_SENSOR: return createPattern_DiffStatus_sensor();
			case ArduinoRuleMMPackage.PATTERN_DIFF_LEVEL: return createPattern_DiffLevel();
			case ArduinoRuleMMPackage.PATTERN_DIFF_LEVEL_LEVEL: return createPattern_DiffLevel_level();
			case ArduinoRuleMMPackage.PATTERN_DIFF_MODULE_INSTRUCTION_MODULE: return createPattern_DiffModuleInstruction_module();
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONTROL_INSTRUCTIONS: return createPattern_DiffControl_instructions();
			case ArduinoRuleMMPackage.PATTERN_DIFF_DELAY: return createPattern_DiffDelay();
			case ArduinoRuleMMPackage.PATTERN_DIFF_INPUT_MODULE: return createPattern_DiffInputModule();
			case ArduinoRuleMMPackage.PATTERN_DIFF_OUTPUT_MODULE: return createPattern_DiffOutputModule();
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONNECTOR: return createPattern_DiffConnector();
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONNECTOR_PIN: return createPattern_DiffConnector_pin();
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONNECTOR_MODULE: return createPattern_DiffConnector_module();
			case ArduinoRuleMMPackage.PATTERN_DIFF_REPEAT: return createPattern_DiffRepeat();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SENSOR: return createPattern_DiffSensor();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SENSOR_STATUS: return createPattern_DiffSensor_status();
			case ArduinoRuleMMPackage.PATTERN_DIFF_WHILE: return createPattern_DiffWhile();
			case ArduinoRuleMMPackage.PATTERN_DIFF_WHILE_CONDITION: return createPattern_DiffWhile_condition();
			case ArduinoRuleMMPackage.PATTERN_DIFF_MATH_OPERATOR_LEFT: return createPattern_DiffMathOperator_left();
			case ArduinoRuleMMPackage.PATTERN_DIFF_MATH_OPERATOR_RIGHT: return createPattern_DiffMathOperator_right();
			case ArduinoRuleMMPackage.PATTERN_DIFF_VARIABLE: return createPattern_DiffVariable();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SET: return createPattern_DiffSet();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SET_VARIABLE: return createPattern_DiffSet_variable();
			case ArduinoRuleMMPackage.PATTERN_DIFF_SET_VALUE: return createPattern_DiffSet_value();
			case ArduinoRuleMMPackage.PATTERN_DIFF_NUMERICAL_OPERATOR: return createPattern_DiffNumericalOperator();
			case ArduinoRuleMMPackage.PATTERN_DIFF_BOOLEAN_OPERATOR: return createPattern_DiffBooleanOperator();
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONSTANT: return createPattern_DiffConstant();
			case ArduinoRuleMMPackage.PATTERN_DIFF_IF: return createPattern_DiffIf();
			case ArduinoRuleMMPackage.PATTERN_DIFF_IF_CONDITION: return createPattern_DiffIf_condition();
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION: return createPattern_DiffFunction();
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_PARAM_DEFS: return createPattern_DiffFunction_paramDefs();
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_INSTRUCTIONS: return createPattern_DiffFunction_instructions();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION: return createPattern_DiffParameterDefinition();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_TO_DEFINITION: return createPattern_DiffParameter_to_definition();
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_CALL: return createPattern_DiffFunctionCall();
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_CALL_DEFINITION: return createPattern_DiffFunctionCall_definition();
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_CALL_PARAMETERS: return createPattern_DiffFunctionCall_parameters();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_CALL: return createPattern_DiffParameterCall();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_CALL_DEFINITION: return createPattern_DiffParameterCall_definition();
			case ArduinoRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Hardware createPattern_Hardware() {
		Pattern_HardwareImpl pattern_Hardware = new Pattern_HardwareImpl();
		return pattern_Hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Platform createPattern_Platform() {
		Pattern_PlatformImpl pattern_Platform = new Pattern_PlatformImpl();
		return pattern_Platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DigitalPin createPattern_DigitalPin() {
		Pattern_DigitalPinImpl pattern_DigitalPin = new Pattern_DigitalPinImpl();
		return pattern_DigitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_AnalogPin createPattern_AnalogPin() {
		Pattern_AnalogPinImpl pattern_AnalogPin = new Pattern_AnalogPinImpl();
		return pattern_AnalogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Sketch createPattern_Sketch() {
		Pattern_SketchImpl pattern_Sketch = new Pattern_SketchImpl();
		return pattern_Sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Project createPattern_Project() {
		Pattern_ProjectImpl pattern_Project = new Pattern_ProjectImpl();
		return pattern_Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Status createPattern_Status() {
		Pattern_StatusImpl pattern_Status = new Pattern_StatusImpl();
		return pattern_Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Level createPattern_Level() {
		Pattern_LevelImpl pattern_Level = new Pattern_LevelImpl();
		return pattern_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Delay createPattern_Delay() {
		Pattern_DelayImpl pattern_Delay = new Pattern_DelayImpl();
		return pattern_Delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_InputModule createPattern_InputModule() {
		Pattern_InputModuleImpl pattern_InputModule = new Pattern_InputModuleImpl();
		return pattern_InputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_OutputModule createPattern_OutputModule() {
		Pattern_OutputModuleImpl pattern_OutputModule = new Pattern_OutputModuleImpl();
		return pattern_OutputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Connector createPattern_Connector() {
		Pattern_ConnectorImpl pattern_Connector = new Pattern_ConnectorImpl();
		return pattern_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Repeat createPattern_Repeat() {
		Pattern_RepeatImpl pattern_Repeat = new Pattern_RepeatImpl();
		return pattern_Repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Sensor createPattern_Sensor() {
		Pattern_SensorImpl pattern_Sensor = new Pattern_SensorImpl();
		return pattern_Sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_While createPattern_While() {
		Pattern_WhileImpl pattern_While = new Pattern_WhileImpl();
		return pattern_While;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Variable createPattern_Variable() {
		Pattern_VariableImpl pattern_Variable = new Pattern_VariableImpl();
		return pattern_Variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Set createPattern_Set() {
		Pattern_SetImpl pattern_Set = new Pattern_SetImpl();
		return pattern_Set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_NumericalOperator createPattern_NumericalOperator() {
		Pattern_NumericalOperatorImpl pattern_NumericalOperator = new Pattern_NumericalOperatorImpl();
		return pattern_NumericalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_BooleanOperator createPattern_BooleanOperator() {
		Pattern_BooleanOperatorImpl pattern_BooleanOperator = new Pattern_BooleanOperatorImpl();
		return pattern_BooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Constant createPattern_Constant() {
		Pattern_ConstantImpl pattern_Constant = new Pattern_ConstantImpl();
		return pattern_Constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_If createPattern_If() {
		Pattern_IfImpl pattern_If = new Pattern_IfImpl();
		return pattern_If;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Function createPattern_Function() {
		Pattern_FunctionImpl pattern_Function = new Pattern_FunctionImpl();
		return pattern_Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_ParameterDefinition createPattern_ParameterDefinition() {
		Pattern_ParameterDefinitionImpl pattern_ParameterDefinition = new Pattern_ParameterDefinitionImpl();
		return pattern_ParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_FunctionCall createPattern_FunctionCall() {
		Pattern_FunctionCallImpl pattern_FunctionCall = new Pattern_FunctionCallImpl();
		return pattern_FunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_ParameterCall createPattern_ParameterCall() {
		Pattern_ParameterCallImpl pattern_ParameterCall = new Pattern_ParameterCallImpl();
		return pattern_ParameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff() {
		Pattern_DomainSpecificDiffImpl pattern_DomainSpecificDiff = new Pattern_DomainSpecificDiffImpl();
		return pattern_DomainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffHardware createPattern_DiffHardware() {
		Pattern_DiffHardwareImpl pattern_DiffHardware = new Pattern_DiffHardwareImpl();
		return pattern_DiffHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffHardware_platforms createPattern_DiffHardware_platforms() {
		Pattern_DiffHardware_platformsImpl pattern_DiffHardware_platforms = new Pattern_DiffHardware_platformsImpl();
		return pattern_DiffHardware_platforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffHardware_modules createPattern_DiffHardware_modules() {
		Pattern_DiffHardware_modulesImpl pattern_DiffHardware_modules = new Pattern_DiffHardware_modulesImpl();
		return pattern_DiffHardware_modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffHardware_connectors createPattern_DiffHardware_connectors() {
		Pattern_DiffHardware_connectorsImpl pattern_DiffHardware_connectors = new Pattern_DiffHardware_connectorsImpl();
		return pattern_DiffHardware_connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffPlatform createPattern_DiffPlatform() {
		Pattern_DiffPlatformImpl pattern_DiffPlatform = new Pattern_DiffPlatformImpl();
		return pattern_DiffPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffPlatform_digitalPins createPattern_DiffPlatform_digitalPins() {
		Pattern_DiffPlatform_digitalPinsImpl pattern_DiffPlatform_digitalPins = new Pattern_DiffPlatform_digitalPinsImpl();
		return pattern_DiffPlatform_digitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffPlatform_analogPins createPattern_DiffPlatform_analogPins() {
		Pattern_DiffPlatform_analogPinsImpl pattern_DiffPlatform_analogPins = new Pattern_DiffPlatform_analogPinsImpl();
		return pattern_DiffPlatform_analogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffDigitalPin createPattern_DiffDigitalPin() {
		Pattern_DiffDigitalPinImpl pattern_DiffDigitalPin = new Pattern_DiffDigitalPinImpl();
		return pattern_DiffDigitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffAnalogPin createPattern_DiffAnalogPin() {
		Pattern_DiffAnalogPinImpl pattern_DiffAnalogPin = new Pattern_DiffAnalogPinImpl();
		return pattern_DiffAnalogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSketch createPattern_DiffSketch() {
		Pattern_DiffSketchImpl pattern_DiffSketch = new Pattern_DiffSketchImpl();
		return pattern_DiffSketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSketch_hardware createPattern_DiffSketch_hardware() {
		Pattern_DiffSketch_hardwareImpl pattern_DiffSketch_hardware = new Pattern_DiffSketch_hardwareImpl();
		return pattern_DiffSketch_hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSketch_instructions createPattern_DiffSketch_instructions() {
		Pattern_DiffSketch_instructionsImpl pattern_DiffSketch_instructions = new Pattern_DiffSketch_instructionsImpl();
		return pattern_DiffSketch_instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSketch_functions createPattern_DiffSketch_functions() {
		Pattern_DiffSketch_functionsImpl pattern_DiffSketch_functions = new Pattern_DiffSketch_functionsImpl();
		return pattern_DiffSketch_functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffProject createPattern_DiffProject() {
		Pattern_DiffProjectImpl pattern_DiffProject = new Pattern_DiffProjectImpl();
		return pattern_DiffProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffProject_hardware createPattern_DiffProject_hardware() {
		Pattern_DiffProject_hardwareImpl pattern_DiffProject_hardware = new Pattern_DiffProject_hardwareImpl();
		return pattern_DiffProject_hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffProject_sketch createPattern_DiffProject_sketch() {
		Pattern_DiffProject_sketchImpl pattern_DiffProject_sketch = new Pattern_DiffProject_sketchImpl();
		return pattern_DiffProject_sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffProject_modules createPattern_DiffProject_modules() {
		Pattern_DiffProject_modulesImpl pattern_DiffProject_modules = new Pattern_DiffProject_modulesImpl();
		return pattern_DiffProject_modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffProject_platform createPattern_DiffProject_platform() {
		Pattern_DiffProject_platformImpl pattern_DiffProject_platform = new Pattern_DiffProject_platformImpl();
		return pattern_DiffProject_platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffProject_domainspecificdiffs createPattern_DiffProject_domainspecificdiffs() {
		Pattern_DiffProject_domainspecificdiffsImpl pattern_DiffProject_domainspecificdiffs = new Pattern_DiffProject_domainspecificdiffsImpl();
		return pattern_DiffProject_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffInstruction_previous createPattern_DiffInstruction_previous() {
		Pattern_DiffInstruction_previousImpl pattern_DiffInstruction_previous = new Pattern_DiffInstruction_previousImpl();
		return pattern_DiffInstruction_previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffInstruction_next createPattern_DiffInstruction_next() {
		Pattern_DiffInstruction_nextImpl pattern_DiffInstruction_next = new Pattern_DiffInstruction_nextImpl();
		return pattern_DiffInstruction_next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffStatus createPattern_DiffStatus() {
		Pattern_DiffStatusImpl pattern_DiffStatus = new Pattern_DiffStatusImpl();
		return pattern_DiffStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffStatus_sensor createPattern_DiffStatus_sensor() {
		Pattern_DiffStatus_sensorImpl pattern_DiffStatus_sensor = new Pattern_DiffStatus_sensorImpl();
		return pattern_DiffStatus_sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffLevel createPattern_DiffLevel() {
		Pattern_DiffLevelImpl pattern_DiffLevel = new Pattern_DiffLevelImpl();
		return pattern_DiffLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffLevel_level createPattern_DiffLevel_level() {
		Pattern_DiffLevel_levelImpl pattern_DiffLevel_level = new Pattern_DiffLevel_levelImpl();
		return pattern_DiffLevel_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffModuleInstruction_module createPattern_DiffModuleInstruction_module() {
		Pattern_DiffModuleInstruction_moduleImpl pattern_DiffModuleInstruction_module = new Pattern_DiffModuleInstruction_moduleImpl();
		return pattern_DiffModuleInstruction_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffControl_instructions createPattern_DiffControl_instructions() {
		Pattern_DiffControl_instructionsImpl pattern_DiffControl_instructions = new Pattern_DiffControl_instructionsImpl();
		return pattern_DiffControl_instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffDelay createPattern_DiffDelay() {
		Pattern_DiffDelayImpl pattern_DiffDelay = new Pattern_DiffDelayImpl();
		return pattern_DiffDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffInputModule createPattern_DiffInputModule() {
		Pattern_DiffInputModuleImpl pattern_DiffInputModule = new Pattern_DiffInputModuleImpl();
		return pattern_DiffInputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffOutputModule createPattern_DiffOutputModule() {
		Pattern_DiffOutputModuleImpl pattern_DiffOutputModule = new Pattern_DiffOutputModuleImpl();
		return pattern_DiffOutputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffConnector createPattern_DiffConnector() {
		Pattern_DiffConnectorImpl pattern_DiffConnector = new Pattern_DiffConnectorImpl();
		return pattern_DiffConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffConnector_pin createPattern_DiffConnector_pin() {
		Pattern_DiffConnector_pinImpl pattern_DiffConnector_pin = new Pattern_DiffConnector_pinImpl();
		return pattern_DiffConnector_pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffConnector_module createPattern_DiffConnector_module() {
		Pattern_DiffConnector_moduleImpl pattern_DiffConnector_module = new Pattern_DiffConnector_moduleImpl();
		return pattern_DiffConnector_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffRepeat createPattern_DiffRepeat() {
		Pattern_DiffRepeatImpl pattern_DiffRepeat = new Pattern_DiffRepeatImpl();
		return pattern_DiffRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSensor createPattern_DiffSensor() {
		Pattern_DiffSensorImpl pattern_DiffSensor = new Pattern_DiffSensorImpl();
		return pattern_DiffSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSensor_status createPattern_DiffSensor_status() {
		Pattern_DiffSensor_statusImpl pattern_DiffSensor_status = new Pattern_DiffSensor_statusImpl();
		return pattern_DiffSensor_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffWhile createPattern_DiffWhile() {
		Pattern_DiffWhileImpl pattern_DiffWhile = new Pattern_DiffWhileImpl();
		return pattern_DiffWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffWhile_condition createPattern_DiffWhile_condition() {
		Pattern_DiffWhile_conditionImpl pattern_DiffWhile_condition = new Pattern_DiffWhile_conditionImpl();
		return pattern_DiffWhile_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffMathOperator_left createPattern_DiffMathOperator_left() {
		Pattern_DiffMathOperator_leftImpl pattern_DiffMathOperator_left = new Pattern_DiffMathOperator_leftImpl();
		return pattern_DiffMathOperator_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffMathOperator_right createPattern_DiffMathOperator_right() {
		Pattern_DiffMathOperator_rightImpl pattern_DiffMathOperator_right = new Pattern_DiffMathOperator_rightImpl();
		return pattern_DiffMathOperator_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffVariable createPattern_DiffVariable() {
		Pattern_DiffVariableImpl pattern_DiffVariable = new Pattern_DiffVariableImpl();
		return pattern_DiffVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSet createPattern_DiffSet() {
		Pattern_DiffSetImpl pattern_DiffSet = new Pattern_DiffSetImpl();
		return pattern_DiffSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSet_variable createPattern_DiffSet_variable() {
		Pattern_DiffSet_variableImpl pattern_DiffSet_variable = new Pattern_DiffSet_variableImpl();
		return pattern_DiffSet_variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffSet_value createPattern_DiffSet_value() {
		Pattern_DiffSet_valueImpl pattern_DiffSet_value = new Pattern_DiffSet_valueImpl();
		return pattern_DiffSet_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffNumericalOperator createPattern_DiffNumericalOperator() {
		Pattern_DiffNumericalOperatorImpl pattern_DiffNumericalOperator = new Pattern_DiffNumericalOperatorImpl();
		return pattern_DiffNumericalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffBooleanOperator createPattern_DiffBooleanOperator() {
		Pattern_DiffBooleanOperatorImpl pattern_DiffBooleanOperator = new Pattern_DiffBooleanOperatorImpl();
		return pattern_DiffBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffConstant createPattern_DiffConstant() {
		Pattern_DiffConstantImpl pattern_DiffConstant = new Pattern_DiffConstantImpl();
		return pattern_DiffConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffIf createPattern_DiffIf() {
		Pattern_DiffIfImpl pattern_DiffIf = new Pattern_DiffIfImpl();
		return pattern_DiffIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffIf_condition createPattern_DiffIf_condition() {
		Pattern_DiffIf_conditionImpl pattern_DiffIf_condition = new Pattern_DiffIf_conditionImpl();
		return pattern_DiffIf_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFunction createPattern_DiffFunction() {
		Pattern_DiffFunctionImpl pattern_DiffFunction = new Pattern_DiffFunctionImpl();
		return pattern_DiffFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFunction_paramDefs createPattern_DiffFunction_paramDefs() {
		Pattern_DiffFunction_paramDefsImpl pattern_DiffFunction_paramDefs = new Pattern_DiffFunction_paramDefsImpl();
		return pattern_DiffFunction_paramDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFunction_instructions createPattern_DiffFunction_instructions() {
		Pattern_DiffFunction_instructionsImpl pattern_DiffFunction_instructions = new Pattern_DiffFunction_instructionsImpl();
		return pattern_DiffFunction_instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffParameterDefinition createPattern_DiffParameterDefinition() {
		Pattern_DiffParameterDefinitionImpl pattern_DiffParameterDefinition = new Pattern_DiffParameterDefinitionImpl();
		return pattern_DiffParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffParameter_to_definition createPattern_DiffParameter_to_definition() {
		Pattern_DiffParameter_to_definitionImpl pattern_DiffParameter_to_definition = new Pattern_DiffParameter_to_definitionImpl();
		return pattern_DiffParameter_to_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFunctionCall createPattern_DiffFunctionCall() {
		Pattern_DiffFunctionCallImpl pattern_DiffFunctionCall = new Pattern_DiffFunctionCallImpl();
		return pattern_DiffFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFunctionCall_definition createPattern_DiffFunctionCall_definition() {
		Pattern_DiffFunctionCall_definitionImpl pattern_DiffFunctionCall_definition = new Pattern_DiffFunctionCall_definitionImpl();
		return pattern_DiffFunctionCall_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFunctionCall_parameters createPattern_DiffFunctionCall_parameters() {
		Pattern_DiffFunctionCall_parametersImpl pattern_DiffFunctionCall_parameters = new Pattern_DiffFunctionCall_parametersImpl();
		return pattern_DiffFunctionCall_parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffParameterCall createPattern_DiffParameterCall() {
		Pattern_DiffParameterCallImpl pattern_DiffParameterCall = new Pattern_DiffParameterCallImpl();
		return pattern_DiffParameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffParameterCall_definition createPattern_DiffParameterCall_definition() {
		Pattern_DiffParameterCall_definitionImpl pattern_DiffParameterCall_definition = new Pattern_DiffParameterCall_definitionImpl();
		return pattern_DiffParameterCall_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoRuleMMPackage getArduinoRuleMMPackage() {
		return (ArduinoRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoRuleMMPackage getPackage() {
		return ArduinoRuleMMPackage.eINSTANCE;
	}

} //ArduinoRuleMMFactoryImpl
