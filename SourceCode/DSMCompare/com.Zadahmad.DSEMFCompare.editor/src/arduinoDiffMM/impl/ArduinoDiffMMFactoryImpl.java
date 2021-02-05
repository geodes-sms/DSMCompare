/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.AnalogPin;
import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.AscOp;
import arduinoDiffMM.BooleanOperator;
import arduinoDiffMM.ClassOp;
import arduinoDiffMM.Connector;
import arduinoDiffMM.Constant;
import arduinoDiffMM.Delay;
import arduinoDiffMM.DiffAnalogPin;
import arduinoDiffMM.DiffBooleanOperator;
import arduinoDiffMM.DiffConnector;
import arduinoDiffMM.DiffConnector_module;
import arduinoDiffMM.DiffConnector_pin;
import arduinoDiffMM.DiffConstant;
import arduinoDiffMM.DiffControl_instructions;
import arduinoDiffMM.DiffDelay;
import arduinoDiffMM.DiffDigitalPin;
import arduinoDiffMM.DiffFunction;
import arduinoDiffMM.DiffFunctionCall;
import arduinoDiffMM.DiffFunctionCall_definition;
import arduinoDiffMM.DiffFunctionCall_parameters;
import arduinoDiffMM.DiffFunction_instructions;
import arduinoDiffMM.DiffFunction_paramDefs;
import arduinoDiffMM.DiffHardware;
import arduinoDiffMM.DiffHardware_connectors;
import arduinoDiffMM.DiffHardware_modules;
import arduinoDiffMM.DiffHardware_platforms;
import arduinoDiffMM.DiffIf;
import arduinoDiffMM.DiffIf_condition;
import arduinoDiffMM.DiffInputModule;
import arduinoDiffMM.DiffInstruction_next;
import arduinoDiffMM.DiffInstruction_previous;
import arduinoDiffMM.DiffLevel;
import arduinoDiffMM.DiffLevel_level;
import arduinoDiffMM.DiffMathOperator_left;
import arduinoDiffMM.DiffMathOperator_right;
import arduinoDiffMM.DiffModuleInstruction_module;
import arduinoDiffMM.DiffNumericalOperator;
import arduinoDiffMM.DiffOutputModule;
import arduinoDiffMM.DiffParameterCall;
import arduinoDiffMM.DiffParameterCall_definition;
import arduinoDiffMM.DiffParameterDefinition;
import arduinoDiffMM.DiffParameter_to_definition;
import arduinoDiffMM.DiffPlatform;
import arduinoDiffMM.DiffPlatform_analogPins;
import arduinoDiffMM.DiffPlatform_digitalPins;
import arduinoDiffMM.DiffProject;
import arduinoDiffMM.DiffProject_domainspecificdiffs;
import arduinoDiffMM.DiffProject_hardware;
import arduinoDiffMM.DiffProject_modules;
import arduinoDiffMM.DiffProject_platform;
import arduinoDiffMM.DiffProject_sketch;
import arduinoDiffMM.DiffRepeat;
import arduinoDiffMM.DiffSensor;
import arduinoDiffMM.DiffSensor_status;
import arduinoDiffMM.DiffSet;
import arduinoDiffMM.DiffSet_value;
import arduinoDiffMM.DiffSet_variable;
import arduinoDiffMM.DiffSketch;
import arduinoDiffMM.DiffSketch_functions;
import arduinoDiffMM.DiffSketch_hardware;
import arduinoDiffMM.DiffSketch_instructions;
import arduinoDiffMM.DiffStatus;
import arduinoDiffMM.DiffStatus_sensor;
import arduinoDiffMM.DiffVariable;
import arduinoDiffMM.DiffWhile;
import arduinoDiffMM.DiffWhile_condition;
import arduinoDiffMM.DigitalPin;
import arduinoDiffMM.DomainSpecificDiff;
import arduinoDiffMM.Function;
import arduinoDiffMM.FunctionCall;
import arduinoDiffMM.Hardware;
import arduinoDiffMM.If;
import arduinoDiffMM.InputModule;
import arduinoDiffMM.Level;
import arduinoDiffMM.Library;
import arduinoDiffMM.ModuleKind;
import arduinoDiffMM.NumericalOperator;
import arduinoDiffMM.OperatorKind;
import arduinoDiffMM.OutputModule;
import arduinoDiffMM.ParameterCall;
import arduinoDiffMM.ParameterDefinition;
import arduinoDiffMM.ParameterType;
import arduinoDiffMM.Platform;
import arduinoDiffMM.Project;
import arduinoDiffMM.Repeat;
import arduinoDiffMM.Sensor;
import arduinoDiffMM.Set;
import arduinoDiffMM.Sketch;
import arduinoDiffMM.Status;
import arduinoDiffMM.Time;
import arduinoDiffMM.Variable;
import arduinoDiffMM.While;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ArduinoDiffMMFactoryImpl extends EFactoryImpl implements ArduinoDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoDiffMMFactory init() {
		try {
			ArduinoDiffMMFactory theArduinoDiffMMFactory = (ArduinoDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoDiffMMPackage.eNS_URI);
			if (theArduinoDiffMMFactory != null) {
				return theArduinoDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoDiffMMFactoryImpl() {
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
			case ArduinoDiffMMPackage.HARDWARE: return createHardware();
			case ArduinoDiffMMPackage.PLATFORM: return createPlatform();
			case ArduinoDiffMMPackage.DIGITAL_PIN: return createDigitalPin();
			case ArduinoDiffMMPackage.ANALOG_PIN: return createAnalogPin();
			case ArduinoDiffMMPackage.SKETCH: return createSketch();
			case ArduinoDiffMMPackage.PROJECT: return createProject();
			case ArduinoDiffMMPackage.STATUS: return createStatus();
			case ArduinoDiffMMPackage.LEVEL: return createLevel();
			case ArduinoDiffMMPackage.DELAY: return createDelay();
			case ArduinoDiffMMPackage.INPUT_MODULE: return createInputModule();
			case ArduinoDiffMMPackage.OUTPUT_MODULE: return createOutputModule();
			case ArduinoDiffMMPackage.CONNECTOR: return createConnector();
			case ArduinoDiffMMPackage.REPEAT: return createRepeat();
			case ArduinoDiffMMPackage.SENSOR: return createSensor();
			case ArduinoDiffMMPackage.WHILE: return createWhile();
			case ArduinoDiffMMPackage.VARIABLE: return createVariable();
			case ArduinoDiffMMPackage.SET: return createSet();
			case ArduinoDiffMMPackage.NUMERICAL_OPERATOR: return createNumericalOperator();
			case ArduinoDiffMMPackage.BOOLEAN_OPERATOR: return createBooleanOperator();
			case ArduinoDiffMMPackage.CONSTANT: return createConstant();
			case ArduinoDiffMMPackage.IF: return createIf();
			case ArduinoDiffMMPackage.FUNCTION: return createFunction();
			case ArduinoDiffMMPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			case ArduinoDiffMMPackage.FUNCTION_CALL: return createFunctionCall();
			case ArduinoDiffMMPackage.PARAMETER_CALL: return createParameterCall();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF: return createDomainSpecificDiff();
			case ArduinoDiffMMPackage.DIFF_HARDWARE: return createDiffHardware();
			case ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS: return createDiffHardware_platforms();
			case ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES: return createDiffHardware_modules();
			case ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS: return createDiffHardware_connectors();
			case ArduinoDiffMMPackage.DIFF_PLATFORM: return createDiffPlatform();
			case ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS: return createDiffPlatform_digitalPins();
			case ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS: return createDiffPlatform_analogPins();
			case ArduinoDiffMMPackage.DIFF_DIGITAL_PIN: return createDiffDigitalPin();
			case ArduinoDiffMMPackage.DIFF_ANALOG_PIN: return createDiffAnalogPin();
			case ArduinoDiffMMPackage.DIFF_SKETCH: return createDiffSketch();
			case ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE: return createDiffSketch_hardware();
			case ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS: return createDiffSketch_instructions();
			case ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS: return createDiffSketch_functions();
			case ArduinoDiffMMPackage.DIFF_PROJECT: return createDiffProject();
			case ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE: return createDiffProject_hardware();
			case ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH: return createDiffProject_sketch();
			case ArduinoDiffMMPackage.DIFF_PROJECT_MODULES: return createDiffProject_modules();
			case ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM: return createDiffProject_platform();
			case ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS: return createDiffProject_domainspecificdiffs();
			case ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS: return createDiffInstruction_previous();
			case ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT: return createDiffInstruction_next();
			case ArduinoDiffMMPackage.DIFF_STATUS: return createDiffStatus();
			case ArduinoDiffMMPackage.DIFF_STATUS_SENSOR: return createDiffStatus_sensor();
			case ArduinoDiffMMPackage.DIFF_LEVEL: return createDiffLevel();
			case ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL: return createDiffLevel_level();
			case ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE: return createDiffModuleInstruction_module();
			case ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS: return createDiffControl_instructions();
			case ArduinoDiffMMPackage.DIFF_DELAY: return createDiffDelay();
			case ArduinoDiffMMPackage.DIFF_INPUT_MODULE: return createDiffInputModule();
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE: return createDiffOutputModule();
			case ArduinoDiffMMPackage.DIFF_CONNECTOR: return createDiffConnector();
			case ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN: return createDiffConnector_pin();
			case ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE: return createDiffConnector_module();
			case ArduinoDiffMMPackage.DIFF_REPEAT: return createDiffRepeat();
			case ArduinoDiffMMPackage.DIFF_SENSOR: return createDiffSensor();
			case ArduinoDiffMMPackage.DIFF_SENSOR_STATUS: return createDiffSensor_status();
			case ArduinoDiffMMPackage.DIFF_WHILE: return createDiffWhile();
			case ArduinoDiffMMPackage.DIFF_WHILE_CONDITION: return createDiffWhile_condition();
			case ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT: return createDiffMathOperator_left();
			case ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT: return createDiffMathOperator_right();
			case ArduinoDiffMMPackage.DIFF_VARIABLE: return createDiffVariable();
			case ArduinoDiffMMPackage.DIFF_SET: return createDiffSet();
			case ArduinoDiffMMPackage.DIFF_SET_VARIABLE: return createDiffSet_variable();
			case ArduinoDiffMMPackage.DIFF_SET_VALUE: return createDiffSet_value();
			case ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR: return createDiffNumericalOperator();
			case ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR: return createDiffBooleanOperator();
			case ArduinoDiffMMPackage.DIFF_CONSTANT: return createDiffConstant();
			case ArduinoDiffMMPackage.DIFF_IF: return createDiffIf();
			case ArduinoDiffMMPackage.DIFF_IF_CONDITION: return createDiffIf_condition();
			case ArduinoDiffMMPackage.DIFF_FUNCTION: return createDiffFunction();
			case ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS: return createDiffFunction_paramDefs();
			case ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS: return createDiffFunction_instructions();
			case ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION: return createDiffParameterDefinition();
			case ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION: return createDiffParameter_to_definition();
			case ArduinoDiffMMPackage.DIFF_FUNCTION_CALL: return createDiffFunctionCall();
			case ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION: return createDiffFunctionCall_definition();
			case ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS: return createDiffFunctionCall_parameters();
			case ArduinoDiffMMPackage.DIFF_PARAMETER_CALL: return createDiffParameterCall();
			case ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION: return createDiffParameterCall_definition();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoDiffMMPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			case ArduinoDiffMMPackage.MODULE_KIND:
				return createModuleKindFromString(eDataType, initialValue);
			case ArduinoDiffMMPackage.OPERATOR_KIND:
				return createOperatorKindFromString(eDataType, initialValue);
			case ArduinoDiffMMPackage.LIBRARY:
				return createLibraryFromString(eDataType, initialValue);
			case ArduinoDiffMMPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case ArduinoDiffMMPackage.CLASS_OP:
				return createClassOpFromString(eDataType, initialValue);
			case ArduinoDiffMMPackage.ASC_OP:
				return createAscOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoDiffMMPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			case ArduinoDiffMMPackage.MODULE_KIND:
				return convertModuleKindToString(eDataType, instanceValue);
			case ArduinoDiffMMPackage.OPERATOR_KIND:
				return convertOperatorKindToString(eDataType, instanceValue);
			case ArduinoDiffMMPackage.LIBRARY:
				return convertLibraryToString(eDataType, instanceValue);
			case ArduinoDiffMMPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case ArduinoDiffMMPackage.CLASS_OP:
				return convertClassOpToString(eDataType, instanceValue);
			case ArduinoDiffMMPackage.ASC_OP:
				return convertAscOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalPin createDigitalPin() {
		DigitalPinImpl digitalPin = new DigitalPinImpl();
		return digitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogPin createAnalogPin() {
		AnalogPinImpl analogPin = new AnalogPinImpl();
		return analogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sketch createSketch() {
		SketchImpl sketch = new SketchImpl();
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputModule createInputModule() {
		InputModuleImpl inputModule = new InputModuleImpl();
		return inputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputModule createOutputModule() {
		OutputModuleImpl outputModule = new OutputModuleImpl();
		return outputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalOperator createNumericalOperator() {
		NumericalOperatorImpl numericalOperator = new NumericalOperatorImpl();
		return numericalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanOperator createBooleanOperator() {
		BooleanOperatorImpl booleanOperator = new BooleanOperatorImpl();
		return booleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterCall createParameterCall() {
		ParameterCallImpl parameterCall = new ParameterCallImpl();
		return parameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSpecificDiff createDomainSpecificDiff() {
		DomainSpecificDiffImpl domainSpecificDiff = new DomainSpecificDiffImpl();
		return domainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffHardware createDiffHardware() {
		DiffHardwareImpl diffHardware = new DiffHardwareImpl();
		return diffHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffHardware_platforms createDiffHardware_platforms() {
		DiffHardware_platformsImpl diffHardware_platforms = new DiffHardware_platformsImpl();
		return diffHardware_platforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffHardware_modules createDiffHardware_modules() {
		DiffHardware_modulesImpl diffHardware_modules = new DiffHardware_modulesImpl();
		return diffHardware_modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffHardware_connectors createDiffHardware_connectors() {
		DiffHardware_connectorsImpl diffHardware_connectors = new DiffHardware_connectorsImpl();
		return diffHardware_connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffPlatform createDiffPlatform() {
		DiffPlatformImpl diffPlatform = new DiffPlatformImpl();
		return diffPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffPlatform_digitalPins createDiffPlatform_digitalPins() {
		DiffPlatform_digitalPinsImpl diffPlatform_digitalPins = new DiffPlatform_digitalPinsImpl();
		return diffPlatform_digitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffPlatform_analogPins createDiffPlatform_analogPins() {
		DiffPlatform_analogPinsImpl diffPlatform_analogPins = new DiffPlatform_analogPinsImpl();
		return diffPlatform_analogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffDigitalPin createDiffDigitalPin() {
		DiffDigitalPinImpl diffDigitalPin = new DiffDigitalPinImpl();
		return diffDigitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffAnalogPin createDiffAnalogPin() {
		DiffAnalogPinImpl diffAnalogPin = new DiffAnalogPinImpl();
		return diffAnalogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSketch createDiffSketch() {
		DiffSketchImpl diffSketch = new DiffSketchImpl();
		return diffSketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSketch_hardware createDiffSketch_hardware() {
		DiffSketch_hardwareImpl diffSketch_hardware = new DiffSketch_hardwareImpl();
		return diffSketch_hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSketch_instructions createDiffSketch_instructions() {
		DiffSketch_instructionsImpl diffSketch_instructions = new DiffSketch_instructionsImpl();
		return diffSketch_instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSketch_functions createDiffSketch_functions() {
		DiffSketch_functionsImpl diffSketch_functions = new DiffSketch_functionsImpl();
		return diffSketch_functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffProject createDiffProject() {
		DiffProjectImpl diffProject = new DiffProjectImpl();
		return diffProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffProject_hardware createDiffProject_hardware() {
		DiffProject_hardwareImpl diffProject_hardware = new DiffProject_hardwareImpl();
		return diffProject_hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffProject_sketch createDiffProject_sketch() {
		DiffProject_sketchImpl diffProject_sketch = new DiffProject_sketchImpl();
		return diffProject_sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffProject_modules createDiffProject_modules() {
		DiffProject_modulesImpl diffProject_modules = new DiffProject_modulesImpl();
		return diffProject_modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffProject_platform createDiffProject_platform() {
		DiffProject_platformImpl diffProject_platform = new DiffProject_platformImpl();
		return diffProject_platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffProject_domainspecificdiffs createDiffProject_domainspecificdiffs() {
		DiffProject_domainspecificdiffsImpl diffProject_domainspecificdiffs = new DiffProject_domainspecificdiffsImpl();
		return diffProject_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffInstruction_previous createDiffInstruction_previous() {
		DiffInstruction_previousImpl diffInstruction_previous = new DiffInstruction_previousImpl();
		return diffInstruction_previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffInstruction_next createDiffInstruction_next() {
		DiffInstruction_nextImpl diffInstruction_next = new DiffInstruction_nextImpl();
		return diffInstruction_next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffStatus createDiffStatus() {
		DiffStatusImpl diffStatus = new DiffStatusImpl();
		return diffStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffStatus_sensor createDiffStatus_sensor() {
		DiffStatus_sensorImpl diffStatus_sensor = new DiffStatus_sensorImpl();
		return diffStatus_sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffLevel createDiffLevel() {
		DiffLevelImpl diffLevel = new DiffLevelImpl();
		return diffLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffLevel_level createDiffLevel_level() {
		DiffLevel_levelImpl diffLevel_level = new DiffLevel_levelImpl();
		return diffLevel_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffModuleInstruction_module createDiffModuleInstruction_module() {
		DiffModuleInstruction_moduleImpl diffModuleInstruction_module = new DiffModuleInstruction_moduleImpl();
		return diffModuleInstruction_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffControl_instructions createDiffControl_instructions() {
		DiffControl_instructionsImpl diffControl_instructions = new DiffControl_instructionsImpl();
		return diffControl_instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffDelay createDiffDelay() {
		DiffDelayImpl diffDelay = new DiffDelayImpl();
		return diffDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffInputModule createDiffInputModule() {
		DiffInputModuleImpl diffInputModule = new DiffInputModuleImpl();
		return diffInputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffOutputModule createDiffOutputModule() {
		DiffOutputModuleImpl diffOutputModule = new DiffOutputModuleImpl();
		return diffOutputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffConnector createDiffConnector() {
		DiffConnectorImpl diffConnector = new DiffConnectorImpl();
		return diffConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffConnector_pin createDiffConnector_pin() {
		DiffConnector_pinImpl diffConnector_pin = new DiffConnector_pinImpl();
		return diffConnector_pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffConnector_module createDiffConnector_module() {
		DiffConnector_moduleImpl diffConnector_module = new DiffConnector_moduleImpl();
		return diffConnector_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffRepeat createDiffRepeat() {
		DiffRepeatImpl diffRepeat = new DiffRepeatImpl();
		return diffRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSensor createDiffSensor() {
		DiffSensorImpl diffSensor = new DiffSensorImpl();
		return diffSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSensor_status createDiffSensor_status() {
		DiffSensor_statusImpl diffSensor_status = new DiffSensor_statusImpl();
		return diffSensor_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffWhile createDiffWhile() {
		DiffWhileImpl diffWhile = new DiffWhileImpl();
		return diffWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffWhile_condition createDiffWhile_condition() {
		DiffWhile_conditionImpl diffWhile_condition = new DiffWhile_conditionImpl();
		return diffWhile_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffMathOperator_left createDiffMathOperator_left() {
		DiffMathOperator_leftImpl diffMathOperator_left = new DiffMathOperator_leftImpl();
		return diffMathOperator_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffMathOperator_right createDiffMathOperator_right() {
		DiffMathOperator_rightImpl diffMathOperator_right = new DiffMathOperator_rightImpl();
		return diffMathOperator_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffVariable createDiffVariable() {
		DiffVariableImpl diffVariable = new DiffVariableImpl();
		return diffVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSet createDiffSet() {
		DiffSetImpl diffSet = new DiffSetImpl();
		return diffSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSet_variable createDiffSet_variable() {
		DiffSet_variableImpl diffSet_variable = new DiffSet_variableImpl();
		return diffSet_variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffSet_value createDiffSet_value() {
		DiffSet_valueImpl diffSet_value = new DiffSet_valueImpl();
		return diffSet_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffNumericalOperator createDiffNumericalOperator() {
		DiffNumericalOperatorImpl diffNumericalOperator = new DiffNumericalOperatorImpl();
		return diffNumericalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffBooleanOperator createDiffBooleanOperator() {
		DiffBooleanOperatorImpl diffBooleanOperator = new DiffBooleanOperatorImpl();
		return diffBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffConstant createDiffConstant() {
		DiffConstantImpl diffConstant = new DiffConstantImpl();
		return diffConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffIf createDiffIf() {
		DiffIfImpl diffIf = new DiffIfImpl();
		return diffIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffIf_condition createDiffIf_condition() {
		DiffIf_conditionImpl diffIf_condition = new DiffIf_conditionImpl();
		return diffIf_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFunction createDiffFunction() {
		DiffFunctionImpl diffFunction = new DiffFunctionImpl();
		return diffFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFunction_paramDefs createDiffFunction_paramDefs() {
		DiffFunction_paramDefsImpl diffFunction_paramDefs = new DiffFunction_paramDefsImpl();
		return diffFunction_paramDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFunction_instructions createDiffFunction_instructions() {
		DiffFunction_instructionsImpl diffFunction_instructions = new DiffFunction_instructionsImpl();
		return diffFunction_instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffParameterDefinition createDiffParameterDefinition() {
		DiffParameterDefinitionImpl diffParameterDefinition = new DiffParameterDefinitionImpl();
		return diffParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffParameter_to_definition createDiffParameter_to_definition() {
		DiffParameter_to_definitionImpl diffParameter_to_definition = new DiffParameter_to_definitionImpl();
		return diffParameter_to_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFunctionCall createDiffFunctionCall() {
		DiffFunctionCallImpl diffFunctionCall = new DiffFunctionCallImpl();
		return diffFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFunctionCall_definition createDiffFunctionCall_definition() {
		DiffFunctionCall_definitionImpl diffFunctionCall_definition = new DiffFunctionCall_definitionImpl();
		return diffFunctionCall_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFunctionCall_parameters createDiffFunctionCall_parameters() {
		DiffFunctionCall_parametersImpl diffFunctionCall_parameters = new DiffFunctionCall_parametersImpl();
		return diffFunctionCall_parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffParameterCall createDiffParameterCall() {
		DiffParameterCallImpl diffParameterCall = new DiffParameterCallImpl();
		return diffParameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffParameterCall_definition createDiffParameterCall_definition() {
		DiffParameterCall_definitionImpl diffParameterCall_definition = new DiffParameterCall_definitionImpl();
		return diffParameterCall_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTimeFromString(EDataType eDataType, String initialValue) {
		Time result = Time.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleKind createModuleKindFromString(EDataType eDataType, String initialValue) {
		ModuleKind result = ModuleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorKind createOperatorKindFromString(EDataType eDataType, String initialValue) {
		OperatorKind result = OperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibraryFromString(EDataType eDataType, String initialValue) {
		Library result = Library.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp createClassOpFromString(EDataType eDataType, String initialValue) {
		ClassOp result = ClassOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscOp createAscOpFromString(EDataType eDataType, String initialValue) {
		AscOp result = AscOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoDiffMMPackage getArduinoDiffMMPackage() {
		return (ArduinoDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoDiffMMPackage getPackage() {
		return ArduinoDiffMMPackage.eINSTANCE;
	}

} //ArduinoDiffMMFactoryImpl
