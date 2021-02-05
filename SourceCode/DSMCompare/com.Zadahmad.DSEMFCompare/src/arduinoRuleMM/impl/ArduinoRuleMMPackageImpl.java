/**
 */
package arduinoRuleMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;

import arduinoDiffMM.impl.ArduinoDiffMMPackageImpl;

import arduinoRuleMM.ArduinoRuleMMFactory;
import arduinoRuleMM.ArduinoRuleMMPackage;
import arduinoRuleMM.Pattern_AnalogPin;
import arduinoRuleMM.Pattern_BooleanOperator;
import arduinoRuleMM.Pattern_Connector;
import arduinoRuleMM.Pattern_Constant;
import arduinoRuleMM.Pattern_Control;
import arduinoRuleMM.Pattern_Delay;
import arduinoRuleMM.Pattern_DiffAnalogPin;
import arduinoRuleMM.Pattern_DiffBooleanOperator;
import arduinoRuleMM.Pattern_DiffConnector;
import arduinoRuleMM.Pattern_DiffConnector_module;
import arduinoRuleMM.Pattern_DiffConnector_pin;
import arduinoRuleMM.Pattern_DiffConstant;
import arduinoRuleMM.Pattern_DiffControl_instructions;
import arduinoRuleMM.Pattern_DiffDelay;
import arduinoRuleMM.Pattern_DiffDigitalPin;
import arduinoRuleMM.Pattern_DiffFunction;
import arduinoRuleMM.Pattern_DiffFunctionCall;
import arduinoRuleMM.Pattern_DiffFunctionCall_definition;
import arduinoRuleMM.Pattern_DiffFunctionCall_parameters;
import arduinoRuleMM.Pattern_DiffFunction_instructions;
import arduinoRuleMM.Pattern_DiffFunction_paramDefs;
import arduinoRuleMM.Pattern_DiffHardware;
import arduinoRuleMM.Pattern_DiffHardware_connectors;
import arduinoRuleMM.Pattern_DiffHardware_modules;
import arduinoRuleMM.Pattern_DiffHardware_platforms;
import arduinoRuleMM.Pattern_DiffIf;
import arduinoRuleMM.Pattern_DiffIf_condition;
import arduinoRuleMM.Pattern_DiffInputModule;
import arduinoRuleMM.Pattern_DiffInstruction_next;
import arduinoRuleMM.Pattern_DiffInstruction_previous;
import arduinoRuleMM.Pattern_DiffLevel;
import arduinoRuleMM.Pattern_DiffLevel_level;
import arduinoRuleMM.Pattern_DiffMathOperator_left;
import arduinoRuleMM.Pattern_DiffMathOperator_right;
import arduinoRuleMM.Pattern_DiffModuleInstruction_module;
import arduinoRuleMM.Pattern_DiffNumericalOperator;
import arduinoRuleMM.Pattern_DiffOutputModule;
import arduinoRuleMM.Pattern_DiffParameterCall;
import arduinoRuleMM.Pattern_DiffParameterCall_definition;
import arduinoRuleMM.Pattern_DiffParameterDefinition;
import arduinoRuleMM.Pattern_DiffParameter_to_definition;
import arduinoRuleMM.Pattern_DiffPlatform;
import arduinoRuleMM.Pattern_DiffPlatform_analogPins;
import arduinoRuleMM.Pattern_DiffPlatform_digitalPins;
import arduinoRuleMM.Pattern_DiffProject;
import arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs;
import arduinoRuleMM.Pattern_DiffProject_hardware;
import arduinoRuleMM.Pattern_DiffProject_modules;
import arduinoRuleMM.Pattern_DiffProject_platform;
import arduinoRuleMM.Pattern_DiffProject_sketch;
import arduinoRuleMM.Pattern_DiffRepeat;
import arduinoRuleMM.Pattern_DiffSensor;
import arduinoRuleMM.Pattern_DiffSensor_status;
import arduinoRuleMM.Pattern_DiffSet;
import arduinoRuleMM.Pattern_DiffSet_value;
import arduinoRuleMM.Pattern_DiffSet_variable;
import arduinoRuleMM.Pattern_DiffSketch;
import arduinoRuleMM.Pattern_DiffSketch_functions;
import arduinoRuleMM.Pattern_DiffSketch_hardware;
import arduinoRuleMM.Pattern_DiffSketch_instructions;
import arduinoRuleMM.Pattern_DiffStatus;
import arduinoRuleMM.Pattern_DiffStatus_sensor;
import arduinoRuleMM.Pattern_DiffVariable;
import arduinoRuleMM.Pattern_DiffWhile;
import arduinoRuleMM.Pattern_DiffWhile_condition;
import arduinoRuleMM.Pattern_DigitalPin;
import arduinoRuleMM.Pattern_DomainSpecificDiff;
import arduinoRuleMM.Pattern_Function;
import arduinoRuleMM.Pattern_FunctionCall;
import arduinoRuleMM.Pattern_Hardware;
import arduinoRuleMM.Pattern_IO;
import arduinoRuleMM.Pattern_If;
import arduinoRuleMM.Pattern_InputModule;
import arduinoRuleMM.Pattern_Instruction;
import arduinoRuleMM.Pattern_Level;
import arduinoRuleMM.Pattern_MathOperator;
import arduinoRuleMM.Pattern_Module;
import arduinoRuleMM.Pattern_ModuleInstruction;
import arduinoRuleMM.Pattern_NamedElement;
import arduinoRuleMM.Pattern_NumericalOperator;
import arduinoRuleMM.Pattern_OutputModule;
import arduinoRuleMM.Pattern_Parameter;
import arduinoRuleMM.Pattern_ParameterCall;
import arduinoRuleMM.Pattern_ParameterDefinition;
import arduinoRuleMM.Pattern_Pin;
import arduinoRuleMM.Pattern_Platform;
import arduinoRuleMM.Pattern_Project;
import arduinoRuleMM.Pattern_Repeat;
import arduinoRuleMM.Pattern_Sensor;
import arduinoRuleMM.Pattern_Set;
import arduinoRuleMM.Pattern_Sketch;
import arduinoRuleMM.Pattern_Status;
import arduinoRuleMM.Pattern_Utilities;
import arduinoRuleMM.Pattern_Value;
import arduinoRuleMM.Pattern_Variable;
import arduinoRuleMM.Pattern_While;
import arduinoRuleMM.Rule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoRuleMMPackageImpl extends EPackageImpl implements ArduinoRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_HardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_PlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DigitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_PinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_AnalogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_InstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_StatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_LevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ModuleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_UtilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_IOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_InputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_OutputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_NamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_RepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_WhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_MathOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_VariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_NumericalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_BooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_IfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_FunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ParameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_FunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ParameterCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DomainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffHardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffHardware_platformsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffHardware_modulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffHardware_connectorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPlatform_digitalPinsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPlatform_analogPinsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDigitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffAnalogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSketch_hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSketch_instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSketch_functionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffProject_hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffProject_sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffProject_modulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffProject_platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffProject_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffInstruction_previousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffInstruction_nextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffStatus_sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffLevel_levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffModuleInstruction_moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffControl_instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffInputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffOutputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffConnector_pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffConnector_moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffRepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSensor_statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffWhile_conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffMathOperator_leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffMathOperator_rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSet_variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffSet_valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffNumericalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffBooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffIf_conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFunction_paramDefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFunction_instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffParameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffParameter_to_definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFunctionCall_definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFunctionCall_parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffParameterCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffParameterCall_definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoRuleMMPackageImpl() {
		super(eNS_URI, ArduinoRuleMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArduinoRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoRuleMMPackage init() {
		if (isInited) return (ArduinoRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArduinoRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArduinoRuleMMPackageImpl theArduinoRuleMMPackage = registeredArduinoRuleMMPackage instanceof ArduinoRuleMMPackageImpl ? (ArduinoRuleMMPackageImpl)registeredArduinoRuleMMPackage : new ArduinoRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArduinoDiffMMPackage.eNS_URI);
		ArduinoDiffMMPackageImpl theArduinoDiffMMPackage = (ArduinoDiffMMPackageImpl)(registeredPackage instanceof ArduinoDiffMMPackageImpl ? registeredPackage : ArduinoDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoRuleMMPackage.createPackageContents();
		theArduinoDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoRuleMMPackage.initializePackageContents();
		theArduinoDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoRuleMMPackage.eNS_URI, theArduinoRuleMMPackage);
		return theArduinoRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Hardware() {
		return pattern_HardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Hardware_ID_Pattern() {
		return (EAttribute)pattern_HardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Platform() {
		return pattern_PlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Platform_ID_Pattern() {
		return (EAttribute)pattern_PlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Module() {
		return pattern_ModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Module_ID_Pattern() {
		return (EAttribute)pattern_ModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DigitalPin() {
		return pattern_DigitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DigitalPin_ID_Pattern() {
		return (EAttribute)pattern_DigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Pin() {
		return pattern_PinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Pin_ID_Pattern() {
		return (EAttribute)pattern_PinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_AnalogPin() {
		return pattern_AnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_AnalogPin_ID_Pattern() {
		return (EAttribute)pattern_AnalogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Sketch() {
		return pattern_SketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Sketch_ID_Pattern() {
		return (EAttribute)pattern_SketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Project() {
		return pattern_ProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Project_ID_Pattern() {
		return (EAttribute)pattern_ProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Instruction() {
		return pattern_InstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Instruction_ID_Pattern() {
		return (EAttribute)pattern_InstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Status() {
		return pattern_StatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Status_ID_Pattern() {
		return (EAttribute)pattern_StatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Level() {
		return pattern_LevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Level_ID_Pattern() {
		return (EAttribute)pattern_LevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_ModuleInstruction() {
		return pattern_ModuleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ModuleInstruction_ID_Pattern() {
		return (EAttribute)pattern_ModuleInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Control() {
		return pattern_ControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Control_ID_Pattern() {
		return (EAttribute)pattern_ControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Utilities() {
		return pattern_UtilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Utilities_ID_Pattern() {
		return (EAttribute)pattern_UtilitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_IO() {
		return pattern_IOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_IO_ID_Pattern() {
		return (EAttribute)pattern_IOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Delay() {
		return pattern_DelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Delay_ID_Pattern() {
		return (EAttribute)pattern_DelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_InputModule() {
		return pattern_InputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_InputModule_ID_Pattern() {
		return (EAttribute)pattern_InputModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_OutputModule() {
		return pattern_OutputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_OutputModule_ID_Pattern() {
		return (EAttribute)pattern_OutputModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_NamedElement() {
		return pattern_NamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NamedElement_ID_Pattern() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Connector() {
		return pattern_ConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Connector_ID_Pattern() {
		return (EAttribute)pattern_ConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Repeat() {
		return pattern_RepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Repeat_ID_Pattern() {
		return (EAttribute)pattern_RepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Sensor() {
		return pattern_SensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Sensor_ID_Pattern() {
		return (EAttribute)pattern_SensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_While() {
		return pattern_WhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_While_ID_Pattern() {
		return (EAttribute)pattern_WhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_MathOperator() {
		return pattern_MathOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_MathOperator_ID_Pattern() {
		return (EAttribute)pattern_MathOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Variable() {
		return pattern_VariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Variable_ID_Pattern() {
		return (EAttribute)pattern_VariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Set() {
		return pattern_SetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Set_ID_Pattern() {
		return (EAttribute)pattern_SetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_NumericalOperator() {
		return pattern_NumericalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NumericalOperator_ID_Pattern() {
		return (EAttribute)pattern_NumericalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_BooleanOperator() {
		return pattern_BooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_BooleanOperator_ID_Pattern() {
		return (EAttribute)pattern_BooleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Value() {
		return pattern_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Value_ID_Pattern() {
		return (EAttribute)pattern_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Constant() {
		return pattern_ConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Constant_ID_Pattern() {
		return (EAttribute)pattern_ConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_If() {
		return pattern_IfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_If_ID_Pattern() {
		return (EAttribute)pattern_IfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Function() {
		return pattern_FunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Function_ID_Pattern() {
		return (EAttribute)pattern_FunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_ParameterDefinition() {
		return pattern_ParameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ParameterDefinition_ID_Pattern() {
		return (EAttribute)pattern_ParameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Parameter() {
		return pattern_ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Parameter_ID_Pattern() {
		return (EAttribute)pattern_ParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_FunctionCall() {
		return pattern_FunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_FunctionCall_ID_Pattern() {
		return (EAttribute)pattern_FunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_ParameterCall() {
		return pattern_ParameterCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ParameterCall_ID_Pattern() {
		return (EAttribute)pattern_ParameterCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DomainSpecificDiff() {
		return pattern_DomainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DomainSpecificDiff_ID_Pattern() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffHardware() {
		return pattern_DiffHardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffHardware_ID_Pattern() {
		return (EAttribute)pattern_DiffHardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffHardware_platforms() {
		return pattern_DiffHardware_platformsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffHardware_platforms_ID_Pattern() {
		return (EAttribute)pattern_DiffHardware_platformsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffHardware_modules() {
		return pattern_DiffHardware_modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffHardware_modules_ID_Pattern() {
		return (EAttribute)pattern_DiffHardware_modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffHardware_connectors() {
		return pattern_DiffHardware_connectorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffHardware_connectors_ID_Pattern() {
		return (EAttribute)pattern_DiffHardware_connectorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPlatform() {
		return pattern_DiffPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlatform_ID_Pattern() {
		return (EAttribute)pattern_DiffPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPlatform_digitalPins() {
		return pattern_DiffPlatform_digitalPinsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlatform_digitalPins_ID_Pattern() {
		return (EAttribute)pattern_DiffPlatform_digitalPinsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPlatform_analogPins() {
		return pattern_DiffPlatform_analogPinsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlatform_analogPins_ID_Pattern() {
		return (EAttribute)pattern_DiffPlatform_analogPinsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffDigitalPin() {
		return pattern_DiffDigitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDigitalPin_ID_Pattern() {
		return (EAttribute)pattern_DiffDigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffAnalogPin() {
		return pattern_DiffAnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffAnalogPin_ID_Pattern() {
		return (EAttribute)pattern_DiffAnalogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSketch() {
		return pattern_DiffSketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSketch_ID_Pattern() {
		return (EAttribute)pattern_DiffSketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSketch_hardware() {
		return pattern_DiffSketch_hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSketch_hardware_ID_Pattern() {
		return (EAttribute)pattern_DiffSketch_hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSketch_instructions() {
		return pattern_DiffSketch_instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSketch_instructions_ID_Pattern() {
		return (EAttribute)pattern_DiffSketch_instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSketch_functions() {
		return pattern_DiffSketch_functionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSketch_functions_ID_Pattern() {
		return (EAttribute)pattern_DiffSketch_functionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffProject() {
		return pattern_DiffProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffProject_ID_Pattern() {
		return (EAttribute)pattern_DiffProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffProject_hardware() {
		return pattern_DiffProject_hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffProject_hardware_ID_Pattern() {
		return (EAttribute)pattern_DiffProject_hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffProject_sketch() {
		return pattern_DiffProject_sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffProject_sketch_ID_Pattern() {
		return (EAttribute)pattern_DiffProject_sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffProject_modules() {
		return pattern_DiffProject_modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffProject_modules_ID_Pattern() {
		return (EAttribute)pattern_DiffProject_modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffProject_platform() {
		return pattern_DiffProject_platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffProject_platform_ID_Pattern() {
		return (EAttribute)pattern_DiffProject_platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffProject_domainspecificdiffs() {
		return pattern_DiffProject_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffProject_domainspecificdiffs_ID_Pattern() {
		return (EAttribute)pattern_DiffProject_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffInstruction_previous() {
		return pattern_DiffInstruction_previousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInstruction_previous_ID_Pattern() {
		return (EAttribute)pattern_DiffInstruction_previousEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffInstruction_next() {
		return pattern_DiffInstruction_nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInstruction_next_ID_Pattern() {
		return (EAttribute)pattern_DiffInstruction_nextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffStatus() {
		return pattern_DiffStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffStatus_ID_Pattern() {
		return (EAttribute)pattern_DiffStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffStatus_sensor() {
		return pattern_DiffStatus_sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffStatus_sensor_ID_Pattern() {
		return (EAttribute)pattern_DiffStatus_sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffLevel() {
		return pattern_DiffLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffLevel_ID_Pattern() {
		return (EAttribute)pattern_DiffLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffLevel_level() {
		return pattern_DiffLevel_levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffLevel_level_ID_Pattern() {
		return (EAttribute)pattern_DiffLevel_levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffModuleInstruction_module() {
		return pattern_DiffModuleInstruction_moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModuleInstruction_module_ID_Pattern() {
		return (EAttribute)pattern_DiffModuleInstruction_moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffControl_instructions() {
		return pattern_DiffControl_instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffControl_instructions_ID_Pattern() {
		return (EAttribute)pattern_DiffControl_instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffDelay() {
		return pattern_DiffDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDelay_ID_Pattern() {
		return (EAttribute)pattern_DiffDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffInputModule() {
		return pattern_DiffInputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInputModule_ID_Pattern() {
		return (EAttribute)pattern_DiffInputModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffOutputModule() {
		return pattern_DiffOutputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOutputModule_ID_Pattern() {
		return (EAttribute)pattern_DiffOutputModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffConnector() {
		return pattern_DiffConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffConnector_ID_Pattern() {
		return (EAttribute)pattern_DiffConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffConnector_pin() {
		return pattern_DiffConnector_pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffConnector_pin_ID_Pattern() {
		return (EAttribute)pattern_DiffConnector_pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffConnector_module() {
		return pattern_DiffConnector_moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffConnector_module_ID_Pattern() {
		return (EAttribute)pattern_DiffConnector_moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffRepeat() {
		return pattern_DiffRepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffRepeat_ID_Pattern() {
		return (EAttribute)pattern_DiffRepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSensor() {
		return pattern_DiffSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSensor_ID_Pattern() {
		return (EAttribute)pattern_DiffSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSensor_status() {
		return pattern_DiffSensor_statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSensor_status_ID_Pattern() {
		return (EAttribute)pattern_DiffSensor_statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffWhile() {
		return pattern_DiffWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffWhile_ID_Pattern() {
		return (EAttribute)pattern_DiffWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffWhile_condition() {
		return pattern_DiffWhile_conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffWhile_condition_ID_Pattern() {
		return (EAttribute)pattern_DiffWhile_conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffMathOperator_left() {
		return pattern_DiffMathOperator_leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffMathOperator_left_ID_Pattern() {
		return (EAttribute)pattern_DiffMathOperator_leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffMathOperator_right() {
		return pattern_DiffMathOperator_rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffMathOperator_right_ID_Pattern() {
		return (EAttribute)pattern_DiffMathOperator_rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffVariable() {
		return pattern_DiffVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffVariable_ID_Pattern() {
		return (EAttribute)pattern_DiffVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSet() {
		return pattern_DiffSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSet_ID_Pattern() {
		return (EAttribute)pattern_DiffSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSet_variable() {
		return pattern_DiffSet_variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSet_variable_ID_Pattern() {
		return (EAttribute)pattern_DiffSet_variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffSet_value() {
		return pattern_DiffSet_valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffSet_value_ID_Pattern() {
		return (EAttribute)pattern_DiffSet_valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffNumericalOperator() {
		return pattern_DiffNumericalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffNumericalOperator_ID_Pattern() {
		return (EAttribute)pattern_DiffNumericalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffBooleanOperator() {
		return pattern_DiffBooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffBooleanOperator_ID_Pattern() {
		return (EAttribute)pattern_DiffBooleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffConstant() {
		return pattern_DiffConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffConstant_ID_Pattern() {
		return (EAttribute)pattern_DiffConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffIf() {
		return pattern_DiffIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffIf_ID_Pattern() {
		return (EAttribute)pattern_DiffIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffIf_condition() {
		return pattern_DiffIf_conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffIf_condition_ID_Pattern() {
		return (EAttribute)pattern_DiffIf_conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFunction() {
		return pattern_DiffFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFunction_ID_Pattern() {
		return (EAttribute)pattern_DiffFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFunction_paramDefs() {
		return pattern_DiffFunction_paramDefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFunction_paramDefs_ID_Pattern() {
		return (EAttribute)pattern_DiffFunction_paramDefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFunction_instructions() {
		return pattern_DiffFunction_instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFunction_instructions_ID_Pattern() {
		return (EAttribute)pattern_DiffFunction_instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffParameterDefinition() {
		return pattern_DiffParameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffParameterDefinition_ID_Pattern() {
		return (EAttribute)pattern_DiffParameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffParameter_to_definition() {
		return pattern_DiffParameter_to_definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffParameter_to_definition_ID_Pattern() {
		return (EAttribute)pattern_DiffParameter_to_definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFunctionCall() {
		return pattern_DiffFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFunctionCall_ID_Pattern() {
		return (EAttribute)pattern_DiffFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFunctionCall_definition() {
		return pattern_DiffFunctionCall_definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFunctionCall_definition_ID_Pattern() {
		return (EAttribute)pattern_DiffFunctionCall_definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFunctionCall_parameters() {
		return pattern_DiffFunctionCall_parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFunctionCall_parameters_ID_Pattern() {
		return (EAttribute)pattern_DiffFunctionCall_parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffParameterCall() {
		return pattern_DiffParameterCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffParameterCall_ID_Pattern() {
		return (EAttribute)pattern_DiffParameterCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffParameterCall_definition() {
		return pattern_DiffParameterCall_definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffParameterCall_definition_ID_Pattern() {
		return (EAttribute)pattern_DiffParameterCall_definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Pattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoRuleMMFactory getArduinoRuleMMFactory() {
		return (ArduinoRuleMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pattern_HardwareEClass = createEClass(PATTERN_HARDWARE);
		createEAttribute(pattern_HardwareEClass, PATTERN_HARDWARE__ID_PATTERN);

		pattern_PlatformEClass = createEClass(PATTERN_PLATFORM);
		createEAttribute(pattern_PlatformEClass, PATTERN_PLATFORM__ID_PATTERN);

		pattern_ModuleEClass = createEClass(PATTERN_MODULE);
		createEAttribute(pattern_ModuleEClass, PATTERN_MODULE__ID_PATTERN);

		pattern_DigitalPinEClass = createEClass(PATTERN_DIGITAL_PIN);
		createEAttribute(pattern_DigitalPinEClass, PATTERN_DIGITAL_PIN__ID_PATTERN);

		pattern_PinEClass = createEClass(PATTERN_PIN);
		createEAttribute(pattern_PinEClass, PATTERN_PIN__ID_PATTERN);

		pattern_AnalogPinEClass = createEClass(PATTERN_ANALOG_PIN);
		createEAttribute(pattern_AnalogPinEClass, PATTERN_ANALOG_PIN__ID_PATTERN);

		pattern_SketchEClass = createEClass(PATTERN_SKETCH);
		createEAttribute(pattern_SketchEClass, PATTERN_SKETCH__ID_PATTERN);

		pattern_ProjectEClass = createEClass(PATTERN_PROJECT);
		createEAttribute(pattern_ProjectEClass, PATTERN_PROJECT__ID_PATTERN);

		pattern_InstructionEClass = createEClass(PATTERN_INSTRUCTION);
		createEAttribute(pattern_InstructionEClass, PATTERN_INSTRUCTION__ID_PATTERN);

		pattern_StatusEClass = createEClass(PATTERN_STATUS);
		createEAttribute(pattern_StatusEClass, PATTERN_STATUS__ID_PATTERN);

		pattern_LevelEClass = createEClass(PATTERN_LEVEL);
		createEAttribute(pattern_LevelEClass, PATTERN_LEVEL__ID_PATTERN);

		pattern_ModuleInstructionEClass = createEClass(PATTERN_MODULE_INSTRUCTION);
		createEAttribute(pattern_ModuleInstructionEClass, PATTERN_MODULE_INSTRUCTION__ID_PATTERN);

		pattern_ControlEClass = createEClass(PATTERN_CONTROL);
		createEAttribute(pattern_ControlEClass, PATTERN_CONTROL__ID_PATTERN);

		pattern_UtilitiesEClass = createEClass(PATTERN_UTILITIES);
		createEAttribute(pattern_UtilitiesEClass, PATTERN_UTILITIES__ID_PATTERN);

		pattern_IOEClass = createEClass(PATTERN_IO);
		createEAttribute(pattern_IOEClass, PATTERN_IO__ID_PATTERN);

		pattern_DelayEClass = createEClass(PATTERN_DELAY);
		createEAttribute(pattern_DelayEClass, PATTERN_DELAY__ID_PATTERN);

		pattern_InputModuleEClass = createEClass(PATTERN_INPUT_MODULE);
		createEAttribute(pattern_InputModuleEClass, PATTERN_INPUT_MODULE__ID_PATTERN);

		pattern_OutputModuleEClass = createEClass(PATTERN_OUTPUT_MODULE);
		createEAttribute(pattern_OutputModuleEClass, PATTERN_OUTPUT_MODULE__ID_PATTERN);

		pattern_NamedElementEClass = createEClass(PATTERN_NAMED_ELEMENT);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__ID_PATTERN);

		pattern_ConnectorEClass = createEClass(PATTERN_CONNECTOR);
		createEAttribute(pattern_ConnectorEClass, PATTERN_CONNECTOR__ID_PATTERN);

		pattern_RepeatEClass = createEClass(PATTERN_REPEAT);
		createEAttribute(pattern_RepeatEClass, PATTERN_REPEAT__ID_PATTERN);

		pattern_SensorEClass = createEClass(PATTERN_SENSOR);
		createEAttribute(pattern_SensorEClass, PATTERN_SENSOR__ID_PATTERN);

		pattern_WhileEClass = createEClass(PATTERN_WHILE);
		createEAttribute(pattern_WhileEClass, PATTERN_WHILE__ID_PATTERN);

		pattern_MathOperatorEClass = createEClass(PATTERN_MATH_OPERATOR);
		createEAttribute(pattern_MathOperatorEClass, PATTERN_MATH_OPERATOR__ID_PATTERN);

		pattern_VariableEClass = createEClass(PATTERN_VARIABLE);
		createEAttribute(pattern_VariableEClass, PATTERN_VARIABLE__ID_PATTERN);

		pattern_SetEClass = createEClass(PATTERN_SET);
		createEAttribute(pattern_SetEClass, PATTERN_SET__ID_PATTERN);

		pattern_NumericalOperatorEClass = createEClass(PATTERN_NUMERICAL_OPERATOR);
		createEAttribute(pattern_NumericalOperatorEClass, PATTERN_NUMERICAL_OPERATOR__ID_PATTERN);

		pattern_BooleanOperatorEClass = createEClass(PATTERN_BOOLEAN_OPERATOR);
		createEAttribute(pattern_BooleanOperatorEClass, PATTERN_BOOLEAN_OPERATOR__ID_PATTERN);

		pattern_ValueEClass = createEClass(PATTERN_VALUE);
		createEAttribute(pattern_ValueEClass, PATTERN_VALUE__ID_PATTERN);

		pattern_ConstantEClass = createEClass(PATTERN_CONSTANT);
		createEAttribute(pattern_ConstantEClass, PATTERN_CONSTANT__ID_PATTERN);

		pattern_IfEClass = createEClass(PATTERN_IF);
		createEAttribute(pattern_IfEClass, PATTERN_IF__ID_PATTERN);

		pattern_FunctionEClass = createEClass(PATTERN_FUNCTION);
		createEAttribute(pattern_FunctionEClass, PATTERN_FUNCTION__ID_PATTERN);

		pattern_ParameterDefinitionEClass = createEClass(PATTERN_PARAMETER_DEFINITION);
		createEAttribute(pattern_ParameterDefinitionEClass, PATTERN_PARAMETER_DEFINITION__ID_PATTERN);

		pattern_ParameterEClass = createEClass(PATTERN_PARAMETER);
		createEAttribute(pattern_ParameterEClass, PATTERN_PARAMETER__ID_PATTERN);

		pattern_FunctionCallEClass = createEClass(PATTERN_FUNCTION_CALL);
		createEAttribute(pattern_FunctionCallEClass, PATTERN_FUNCTION_CALL__ID_PATTERN);

		pattern_ParameterCallEClass = createEClass(PATTERN_PARAMETER_CALL);
		createEAttribute(pattern_ParameterCallEClass, PATTERN_PARAMETER_CALL__ID_PATTERN);

		pattern_DomainSpecificDiffEClass = createEClass(PATTERN_DOMAIN_SPECIFIC_DIFF);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN);

		pattern_DiffHardwareEClass = createEClass(PATTERN_DIFF_HARDWARE);
		createEAttribute(pattern_DiffHardwareEClass, PATTERN_DIFF_HARDWARE__ID_PATTERN);

		pattern_DiffHardware_platformsEClass = createEClass(PATTERN_DIFF_HARDWARE_PLATFORMS);
		createEAttribute(pattern_DiffHardware_platformsEClass, PATTERN_DIFF_HARDWARE_PLATFORMS__ID_PATTERN);

		pattern_DiffHardware_modulesEClass = createEClass(PATTERN_DIFF_HARDWARE_MODULES);
		createEAttribute(pattern_DiffHardware_modulesEClass, PATTERN_DIFF_HARDWARE_MODULES__ID_PATTERN);

		pattern_DiffHardware_connectorsEClass = createEClass(PATTERN_DIFF_HARDWARE_CONNECTORS);
		createEAttribute(pattern_DiffHardware_connectorsEClass, PATTERN_DIFF_HARDWARE_CONNECTORS__ID_PATTERN);

		pattern_DiffPlatformEClass = createEClass(PATTERN_DIFF_PLATFORM);
		createEAttribute(pattern_DiffPlatformEClass, PATTERN_DIFF_PLATFORM__ID_PATTERN);

		pattern_DiffPlatform_digitalPinsEClass = createEClass(PATTERN_DIFF_PLATFORM_DIGITAL_PINS);
		createEAttribute(pattern_DiffPlatform_digitalPinsEClass, PATTERN_DIFF_PLATFORM_DIGITAL_PINS__ID_PATTERN);

		pattern_DiffPlatform_analogPinsEClass = createEClass(PATTERN_DIFF_PLATFORM_ANALOG_PINS);
		createEAttribute(pattern_DiffPlatform_analogPinsEClass, PATTERN_DIFF_PLATFORM_ANALOG_PINS__ID_PATTERN);

		pattern_DiffDigitalPinEClass = createEClass(PATTERN_DIFF_DIGITAL_PIN);
		createEAttribute(pattern_DiffDigitalPinEClass, PATTERN_DIFF_DIGITAL_PIN__ID_PATTERN);

		pattern_DiffAnalogPinEClass = createEClass(PATTERN_DIFF_ANALOG_PIN);
		createEAttribute(pattern_DiffAnalogPinEClass, PATTERN_DIFF_ANALOG_PIN__ID_PATTERN);

		pattern_DiffSketchEClass = createEClass(PATTERN_DIFF_SKETCH);
		createEAttribute(pattern_DiffSketchEClass, PATTERN_DIFF_SKETCH__ID_PATTERN);

		pattern_DiffSketch_hardwareEClass = createEClass(PATTERN_DIFF_SKETCH_HARDWARE);
		createEAttribute(pattern_DiffSketch_hardwareEClass, PATTERN_DIFF_SKETCH_HARDWARE__ID_PATTERN);

		pattern_DiffSketch_instructionsEClass = createEClass(PATTERN_DIFF_SKETCH_INSTRUCTIONS);
		createEAttribute(pattern_DiffSketch_instructionsEClass, PATTERN_DIFF_SKETCH_INSTRUCTIONS__ID_PATTERN);

		pattern_DiffSketch_functionsEClass = createEClass(PATTERN_DIFF_SKETCH_FUNCTIONS);
		createEAttribute(pattern_DiffSketch_functionsEClass, PATTERN_DIFF_SKETCH_FUNCTIONS__ID_PATTERN);

		pattern_DiffProjectEClass = createEClass(PATTERN_DIFF_PROJECT);
		createEAttribute(pattern_DiffProjectEClass, PATTERN_DIFF_PROJECT__ID_PATTERN);

		pattern_DiffProject_hardwareEClass = createEClass(PATTERN_DIFF_PROJECT_HARDWARE);
		createEAttribute(pattern_DiffProject_hardwareEClass, PATTERN_DIFF_PROJECT_HARDWARE__ID_PATTERN);

		pattern_DiffProject_sketchEClass = createEClass(PATTERN_DIFF_PROJECT_SKETCH);
		createEAttribute(pattern_DiffProject_sketchEClass, PATTERN_DIFF_PROJECT_SKETCH__ID_PATTERN);

		pattern_DiffProject_modulesEClass = createEClass(PATTERN_DIFF_PROJECT_MODULES);
		createEAttribute(pattern_DiffProject_modulesEClass, PATTERN_DIFF_PROJECT_MODULES__ID_PATTERN);

		pattern_DiffProject_platformEClass = createEClass(PATTERN_DIFF_PROJECT_PLATFORM);
		createEAttribute(pattern_DiffProject_platformEClass, PATTERN_DIFF_PROJECT_PLATFORM__ID_PATTERN);

		pattern_DiffProject_domainspecificdiffsEClass = createEClass(PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS);
		createEAttribute(pattern_DiffProject_domainspecificdiffsEClass, PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS__ID_PATTERN);

		pattern_DiffInstruction_previousEClass = createEClass(PATTERN_DIFF_INSTRUCTION_PREVIOUS);
		createEAttribute(pattern_DiffInstruction_previousEClass, PATTERN_DIFF_INSTRUCTION_PREVIOUS__ID_PATTERN);

		pattern_DiffInstruction_nextEClass = createEClass(PATTERN_DIFF_INSTRUCTION_NEXT);
		createEAttribute(pattern_DiffInstruction_nextEClass, PATTERN_DIFF_INSTRUCTION_NEXT__ID_PATTERN);

		pattern_DiffStatusEClass = createEClass(PATTERN_DIFF_STATUS);
		createEAttribute(pattern_DiffStatusEClass, PATTERN_DIFF_STATUS__ID_PATTERN);

		pattern_DiffStatus_sensorEClass = createEClass(PATTERN_DIFF_STATUS_SENSOR);
		createEAttribute(pattern_DiffStatus_sensorEClass, PATTERN_DIFF_STATUS_SENSOR__ID_PATTERN);

		pattern_DiffLevelEClass = createEClass(PATTERN_DIFF_LEVEL);
		createEAttribute(pattern_DiffLevelEClass, PATTERN_DIFF_LEVEL__ID_PATTERN);

		pattern_DiffLevel_levelEClass = createEClass(PATTERN_DIFF_LEVEL_LEVEL);
		createEAttribute(pattern_DiffLevel_levelEClass, PATTERN_DIFF_LEVEL_LEVEL__ID_PATTERN);

		pattern_DiffModuleInstruction_moduleEClass = createEClass(PATTERN_DIFF_MODULE_INSTRUCTION_MODULE);
		createEAttribute(pattern_DiffModuleInstruction_moduleEClass, PATTERN_DIFF_MODULE_INSTRUCTION_MODULE__ID_PATTERN);

		pattern_DiffControl_instructionsEClass = createEClass(PATTERN_DIFF_CONTROL_INSTRUCTIONS);
		createEAttribute(pattern_DiffControl_instructionsEClass, PATTERN_DIFF_CONTROL_INSTRUCTIONS__ID_PATTERN);

		pattern_DiffDelayEClass = createEClass(PATTERN_DIFF_DELAY);
		createEAttribute(pattern_DiffDelayEClass, PATTERN_DIFF_DELAY__ID_PATTERN);

		pattern_DiffInputModuleEClass = createEClass(PATTERN_DIFF_INPUT_MODULE);
		createEAttribute(pattern_DiffInputModuleEClass, PATTERN_DIFF_INPUT_MODULE__ID_PATTERN);

		pattern_DiffOutputModuleEClass = createEClass(PATTERN_DIFF_OUTPUT_MODULE);
		createEAttribute(pattern_DiffOutputModuleEClass, PATTERN_DIFF_OUTPUT_MODULE__ID_PATTERN);

		pattern_DiffConnectorEClass = createEClass(PATTERN_DIFF_CONNECTOR);
		createEAttribute(pattern_DiffConnectorEClass, PATTERN_DIFF_CONNECTOR__ID_PATTERN);

		pattern_DiffConnector_pinEClass = createEClass(PATTERN_DIFF_CONNECTOR_PIN);
		createEAttribute(pattern_DiffConnector_pinEClass, PATTERN_DIFF_CONNECTOR_PIN__ID_PATTERN);

		pattern_DiffConnector_moduleEClass = createEClass(PATTERN_DIFF_CONNECTOR_MODULE);
		createEAttribute(pattern_DiffConnector_moduleEClass, PATTERN_DIFF_CONNECTOR_MODULE__ID_PATTERN);

		pattern_DiffRepeatEClass = createEClass(PATTERN_DIFF_REPEAT);
		createEAttribute(pattern_DiffRepeatEClass, PATTERN_DIFF_REPEAT__ID_PATTERN);

		pattern_DiffSensorEClass = createEClass(PATTERN_DIFF_SENSOR);
		createEAttribute(pattern_DiffSensorEClass, PATTERN_DIFF_SENSOR__ID_PATTERN);

		pattern_DiffSensor_statusEClass = createEClass(PATTERN_DIFF_SENSOR_STATUS);
		createEAttribute(pattern_DiffSensor_statusEClass, PATTERN_DIFF_SENSOR_STATUS__ID_PATTERN);

		pattern_DiffWhileEClass = createEClass(PATTERN_DIFF_WHILE);
		createEAttribute(pattern_DiffWhileEClass, PATTERN_DIFF_WHILE__ID_PATTERN);

		pattern_DiffWhile_conditionEClass = createEClass(PATTERN_DIFF_WHILE_CONDITION);
		createEAttribute(pattern_DiffWhile_conditionEClass, PATTERN_DIFF_WHILE_CONDITION__ID_PATTERN);

		pattern_DiffMathOperator_leftEClass = createEClass(PATTERN_DIFF_MATH_OPERATOR_LEFT);
		createEAttribute(pattern_DiffMathOperator_leftEClass, PATTERN_DIFF_MATH_OPERATOR_LEFT__ID_PATTERN);

		pattern_DiffMathOperator_rightEClass = createEClass(PATTERN_DIFF_MATH_OPERATOR_RIGHT);
		createEAttribute(pattern_DiffMathOperator_rightEClass, PATTERN_DIFF_MATH_OPERATOR_RIGHT__ID_PATTERN);

		pattern_DiffVariableEClass = createEClass(PATTERN_DIFF_VARIABLE);
		createEAttribute(pattern_DiffVariableEClass, PATTERN_DIFF_VARIABLE__ID_PATTERN);

		pattern_DiffSetEClass = createEClass(PATTERN_DIFF_SET);
		createEAttribute(pattern_DiffSetEClass, PATTERN_DIFF_SET__ID_PATTERN);

		pattern_DiffSet_variableEClass = createEClass(PATTERN_DIFF_SET_VARIABLE);
		createEAttribute(pattern_DiffSet_variableEClass, PATTERN_DIFF_SET_VARIABLE__ID_PATTERN);

		pattern_DiffSet_valueEClass = createEClass(PATTERN_DIFF_SET_VALUE);
		createEAttribute(pattern_DiffSet_valueEClass, PATTERN_DIFF_SET_VALUE__ID_PATTERN);

		pattern_DiffNumericalOperatorEClass = createEClass(PATTERN_DIFF_NUMERICAL_OPERATOR);
		createEAttribute(pattern_DiffNumericalOperatorEClass, PATTERN_DIFF_NUMERICAL_OPERATOR__ID_PATTERN);

		pattern_DiffBooleanOperatorEClass = createEClass(PATTERN_DIFF_BOOLEAN_OPERATOR);
		createEAttribute(pattern_DiffBooleanOperatorEClass, PATTERN_DIFF_BOOLEAN_OPERATOR__ID_PATTERN);

		pattern_DiffConstantEClass = createEClass(PATTERN_DIFF_CONSTANT);
		createEAttribute(pattern_DiffConstantEClass, PATTERN_DIFF_CONSTANT__ID_PATTERN);

		pattern_DiffIfEClass = createEClass(PATTERN_DIFF_IF);
		createEAttribute(pattern_DiffIfEClass, PATTERN_DIFF_IF__ID_PATTERN);

		pattern_DiffIf_conditionEClass = createEClass(PATTERN_DIFF_IF_CONDITION);
		createEAttribute(pattern_DiffIf_conditionEClass, PATTERN_DIFF_IF_CONDITION__ID_PATTERN);

		pattern_DiffFunctionEClass = createEClass(PATTERN_DIFF_FUNCTION);
		createEAttribute(pattern_DiffFunctionEClass, PATTERN_DIFF_FUNCTION__ID_PATTERN);

		pattern_DiffFunction_paramDefsEClass = createEClass(PATTERN_DIFF_FUNCTION_PARAM_DEFS);
		createEAttribute(pattern_DiffFunction_paramDefsEClass, PATTERN_DIFF_FUNCTION_PARAM_DEFS__ID_PATTERN);

		pattern_DiffFunction_instructionsEClass = createEClass(PATTERN_DIFF_FUNCTION_INSTRUCTIONS);
		createEAttribute(pattern_DiffFunction_instructionsEClass, PATTERN_DIFF_FUNCTION_INSTRUCTIONS__ID_PATTERN);

		pattern_DiffParameterDefinitionEClass = createEClass(PATTERN_DIFF_PARAMETER_DEFINITION);
		createEAttribute(pattern_DiffParameterDefinitionEClass, PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN);

		pattern_DiffParameter_to_definitionEClass = createEClass(PATTERN_DIFF_PARAMETER_TO_DEFINITION);
		createEAttribute(pattern_DiffParameter_to_definitionEClass, PATTERN_DIFF_PARAMETER_TO_DEFINITION__ID_PATTERN);

		pattern_DiffFunctionCallEClass = createEClass(PATTERN_DIFF_FUNCTION_CALL);
		createEAttribute(pattern_DiffFunctionCallEClass, PATTERN_DIFF_FUNCTION_CALL__ID_PATTERN);

		pattern_DiffFunctionCall_definitionEClass = createEClass(PATTERN_DIFF_FUNCTION_CALL_DEFINITION);
		createEAttribute(pattern_DiffFunctionCall_definitionEClass, PATTERN_DIFF_FUNCTION_CALL_DEFINITION__ID_PATTERN);

		pattern_DiffFunctionCall_parametersEClass = createEClass(PATTERN_DIFF_FUNCTION_CALL_PARAMETERS);
		createEAttribute(pattern_DiffFunctionCall_parametersEClass, PATTERN_DIFF_FUNCTION_CALL_PARAMETERS__ID_PATTERN);

		pattern_DiffParameterCallEClass = createEClass(PATTERN_DIFF_PARAMETER_CALL);
		createEAttribute(pattern_DiffParameterCallEClass, PATTERN_DIFF_PARAMETER_CALL__ID_PATTERN);

		pattern_DiffParameterCall_definitionEClass = createEClass(PATTERN_DIFF_PARAMETER_CALL_DEFINITION);
		createEAttribute(pattern_DiffParameterCall_definitionEClass, PATTERN_DIFF_PARAMETER_CALL_DEFINITION__ID_PATTERN);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__PATTERN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArduinoDiffMMPackage theArduinoDiffMMPackage = (ArduinoDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_HardwareEClass.getESuperTypes().add(theArduinoDiffMMPackage.getHardware());
		pattern_PlatformEClass.getESuperTypes().add(theArduinoDiffMMPackage.getPlatform());
		pattern_ModuleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getModule());
		pattern_DigitalPinEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDigitalPin());
		pattern_PinEClass.getESuperTypes().add(theArduinoDiffMMPackage.getPin());
		pattern_AnalogPinEClass.getESuperTypes().add(theArduinoDiffMMPackage.getAnalogPin());
		pattern_SketchEClass.getESuperTypes().add(theArduinoDiffMMPackage.getSketch());
		pattern_ProjectEClass.getESuperTypes().add(theArduinoDiffMMPackage.getProject());
		pattern_InstructionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getInstruction());
		pattern_StatusEClass.getESuperTypes().add(theArduinoDiffMMPackage.getStatus());
		pattern_LevelEClass.getESuperTypes().add(theArduinoDiffMMPackage.getLevel());
		pattern_ModuleInstructionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getModuleInstruction());
		pattern_ControlEClass.getESuperTypes().add(theArduinoDiffMMPackage.getControl());
		pattern_UtilitiesEClass.getESuperTypes().add(theArduinoDiffMMPackage.getUtilities());
		pattern_IOEClass.getESuperTypes().add(theArduinoDiffMMPackage.getIO());
		pattern_DelayEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDelay());
		pattern_InputModuleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getInputModule());
		pattern_OutputModuleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getOutputModule());
		pattern_NamedElementEClass.getESuperTypes().add(theArduinoDiffMMPackage.getNamedElement());
		pattern_ConnectorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getConnector());
		pattern_RepeatEClass.getESuperTypes().add(theArduinoDiffMMPackage.getRepeat());
		pattern_SensorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getSensor());
		pattern_WhileEClass.getESuperTypes().add(theArduinoDiffMMPackage.getWhile());
		pattern_MathOperatorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getMathOperator());
		pattern_VariableEClass.getESuperTypes().add(theArduinoDiffMMPackage.getVariable());
		pattern_SetEClass.getESuperTypes().add(theArduinoDiffMMPackage.getSet());
		pattern_NumericalOperatorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getNumericalOperator());
		pattern_BooleanOperatorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getBooleanOperator());
		pattern_ValueEClass.getESuperTypes().add(theArduinoDiffMMPackage.getValue());
		pattern_ConstantEClass.getESuperTypes().add(theArduinoDiffMMPackage.getConstant());
		pattern_IfEClass.getESuperTypes().add(theArduinoDiffMMPackage.getIf());
		pattern_FunctionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getFunction());
		pattern_ParameterDefinitionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getParameterDefinition());
		pattern_ParameterEClass.getESuperTypes().add(theArduinoDiffMMPackage.getParameter());
		pattern_FunctionCallEClass.getESuperTypes().add(theArduinoDiffMMPackage.getFunctionCall());
		pattern_ParameterCallEClass.getESuperTypes().add(theArduinoDiffMMPackage.getParameterCall());
		pattern_DomainSpecificDiffEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDomainSpecificDiff());
		pattern_DiffHardwareEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffHardware());
		pattern_DiffHardware_platformsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffHardware_platforms());
		pattern_DiffHardware_modulesEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffHardware_modules());
		pattern_DiffHardware_connectorsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffHardware_connectors());
		pattern_DiffPlatformEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffPlatform());
		pattern_DiffPlatform_digitalPinsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffPlatform_digitalPins());
		pattern_DiffPlatform_analogPinsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffPlatform_analogPins());
		pattern_DiffDigitalPinEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffDigitalPin());
		pattern_DiffAnalogPinEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffAnalogPin());
		pattern_DiffSketchEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSketch());
		pattern_DiffSketch_hardwareEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSketch_hardware());
		pattern_DiffSketch_instructionsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSketch_instructions());
		pattern_DiffSketch_functionsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSketch_functions());
		pattern_DiffProjectEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffProject());
		pattern_DiffProject_hardwareEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffProject_hardware());
		pattern_DiffProject_sketchEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffProject_sketch());
		pattern_DiffProject_modulesEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffProject_modules());
		pattern_DiffProject_platformEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffProject_platform());
		pattern_DiffProject_domainspecificdiffsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffProject_domainspecificdiffs());
		pattern_DiffInstruction_previousEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffInstruction_previous());
		pattern_DiffInstruction_nextEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffInstruction_next());
		pattern_DiffStatusEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffStatus());
		pattern_DiffStatus_sensorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffStatus_sensor());
		pattern_DiffLevelEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffLevel());
		pattern_DiffLevel_levelEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffLevel_level());
		pattern_DiffModuleInstruction_moduleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffModuleInstruction_module());
		pattern_DiffControl_instructionsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffControl_instructions());
		pattern_DiffDelayEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffDelay());
		pattern_DiffInputModuleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffInputModule());
		pattern_DiffOutputModuleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffOutputModule());
		pattern_DiffConnectorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffConnector());
		pattern_DiffConnector_pinEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffConnector_pin());
		pattern_DiffConnector_moduleEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffConnector_module());
		pattern_DiffRepeatEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffRepeat());
		pattern_DiffSensorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSensor());
		pattern_DiffSensor_statusEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSensor_status());
		pattern_DiffWhileEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffWhile());
		pattern_DiffWhile_conditionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffWhile_condition());
		pattern_DiffMathOperator_leftEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffMathOperator_left());
		pattern_DiffMathOperator_rightEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffMathOperator_right());
		pattern_DiffVariableEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffVariable());
		pattern_DiffSetEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSet());
		pattern_DiffSet_variableEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSet_variable());
		pattern_DiffSet_valueEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffSet_value());
		pattern_DiffNumericalOperatorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffNumericalOperator());
		pattern_DiffBooleanOperatorEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffBooleanOperator());
		pattern_DiffConstantEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffConstant());
		pattern_DiffIfEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffIf());
		pattern_DiffIf_conditionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffIf_condition());
		pattern_DiffFunctionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffFunction());
		pattern_DiffFunction_paramDefsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffFunction_paramDefs());
		pattern_DiffFunction_instructionsEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffFunction_instructions());
		pattern_DiffParameterDefinitionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffParameterDefinition());
		pattern_DiffParameter_to_definitionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffParameter_to_definition());
		pattern_DiffFunctionCallEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffFunctionCall());
		pattern_DiffFunctionCall_definitionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffFunctionCall_definition());
		pattern_DiffFunctionCall_parametersEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffFunctionCall_parameters());
		pattern_DiffParameterCallEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffParameterCall());
		pattern_DiffParameterCall_definitionEClass.getESuperTypes().add(theArduinoDiffMMPackage.getDiffParameterCall_definition());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_HardwareEClass, Pattern_Hardware.class, "Pattern_Hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Hardware_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PlatformEClass, Pattern_Platform.class, "Pattern_Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Platform_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ModuleEClass, Pattern_Module.class, "Pattern_Module", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Module_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DigitalPinEClass, Pattern_DigitalPin.class, "Pattern_DigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DigitalPin_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PinEClass, Pattern_Pin.class, "Pattern_Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Pin_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_AnalogPinEClass, Pattern_AnalogPin.class, "Pattern_AnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_AnalogPin_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_AnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SketchEClass, Pattern_Sketch.class, "Pattern_Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Sketch_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ProjectEClass, Pattern_Project.class, "Pattern_Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Project_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_InstructionEClass, Pattern_Instruction.class, "Pattern_Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Instruction_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_StatusEClass, Pattern_Status.class, "Pattern_Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Status_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_LevelEClass, Pattern_Level.class, "Pattern_Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Level_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ModuleInstructionEClass, Pattern_ModuleInstruction.class, "Pattern_ModuleInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ModuleInstruction_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ModuleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ControlEClass, Pattern_Control.class, "Pattern_Control", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Control_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_UtilitiesEClass, Pattern_Utilities.class, "Pattern_Utilities", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Utilities_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Utilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_IOEClass, Pattern_IO.class, "Pattern_IO", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_IO_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_IO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DelayEClass, Pattern_Delay.class, "Pattern_Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Delay_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_InputModuleEClass, Pattern_InputModule.class, "Pattern_InputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_InputModule_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_InputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_OutputModuleEClass, Pattern_OutputModule.class, "Pattern_OutputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_OutputModule_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_OutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_NamedElementEClass, Pattern_NamedElement.class, "Pattern_NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_NamedElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ConnectorEClass, Pattern_Connector.class, "Pattern_Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Connector_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_RepeatEClass, Pattern_Repeat.class, "Pattern_Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Repeat_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SensorEClass, Pattern_Sensor.class, "Pattern_Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Sensor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_WhileEClass, Pattern_While.class, "Pattern_While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_While_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_MathOperatorEClass, Pattern_MathOperator.class, "Pattern_MathOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_MathOperator_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_MathOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_VariableEClass, Pattern_Variable.class, "Pattern_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Variable_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SetEClass, Pattern_Set.class, "Pattern_Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Set_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_NumericalOperatorEClass, Pattern_NumericalOperator.class, "Pattern_NumericalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_NumericalOperator_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_NumericalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_BooleanOperatorEClass, Pattern_BooleanOperator.class, "Pattern_BooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_BooleanOperator_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_BooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ValueEClass, Pattern_Value.class, "Pattern_Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Value_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ConstantEClass, Pattern_Constant.class, "Pattern_Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Constant_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_IfEClass, Pattern_If.class, "Pattern_If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_If_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FunctionEClass, Pattern_Function.class, "Pattern_Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Function_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ParameterDefinitionEClass, Pattern_ParameterDefinition.class, "Pattern_ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ParameterDefinition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ParameterEClass, Pattern_Parameter.class, "Pattern_Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Parameter_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FunctionCallEClass, Pattern_FunctionCall.class, "Pattern_FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_FunctionCall_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ParameterCallEClass, Pattern_ParameterCall.class, "Pattern_ParameterCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ParameterCall_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DomainSpecificDiffEClass, Pattern_DomainSpecificDiff.class, "Pattern_DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DomainSpecificDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffHardwareEClass, Pattern_DiffHardware.class, "Pattern_DiffHardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffHardware_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffHardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffHardware_platformsEClass, Pattern_DiffHardware_platforms.class, "Pattern_DiffHardware_platforms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffHardware_platforms_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffHardware_platforms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffHardware_modulesEClass, Pattern_DiffHardware_modules.class, "Pattern_DiffHardware_modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffHardware_modules_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffHardware_modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffHardware_connectorsEClass, Pattern_DiffHardware_connectors.class, "Pattern_DiffHardware_connectors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffHardware_connectors_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffHardware_connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlatformEClass, Pattern_DiffPlatform.class, "Pattern_DiffPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlatform_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlatform_digitalPinsEClass, Pattern_DiffPlatform_digitalPins.class, "Pattern_DiffPlatform_digitalPins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlatform_digitalPins_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPlatform_digitalPins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlatform_analogPinsEClass, Pattern_DiffPlatform_analogPins.class, "Pattern_DiffPlatform_analogPins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlatform_analogPins_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPlatform_analogPins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDigitalPinEClass, Pattern_DiffDigitalPin.class, "Pattern_DiffDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffDigitalPin_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffAnalogPinEClass, Pattern_DiffAnalogPin.class, "Pattern_DiffAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffAnalogPin_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSketchEClass, Pattern_DiffSketch.class, "Pattern_DiffSketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSketch_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSketch_hardwareEClass, Pattern_DiffSketch_hardware.class, "Pattern_DiffSketch_hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSketch_hardware_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSketch_hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSketch_instructionsEClass, Pattern_DiffSketch_instructions.class, "Pattern_DiffSketch_instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSketch_instructions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSketch_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSketch_functionsEClass, Pattern_DiffSketch_functions.class, "Pattern_DiffSketch_functions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSketch_functions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSketch_functions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffProjectEClass, Pattern_DiffProject.class, "Pattern_DiffProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffProject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffProject_hardwareEClass, Pattern_DiffProject_hardware.class, "Pattern_DiffProject_hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffProject_hardware_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffProject_hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffProject_sketchEClass, Pattern_DiffProject_sketch.class, "Pattern_DiffProject_sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffProject_sketch_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffProject_sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffProject_modulesEClass, Pattern_DiffProject_modules.class, "Pattern_DiffProject_modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffProject_modules_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffProject_modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffProject_platformEClass, Pattern_DiffProject_platform.class, "Pattern_DiffProject_platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffProject_platform_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffProject_platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffProject_domainspecificdiffsEClass, Pattern_DiffProject_domainspecificdiffs.class, "Pattern_DiffProject_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffProject_domainspecificdiffs_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffProject_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInstruction_previousEClass, Pattern_DiffInstruction_previous.class, "Pattern_DiffInstruction_previous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInstruction_previous_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInstruction_previous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInstruction_nextEClass, Pattern_DiffInstruction_next.class, "Pattern_DiffInstruction_next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInstruction_next_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInstruction_next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffStatusEClass, Pattern_DiffStatus.class, "Pattern_DiffStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffStatus_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffStatus_sensorEClass, Pattern_DiffStatus_sensor.class, "Pattern_DiffStatus_sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffStatus_sensor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffStatus_sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffLevelEClass, Pattern_DiffLevel.class, "Pattern_DiffLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffLevel_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffLevel_levelEClass, Pattern_DiffLevel_level.class, "Pattern_DiffLevel_level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffLevel_level_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffLevel_level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffModuleInstruction_moduleEClass, Pattern_DiffModuleInstruction_module.class, "Pattern_DiffModuleInstruction_module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffModuleInstruction_module_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffModuleInstruction_module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffControl_instructionsEClass, Pattern_DiffControl_instructions.class, "Pattern_DiffControl_instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffControl_instructions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffControl_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDelayEClass, Pattern_DiffDelay.class, "Pattern_DiffDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffDelay_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInputModuleEClass, Pattern_DiffInputModule.class, "Pattern_DiffInputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInputModule_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffOutputModuleEClass, Pattern_DiffOutputModule.class, "Pattern_DiffOutputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffOutputModule_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffConnectorEClass, Pattern_DiffConnector.class, "Pattern_DiffConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffConnector_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffConnector_pinEClass, Pattern_DiffConnector_pin.class, "Pattern_DiffConnector_pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffConnector_pin_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffConnector_pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffConnector_moduleEClass, Pattern_DiffConnector_module.class, "Pattern_DiffConnector_module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffConnector_module_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffConnector_module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffRepeatEClass, Pattern_DiffRepeat.class, "Pattern_DiffRepeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffRepeat_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSensorEClass, Pattern_DiffSensor.class, "Pattern_DiffSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSensor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSensor_statusEClass, Pattern_DiffSensor_status.class, "Pattern_DiffSensor_status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSensor_status_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSensor_status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffWhileEClass, Pattern_DiffWhile.class, "Pattern_DiffWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffWhile_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffWhile_conditionEClass, Pattern_DiffWhile_condition.class, "Pattern_DiffWhile_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffWhile_condition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffWhile_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffMathOperator_leftEClass, Pattern_DiffMathOperator_left.class, "Pattern_DiffMathOperator_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffMathOperator_left_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffMathOperator_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffMathOperator_rightEClass, Pattern_DiffMathOperator_right.class, "Pattern_DiffMathOperator_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffMathOperator_right_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffMathOperator_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffVariableEClass, Pattern_DiffVariable.class, "Pattern_DiffVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffVariable_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSetEClass, Pattern_DiffSet.class, "Pattern_DiffSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSet_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSet_variableEClass, Pattern_DiffSet_variable.class, "Pattern_DiffSet_variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSet_variable_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSet_variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffSet_valueEClass, Pattern_DiffSet_value.class, "Pattern_DiffSet_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffSet_value_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffSet_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffNumericalOperatorEClass, Pattern_DiffNumericalOperator.class, "Pattern_DiffNumericalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffNumericalOperator_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffNumericalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffBooleanOperatorEClass, Pattern_DiffBooleanOperator.class, "Pattern_DiffBooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffBooleanOperator_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffConstantEClass, Pattern_DiffConstant.class, "Pattern_DiffConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffConstant_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffIfEClass, Pattern_DiffIf.class, "Pattern_DiffIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffIf_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffIf_conditionEClass, Pattern_DiffIf_condition.class, "Pattern_DiffIf_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffIf_condition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffIf_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFunctionEClass, Pattern_DiffFunction.class, "Pattern_DiffFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFunction_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFunction_paramDefsEClass, Pattern_DiffFunction_paramDefs.class, "Pattern_DiffFunction_paramDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFunction_paramDefs_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFunction_paramDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFunction_instructionsEClass, Pattern_DiffFunction_instructions.class, "Pattern_DiffFunction_instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFunction_instructions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFunction_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffParameterDefinitionEClass, Pattern_DiffParameterDefinition.class, "Pattern_DiffParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffParameterDefinition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffParameter_to_definitionEClass, Pattern_DiffParameter_to_definition.class, "Pattern_DiffParameter_to_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffParameter_to_definition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffParameter_to_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFunctionCallEClass, Pattern_DiffFunctionCall.class, "Pattern_DiffFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFunctionCall_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFunctionCall_definitionEClass, Pattern_DiffFunctionCall_definition.class, "Pattern_DiffFunctionCall_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFunctionCall_definition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFunctionCall_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFunctionCall_parametersEClass, Pattern_DiffFunctionCall_parameters.class, "Pattern_DiffFunctionCall_parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFunctionCall_parameters_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFunctionCall_parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffParameterCallEClass, Pattern_DiffParameterCall.class, "Pattern_DiffParameterCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffParameterCall_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffParameterCall_definitionEClass, Pattern_DiffParameterCall_definition.class, "Pattern_DiffParameterCall_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffParameterCall_definition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffParameterCall_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pattern(), this.getPattern_Project(), null, "pattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinoRuleMMPackageImpl
