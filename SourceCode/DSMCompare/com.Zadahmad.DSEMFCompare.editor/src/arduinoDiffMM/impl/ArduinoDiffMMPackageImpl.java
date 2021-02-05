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
import arduinoDiffMM.Control;
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
import arduinoDiffMM.Instruction;
import arduinoDiffMM.Level;
import arduinoDiffMM.Library;
import arduinoDiffMM.MathOperator;
import arduinoDiffMM.ModuleInstruction;
import arduinoDiffMM.ModuleKind;
import arduinoDiffMM.NamedElement;
import arduinoDiffMM.NumericalOperator;
import arduinoDiffMM.OperatorKind;
import arduinoDiffMM.OutputModule;
import arduinoDiffMM.Parameter;
import arduinoDiffMM.ParameterCall;
import arduinoDiffMM.ParameterDefinition;
import arduinoDiffMM.ParameterType;
import arduinoDiffMM.Pin;
import arduinoDiffMM.Platform;
import arduinoDiffMM.Project;
import arduinoDiffMM.Repeat;
import arduinoDiffMM.Sensor;
import arduinoDiffMM.Set;
import arduinoDiffMM.Sketch;
import arduinoDiffMM.Status;
import arduinoDiffMM.Time;
import arduinoDiffMM.Utilities;
import arduinoDiffMM.Value;
import arduinoDiffMM.Variable;
import arduinoDiffMM.While;

import arduinoRuleMM.ArduinoRuleMMPackage;
import arduinoRuleMM.impl.ArduinoRuleMMPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoDiffMMPackageImpl extends EPackageImpl implements ArduinoDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffHardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffHardware_platformsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffHardware_modulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffHardware_connectorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPlatform_digitalPinsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPlatform_analogPinsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDigitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffAnalogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSketch_hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSketch_instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSketch_functionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffProject_hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffProject_sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffProject_modulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffProject_platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffProject_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffInstruction_previousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffInstruction_nextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffStatus_sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffLevel_levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffModuleInstruction_moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffControl_instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffInputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffOutputModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffConnector_pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffConnector_moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffRepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSensor_statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffWhile_conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffMathOperator_leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffMathOperator_rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSet_variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffSet_valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffNumericalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffBooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffIf_conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFunction_paramDefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFunction_instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffParameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffParameter_to_definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFunctionCall_definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFunctionCall_parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffParameterCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffParameterCall_definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum libraryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascOpEEnum = null;

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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoDiffMMPackageImpl() {
		super(eNS_URI, ArduinoDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArduinoDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoDiffMMPackage init() {
		if (isInited) return (ArduinoDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArduinoDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArduinoDiffMMPackageImpl theArduinoDiffMMPackage = registeredArduinoDiffMMPackage instanceof ArduinoDiffMMPackageImpl ? (ArduinoDiffMMPackageImpl)registeredArduinoDiffMMPackage : new ArduinoDiffMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArduinoRuleMMPackage.eNS_URI);
		ArduinoRuleMMPackageImpl theArduinoRuleMMPackage = (ArduinoRuleMMPackageImpl)(registeredPackage instanceof ArduinoRuleMMPackageImpl ? registeredPackage : ArduinoRuleMMPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoDiffMMPackage.createPackageContents();
		theArduinoRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoDiffMMPackage.initializePackageContents();
		theArduinoRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoDiffMMPackage.eNS_URI, theArduinoDiffMMPackage);
		return theArduinoDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHardware() {
		return hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Platforms() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Modules() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Connectors() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Diffplatforms() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Diffmodules() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Diffconnectors() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_DigitalPins() {
		return (EReference)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_AnalogPins() {
		return (EReference)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_Image() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_DiffdigitalPins() {
		return (EReference)platformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_DiffanalogPins() {
		return (EReference)platformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_Kind() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_Image() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_Level() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_Library() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalPin() {
		return digitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Id() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalogPin() {
		return analogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSketch_Hardware() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSketch_Instructions() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSketch_Functions() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSketch_Diffhardware() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSketch_Diffinstructions() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSketch_Difffunctions() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Hardware() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Sketch() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Modules() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Platform() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Domainspecificdiffs() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Diffhardware() {
		return (EReference)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Diffsketch() {
		return (EReference)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Diffmodules() {
		return (EReference)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Diffplatform() {
		return (EReference)projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Diffdomainspecificdiffs() {
		return (EReference)projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstruction_Previous() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstruction_Next() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstruction_Diffprevious() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstruction_Diffnext() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatus_Status() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatus_Sensor() {
		return (EReference)statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatus_Diffsensor() {
		return (EReference)statusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevel() {
		return levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevel_Level() {
		return (EReference)levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevel_Difflevel() {
		return (EReference)levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleInstruction() {
		return moduleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstruction_Module() {
		return (EReference)moduleInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstruction_Diffmodule() {
		return (EReference)moduleInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Instructions() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Diffinstructions() {
		return (EReference)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUtilities() {
		return utilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIO() {
		return ioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelay_Unit() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelay_Value() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputModule() {
		return inputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputModule() {
		return outputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Pin() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Module() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Diffpin() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Diffmodule() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepeat_Iteration() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensor_Status() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensor_Diffstatus() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhile_Condition() {
		return (EReference)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhile_Diffcondition() {
		return (EReference)whileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMathOperator() {
		return mathOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMathOperator_Left() {
		return (EReference)mathOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMathOperator_Right() {
		return (EReference)mathOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMathOperator_Operator() {
		return (EAttribute)mathOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMathOperator_Diffleft() {
		return (EReference)mathOperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMathOperator_Diffright() {
		return (EReference)mathOperatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSet_Variable() {
		return (EReference)setEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSet_Value() {
		return (EReference)setEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSet_Diffvariable() {
		return (EReference)setEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSet_Diffvalue() {
		return (EReference)setEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericalOperator() {
		return numericalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanOperator() {
		return booleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Value() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIf_Condition() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIf_Diffcondition() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_ParamDefs() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Instructions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_DiffparamDefs() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Diffinstructions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Type() {
		return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Name() {
		return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Definition() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Diffdefinition() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_Definition() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_Parameters() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_Diffdefinition() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_Diffparameters() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterCall() {
		return parameterCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterCall_Definition() {
		return (EReference)parameterCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterCall_Diffdefinition() {
		return (EReference)parameterCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainSpecificDiff() {
		return domainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainSpecificDiff_Name() {
		return (EAttribute)domainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Hardware() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Platform() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Module() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DigitalPin() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Pin() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_AnalogPin() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Sketch() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Instruction() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Status() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Level() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_ModuleInstruction() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Control() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Utilities() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_IO() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Delay() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_InputModule() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_OutputModule() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_NamedElement() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Connector() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Repeat() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Sensor() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_While() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_MathOperator() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Variable() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Set() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_NumericalOperator() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_BooleanOperator() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Value() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Constant() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_If() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Function() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_ParameterDefinition() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Parameter() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_FunctionCall() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_ParameterCall() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffHardware() {
		return diffHardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffHardware_Operation() {
		return (EAttribute)diffHardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffHardware_New_name() {
		return (EAttribute)diffHardwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffHardware_platforms() {
		return diffHardware_platformsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffHardware_platforms_Operation() {
		return (EAttribute)diffHardware_platformsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffHardware_platforms_EType() {
		return (EReference)diffHardware_platformsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffHardware_modules() {
		return diffHardware_modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffHardware_modules_Operation() {
		return (EAttribute)diffHardware_modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffHardware_modules_EType() {
		return (EReference)diffHardware_modulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffHardware_connectors() {
		return diffHardware_connectorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffHardware_connectors_Operation() {
		return (EAttribute)diffHardware_connectorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffHardware_connectors_EType() {
		return (EReference)diffHardware_connectorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffPlatform() {
		return diffPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffPlatform_Operation() {
		return (EAttribute)diffPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffPlatform_New_name() {
		return (EAttribute)diffPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffPlatform_New_image() {
		return (EAttribute)diffPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffPlatform_digitalPins() {
		return diffPlatform_digitalPinsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffPlatform_digitalPins_Operation() {
		return (EAttribute)diffPlatform_digitalPinsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffPlatform_digitalPins_EType() {
		return (EReference)diffPlatform_digitalPinsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffPlatform_analogPins() {
		return diffPlatform_analogPinsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffPlatform_analogPins_Operation() {
		return (EAttribute)diffPlatform_analogPinsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffPlatform_analogPins_EType() {
		return (EReference)diffPlatform_analogPinsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffDigitalPin() {
		return diffDigitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffDigitalPin_Operation() {
		return (EAttribute)diffDigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffDigitalPin_New_id() {
		return (EAttribute)diffDigitalPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffAnalogPin() {
		return diffAnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffAnalogPin_Operation() {
		return (EAttribute)diffAnalogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffAnalogPin_New_id() {
		return (EAttribute)diffAnalogPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSketch() {
		return diffSketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSketch_Operation() {
		return (EAttribute)diffSketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSketch_New_name() {
		return (EAttribute)diffSketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSketch_hardware() {
		return diffSketch_hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSketch_hardware_Operation() {
		return (EAttribute)diffSketch_hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffSketch_hardware_EType() {
		return (EReference)diffSketch_hardwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSketch_instructions() {
		return diffSketch_instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSketch_instructions_Operation() {
		return (EAttribute)diffSketch_instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffSketch_instructions_EType() {
		return (EReference)diffSketch_instructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSketch_functions() {
		return diffSketch_functionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSketch_functions_Operation() {
		return (EAttribute)diffSketch_functionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffSketch_functions_EType() {
		return (EReference)diffSketch_functionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffProject() {
		return diffProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffProject_Operation() {
		return (EAttribute)diffProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffProject_hardware() {
		return diffProject_hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffProject_hardware_Operation() {
		return (EAttribute)diffProject_hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffProject_hardware_EType() {
		return (EReference)diffProject_hardwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffProject_sketch() {
		return diffProject_sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffProject_sketch_Operation() {
		return (EAttribute)diffProject_sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffProject_sketch_EType() {
		return (EReference)diffProject_sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffProject_modules() {
		return diffProject_modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffProject_modules_Operation() {
		return (EAttribute)diffProject_modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffProject_modules_EType() {
		return (EReference)diffProject_modulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffProject_platform() {
		return diffProject_platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffProject_platform_Operation() {
		return (EAttribute)diffProject_platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffProject_platform_EType() {
		return (EReference)diffProject_platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffProject_domainspecificdiffs() {
		return diffProject_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffProject_domainspecificdiffs_Operation() {
		return (EAttribute)diffProject_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffProject_domainspecificdiffs_EType() {
		return (EReference)diffProject_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffInstruction_previous() {
		return diffInstruction_previousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInstruction_previous_Operation() {
		return (EAttribute)diffInstruction_previousEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffInstruction_previous_EType() {
		return (EReference)diffInstruction_previousEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffInstruction_next() {
		return diffInstruction_nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInstruction_next_Operation() {
		return (EAttribute)diffInstruction_nextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffInstruction_next_EType() {
		return (EReference)diffInstruction_nextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffStatus() {
		return diffStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffStatus_Operation() {
		return (EAttribute)diffStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffStatus_New_value() {
		return (EAttribute)diffStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffStatus_New_status() {
		return (EAttribute)diffStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffStatus_sensor() {
		return diffStatus_sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffStatus_sensor_Operation() {
		return (EAttribute)diffStatus_sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffStatus_sensor_EType() {
		return (EReference)diffStatus_sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffLevel() {
		return diffLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffLevel_Operation() {
		return (EAttribute)diffLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffLevel_level() {
		return diffLevel_levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffLevel_level_Operation() {
		return (EAttribute)diffLevel_levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffLevel_level_EType() {
		return (EReference)diffLevel_levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffModuleInstruction_module() {
		return diffModuleInstruction_moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffModuleInstruction_module_Operation() {
		return (EAttribute)diffModuleInstruction_moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffModuleInstruction_module_EType() {
		return (EReference)diffModuleInstruction_moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffControl_instructions() {
		return diffControl_instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffControl_instructions_Operation() {
		return (EAttribute)diffControl_instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffControl_instructions_EType() {
		return (EReference)diffControl_instructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffDelay() {
		return diffDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffDelay_Operation() {
		return (EAttribute)diffDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffDelay_New_unit() {
		return (EAttribute)diffDelayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffDelay_New_value() {
		return (EAttribute)diffDelayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffInputModule() {
		return diffInputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInputModule_Operation() {
		return (EAttribute)diffInputModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInputModule_New_name() {
		return (EAttribute)diffInputModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInputModule_New_kind() {
		return (EAttribute)diffInputModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInputModule_New_image() {
		return (EAttribute)diffInputModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInputModule_New_level() {
		return (EAttribute)diffInputModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffInputModule_New_library() {
		return (EAttribute)diffInputModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffOutputModule() {
		return diffOutputModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffOutputModule_Operation() {
		return (EAttribute)diffOutputModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffOutputModule_New_name() {
		return (EAttribute)diffOutputModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffOutputModule_New_kind() {
		return (EAttribute)diffOutputModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffOutputModule_New_image() {
		return (EAttribute)diffOutputModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffOutputModule_New_level() {
		return (EAttribute)diffOutputModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffOutputModule_New_library() {
		return (EAttribute)diffOutputModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffConnector() {
		return diffConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffConnector_Operation() {
		return (EAttribute)diffConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffConnector_pin() {
		return diffConnector_pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffConnector_pin_Operation() {
		return (EAttribute)diffConnector_pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffConnector_pin_EType() {
		return (EReference)diffConnector_pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffConnector_module() {
		return diffConnector_moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffConnector_module_Operation() {
		return (EAttribute)diffConnector_moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffConnector_module_EType() {
		return (EReference)diffConnector_moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffRepeat() {
		return diffRepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffRepeat_Operation() {
		return (EAttribute)diffRepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffRepeat_New_iteration() {
		return (EAttribute)diffRepeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSensor() {
		return diffSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSensor_Operation() {
		return (EAttribute)diffSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSensor_New_value() {
		return (EAttribute)diffSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSensor_New_operator() {
		return (EAttribute)diffSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSensor_status() {
		return diffSensor_statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSensor_status_Operation() {
		return (EAttribute)diffSensor_statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffSensor_status_EType() {
		return (EReference)diffSensor_statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffWhile() {
		return diffWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffWhile_Operation() {
		return (EAttribute)diffWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffWhile_condition() {
		return diffWhile_conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffWhile_condition_Operation() {
		return (EAttribute)diffWhile_conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffWhile_condition_EType() {
		return (EReference)diffWhile_conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffMathOperator_left() {
		return diffMathOperator_leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffMathOperator_left_Operation() {
		return (EAttribute)diffMathOperator_leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffMathOperator_left_EType() {
		return (EReference)diffMathOperator_leftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffMathOperator_right() {
		return diffMathOperator_rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffMathOperator_right_Operation() {
		return (EAttribute)diffMathOperator_rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffMathOperator_right_EType() {
		return (EReference)diffMathOperator_rightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffVariable() {
		return diffVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffVariable_Operation() {
		return (EAttribute)diffVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffVariable_New_value() {
		return (EAttribute)diffVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffVariable_New_name() {
		return (EAttribute)diffVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSet() {
		return diffSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSet_Operation() {
		return (EAttribute)diffSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSet_variable() {
		return diffSet_variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSet_variable_Operation() {
		return (EAttribute)diffSet_variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffSet_variable_EType() {
		return (EReference)diffSet_variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffSet_value() {
		return diffSet_valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffSet_value_Operation() {
		return (EAttribute)diffSet_valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffSet_value_EType() {
		return (EReference)diffSet_valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffNumericalOperator() {
		return diffNumericalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffNumericalOperator_Operation() {
		return (EAttribute)diffNumericalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffNumericalOperator_New_value() {
		return (EAttribute)diffNumericalOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffNumericalOperator_New_operator() {
		return (EAttribute)diffNumericalOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffBooleanOperator() {
		return diffBooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffBooleanOperator_Operation() {
		return (EAttribute)diffBooleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffBooleanOperator_New_value() {
		return (EAttribute)diffBooleanOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffBooleanOperator_New_operator() {
		return (EAttribute)diffBooleanOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffConstant() {
		return diffConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffConstant_Operation() {
		return (EAttribute)diffConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffConstant_New_value() {
		return (EAttribute)diffConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffIf() {
		return diffIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffIf_Operation() {
		return (EAttribute)diffIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffIf_condition() {
		return diffIf_conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffIf_condition_Operation() {
		return (EAttribute)diffIf_conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffIf_condition_EType() {
		return (EReference)diffIf_conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffFunction() {
		return diffFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunction_Operation() {
		return (EAttribute)diffFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunction_New_name() {
		return (EAttribute)diffFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffFunction_paramDefs() {
		return diffFunction_paramDefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunction_paramDefs_Operation() {
		return (EAttribute)diffFunction_paramDefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffFunction_paramDefs_EType() {
		return (EReference)diffFunction_paramDefsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffFunction_instructions() {
		return diffFunction_instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunction_instructions_Operation() {
		return (EAttribute)diffFunction_instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffFunction_instructions_EType() {
		return (EReference)diffFunction_instructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffParameterDefinition() {
		return diffParameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffParameterDefinition_Operation() {
		return (EAttribute)diffParameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffParameterDefinition_New_type() {
		return (EAttribute)diffParameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffParameterDefinition_New_name() {
		return (EAttribute)diffParameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffParameter_to_definition() {
		return diffParameter_to_definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffParameter_to_definition_Operation() {
		return (EAttribute)diffParameter_to_definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffParameter_to_definition_EType() {
		return (EReference)diffParameter_to_definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffFunctionCall() {
		return diffFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunctionCall_Operation() {
		return (EAttribute)diffFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffFunctionCall_definition() {
		return diffFunctionCall_definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunctionCall_definition_Operation() {
		return (EAttribute)diffFunctionCall_definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffFunctionCall_definition_EType() {
		return (EReference)diffFunctionCall_definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffFunctionCall_parameters() {
		return diffFunctionCall_parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffFunctionCall_parameters_Operation() {
		return (EAttribute)diffFunctionCall_parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffFunctionCall_parameters_EType() {
		return (EReference)diffFunctionCall_parametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffParameterCall() {
		return diffParameterCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffParameterCall_Operation() {
		return (EAttribute)diffParameterCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffParameterCall_definition() {
		return diffParameterCall_definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffParameterCall_definition_Operation() {
		return (EAttribute)diffParameterCall_definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffParameterCall_definition_EType() {
		return (EReference)diffParameterCall_definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTime() {
		return timeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModuleKind() {
		return moduleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperatorKind() {
		return operatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLibrary() {
		return libraryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClassOp() {
		return classOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAscOp() {
		return ascOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoDiffMMFactory getArduinoDiffMMFactory() {
		return (ArduinoDiffMMFactory)getEFactoryInstance();
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
		hardwareEClass = createEClass(HARDWARE);
		createEReference(hardwareEClass, HARDWARE__PLATFORMS);
		createEReference(hardwareEClass, HARDWARE__MODULES);
		createEReference(hardwareEClass, HARDWARE__CONNECTORS);
		createEReference(hardwareEClass, HARDWARE__DIFFPLATFORMS);
		createEReference(hardwareEClass, HARDWARE__DIFFMODULES);
		createEReference(hardwareEClass, HARDWARE__DIFFCONNECTORS);

		platformEClass = createEClass(PLATFORM);
		createEReference(platformEClass, PLATFORM__DIGITAL_PINS);
		createEReference(platformEClass, PLATFORM__ANALOG_PINS);
		createEAttribute(platformEClass, PLATFORM__IMAGE);
		createEReference(platformEClass, PLATFORM__DIFFDIGITAL_PINS);
		createEReference(platformEClass, PLATFORM__DIFFANALOG_PINS);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__KIND);
		createEAttribute(moduleEClass, MODULE__IMAGE);
		createEAttribute(moduleEClass, MODULE__LEVEL);
		createEAttribute(moduleEClass, MODULE__LIBRARY);

		digitalPinEClass = createEClass(DIGITAL_PIN);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__ID);

		analogPinEClass = createEClass(ANALOG_PIN);

		sketchEClass = createEClass(SKETCH);
		createEReference(sketchEClass, SKETCH__HARDWARE);
		createEReference(sketchEClass, SKETCH__INSTRUCTIONS);
		createEReference(sketchEClass, SKETCH__FUNCTIONS);
		createEReference(sketchEClass, SKETCH__DIFFHARDWARE);
		createEReference(sketchEClass, SKETCH__DIFFINSTRUCTIONS);
		createEReference(sketchEClass, SKETCH__DIFFFUNCTIONS);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__HARDWARE);
		createEReference(projectEClass, PROJECT__SKETCH);
		createEReference(projectEClass, PROJECT__MODULES);
		createEReference(projectEClass, PROJECT__PLATFORM);
		createEReference(projectEClass, PROJECT__DOMAINSPECIFICDIFFS);
		createEReference(projectEClass, PROJECT__DIFFHARDWARE);
		createEReference(projectEClass, PROJECT__DIFFSKETCH);
		createEReference(projectEClass, PROJECT__DIFFMODULES);
		createEReference(projectEClass, PROJECT__DIFFPLATFORM);
		createEReference(projectEClass, PROJECT__DIFFDOMAINSPECIFICDIFFS);

		instructionEClass = createEClass(INSTRUCTION);
		createEReference(instructionEClass, INSTRUCTION__PREVIOUS);
		createEReference(instructionEClass, INSTRUCTION__NEXT);
		createEReference(instructionEClass, INSTRUCTION__DIFFPREVIOUS);
		createEReference(instructionEClass, INSTRUCTION__DIFFNEXT);

		statusEClass = createEClass(STATUS);
		createEAttribute(statusEClass, STATUS__STATUS);
		createEReference(statusEClass, STATUS__SENSOR);
		createEReference(statusEClass, STATUS__DIFFSENSOR);

		levelEClass = createEClass(LEVEL);
		createEReference(levelEClass, LEVEL__LEVEL);
		createEReference(levelEClass, LEVEL__DIFFLEVEL);

		moduleInstructionEClass = createEClass(MODULE_INSTRUCTION);
		createEReference(moduleInstructionEClass, MODULE_INSTRUCTION__MODULE);
		createEReference(moduleInstructionEClass, MODULE_INSTRUCTION__DIFFMODULE);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__INSTRUCTIONS);
		createEReference(controlEClass, CONTROL__DIFFINSTRUCTIONS);

		utilitiesEClass = createEClass(UTILITIES);

		ioEClass = createEClass(IO);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__UNIT);
		createEAttribute(delayEClass, DELAY__VALUE);

		inputModuleEClass = createEClass(INPUT_MODULE);

		outputModuleEClass = createEClass(OUTPUT_MODULE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__PIN);
		createEReference(connectorEClass, CONNECTOR__MODULE);
		createEReference(connectorEClass, CONNECTOR__DIFFPIN);
		createEReference(connectorEClass, CONNECTOR__DIFFMODULE);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__ITERATION);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__STATUS);
		createEReference(sensorEClass, SENSOR__DIFFSTATUS);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__CONDITION);
		createEReference(whileEClass, WHILE__DIFFCONDITION);

		mathOperatorEClass = createEClass(MATH_OPERATOR);
		createEReference(mathOperatorEClass, MATH_OPERATOR__LEFT);
		createEReference(mathOperatorEClass, MATH_OPERATOR__RIGHT);
		createEAttribute(mathOperatorEClass, MATH_OPERATOR__OPERATOR);
		createEReference(mathOperatorEClass, MATH_OPERATOR__DIFFLEFT);
		createEReference(mathOperatorEClass, MATH_OPERATOR__DIFFRIGHT);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		setEClass = createEClass(SET);
		createEReference(setEClass, SET__VARIABLE);
		createEReference(setEClass, SET__VALUE);
		createEReference(setEClass, SET__DIFFVARIABLE);
		createEReference(setEClass, SET__DIFFVALUE);

		numericalOperatorEClass = createEClass(NUMERICAL_OPERATOR);

		booleanOperatorEClass = createEClass(BOOLEAN_OPERATOR);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__VALUE);

		constantEClass = createEClass(CONSTANT);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__DIFFCONDITION);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEReference(functionEClass, FUNCTION__PARAM_DEFS);
		createEReference(functionEClass, FUNCTION__INSTRUCTIONS);
		createEReference(functionEClass, FUNCTION__DIFFPARAM_DEFS);
		createEReference(functionEClass, FUNCTION__DIFFINSTRUCTIONS);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__DEFINITION);
		createEReference(parameterEClass, PARAMETER__DIFFDEFINITION);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEReference(functionCallEClass, FUNCTION_CALL__DEFINITION);
		createEReference(functionCallEClass, FUNCTION_CALL__PARAMETERS);
		createEReference(functionCallEClass, FUNCTION_CALL__DIFFDEFINITION);
		createEReference(functionCallEClass, FUNCTION_CALL__DIFFPARAMETERS);

		parameterCallEClass = createEClass(PARAMETER_CALL);
		createEReference(parameterCallEClass, PARAMETER_CALL__DEFINITION);
		createEReference(parameterCallEClass, PARAMETER_CALL__DIFFDEFINITION);

		domainSpecificDiffEClass = createEClass(DOMAIN_SPECIFIC_DIFF);
		createEAttribute(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__NAME);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL);

		diffHardwareEClass = createEClass(DIFF_HARDWARE);
		createEAttribute(diffHardwareEClass, DIFF_HARDWARE__OPERATION);
		createEAttribute(diffHardwareEClass, DIFF_HARDWARE__NEW_NAME);

		diffHardware_platformsEClass = createEClass(DIFF_HARDWARE_PLATFORMS);
		createEAttribute(diffHardware_platformsEClass, DIFF_HARDWARE_PLATFORMS__OPERATION);
		createEReference(diffHardware_platformsEClass, DIFF_HARDWARE_PLATFORMS__ETYPE);

		diffHardware_modulesEClass = createEClass(DIFF_HARDWARE_MODULES);
		createEAttribute(diffHardware_modulesEClass, DIFF_HARDWARE_MODULES__OPERATION);
		createEReference(diffHardware_modulesEClass, DIFF_HARDWARE_MODULES__ETYPE);

		diffHardware_connectorsEClass = createEClass(DIFF_HARDWARE_CONNECTORS);
		createEAttribute(diffHardware_connectorsEClass, DIFF_HARDWARE_CONNECTORS__OPERATION);
		createEReference(diffHardware_connectorsEClass, DIFF_HARDWARE_CONNECTORS__ETYPE);

		diffPlatformEClass = createEClass(DIFF_PLATFORM);
		createEAttribute(diffPlatformEClass, DIFF_PLATFORM__OPERATION);
		createEAttribute(diffPlatformEClass, DIFF_PLATFORM__NEW_NAME);
		createEAttribute(diffPlatformEClass, DIFF_PLATFORM__NEW_IMAGE);

		diffPlatform_digitalPinsEClass = createEClass(DIFF_PLATFORM_DIGITAL_PINS);
		createEAttribute(diffPlatform_digitalPinsEClass, DIFF_PLATFORM_DIGITAL_PINS__OPERATION);
		createEReference(diffPlatform_digitalPinsEClass, DIFF_PLATFORM_DIGITAL_PINS__ETYPE);

		diffPlatform_analogPinsEClass = createEClass(DIFF_PLATFORM_ANALOG_PINS);
		createEAttribute(diffPlatform_analogPinsEClass, DIFF_PLATFORM_ANALOG_PINS__OPERATION);
		createEReference(diffPlatform_analogPinsEClass, DIFF_PLATFORM_ANALOG_PINS__ETYPE);

		diffDigitalPinEClass = createEClass(DIFF_DIGITAL_PIN);
		createEAttribute(diffDigitalPinEClass, DIFF_DIGITAL_PIN__OPERATION);
		createEAttribute(diffDigitalPinEClass, DIFF_DIGITAL_PIN__NEW_ID);

		diffAnalogPinEClass = createEClass(DIFF_ANALOG_PIN);
		createEAttribute(diffAnalogPinEClass, DIFF_ANALOG_PIN__OPERATION);
		createEAttribute(diffAnalogPinEClass, DIFF_ANALOG_PIN__NEW_ID);

		diffSketchEClass = createEClass(DIFF_SKETCH);
		createEAttribute(diffSketchEClass, DIFF_SKETCH__OPERATION);
		createEAttribute(diffSketchEClass, DIFF_SKETCH__NEW_NAME);

		diffSketch_hardwareEClass = createEClass(DIFF_SKETCH_HARDWARE);
		createEAttribute(diffSketch_hardwareEClass, DIFF_SKETCH_HARDWARE__OPERATION);
		createEReference(diffSketch_hardwareEClass, DIFF_SKETCH_HARDWARE__ETYPE);

		diffSketch_instructionsEClass = createEClass(DIFF_SKETCH_INSTRUCTIONS);
		createEAttribute(diffSketch_instructionsEClass, DIFF_SKETCH_INSTRUCTIONS__OPERATION);
		createEReference(diffSketch_instructionsEClass, DIFF_SKETCH_INSTRUCTIONS__ETYPE);

		diffSketch_functionsEClass = createEClass(DIFF_SKETCH_FUNCTIONS);
		createEAttribute(diffSketch_functionsEClass, DIFF_SKETCH_FUNCTIONS__OPERATION);
		createEReference(diffSketch_functionsEClass, DIFF_SKETCH_FUNCTIONS__ETYPE);

		diffProjectEClass = createEClass(DIFF_PROJECT);
		createEAttribute(diffProjectEClass, DIFF_PROJECT__OPERATION);

		diffProject_hardwareEClass = createEClass(DIFF_PROJECT_HARDWARE);
		createEAttribute(diffProject_hardwareEClass, DIFF_PROJECT_HARDWARE__OPERATION);
		createEReference(diffProject_hardwareEClass, DIFF_PROJECT_HARDWARE__ETYPE);

		diffProject_sketchEClass = createEClass(DIFF_PROJECT_SKETCH);
		createEAttribute(diffProject_sketchEClass, DIFF_PROJECT_SKETCH__OPERATION);
		createEReference(diffProject_sketchEClass, DIFF_PROJECT_SKETCH__ETYPE);

		diffProject_modulesEClass = createEClass(DIFF_PROJECT_MODULES);
		createEAttribute(diffProject_modulesEClass, DIFF_PROJECT_MODULES__OPERATION);
		createEReference(diffProject_modulesEClass, DIFF_PROJECT_MODULES__ETYPE);

		diffProject_platformEClass = createEClass(DIFF_PROJECT_PLATFORM);
		createEAttribute(diffProject_platformEClass, DIFF_PROJECT_PLATFORM__OPERATION);
		createEReference(diffProject_platformEClass, DIFF_PROJECT_PLATFORM__ETYPE);

		diffProject_domainspecificdiffsEClass = createEClass(DIFF_PROJECT_DOMAINSPECIFICDIFFS);
		createEAttribute(diffProject_domainspecificdiffsEClass, DIFF_PROJECT_DOMAINSPECIFICDIFFS__OPERATION);
		createEReference(diffProject_domainspecificdiffsEClass, DIFF_PROJECT_DOMAINSPECIFICDIFFS__ETYPE);

		diffInstruction_previousEClass = createEClass(DIFF_INSTRUCTION_PREVIOUS);
		createEAttribute(diffInstruction_previousEClass, DIFF_INSTRUCTION_PREVIOUS__OPERATION);
		createEReference(diffInstruction_previousEClass, DIFF_INSTRUCTION_PREVIOUS__ETYPE);

		diffInstruction_nextEClass = createEClass(DIFF_INSTRUCTION_NEXT);
		createEAttribute(diffInstruction_nextEClass, DIFF_INSTRUCTION_NEXT__OPERATION);
		createEReference(diffInstruction_nextEClass, DIFF_INSTRUCTION_NEXT__ETYPE);

		diffStatusEClass = createEClass(DIFF_STATUS);
		createEAttribute(diffStatusEClass, DIFF_STATUS__OPERATION);
		createEAttribute(diffStatusEClass, DIFF_STATUS__NEW_VALUE);
		createEAttribute(diffStatusEClass, DIFF_STATUS__NEW_STATUS);

		diffStatus_sensorEClass = createEClass(DIFF_STATUS_SENSOR);
		createEAttribute(diffStatus_sensorEClass, DIFF_STATUS_SENSOR__OPERATION);
		createEReference(diffStatus_sensorEClass, DIFF_STATUS_SENSOR__ETYPE);

		diffLevelEClass = createEClass(DIFF_LEVEL);
		createEAttribute(diffLevelEClass, DIFF_LEVEL__OPERATION);

		diffLevel_levelEClass = createEClass(DIFF_LEVEL_LEVEL);
		createEAttribute(diffLevel_levelEClass, DIFF_LEVEL_LEVEL__OPERATION);
		createEReference(diffLevel_levelEClass, DIFF_LEVEL_LEVEL__ETYPE);

		diffModuleInstruction_moduleEClass = createEClass(DIFF_MODULE_INSTRUCTION_MODULE);
		createEAttribute(diffModuleInstruction_moduleEClass, DIFF_MODULE_INSTRUCTION_MODULE__OPERATION);
		createEReference(diffModuleInstruction_moduleEClass, DIFF_MODULE_INSTRUCTION_MODULE__ETYPE);

		diffControl_instructionsEClass = createEClass(DIFF_CONTROL_INSTRUCTIONS);
		createEAttribute(diffControl_instructionsEClass, DIFF_CONTROL_INSTRUCTIONS__OPERATION);
		createEReference(diffControl_instructionsEClass, DIFF_CONTROL_INSTRUCTIONS__ETYPE);

		diffDelayEClass = createEClass(DIFF_DELAY);
		createEAttribute(diffDelayEClass, DIFF_DELAY__OPERATION);
		createEAttribute(diffDelayEClass, DIFF_DELAY__NEW_UNIT);
		createEAttribute(diffDelayEClass, DIFF_DELAY__NEW_VALUE);

		diffInputModuleEClass = createEClass(DIFF_INPUT_MODULE);
		createEAttribute(diffInputModuleEClass, DIFF_INPUT_MODULE__OPERATION);
		createEAttribute(diffInputModuleEClass, DIFF_INPUT_MODULE__NEW_NAME);
		createEAttribute(diffInputModuleEClass, DIFF_INPUT_MODULE__NEW_KIND);
		createEAttribute(diffInputModuleEClass, DIFF_INPUT_MODULE__NEW_IMAGE);
		createEAttribute(diffInputModuleEClass, DIFF_INPUT_MODULE__NEW_LEVEL);
		createEAttribute(diffInputModuleEClass, DIFF_INPUT_MODULE__NEW_LIBRARY);

		diffOutputModuleEClass = createEClass(DIFF_OUTPUT_MODULE);
		createEAttribute(diffOutputModuleEClass, DIFF_OUTPUT_MODULE__OPERATION);
		createEAttribute(diffOutputModuleEClass, DIFF_OUTPUT_MODULE__NEW_NAME);
		createEAttribute(diffOutputModuleEClass, DIFF_OUTPUT_MODULE__NEW_KIND);
		createEAttribute(diffOutputModuleEClass, DIFF_OUTPUT_MODULE__NEW_IMAGE);
		createEAttribute(diffOutputModuleEClass, DIFF_OUTPUT_MODULE__NEW_LEVEL);
		createEAttribute(diffOutputModuleEClass, DIFF_OUTPUT_MODULE__NEW_LIBRARY);

		diffConnectorEClass = createEClass(DIFF_CONNECTOR);
		createEAttribute(diffConnectorEClass, DIFF_CONNECTOR__OPERATION);

		diffConnector_pinEClass = createEClass(DIFF_CONNECTOR_PIN);
		createEAttribute(diffConnector_pinEClass, DIFF_CONNECTOR_PIN__OPERATION);
		createEReference(diffConnector_pinEClass, DIFF_CONNECTOR_PIN__ETYPE);

		diffConnector_moduleEClass = createEClass(DIFF_CONNECTOR_MODULE);
		createEAttribute(diffConnector_moduleEClass, DIFF_CONNECTOR_MODULE__OPERATION);
		createEReference(diffConnector_moduleEClass, DIFF_CONNECTOR_MODULE__ETYPE);

		diffRepeatEClass = createEClass(DIFF_REPEAT);
		createEAttribute(diffRepeatEClass, DIFF_REPEAT__OPERATION);
		createEAttribute(diffRepeatEClass, DIFF_REPEAT__NEW_ITERATION);

		diffSensorEClass = createEClass(DIFF_SENSOR);
		createEAttribute(diffSensorEClass, DIFF_SENSOR__OPERATION);
		createEAttribute(diffSensorEClass, DIFF_SENSOR__NEW_VALUE);
		createEAttribute(diffSensorEClass, DIFF_SENSOR__NEW_OPERATOR);

		diffSensor_statusEClass = createEClass(DIFF_SENSOR_STATUS);
		createEAttribute(diffSensor_statusEClass, DIFF_SENSOR_STATUS__OPERATION);
		createEReference(diffSensor_statusEClass, DIFF_SENSOR_STATUS__ETYPE);

		diffWhileEClass = createEClass(DIFF_WHILE);
		createEAttribute(diffWhileEClass, DIFF_WHILE__OPERATION);

		diffWhile_conditionEClass = createEClass(DIFF_WHILE_CONDITION);
		createEAttribute(diffWhile_conditionEClass, DIFF_WHILE_CONDITION__OPERATION);
		createEReference(diffWhile_conditionEClass, DIFF_WHILE_CONDITION__ETYPE);

		diffMathOperator_leftEClass = createEClass(DIFF_MATH_OPERATOR_LEFT);
		createEAttribute(diffMathOperator_leftEClass, DIFF_MATH_OPERATOR_LEFT__OPERATION);
		createEReference(diffMathOperator_leftEClass, DIFF_MATH_OPERATOR_LEFT__ETYPE);

		diffMathOperator_rightEClass = createEClass(DIFF_MATH_OPERATOR_RIGHT);
		createEAttribute(diffMathOperator_rightEClass, DIFF_MATH_OPERATOR_RIGHT__OPERATION);
		createEReference(diffMathOperator_rightEClass, DIFF_MATH_OPERATOR_RIGHT__ETYPE);

		diffVariableEClass = createEClass(DIFF_VARIABLE);
		createEAttribute(diffVariableEClass, DIFF_VARIABLE__OPERATION);
		createEAttribute(diffVariableEClass, DIFF_VARIABLE__NEW_VALUE);
		createEAttribute(diffVariableEClass, DIFF_VARIABLE__NEW_NAME);

		diffSetEClass = createEClass(DIFF_SET);
		createEAttribute(diffSetEClass, DIFF_SET__OPERATION);

		diffSet_variableEClass = createEClass(DIFF_SET_VARIABLE);
		createEAttribute(diffSet_variableEClass, DIFF_SET_VARIABLE__OPERATION);
		createEReference(diffSet_variableEClass, DIFF_SET_VARIABLE__ETYPE);

		diffSet_valueEClass = createEClass(DIFF_SET_VALUE);
		createEAttribute(diffSet_valueEClass, DIFF_SET_VALUE__OPERATION);
		createEReference(diffSet_valueEClass, DIFF_SET_VALUE__ETYPE);

		diffNumericalOperatorEClass = createEClass(DIFF_NUMERICAL_OPERATOR);
		createEAttribute(diffNumericalOperatorEClass, DIFF_NUMERICAL_OPERATOR__OPERATION);
		createEAttribute(diffNumericalOperatorEClass, DIFF_NUMERICAL_OPERATOR__NEW_VALUE);
		createEAttribute(diffNumericalOperatorEClass, DIFF_NUMERICAL_OPERATOR__NEW_OPERATOR);

		diffBooleanOperatorEClass = createEClass(DIFF_BOOLEAN_OPERATOR);
		createEAttribute(diffBooleanOperatorEClass, DIFF_BOOLEAN_OPERATOR__OPERATION);
		createEAttribute(diffBooleanOperatorEClass, DIFF_BOOLEAN_OPERATOR__NEW_VALUE);
		createEAttribute(diffBooleanOperatorEClass, DIFF_BOOLEAN_OPERATOR__NEW_OPERATOR);

		diffConstantEClass = createEClass(DIFF_CONSTANT);
		createEAttribute(diffConstantEClass, DIFF_CONSTANT__OPERATION);
		createEAttribute(diffConstantEClass, DIFF_CONSTANT__NEW_VALUE);

		diffIfEClass = createEClass(DIFF_IF);
		createEAttribute(diffIfEClass, DIFF_IF__OPERATION);

		diffIf_conditionEClass = createEClass(DIFF_IF_CONDITION);
		createEAttribute(diffIf_conditionEClass, DIFF_IF_CONDITION__OPERATION);
		createEReference(diffIf_conditionEClass, DIFF_IF_CONDITION__ETYPE);

		diffFunctionEClass = createEClass(DIFF_FUNCTION);
		createEAttribute(diffFunctionEClass, DIFF_FUNCTION__OPERATION);
		createEAttribute(diffFunctionEClass, DIFF_FUNCTION__NEW_NAME);

		diffFunction_paramDefsEClass = createEClass(DIFF_FUNCTION_PARAM_DEFS);
		createEAttribute(diffFunction_paramDefsEClass, DIFF_FUNCTION_PARAM_DEFS__OPERATION);
		createEReference(diffFunction_paramDefsEClass, DIFF_FUNCTION_PARAM_DEFS__ETYPE);

		diffFunction_instructionsEClass = createEClass(DIFF_FUNCTION_INSTRUCTIONS);
		createEAttribute(diffFunction_instructionsEClass, DIFF_FUNCTION_INSTRUCTIONS__OPERATION);
		createEReference(diffFunction_instructionsEClass, DIFF_FUNCTION_INSTRUCTIONS__ETYPE);

		diffParameterDefinitionEClass = createEClass(DIFF_PARAMETER_DEFINITION);
		createEAttribute(diffParameterDefinitionEClass, DIFF_PARAMETER_DEFINITION__OPERATION);
		createEAttribute(diffParameterDefinitionEClass, DIFF_PARAMETER_DEFINITION__NEW_TYPE);
		createEAttribute(diffParameterDefinitionEClass, DIFF_PARAMETER_DEFINITION__NEW_NAME);

		diffParameter_to_definitionEClass = createEClass(DIFF_PARAMETER_TO_DEFINITION);
		createEAttribute(diffParameter_to_definitionEClass, DIFF_PARAMETER_TO_DEFINITION__OPERATION);
		createEReference(diffParameter_to_definitionEClass, DIFF_PARAMETER_TO_DEFINITION__ETYPE);

		diffFunctionCallEClass = createEClass(DIFF_FUNCTION_CALL);
		createEAttribute(diffFunctionCallEClass, DIFF_FUNCTION_CALL__OPERATION);

		diffFunctionCall_definitionEClass = createEClass(DIFF_FUNCTION_CALL_DEFINITION);
		createEAttribute(diffFunctionCall_definitionEClass, DIFF_FUNCTION_CALL_DEFINITION__OPERATION);
		createEReference(diffFunctionCall_definitionEClass, DIFF_FUNCTION_CALL_DEFINITION__ETYPE);

		diffFunctionCall_parametersEClass = createEClass(DIFF_FUNCTION_CALL_PARAMETERS);
		createEAttribute(diffFunctionCall_parametersEClass, DIFF_FUNCTION_CALL_PARAMETERS__OPERATION);
		createEReference(diffFunctionCall_parametersEClass, DIFF_FUNCTION_CALL_PARAMETERS__ETYPE);

		diffParameterCallEClass = createEClass(DIFF_PARAMETER_CALL);
		createEAttribute(diffParameterCallEClass, DIFF_PARAMETER_CALL__OPERATION);

		diffParameterCall_definitionEClass = createEClass(DIFF_PARAMETER_CALL_DEFINITION);
		createEAttribute(diffParameterCall_definitionEClass, DIFF_PARAMETER_CALL_DEFINITION__OPERATION);
		createEReference(diffParameterCall_definitionEClass, DIFF_PARAMETER_CALL_DEFINITION__ETYPE);

		// Create enums
		timeEEnum = createEEnum(TIME);
		moduleKindEEnum = createEEnum(MODULE_KIND);
		operatorKindEEnum = createEEnum(OPERATOR_KIND);
		libraryEEnum = createEEnum(LIBRARY);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		classOpEEnum = createEEnum(CLASS_OP);
		ascOpEEnum = createEEnum(ASC_OP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hardwareEClass.getESuperTypes().add(this.getNamedElement());
		platformEClass.getESuperTypes().add(this.getNamedElement());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		digitalPinEClass.getESuperTypes().add(this.getPin());
		analogPinEClass.getESuperTypes().add(this.getPin());
		sketchEClass.getESuperTypes().add(this.getNamedElement());
		sketchEClass.getESuperTypes().add(this.getInstruction());
		statusEClass.getESuperTypes().add(this.getModuleInstruction());
		statusEClass.getESuperTypes().add(this.getValue());
		levelEClass.getESuperTypes().add(this.getModuleInstruction());
		moduleInstructionEClass.getESuperTypes().add(this.getInstruction());
		moduleInstructionEClass.getESuperTypes().add(this.getParameter());
		controlEClass.getESuperTypes().add(this.getInstruction());
		utilitiesEClass.getESuperTypes().add(this.getInstruction());
		utilitiesEClass.getESuperTypes().add(this.getParameter());
		ioEClass.getESuperTypes().add(this.getInstruction());
		delayEClass.getESuperTypes().add(this.getUtilities());
		inputModuleEClass.getESuperTypes().add(this.getModule());
		outputModuleEClass.getESuperTypes().add(this.getModule());
		repeatEClass.getESuperTypes().add(this.getControl());
		sensorEClass.getESuperTypes().add(this.getModuleInstruction());
		sensorEClass.getESuperTypes().add(this.getBooleanOperator());
		whileEClass.getESuperTypes().add(this.getControl());
		mathOperatorEClass.getESuperTypes().add(this.getValue());
		mathOperatorEClass.getESuperTypes().add(this.getInstruction());
		variableEClass.getESuperTypes().add(this.getValue());
		variableEClass.getESuperTypes().add(this.getInstruction());
		setEClass.getESuperTypes().add(this.getInstruction());
		numericalOperatorEClass.getESuperTypes().add(this.getMathOperator());
		booleanOperatorEClass.getESuperTypes().add(this.getMathOperator());
		valueEClass.getESuperTypes().add(this.getInstruction());
		valueEClass.getESuperTypes().add(this.getParameter());
		constantEClass.getESuperTypes().add(this.getValue());
		ifEClass.getESuperTypes().add(this.getControl());
		functionCallEClass.getESuperTypes().add(this.getInstruction());
		parameterCallEClass.getESuperTypes().add(this.getInstruction());
		diffHardwareEClass.getESuperTypes().add(this.getHardware());
		diffPlatformEClass.getESuperTypes().add(this.getPlatform());
		diffDigitalPinEClass.getESuperTypes().add(this.getDigitalPin());
		diffAnalogPinEClass.getESuperTypes().add(this.getAnalogPin());
		diffSketchEClass.getESuperTypes().add(this.getSketch());
		diffProjectEClass.getESuperTypes().add(this.getProject());
		diffStatusEClass.getESuperTypes().add(this.getStatus());
		diffLevelEClass.getESuperTypes().add(this.getLevel());
		diffDelayEClass.getESuperTypes().add(this.getDelay());
		diffInputModuleEClass.getESuperTypes().add(this.getInputModule());
		diffOutputModuleEClass.getESuperTypes().add(this.getOutputModule());
		diffConnectorEClass.getESuperTypes().add(this.getConnector());
		diffRepeatEClass.getESuperTypes().add(this.getRepeat());
		diffSensorEClass.getESuperTypes().add(this.getSensor());
		diffWhileEClass.getESuperTypes().add(this.getWhile());
		diffVariableEClass.getESuperTypes().add(this.getVariable());
		diffSetEClass.getESuperTypes().add(this.getSet());
		diffNumericalOperatorEClass.getESuperTypes().add(this.getNumericalOperator());
		diffBooleanOperatorEClass.getESuperTypes().add(this.getBooleanOperator());
		diffConstantEClass.getESuperTypes().add(this.getConstant());
		diffIfEClass.getESuperTypes().add(this.getIf());
		diffFunctionEClass.getESuperTypes().add(this.getFunction());
		diffParameterDefinitionEClass.getESuperTypes().add(this.getParameterDefinition());
		diffFunctionCallEClass.getESuperTypes().add(this.getFunctionCall());
		diffParameterCallEClass.getESuperTypes().add(this.getParameterCall());

		// Initialize classes, features, and operations; add parameters
		initEClass(hardwareEClass, Hardware.class, "Hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardware_Platforms(), this.getPlatform(), null, "platforms", null, 1, -1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardware_Modules(), this.getModule(), null, "modules", null, 0, -1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardware_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardware_Diffplatforms(), this.getDiffHardware_platforms(), null, "diffplatforms", null, 0, -1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardware_Diffmodules(), this.getDiffHardware_modules(), null, "diffmodules", null, 0, -1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardware_Diffconnectors(), this.getDiffHardware_connectors(), null, "diffconnectors", null, 0, -1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatform_DigitalPins(), this.getDigitalPin(), null, "digitalPins", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_AnalogPins(), this.getAnalogPin(), null, "analogPins", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Image(), ecorePackage.getEString(), "image", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_DiffdigitalPins(), this.getDiffPlatform_digitalPins(), null, "diffdigitalPins", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_DiffanalogPins(), this.getDiffPlatform_analogPins(), null, "diffanalogPins", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, arduinoDiffMM.Module.class, "Module", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Kind(), this.getModuleKind(), "kind", "digital", 0, 1, arduinoDiffMM.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Image(), ecorePackage.getEString(), "image", null, 0, 1, arduinoDiffMM.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Level(), ecorePackage.getEBoolean(), "level", null, 0, 1, arduinoDiffMM.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Library(), this.getLibrary(), "library", null, 0, 1, arduinoDiffMM.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalPinEClass, DigitalPin.class, "DigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogPinEClass, AnalogPin.class, "AnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketch_Hardware(), this.getHardware(), null, "hardware", null, 1, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Functions(), this.getFunction(), null, "functions", null, 0, -1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Diffhardware(), this.getDiffSketch_hardware(), null, "diffhardware", null, 0, 2, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Diffinstructions(), this.getDiffSketch_instructions(), null, "diffinstructions", null, 0, -1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Difffunctions(), this.getDiffSketch_functions(), null, "difffunctions", null, 0, -1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Hardware(), this.getHardware(), null, "hardware", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Sketch(), this.getSketch(), null, "sketch", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Modules(), this.getModule(), null, "modules", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Platform(), this.getPlatform(), null, "platform", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Domainspecificdiffs(), this.getDomainSpecificDiff(), null, "domainspecificdiffs", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Diffhardware(), this.getDiffProject_hardware(), null, "diffhardware", null, 0, 2, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Diffsketch(), this.getDiffProject_sketch(), null, "diffsketch", null, 0, 2, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Diffmodules(), this.getDiffProject_modules(), null, "diffmodules", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Diffplatform(), this.getDiffProject_platform(), null, "diffplatform", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Diffdomainspecificdiffs(), this.getDiffProject_domainspecificdiffs(), null, "diffdomainspecificdiffs", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Previous(), this.getInstruction(), null, "previous", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Next(), this.getInstruction(), null, "next", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Diffprevious(), this.getDiffInstruction_previous(), null, "diffprevious", null, 0, 2, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Diffnext(), this.getDiffInstruction_next(), null, "diffnext", null, 0, 2, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatus_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatus_Sensor(), this.getSensor(), this.getSensor_Status(), "sensor", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatus_Diffsensor(), this.getDiffStatus_sensor(), null, "diffsensor", null, 0, 2, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLevel_Level(), this.getValue(), null, "level", null, 1, 1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Difflevel(), this.getDiffLevel_level(), null, "difflevel", null, 0, 2, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleInstructionEClass, ModuleInstruction.class, "ModuleInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleInstruction_Module(), this.getModule(), null, "module", null, 1, 1, ModuleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstruction_Diffmodule(), this.getDiffModuleInstruction_module(), null, "diffmodule", null, 0, 2, ModuleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Diffinstructions(), this.getDiffControl_instructions(), null, "diffinstructions", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilitiesEClass, Utilities.class, "Utilities", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioEClass, arduinoDiffMM.IO.class, "IO", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Unit(), this.getTime(), "unit", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputModuleEClass, InputModule.class, "InputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputModuleEClass, OutputModule.class, "OutputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Pin(), this.getPin(), null, "pin", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Module(), this.getModule(), null, "module", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Diffpin(), this.getDiffConnector_pin(), null, "diffpin", null, 0, 2, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Diffmodule(), this.getDiffConnector_module(), null, "diffmodule", null, 0, 2, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_Iteration(), ecorePackage.getEInt(), "iteration", "5", 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Status(), this.getStatus(), this.getStatus_Sensor(), "status", null, 0, -1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Diffstatus(), this.getDiffSensor_status(), null, "diffstatus", null, 0, -1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Condition(), this.getBooleanOperator(), null, "condition", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhile_Diffcondition(), this.getDiffWhile_condition(), null, "diffcondition", null, 0, 2, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mathOperatorEClass, MathOperator.class, "MathOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMathOperator_Left(), this.getValue(), null, "left", null, 1, 1, MathOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMathOperator_Right(), this.getValue(), null, "right", null, 0, 1, MathOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMathOperator_Operator(), this.getOperatorKind(), "operator", null, 0, 1, MathOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMathOperator_Diffleft(), this.getDiffMathOperator_left(), null, "diffleft", null, 0, 2, MathOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMathOperator_Diffright(), this.getDiffMathOperator_right(), null, "diffright", null, 0, 2, MathOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSet_Variable(), this.getVariable(), null, "variable", null, 1, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSet_Value(), this.getValue(), null, "value", null, 1, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSet_Diffvariable(), this.getDiffSet_variable(), null, "diffvariable", null, 0, 2, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSet_Diffvalue(), this.getDiffSet_value(), null, "diffvalue", null, 0, 2, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericalOperatorEClass, NumericalOperator.class, "NumericalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOperatorEClass, BooleanOperator.class, "BooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getBooleanOperator(), null, "condition", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Diffcondition(), this.getDiffIf_condition(), null, "diffcondition", null, 0, 2, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_ParamDefs(), this.getParameterDefinition(), null, "paramDefs", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_DiffparamDefs(), this.getDiffFunction_paramDefs(), null, "diffparamDefs", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Diffinstructions(), this.getDiffFunction_instructions(), null, "diffinstructions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDefinition_Type(), this.getParameterType(), "type", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Definition(), this.getParameterDefinition(), null, "definition", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Diffdefinition(), this.getDiffParameter_to_definition(), null, "diffdefinition", null, 0, 2, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionCall_Definition(), this.getFunction(), null, "definition", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_Diffdefinition(), this.getDiffFunctionCall_definition(), null, "diffdefinition", null, 0, 2, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_Diffparameters(), this.getDiffFunctionCall_parameters(), null, "diffparameters", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCallEClass, ParameterCall.class, "ParameterCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCall_Definition(), this.getParameterDefinition(), null, "definition", null, 0, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCall_Diffdefinition(), this.getDiffParameterCall_definition(), null, "diffdefinition", null, 0, 2, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificDiffEClass, DomainSpecificDiff.class, "DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificDiff_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Hardware(), this.getHardware(), null, "DomainSpecificDiff_Hardware", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Platform(), this.getPlatform(), null, "DomainSpecificDiff_Platform", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Module(), this.getModule(), null, "DomainSpecificDiff_Module", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DigitalPin(), this.getDigitalPin(), null, "DomainSpecificDiff_DigitalPin", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Pin(), this.getPin(), null, "DomainSpecificDiff_Pin", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_AnalogPin(), this.getAnalogPin(), null, "DomainSpecificDiff_AnalogPin", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Sketch(), this.getSketch(), null, "DomainSpecificDiff_Sketch", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Instruction(), this.getInstruction(), null, "DomainSpecificDiff_Instruction", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Status(), this.getStatus(), null, "DomainSpecificDiff_Status", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Level(), this.getLevel(), null, "DomainSpecificDiff_Level", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_ModuleInstruction(), this.getModuleInstruction(), null, "DomainSpecificDiff_ModuleInstruction", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Control(), this.getControl(), null, "DomainSpecificDiff_Control", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Utilities(), this.getUtilities(), null, "DomainSpecificDiff_Utilities", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_IO(), this.getIO(), null, "DomainSpecificDiff_IO", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Delay(), this.getDelay(), null, "DomainSpecificDiff_Delay", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_InputModule(), this.getInputModule(), null, "DomainSpecificDiff_InputModule", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_OutputModule(), this.getOutputModule(), null, "DomainSpecificDiff_OutputModule", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_NamedElement(), this.getNamedElement(), null, "DomainSpecificDiff_NamedElement", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Connector(), this.getConnector(), null, "DomainSpecificDiff_Connector", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Repeat(), this.getRepeat(), null, "DomainSpecificDiff_Repeat", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Sensor(), this.getSensor(), null, "DomainSpecificDiff_Sensor", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_While(), this.getWhile(), null, "DomainSpecificDiff_While", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_MathOperator(), this.getMathOperator(), null, "DomainSpecificDiff_MathOperator", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Variable(), this.getVariable(), null, "DomainSpecificDiff_Variable", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Set(), this.getSet(), null, "DomainSpecificDiff_Set", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_NumericalOperator(), this.getNumericalOperator(), null, "DomainSpecificDiff_NumericalOperator", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_BooleanOperator(), this.getBooleanOperator(), null, "DomainSpecificDiff_BooleanOperator", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Value(), this.getValue(), null, "DomainSpecificDiff_Value", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Constant(), this.getConstant(), null, "DomainSpecificDiff_Constant", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_If(), this.getIf(), null, "DomainSpecificDiff_If", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Function(), this.getFunction(), null, "DomainSpecificDiff_Function", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_ParameterDefinition(), this.getParameterDefinition(), null, "DomainSpecificDiff_ParameterDefinition", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Parameter(), this.getParameter(), null, "DomainSpecificDiff_Parameter", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_FunctionCall(), this.getFunctionCall(), null, "DomainSpecificDiff_FunctionCall", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_ParameterCall(), this.getParameterCall(), null, "DomainSpecificDiff_ParameterCall", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffHardwareEClass, DiffHardware.class, "DiffHardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffHardware_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffHardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffHardware_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffHardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffHardware_platformsEClass, DiffHardware_platforms.class, "DiffHardware_platforms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffHardware_platforms_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffHardware_platforms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffHardware_platforms_EType(), this.getPlatform(), null, "eType", null, 1, 1, DiffHardware_platforms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffHardware_modulesEClass, DiffHardware_modules.class, "DiffHardware_modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffHardware_modules_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffHardware_modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffHardware_modules_EType(), this.getModule(), null, "eType", null, 1, 1, DiffHardware_modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffHardware_connectorsEClass, DiffHardware_connectors.class, "DiffHardware_connectors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffHardware_connectors_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffHardware_connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffHardware_connectors_EType(), this.getConnector(), null, "eType", null, 1, 1, DiffHardware_connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlatformEClass, DiffPlatform.class, "DiffPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlatform_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlatform_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlatform_New_image(), ecorePackage.getEString(), "new_image", null, 0, 1, DiffPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlatform_digitalPinsEClass, DiffPlatform_digitalPins.class, "DiffPlatform_digitalPins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlatform_digitalPins_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffPlatform_digitalPins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPlatform_digitalPins_EType(), this.getDigitalPin(), null, "eType", null, 1, 1, DiffPlatform_digitalPins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlatform_analogPinsEClass, DiffPlatform_analogPins.class, "DiffPlatform_analogPins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlatform_analogPins_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffPlatform_analogPins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPlatform_analogPins_EType(), this.getAnalogPin(), null, "eType", null, 1, 1, DiffPlatform_analogPins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDigitalPinEClass, DiffDigitalPin.class, "DiffDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffDigitalPin_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDigitalPin_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffAnalogPinEClass, DiffAnalogPin.class, "DiffAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffAnalogPin_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffAnalogPin_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSketchEClass, DiffSketch.class, "DiffSketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSketch_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffSketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffSketch_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffSketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSketch_hardwareEClass, DiffSketch_hardware.class, "DiffSketch_hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSketch_hardware_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffSketch_hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffSketch_hardware_EType(), this.getHardware(), null, "eType", null, 1, 1, DiffSketch_hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSketch_instructionsEClass, DiffSketch_instructions.class, "DiffSketch_instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSketch_instructions_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffSketch_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffSketch_instructions_EType(), this.getInstruction(), null, "eType", null, 1, 1, DiffSketch_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSketch_functionsEClass, DiffSketch_functions.class, "DiffSketch_functions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSketch_functions_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffSketch_functions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffSketch_functions_EType(), this.getFunction(), null, "eType", null, 1, 1, DiffSketch_functions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffProjectEClass, DiffProject.class, "DiffProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffProject_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffProject_hardwareEClass, DiffProject_hardware.class, "DiffProject_hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffProject_hardware_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffProject_hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffProject_hardware_EType(), this.getHardware(), null, "eType", null, 1, 1, DiffProject_hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffProject_sketchEClass, DiffProject_sketch.class, "DiffProject_sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffProject_sketch_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffProject_sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffProject_sketch_EType(), this.getSketch(), null, "eType", null, 1, 1, DiffProject_sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffProject_modulesEClass, DiffProject_modules.class, "DiffProject_modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffProject_modules_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffProject_modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffProject_modules_EType(), this.getModule(), null, "eType", null, 1, 1, DiffProject_modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffProject_platformEClass, DiffProject_platform.class, "DiffProject_platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffProject_platform_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffProject_platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffProject_platform_EType(), this.getPlatform(), null, "eType", null, 1, 1, DiffProject_platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffProject_domainspecificdiffsEClass, DiffProject_domainspecificdiffs.class, "DiffProject_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffProject_domainspecificdiffs_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffProject_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffProject_domainspecificdiffs_EType(), this.getDomainSpecificDiff(), null, "eType", null, 1, 1, DiffProject_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffInstruction_previousEClass, DiffInstruction_previous.class, "DiffInstruction_previous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffInstruction_previous_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffInstruction_previous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffInstruction_previous_EType(), this.getInstruction(), null, "eType", null, 1, 1, DiffInstruction_previous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffInstruction_nextEClass, DiffInstruction_next.class, "DiffInstruction_next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffInstruction_next_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffInstruction_next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffInstruction_next_EType(), this.getInstruction(), null, "eType", null, 1, 1, DiffInstruction_next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffStatusEClass, DiffStatus.class, "DiffStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffStatus_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffStatus_New_value(), ecorePackage.getEString(), "new_value", null, 0, 1, DiffStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffStatus_New_status(), ecorePackage.getEBoolean(), "new_status", null, 0, 1, DiffStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffStatus_sensorEClass, DiffStatus_sensor.class, "DiffStatus_sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffStatus_sensor_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffStatus_sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffStatus_sensor_EType(), this.getSensor(), null, "eType", null, 1, 1, DiffStatus_sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffLevelEClass, DiffLevel.class, "DiffLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffLevel_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffLevel_levelEClass, DiffLevel_level.class, "DiffLevel_level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffLevel_level_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffLevel_level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffLevel_level_EType(), this.getValue(), null, "eType", null, 1, 1, DiffLevel_level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffModuleInstruction_moduleEClass, DiffModuleInstruction_module.class, "DiffModuleInstruction_module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffModuleInstruction_module_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffModuleInstruction_module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffModuleInstruction_module_EType(), this.getModule(), null, "eType", null, 1, 1, DiffModuleInstruction_module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffControl_instructionsEClass, DiffControl_instructions.class, "DiffControl_instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffControl_instructions_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffControl_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffControl_instructions_EType(), this.getInstruction(), null, "eType", null, 1, 1, DiffControl_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDelayEClass, DiffDelay.class, "DiffDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffDelay_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDelay_New_unit(), this.getTime(), "new_unit", null, 0, 1, DiffDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDelay_New_value(), ecorePackage.getEInt(), "new_value", null, 0, 1, DiffDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffInputModuleEClass, DiffInputModule.class, "DiffInputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffInputModule_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInputModule_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInputModule_New_kind(), this.getModuleKind(), "new_kind", null, 0, 1, DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInputModule_New_image(), ecorePackage.getEString(), "new_image", null, 0, 1, DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInputModule_New_level(), ecorePackage.getEBoolean(), "new_level", null, 0, 1, DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInputModule_New_library(), this.getLibrary(), "new_library", null, 0, 1, DiffInputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffOutputModuleEClass, DiffOutputModule.class, "DiffOutputModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffOutputModule_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOutputModule_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOutputModule_New_kind(), this.getModuleKind(), "new_kind", null, 0, 1, DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOutputModule_New_image(), ecorePackage.getEString(), "new_image", null, 0, 1, DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOutputModule_New_level(), ecorePackage.getEBoolean(), "new_level", null, 0, 1, DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOutputModule_New_library(), this.getLibrary(), "new_library", null, 0, 1, DiffOutputModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffConnectorEClass, DiffConnector.class, "DiffConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffConnector_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffConnector_pinEClass, DiffConnector_pin.class, "DiffConnector_pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffConnector_pin_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffConnector_pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffConnector_pin_EType(), this.getPin(), null, "eType", null, 1, 1, DiffConnector_pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffConnector_moduleEClass, DiffConnector_module.class, "DiffConnector_module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffConnector_module_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffConnector_module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffConnector_module_EType(), this.getModule(), null, "eType", null, 1, 1, DiffConnector_module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffRepeatEClass, DiffRepeat.class, "DiffRepeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffRepeat_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffRepeat_New_iteration(), ecorePackage.getEInt(), "new_iteration", null, 0, 1, DiffRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSensorEClass, DiffSensor.class, "DiffSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSensor_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffSensor_New_value(), ecorePackage.getEString(), "new_value", null, 0, 1, DiffSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffSensor_New_operator(), this.getOperatorKind(), "new_operator", null, 0, 1, DiffSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSensor_statusEClass, DiffSensor_status.class, "DiffSensor_status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSensor_status_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffSensor_status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffSensor_status_EType(), this.getStatus(), null, "eType", null, 1, 1, DiffSensor_status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffWhileEClass, DiffWhile.class, "DiffWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffWhile_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffWhile_conditionEClass, DiffWhile_condition.class, "DiffWhile_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffWhile_condition_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffWhile_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffWhile_condition_EType(), this.getBooleanOperator(), null, "eType", null, 1, 1, DiffWhile_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffMathOperator_leftEClass, DiffMathOperator_left.class, "DiffMathOperator_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffMathOperator_left_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffMathOperator_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffMathOperator_left_EType(), this.getValue(), null, "eType", null, 1, 1, DiffMathOperator_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffMathOperator_rightEClass, DiffMathOperator_right.class, "DiffMathOperator_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffMathOperator_right_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffMathOperator_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffMathOperator_right_EType(), this.getValue(), null, "eType", null, 1, 1, DiffMathOperator_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffVariableEClass, DiffVariable.class, "DiffVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffVariable_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVariable_New_value(), ecorePackage.getEString(), "new_value", null, 0, 1, DiffVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVariable_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSetEClass, DiffSet.class, "DiffSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSet_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSet_variableEClass, DiffSet_variable.class, "DiffSet_variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSet_variable_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffSet_variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffSet_variable_EType(), this.getVariable(), null, "eType", null, 1, 1, DiffSet_variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffSet_valueEClass, DiffSet_value.class, "DiffSet_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffSet_value_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffSet_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffSet_value_EType(), this.getValue(), null, "eType", null, 1, 1, DiffSet_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffNumericalOperatorEClass, DiffNumericalOperator.class, "DiffNumericalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffNumericalOperator_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffNumericalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffNumericalOperator_New_value(), ecorePackage.getEString(), "new_value", null, 0, 1, DiffNumericalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffNumericalOperator_New_operator(), this.getOperatorKind(), "new_operator", null, 0, 1, DiffNumericalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffBooleanOperatorEClass, DiffBooleanOperator.class, "DiffBooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffBooleanOperator_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffBooleanOperator_New_value(), ecorePackage.getEString(), "new_value", null, 0, 1, DiffBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffBooleanOperator_New_operator(), this.getOperatorKind(), "new_operator", null, 0, 1, DiffBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffConstantEClass, DiffConstant.class, "DiffConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffConstant_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffConstant_New_value(), ecorePackage.getEString(), "new_value", null, 0, 1, DiffConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffIfEClass, DiffIf.class, "DiffIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffIf_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffIf_conditionEClass, DiffIf_condition.class, "DiffIf_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffIf_condition_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffIf_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffIf_condition_EType(), this.getBooleanOperator(), null, "eType", null, 1, 1, DiffIf_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFunctionEClass, DiffFunction.class, "DiffFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFunction_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFunction_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFunction_paramDefsEClass, DiffFunction_paramDefs.class, "DiffFunction_paramDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFunction_paramDefs_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffFunction_paramDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffFunction_paramDefs_EType(), this.getParameterDefinition(), null, "eType", null, 1, 1, DiffFunction_paramDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFunction_instructionsEClass, DiffFunction_instructions.class, "DiffFunction_instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFunction_instructions_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffFunction_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffFunction_instructions_EType(), this.getInstruction(), null, "eType", null, 1, 1, DiffFunction_instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffParameterDefinitionEClass, DiffParameterDefinition.class, "DiffParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffParameterDefinition_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffParameterDefinition_New_type(), this.getParameterType(), "new_type", null, 0, 1, DiffParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffParameterDefinition_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffParameter_to_definitionEClass, DiffParameter_to_definition.class, "DiffParameter_to_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffParameter_to_definition_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffParameter_to_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffParameter_to_definition_EType(), this.getParameterDefinition(), null, "eType", null, 1, 1, DiffParameter_to_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFunctionCallEClass, DiffFunctionCall.class, "DiffFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFunctionCall_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFunctionCall_definitionEClass, DiffFunctionCall_definition.class, "DiffFunctionCall_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFunctionCall_definition_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffFunctionCall_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffFunctionCall_definition_EType(), this.getFunction(), null, "eType", null, 1, 1, DiffFunctionCall_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFunctionCall_parametersEClass, DiffFunctionCall_parameters.class, "DiffFunctionCall_parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFunctionCall_parameters_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffFunctionCall_parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffFunctionCall_parameters_EType(), this.getParameter(), null, "eType", null, 1, 1, DiffFunctionCall_parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffParameterCallEClass, DiffParameterCall.class, "DiffParameterCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffParameterCall_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffParameterCall_definitionEClass, DiffParameterCall_definition.class, "DiffParameterCall_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffParameterCall_definition_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffParameterCall_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffParameterCall_definition_EType(), this.getParameterDefinition(), null, "eType", null, 1, 1, DiffParameterCall_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeEEnum, Time.class, "Time");
		addEEnumLiteral(timeEEnum, Time.MILLI_SECOND);
		addEEnumLiteral(timeEEnum, Time.MICRO_SECOND);

		initEEnum(moduleKindEEnum, ModuleKind.class, "ModuleKind");
		addEEnumLiteral(moduleKindEEnum, ModuleKind.DIGITAL);
		addEEnumLiteral(moduleKindEEnum, ModuleKind.ANALOG);

		initEEnum(operatorKindEEnum, OperatorKind.class, "OperatorKind");
		addEEnumLiteral(operatorKindEEnum, OperatorKind.EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.MINUS);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.UPPER);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.LOWER);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.PLUS);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.DIFF);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.UPPER_OR_EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.LOWER_OR_EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.MUL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.DIV);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.MIN);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.MAX);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.POURCENT);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.AND);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.OR);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.NOT);

		initEEnum(libraryEEnum, Library.class, "Library");
		addEEnumLiteral(libraryEEnum, Library.NONE);
		addEEnumLiteral(libraryEEnum, Library.SERVO);
		addEEnumLiteral(libraryEEnum, Library.MUSIC);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.DELAY);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.LEVEL);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STATUS);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.CONSTANT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.SENSOR);

		initEEnum(classOpEEnum, ClassOp.class, "ClassOp");
		addEEnumLiteral(classOpEEnum, ClassOp.ADD);
		addEEnumLiteral(classOpEEnum, ClassOp.DELETE);
		addEEnumLiteral(classOpEEnum, ClassOp.MODIFY);

		initEEnum(ascOpEEnum, AscOp.class, "AscOp");
		addEEnumLiteral(ascOpEEnum, AscOp.ADD);
		addEEnumLiteral(ascOpEEnum, AscOp.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinoDiffMMPackageImpl
