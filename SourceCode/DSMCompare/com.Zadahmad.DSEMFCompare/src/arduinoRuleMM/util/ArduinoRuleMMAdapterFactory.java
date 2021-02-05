/**
 */
package arduinoRuleMM.util;

import arduinoDiffMM.AnalogPin;
import arduinoDiffMM.BooleanOperator;
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
import arduinoDiffMM.IO;
import arduinoDiffMM.If;
import arduinoDiffMM.InputModule;
import arduinoDiffMM.Instruction;
import arduinoDiffMM.Level;
import arduinoDiffMM.MathOperator;
import arduinoDiffMM.ModuleInstruction;
import arduinoDiffMM.NamedElement;
import arduinoDiffMM.NumericalOperator;
import arduinoDiffMM.OutputModule;
import arduinoDiffMM.Parameter;
import arduinoDiffMM.ParameterCall;
import arduinoDiffMM.ParameterDefinition;
import arduinoDiffMM.Pin;
import arduinoDiffMM.Platform;
import arduinoDiffMM.Project;
import arduinoDiffMM.Repeat;
import arduinoDiffMM.Sensor;
import arduinoDiffMM.Set;
import arduinoDiffMM.Sketch;
import arduinoDiffMM.Status;
import arduinoDiffMM.Utilities;
import arduinoDiffMM.Value;
import arduinoDiffMM.Variable;
import arduinoDiffMM.While;

import arduinoRuleMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduinoRuleMM.ArduinoRuleMMPackage
 * @generated
 */
public class ArduinoRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoRuleMMSwitch<Adapter> modelSwitch =
		new ArduinoRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_Hardware(Pattern_Hardware object) {
				return createPattern_HardwareAdapter();
			}
			@Override
			public Adapter casePattern_Platform(Pattern_Platform object) {
				return createPattern_PlatformAdapter();
			}
			@Override
			public Adapter casePattern_Module(Pattern_Module object) {
				return createPattern_ModuleAdapter();
			}
			@Override
			public Adapter casePattern_DigitalPin(Pattern_DigitalPin object) {
				return createPattern_DigitalPinAdapter();
			}
			@Override
			public Adapter casePattern_Pin(Pattern_Pin object) {
				return createPattern_PinAdapter();
			}
			@Override
			public Adapter casePattern_AnalogPin(Pattern_AnalogPin object) {
				return createPattern_AnalogPinAdapter();
			}
			@Override
			public Adapter casePattern_Sketch(Pattern_Sketch object) {
				return createPattern_SketchAdapter();
			}
			@Override
			public Adapter casePattern_Project(Pattern_Project object) {
				return createPattern_ProjectAdapter();
			}
			@Override
			public Adapter casePattern_Instruction(Pattern_Instruction object) {
				return createPattern_InstructionAdapter();
			}
			@Override
			public Adapter casePattern_Status(Pattern_Status object) {
				return createPattern_StatusAdapter();
			}
			@Override
			public Adapter casePattern_Level(Pattern_Level object) {
				return createPattern_LevelAdapter();
			}
			@Override
			public Adapter casePattern_ModuleInstruction(Pattern_ModuleInstruction object) {
				return createPattern_ModuleInstructionAdapter();
			}
			@Override
			public Adapter casePattern_Control(Pattern_Control object) {
				return createPattern_ControlAdapter();
			}
			@Override
			public Adapter casePattern_Utilities(Pattern_Utilities object) {
				return createPattern_UtilitiesAdapter();
			}
			@Override
			public Adapter casePattern_IO(Pattern_IO object) {
				return createPattern_IOAdapter();
			}
			@Override
			public Adapter casePattern_Delay(Pattern_Delay object) {
				return createPattern_DelayAdapter();
			}
			@Override
			public Adapter casePattern_InputModule(Pattern_InputModule object) {
				return createPattern_InputModuleAdapter();
			}
			@Override
			public Adapter casePattern_OutputModule(Pattern_OutputModule object) {
				return createPattern_OutputModuleAdapter();
			}
			@Override
			public Adapter casePattern_NamedElement(Pattern_NamedElement object) {
				return createPattern_NamedElementAdapter();
			}
			@Override
			public Adapter casePattern_Connector(Pattern_Connector object) {
				return createPattern_ConnectorAdapter();
			}
			@Override
			public Adapter casePattern_Repeat(Pattern_Repeat object) {
				return createPattern_RepeatAdapter();
			}
			@Override
			public Adapter casePattern_Sensor(Pattern_Sensor object) {
				return createPattern_SensorAdapter();
			}
			@Override
			public Adapter casePattern_While(Pattern_While object) {
				return createPattern_WhileAdapter();
			}
			@Override
			public Adapter casePattern_MathOperator(Pattern_MathOperator object) {
				return createPattern_MathOperatorAdapter();
			}
			@Override
			public Adapter casePattern_Variable(Pattern_Variable object) {
				return createPattern_VariableAdapter();
			}
			@Override
			public Adapter casePattern_Set(Pattern_Set object) {
				return createPattern_SetAdapter();
			}
			@Override
			public Adapter casePattern_NumericalOperator(Pattern_NumericalOperator object) {
				return createPattern_NumericalOperatorAdapter();
			}
			@Override
			public Adapter casePattern_BooleanOperator(Pattern_BooleanOperator object) {
				return createPattern_BooleanOperatorAdapter();
			}
			@Override
			public Adapter casePattern_Value(Pattern_Value object) {
				return createPattern_ValueAdapter();
			}
			@Override
			public Adapter casePattern_Constant(Pattern_Constant object) {
				return createPattern_ConstantAdapter();
			}
			@Override
			public Adapter casePattern_If(Pattern_If object) {
				return createPattern_IfAdapter();
			}
			@Override
			public Adapter casePattern_Function(Pattern_Function object) {
				return createPattern_FunctionAdapter();
			}
			@Override
			public Adapter casePattern_ParameterDefinition(Pattern_ParameterDefinition object) {
				return createPattern_ParameterDefinitionAdapter();
			}
			@Override
			public Adapter casePattern_Parameter(Pattern_Parameter object) {
				return createPattern_ParameterAdapter();
			}
			@Override
			public Adapter casePattern_FunctionCall(Pattern_FunctionCall object) {
				return createPattern_FunctionCallAdapter();
			}
			@Override
			public Adapter casePattern_ParameterCall(Pattern_ParameterCall object) {
				return createPattern_ParameterCallAdapter();
			}
			@Override
			public Adapter casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
				return createPattern_DomainSpecificDiffAdapter();
			}
			@Override
			public Adapter casePattern_DiffHardware(Pattern_DiffHardware object) {
				return createPattern_DiffHardwareAdapter();
			}
			@Override
			public Adapter casePattern_DiffHardware_platforms(Pattern_DiffHardware_platforms object) {
				return createPattern_DiffHardware_platformsAdapter();
			}
			@Override
			public Adapter casePattern_DiffHardware_modules(Pattern_DiffHardware_modules object) {
				return createPattern_DiffHardware_modulesAdapter();
			}
			@Override
			public Adapter casePattern_DiffHardware_connectors(Pattern_DiffHardware_connectors object) {
				return createPattern_DiffHardware_connectorsAdapter();
			}
			@Override
			public Adapter casePattern_DiffPlatform(Pattern_DiffPlatform object) {
				return createPattern_DiffPlatformAdapter();
			}
			@Override
			public Adapter casePattern_DiffPlatform_digitalPins(Pattern_DiffPlatform_digitalPins object) {
				return createPattern_DiffPlatform_digitalPinsAdapter();
			}
			@Override
			public Adapter casePattern_DiffPlatform_analogPins(Pattern_DiffPlatform_analogPins object) {
				return createPattern_DiffPlatform_analogPinsAdapter();
			}
			@Override
			public Adapter casePattern_DiffDigitalPin(Pattern_DiffDigitalPin object) {
				return createPattern_DiffDigitalPinAdapter();
			}
			@Override
			public Adapter casePattern_DiffAnalogPin(Pattern_DiffAnalogPin object) {
				return createPattern_DiffAnalogPinAdapter();
			}
			@Override
			public Adapter casePattern_DiffSketch(Pattern_DiffSketch object) {
				return createPattern_DiffSketchAdapter();
			}
			@Override
			public Adapter casePattern_DiffSketch_hardware(Pattern_DiffSketch_hardware object) {
				return createPattern_DiffSketch_hardwareAdapter();
			}
			@Override
			public Adapter casePattern_DiffSketch_instructions(Pattern_DiffSketch_instructions object) {
				return createPattern_DiffSketch_instructionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffSketch_functions(Pattern_DiffSketch_functions object) {
				return createPattern_DiffSketch_functionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffProject(Pattern_DiffProject object) {
				return createPattern_DiffProjectAdapter();
			}
			@Override
			public Adapter casePattern_DiffProject_hardware(Pattern_DiffProject_hardware object) {
				return createPattern_DiffProject_hardwareAdapter();
			}
			@Override
			public Adapter casePattern_DiffProject_sketch(Pattern_DiffProject_sketch object) {
				return createPattern_DiffProject_sketchAdapter();
			}
			@Override
			public Adapter casePattern_DiffProject_modules(Pattern_DiffProject_modules object) {
				return createPattern_DiffProject_modulesAdapter();
			}
			@Override
			public Adapter casePattern_DiffProject_platform(Pattern_DiffProject_platform object) {
				return createPattern_DiffProject_platformAdapter();
			}
			@Override
			public Adapter casePattern_DiffProject_domainspecificdiffs(Pattern_DiffProject_domainspecificdiffs object) {
				return createPattern_DiffProject_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter casePattern_DiffInstruction_previous(Pattern_DiffInstruction_previous object) {
				return createPattern_DiffInstruction_previousAdapter();
			}
			@Override
			public Adapter casePattern_DiffInstruction_next(Pattern_DiffInstruction_next object) {
				return createPattern_DiffInstruction_nextAdapter();
			}
			@Override
			public Adapter casePattern_DiffStatus(Pattern_DiffStatus object) {
				return createPattern_DiffStatusAdapter();
			}
			@Override
			public Adapter casePattern_DiffStatus_sensor(Pattern_DiffStatus_sensor object) {
				return createPattern_DiffStatus_sensorAdapter();
			}
			@Override
			public Adapter casePattern_DiffLevel(Pattern_DiffLevel object) {
				return createPattern_DiffLevelAdapter();
			}
			@Override
			public Adapter casePattern_DiffLevel_level(Pattern_DiffLevel_level object) {
				return createPattern_DiffLevel_levelAdapter();
			}
			@Override
			public Adapter casePattern_DiffModuleInstruction_module(Pattern_DiffModuleInstruction_module object) {
				return createPattern_DiffModuleInstruction_moduleAdapter();
			}
			@Override
			public Adapter casePattern_DiffControl_instructions(Pattern_DiffControl_instructions object) {
				return createPattern_DiffControl_instructionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffDelay(Pattern_DiffDelay object) {
				return createPattern_DiffDelayAdapter();
			}
			@Override
			public Adapter casePattern_DiffInputModule(Pattern_DiffInputModule object) {
				return createPattern_DiffInputModuleAdapter();
			}
			@Override
			public Adapter casePattern_DiffOutputModule(Pattern_DiffOutputModule object) {
				return createPattern_DiffOutputModuleAdapter();
			}
			@Override
			public Adapter casePattern_DiffConnector(Pattern_DiffConnector object) {
				return createPattern_DiffConnectorAdapter();
			}
			@Override
			public Adapter casePattern_DiffConnector_pin(Pattern_DiffConnector_pin object) {
				return createPattern_DiffConnector_pinAdapter();
			}
			@Override
			public Adapter casePattern_DiffConnector_module(Pattern_DiffConnector_module object) {
				return createPattern_DiffConnector_moduleAdapter();
			}
			@Override
			public Adapter casePattern_DiffRepeat(Pattern_DiffRepeat object) {
				return createPattern_DiffRepeatAdapter();
			}
			@Override
			public Adapter casePattern_DiffSensor(Pattern_DiffSensor object) {
				return createPattern_DiffSensorAdapter();
			}
			@Override
			public Adapter casePattern_DiffSensor_status(Pattern_DiffSensor_status object) {
				return createPattern_DiffSensor_statusAdapter();
			}
			@Override
			public Adapter casePattern_DiffWhile(Pattern_DiffWhile object) {
				return createPattern_DiffWhileAdapter();
			}
			@Override
			public Adapter casePattern_DiffWhile_condition(Pattern_DiffWhile_condition object) {
				return createPattern_DiffWhile_conditionAdapter();
			}
			@Override
			public Adapter casePattern_DiffMathOperator_left(Pattern_DiffMathOperator_left object) {
				return createPattern_DiffMathOperator_leftAdapter();
			}
			@Override
			public Adapter casePattern_DiffMathOperator_right(Pattern_DiffMathOperator_right object) {
				return createPattern_DiffMathOperator_rightAdapter();
			}
			@Override
			public Adapter casePattern_DiffVariable(Pattern_DiffVariable object) {
				return createPattern_DiffVariableAdapter();
			}
			@Override
			public Adapter casePattern_DiffSet(Pattern_DiffSet object) {
				return createPattern_DiffSetAdapter();
			}
			@Override
			public Adapter casePattern_DiffSet_variable(Pattern_DiffSet_variable object) {
				return createPattern_DiffSet_variableAdapter();
			}
			@Override
			public Adapter casePattern_DiffSet_value(Pattern_DiffSet_value object) {
				return createPattern_DiffSet_valueAdapter();
			}
			@Override
			public Adapter casePattern_DiffNumericalOperator(Pattern_DiffNumericalOperator object) {
				return createPattern_DiffNumericalOperatorAdapter();
			}
			@Override
			public Adapter casePattern_DiffBooleanOperator(Pattern_DiffBooleanOperator object) {
				return createPattern_DiffBooleanOperatorAdapter();
			}
			@Override
			public Adapter casePattern_DiffConstant(Pattern_DiffConstant object) {
				return createPattern_DiffConstantAdapter();
			}
			@Override
			public Adapter casePattern_DiffIf(Pattern_DiffIf object) {
				return createPattern_DiffIfAdapter();
			}
			@Override
			public Adapter casePattern_DiffIf_condition(Pattern_DiffIf_condition object) {
				return createPattern_DiffIf_conditionAdapter();
			}
			@Override
			public Adapter casePattern_DiffFunction(Pattern_DiffFunction object) {
				return createPattern_DiffFunctionAdapter();
			}
			@Override
			public Adapter casePattern_DiffFunction_paramDefs(Pattern_DiffFunction_paramDefs object) {
				return createPattern_DiffFunction_paramDefsAdapter();
			}
			@Override
			public Adapter casePattern_DiffFunction_instructions(Pattern_DiffFunction_instructions object) {
				return createPattern_DiffFunction_instructionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffParameterDefinition(Pattern_DiffParameterDefinition object) {
				return createPattern_DiffParameterDefinitionAdapter();
			}
			@Override
			public Adapter casePattern_DiffParameter_to_definition(Pattern_DiffParameter_to_definition object) {
				return createPattern_DiffParameter_to_definitionAdapter();
			}
			@Override
			public Adapter casePattern_DiffFunctionCall(Pattern_DiffFunctionCall object) {
				return createPattern_DiffFunctionCallAdapter();
			}
			@Override
			public Adapter casePattern_DiffFunctionCall_definition(Pattern_DiffFunctionCall_definition object) {
				return createPattern_DiffFunctionCall_definitionAdapter();
			}
			@Override
			public Adapter casePattern_DiffFunctionCall_parameters(Pattern_DiffFunctionCall_parameters object) {
				return createPattern_DiffFunctionCall_parametersAdapter();
			}
			@Override
			public Adapter casePattern_DiffParameterCall(Pattern_DiffParameterCall object) {
				return createPattern_DiffParameterCallAdapter();
			}
			@Override
			public Adapter casePattern_DiffParameterCall_definition(Pattern_DiffParameterCall_definition object) {
				return createPattern_DiffParameterCall_definitionAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseModule(arduinoDiffMM.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseDigitalPin(DigitalPin object) {
				return createDigitalPinAdapter();
			}
			@Override
			public Adapter caseAnalogPin(AnalogPin object) {
				return createAnalogPinAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseSketch(Sketch object) {
				return createSketchAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseModuleInstruction(ModuleInstruction object) {
				return createModuleInstructionAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter caseLevel(Level object) {
				return createLevelAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseUtilities(Utilities object) {
				return createUtilitiesAdapter();
			}
			@Override
			public Adapter caseIO(IO object) {
				return createIOAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseInputModule(InputModule object) {
				return createInputModuleAdapter();
			}
			@Override
			public Adapter caseOutputModule(OutputModule object) {
				return createOutputModuleAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseRepeat(Repeat object) {
				return createRepeatAdapter();
			}
			@Override
			public Adapter caseMathOperator(MathOperator object) {
				return createMathOperatorAdapter();
			}
			@Override
			public Adapter caseBooleanOperator(BooleanOperator object) {
				return createBooleanOperatorAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseSet(Set object) {
				return createSetAdapter();
			}
			@Override
			public Adapter caseNumericalOperator(NumericalOperator object) {
				return createNumericalOperatorAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseParameterDefinition(ParameterDefinition object) {
				return createParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object) {
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseParameterCall(ParameterCall object) {
				return createParameterCallAdapter();
			}
			@Override
			public Adapter caseDomainSpecificDiff(DomainSpecificDiff object) {
				return createDomainSpecificDiffAdapter();
			}
			@Override
			public Adapter caseDiffHardware(DiffHardware object) {
				return createDiffHardwareAdapter();
			}
			@Override
			public Adapter caseDiffHardware_platforms(DiffHardware_platforms object) {
				return createDiffHardware_platformsAdapter();
			}
			@Override
			public Adapter caseDiffHardware_modules(DiffHardware_modules object) {
				return createDiffHardware_modulesAdapter();
			}
			@Override
			public Adapter caseDiffHardware_connectors(DiffHardware_connectors object) {
				return createDiffHardware_connectorsAdapter();
			}
			@Override
			public Adapter caseDiffPlatform(DiffPlatform object) {
				return createDiffPlatformAdapter();
			}
			@Override
			public Adapter caseDiffPlatform_digitalPins(DiffPlatform_digitalPins object) {
				return createDiffPlatform_digitalPinsAdapter();
			}
			@Override
			public Adapter caseDiffPlatform_analogPins(DiffPlatform_analogPins object) {
				return createDiffPlatform_analogPinsAdapter();
			}
			@Override
			public Adapter caseDiffDigitalPin(DiffDigitalPin object) {
				return createDiffDigitalPinAdapter();
			}
			@Override
			public Adapter caseDiffAnalogPin(DiffAnalogPin object) {
				return createDiffAnalogPinAdapter();
			}
			@Override
			public Adapter caseDiffSketch(DiffSketch object) {
				return createDiffSketchAdapter();
			}
			@Override
			public Adapter caseDiffSketch_hardware(DiffSketch_hardware object) {
				return createDiffSketch_hardwareAdapter();
			}
			@Override
			public Adapter caseDiffSketch_instructions(DiffSketch_instructions object) {
				return createDiffSketch_instructionsAdapter();
			}
			@Override
			public Adapter caseDiffSketch_functions(DiffSketch_functions object) {
				return createDiffSketch_functionsAdapter();
			}
			@Override
			public Adapter caseDiffProject(DiffProject object) {
				return createDiffProjectAdapter();
			}
			@Override
			public Adapter caseDiffProject_hardware(DiffProject_hardware object) {
				return createDiffProject_hardwareAdapter();
			}
			@Override
			public Adapter caseDiffProject_sketch(DiffProject_sketch object) {
				return createDiffProject_sketchAdapter();
			}
			@Override
			public Adapter caseDiffProject_modules(DiffProject_modules object) {
				return createDiffProject_modulesAdapter();
			}
			@Override
			public Adapter caseDiffProject_platform(DiffProject_platform object) {
				return createDiffProject_platformAdapter();
			}
			@Override
			public Adapter caseDiffProject_domainspecificdiffs(DiffProject_domainspecificdiffs object) {
				return createDiffProject_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter caseDiffInstruction_previous(DiffInstruction_previous object) {
				return createDiffInstruction_previousAdapter();
			}
			@Override
			public Adapter caseDiffInstruction_next(DiffInstruction_next object) {
				return createDiffInstruction_nextAdapter();
			}
			@Override
			public Adapter caseDiffStatus(DiffStatus object) {
				return createDiffStatusAdapter();
			}
			@Override
			public Adapter caseDiffStatus_sensor(DiffStatus_sensor object) {
				return createDiffStatus_sensorAdapter();
			}
			@Override
			public Adapter caseDiffLevel(DiffLevel object) {
				return createDiffLevelAdapter();
			}
			@Override
			public Adapter caseDiffLevel_level(DiffLevel_level object) {
				return createDiffLevel_levelAdapter();
			}
			@Override
			public Adapter caseDiffModuleInstruction_module(DiffModuleInstruction_module object) {
				return createDiffModuleInstruction_moduleAdapter();
			}
			@Override
			public Adapter caseDiffControl_instructions(DiffControl_instructions object) {
				return createDiffControl_instructionsAdapter();
			}
			@Override
			public Adapter caseDiffDelay(DiffDelay object) {
				return createDiffDelayAdapter();
			}
			@Override
			public Adapter caseDiffInputModule(DiffInputModule object) {
				return createDiffInputModuleAdapter();
			}
			@Override
			public Adapter caseDiffOutputModule(DiffOutputModule object) {
				return createDiffOutputModuleAdapter();
			}
			@Override
			public Adapter caseDiffConnector(DiffConnector object) {
				return createDiffConnectorAdapter();
			}
			@Override
			public Adapter caseDiffConnector_pin(DiffConnector_pin object) {
				return createDiffConnector_pinAdapter();
			}
			@Override
			public Adapter caseDiffConnector_module(DiffConnector_module object) {
				return createDiffConnector_moduleAdapter();
			}
			@Override
			public Adapter caseDiffRepeat(DiffRepeat object) {
				return createDiffRepeatAdapter();
			}
			@Override
			public Adapter caseDiffSensor(DiffSensor object) {
				return createDiffSensorAdapter();
			}
			@Override
			public Adapter caseDiffSensor_status(DiffSensor_status object) {
				return createDiffSensor_statusAdapter();
			}
			@Override
			public Adapter caseDiffWhile(DiffWhile object) {
				return createDiffWhileAdapter();
			}
			@Override
			public Adapter caseDiffWhile_condition(DiffWhile_condition object) {
				return createDiffWhile_conditionAdapter();
			}
			@Override
			public Adapter caseDiffMathOperator_left(DiffMathOperator_left object) {
				return createDiffMathOperator_leftAdapter();
			}
			@Override
			public Adapter caseDiffMathOperator_right(DiffMathOperator_right object) {
				return createDiffMathOperator_rightAdapter();
			}
			@Override
			public Adapter caseDiffVariable(DiffVariable object) {
				return createDiffVariableAdapter();
			}
			@Override
			public Adapter caseDiffSet(DiffSet object) {
				return createDiffSetAdapter();
			}
			@Override
			public Adapter caseDiffSet_variable(DiffSet_variable object) {
				return createDiffSet_variableAdapter();
			}
			@Override
			public Adapter caseDiffSet_value(DiffSet_value object) {
				return createDiffSet_valueAdapter();
			}
			@Override
			public Adapter caseDiffNumericalOperator(DiffNumericalOperator object) {
				return createDiffNumericalOperatorAdapter();
			}
			@Override
			public Adapter caseDiffBooleanOperator(DiffBooleanOperator object) {
				return createDiffBooleanOperatorAdapter();
			}
			@Override
			public Adapter caseDiffConstant(DiffConstant object) {
				return createDiffConstantAdapter();
			}
			@Override
			public Adapter caseDiffIf(DiffIf object) {
				return createDiffIfAdapter();
			}
			@Override
			public Adapter caseDiffIf_condition(DiffIf_condition object) {
				return createDiffIf_conditionAdapter();
			}
			@Override
			public Adapter caseDiffFunction(DiffFunction object) {
				return createDiffFunctionAdapter();
			}
			@Override
			public Adapter caseDiffFunction_paramDefs(DiffFunction_paramDefs object) {
				return createDiffFunction_paramDefsAdapter();
			}
			@Override
			public Adapter caseDiffFunction_instructions(DiffFunction_instructions object) {
				return createDiffFunction_instructionsAdapter();
			}
			@Override
			public Adapter caseDiffParameterDefinition(DiffParameterDefinition object) {
				return createDiffParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseDiffParameter_to_definition(DiffParameter_to_definition object) {
				return createDiffParameter_to_definitionAdapter();
			}
			@Override
			public Adapter caseDiffFunctionCall(DiffFunctionCall object) {
				return createDiffFunctionCallAdapter();
			}
			@Override
			public Adapter caseDiffFunctionCall_definition(DiffFunctionCall_definition object) {
				return createDiffFunctionCall_definitionAdapter();
			}
			@Override
			public Adapter caseDiffFunctionCall_parameters(DiffFunctionCall_parameters object) {
				return createDiffFunctionCall_parametersAdapter();
			}
			@Override
			public Adapter caseDiffParameterCall(DiffParameterCall object) {
				return createDiffParameterCallAdapter();
			}
			@Override
			public Adapter caseDiffParameterCall_definition(DiffParameterCall_definition object) {
				return createDiffParameterCall_definitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Hardware <em>Pattern Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Hardware
	 * @generated
	 */
	public Adapter createPattern_HardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Platform <em>Pattern Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Platform
	 * @generated
	 */
	public Adapter createPattern_PlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Module <em>Pattern Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Module
	 * @generated
	 */
	public Adapter createPattern_ModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DigitalPin <em>Pattern Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DigitalPin
	 * @generated
	 */
	public Adapter createPattern_DigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Pin <em>Pattern Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Pin
	 * @generated
	 */
	public Adapter createPattern_PinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_AnalogPin <em>Pattern Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_AnalogPin
	 * @generated
	 */
	public Adapter createPattern_AnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Sketch <em>Pattern Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Sketch
	 * @generated
	 */
	public Adapter createPattern_SketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Project <em>Pattern Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Project
	 * @generated
	 */
	public Adapter createPattern_ProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Instruction <em>Pattern Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Instruction
	 * @generated
	 */
	public Adapter createPattern_InstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Status <em>Pattern Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Status
	 * @generated
	 */
	public Adapter createPattern_StatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Level <em>Pattern Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Level
	 * @generated
	 */
	public Adapter createPattern_LevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_ModuleInstruction <em>Pattern Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_ModuleInstruction
	 * @generated
	 */
	public Adapter createPattern_ModuleInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Control <em>Pattern Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Control
	 * @generated
	 */
	public Adapter createPattern_ControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Utilities <em>Pattern Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Utilities
	 * @generated
	 */
	public Adapter createPattern_UtilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_IO <em>Pattern IO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_IO
	 * @generated
	 */
	public Adapter createPattern_IOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Delay <em>Pattern Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Delay
	 * @generated
	 */
	public Adapter createPattern_DelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_InputModule <em>Pattern Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_InputModule
	 * @generated
	 */
	public Adapter createPattern_InputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_OutputModule <em>Pattern Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_OutputModule
	 * @generated
	 */
	public Adapter createPattern_OutputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_NamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_NamedElement
	 * @generated
	 */
	public Adapter createPattern_NamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Connector <em>Pattern Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Connector
	 * @generated
	 */
	public Adapter createPattern_ConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Repeat <em>Pattern Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Repeat
	 * @generated
	 */
	public Adapter createPattern_RepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Sensor <em>Pattern Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Sensor
	 * @generated
	 */
	public Adapter createPattern_SensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_While <em>Pattern While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_While
	 * @generated
	 */
	public Adapter createPattern_WhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_MathOperator <em>Pattern Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_MathOperator
	 * @generated
	 */
	public Adapter createPattern_MathOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Variable <em>Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Variable
	 * @generated
	 */
	public Adapter createPattern_VariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Set <em>Pattern Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Set
	 * @generated
	 */
	public Adapter createPattern_SetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_NumericalOperator <em>Pattern Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_NumericalOperator
	 * @generated
	 */
	public Adapter createPattern_NumericalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_BooleanOperator <em>Pattern Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_BooleanOperator
	 * @generated
	 */
	public Adapter createPattern_BooleanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Value <em>Pattern Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Value
	 * @generated
	 */
	public Adapter createPattern_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Constant <em>Pattern Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Constant
	 * @generated
	 */
	public Adapter createPattern_ConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_If <em>Pattern If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_If
	 * @generated
	 */
	public Adapter createPattern_IfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Function <em>Pattern Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Function
	 * @generated
	 */
	public Adapter createPattern_FunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_ParameterDefinition <em>Pattern Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_ParameterDefinition
	 * @generated
	 */
	public Adapter createPattern_ParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_Parameter <em>Pattern Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_Parameter
	 * @generated
	 */
	public Adapter createPattern_ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_FunctionCall <em>Pattern Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_FunctionCall
	 * @generated
	 */
	public Adapter createPattern_FunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_ParameterCall <em>Pattern Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_ParameterCall
	 * @generated
	 */
	public Adapter createPattern_ParameterCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	public Adapter createPattern_DomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffHardware <em>Pattern Diff Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffHardware
	 * @generated
	 */
	public Adapter createPattern_DiffHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffHardware_platforms <em>Pattern Diff Hardware platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffHardware_platforms
	 * @generated
	 */
	public Adapter createPattern_DiffHardware_platformsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffHardware_modules <em>Pattern Diff Hardware modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffHardware_modules
	 * @generated
	 */
	public Adapter createPattern_DiffHardware_modulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffHardware_connectors <em>Pattern Diff Hardware connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffHardware_connectors
	 * @generated
	 */
	public Adapter createPattern_DiffHardware_connectorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffPlatform <em>Pattern Diff Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffPlatform
	 * @generated
	 */
	public Adapter createPattern_DiffPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins <em>Pattern Diff Platform digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffPlatform_digitalPins
	 * @generated
	 */
	public Adapter createPattern_DiffPlatform_digitalPinsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffPlatform_analogPins <em>Pattern Diff Platform analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffPlatform_analogPins
	 * @generated
	 */
	public Adapter createPattern_DiffPlatform_analogPinsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffDigitalPin <em>Pattern Diff Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffDigitalPin
	 * @generated
	 */
	public Adapter createPattern_DiffDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffAnalogPin <em>Pattern Diff Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffAnalogPin
	 * @generated
	 */
	public Adapter createPattern_DiffAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSketch <em>Pattern Diff Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSketch
	 * @generated
	 */
	public Adapter createPattern_DiffSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSketch_hardware <em>Pattern Diff Sketch hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSketch_hardware
	 * @generated
	 */
	public Adapter createPattern_DiffSketch_hardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSketch_instructions <em>Pattern Diff Sketch instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSketch_instructions
	 * @generated
	 */
	public Adapter createPattern_DiffSketch_instructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSketch_functions <em>Pattern Diff Sketch functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSketch_functions
	 * @generated
	 */
	public Adapter createPattern_DiffSketch_functionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffProject <em>Pattern Diff Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffProject
	 * @generated
	 */
	public Adapter createPattern_DiffProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffProject_hardware <em>Pattern Diff Project hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffProject_hardware
	 * @generated
	 */
	public Adapter createPattern_DiffProject_hardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffProject_sketch <em>Pattern Diff Project sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffProject_sketch
	 * @generated
	 */
	public Adapter createPattern_DiffProject_sketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffProject_modules <em>Pattern Diff Project modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffProject_modules
	 * @generated
	 */
	public Adapter createPattern_DiffProject_modulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffProject_platform <em>Pattern Diff Project platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffProject_platform
	 * @generated
	 */
	public Adapter createPattern_DiffProject_platformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs <em>Pattern Diff Project domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs
	 * @generated
	 */
	public Adapter createPattern_DiffProject_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffInstruction_previous <em>Pattern Diff Instruction previous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffInstruction_previous
	 * @generated
	 */
	public Adapter createPattern_DiffInstruction_previousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffInstruction_next <em>Pattern Diff Instruction next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffInstruction_next
	 * @generated
	 */
	public Adapter createPattern_DiffInstruction_nextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffStatus <em>Pattern Diff Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffStatus
	 * @generated
	 */
	public Adapter createPattern_DiffStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffStatus_sensor <em>Pattern Diff Status sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffStatus_sensor
	 * @generated
	 */
	public Adapter createPattern_DiffStatus_sensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffLevel <em>Pattern Diff Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffLevel
	 * @generated
	 */
	public Adapter createPattern_DiffLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffLevel_level <em>Pattern Diff Level level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffLevel_level
	 * @generated
	 */
	public Adapter createPattern_DiffLevel_levelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffModuleInstruction_module <em>Pattern Diff Module Instruction module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffModuleInstruction_module
	 * @generated
	 */
	public Adapter createPattern_DiffModuleInstruction_moduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffControl_instructions <em>Pattern Diff Control instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffControl_instructions
	 * @generated
	 */
	public Adapter createPattern_DiffControl_instructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffDelay <em>Pattern Diff Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffDelay
	 * @generated
	 */
	public Adapter createPattern_DiffDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffInputModule <em>Pattern Diff Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffInputModule
	 * @generated
	 */
	public Adapter createPattern_DiffInputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffOutputModule <em>Pattern Diff Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffOutputModule
	 * @generated
	 */
	public Adapter createPattern_DiffOutputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffConnector <em>Pattern Diff Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffConnector
	 * @generated
	 */
	public Adapter createPattern_DiffConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffConnector_pin <em>Pattern Diff Connector pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffConnector_pin
	 * @generated
	 */
	public Adapter createPattern_DiffConnector_pinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffConnector_module <em>Pattern Diff Connector module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffConnector_module
	 * @generated
	 */
	public Adapter createPattern_DiffConnector_moduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffRepeat <em>Pattern Diff Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffRepeat
	 * @generated
	 */
	public Adapter createPattern_DiffRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSensor <em>Pattern Diff Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSensor
	 * @generated
	 */
	public Adapter createPattern_DiffSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSensor_status <em>Pattern Diff Sensor status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSensor_status
	 * @generated
	 */
	public Adapter createPattern_DiffSensor_statusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffWhile <em>Pattern Diff While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffWhile
	 * @generated
	 */
	public Adapter createPattern_DiffWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffWhile_condition <em>Pattern Diff While condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffWhile_condition
	 * @generated
	 */
	public Adapter createPattern_DiffWhile_conditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffMathOperator_left <em>Pattern Diff Math Operator left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffMathOperator_left
	 * @generated
	 */
	public Adapter createPattern_DiffMathOperator_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffMathOperator_right <em>Pattern Diff Math Operator right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffMathOperator_right
	 * @generated
	 */
	public Adapter createPattern_DiffMathOperator_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffVariable <em>Pattern Diff Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffVariable
	 * @generated
	 */
	public Adapter createPattern_DiffVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSet <em>Pattern Diff Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSet
	 * @generated
	 */
	public Adapter createPattern_DiffSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSet_variable <em>Pattern Diff Set variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSet_variable
	 * @generated
	 */
	public Adapter createPattern_DiffSet_variableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffSet_value <em>Pattern Diff Set value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffSet_value
	 * @generated
	 */
	public Adapter createPattern_DiffSet_valueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffNumericalOperator <em>Pattern Diff Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffNumericalOperator
	 * @generated
	 */
	public Adapter createPattern_DiffNumericalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffBooleanOperator <em>Pattern Diff Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffBooleanOperator
	 * @generated
	 */
	public Adapter createPattern_DiffBooleanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffConstant <em>Pattern Diff Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffConstant
	 * @generated
	 */
	public Adapter createPattern_DiffConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffIf <em>Pattern Diff If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffIf
	 * @generated
	 */
	public Adapter createPattern_DiffIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffIf_condition <em>Pattern Diff If condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffIf_condition
	 * @generated
	 */
	public Adapter createPattern_DiffIf_conditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffFunction <em>Pattern Diff Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffFunction
	 * @generated
	 */
	public Adapter createPattern_DiffFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffFunction_paramDefs <em>Pattern Diff Function param Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffFunction_paramDefs
	 * @generated
	 */
	public Adapter createPattern_DiffFunction_paramDefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffFunction_instructions <em>Pattern Diff Function instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffFunction_instructions
	 * @generated
	 */
	public Adapter createPattern_DiffFunction_instructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffParameterDefinition <em>Pattern Diff Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffParameterDefinition
	 * @generated
	 */
	public Adapter createPattern_DiffParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffParameter_to_definition <em>Pattern Diff Parameter to definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffParameter_to_definition
	 * @generated
	 */
	public Adapter createPattern_DiffParameter_to_definitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffFunctionCall <em>Pattern Diff Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall
	 * @generated
	 */
	public Adapter createPattern_DiffFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffFunctionCall_definition <em>Pattern Diff Function Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall_definition
	 * @generated
	 */
	public Adapter createPattern_DiffFunctionCall_definitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffFunctionCall_parameters <em>Pattern Diff Function Call parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall_parameters
	 * @generated
	 */
	public Adapter createPattern_DiffFunctionCall_parametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffParameterCall <em>Pattern Diff Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffParameterCall
	 * @generated
	 */
	public Adapter createPattern_DiffParameterCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Pattern_DiffParameterCall_definition <em>Pattern Diff Parameter Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Pattern_DiffParameterCall_definition
	 * @generated
	 */
	public Adapter createPattern_DiffParameterCall_definitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DigitalPin
	 * @generated
	 */
	public Adapter createDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.AnalogPin
	 * @generated
	 */
	public Adapter createAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Sketch
	 * @generated
	 */
	public Adapter createSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.ModuleInstruction <em>Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.ModuleInstruction
	 * @generated
	 */
	public Adapter createModuleInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Utilities <em>Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Utilities
	 * @generated
	 */
	public Adapter createUtilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.IO <em>IO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.IO
	 * @generated
	 */
	public Adapter createIOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.InputModule <em>Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.InputModule
	 * @generated
	 */
	public Adapter createInputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.OutputModule <em>Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.OutputModule
	 * @generated
	 */
	public Adapter createOutputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.MathOperator <em>Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.MathOperator
	 * @generated
	 */
	public Adapter createMathOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.BooleanOperator
	 * @generated
	 */
	public Adapter createBooleanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.NumericalOperator <em>Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.NumericalOperator
	 * @generated
	 */
	public Adapter createNumericalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.ParameterCall
	 * @generated
	 */
	public Adapter createParameterCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DomainSpecificDiff
	 * @generated
	 */
	public Adapter createDomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffHardware <em>Diff Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffHardware
	 * @generated
	 */
	public Adapter createDiffHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffHardware_platforms <em>Diff Hardware platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffHardware_platforms
	 * @generated
	 */
	public Adapter createDiffHardware_platformsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffHardware_modules <em>Diff Hardware modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffHardware_modules
	 * @generated
	 */
	public Adapter createDiffHardware_modulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffHardware_connectors <em>Diff Hardware connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffHardware_connectors
	 * @generated
	 */
	public Adapter createDiffHardware_connectorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffPlatform <em>Diff Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffPlatform
	 * @generated
	 */
	public Adapter createDiffPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffPlatform_digitalPins <em>Diff Platform digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffPlatform_digitalPins
	 * @generated
	 */
	public Adapter createDiffPlatform_digitalPinsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffPlatform_analogPins <em>Diff Platform analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffPlatform_analogPins
	 * @generated
	 */
	public Adapter createDiffPlatform_analogPinsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffDigitalPin <em>Diff Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffDigitalPin
	 * @generated
	 */
	public Adapter createDiffDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffAnalogPin <em>Diff Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffAnalogPin
	 * @generated
	 */
	public Adapter createDiffAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSketch <em>Diff Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSketch
	 * @generated
	 */
	public Adapter createDiffSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSketch_hardware <em>Diff Sketch hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSketch_hardware
	 * @generated
	 */
	public Adapter createDiffSketch_hardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSketch_instructions <em>Diff Sketch instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSketch_instructions
	 * @generated
	 */
	public Adapter createDiffSketch_instructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSketch_functions <em>Diff Sketch functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSketch_functions
	 * @generated
	 */
	public Adapter createDiffSketch_functionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffProject <em>Diff Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffProject
	 * @generated
	 */
	public Adapter createDiffProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffProject_hardware <em>Diff Project hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffProject_hardware
	 * @generated
	 */
	public Adapter createDiffProject_hardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffProject_sketch <em>Diff Project sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffProject_sketch
	 * @generated
	 */
	public Adapter createDiffProject_sketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffProject_modules <em>Diff Project modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffProject_modules
	 * @generated
	 */
	public Adapter createDiffProject_modulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffProject_platform <em>Diff Project platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffProject_platform
	 * @generated
	 */
	public Adapter createDiffProject_platformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffProject_domainspecificdiffs <em>Diff Project domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffProject_domainspecificdiffs
	 * @generated
	 */
	public Adapter createDiffProject_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffInstruction_previous <em>Diff Instruction previous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffInstruction_previous
	 * @generated
	 */
	public Adapter createDiffInstruction_previousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffInstruction_next <em>Diff Instruction next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffInstruction_next
	 * @generated
	 */
	public Adapter createDiffInstruction_nextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffStatus <em>Diff Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffStatus
	 * @generated
	 */
	public Adapter createDiffStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffStatus_sensor <em>Diff Status sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffStatus_sensor
	 * @generated
	 */
	public Adapter createDiffStatus_sensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffLevel <em>Diff Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffLevel
	 * @generated
	 */
	public Adapter createDiffLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffLevel_level <em>Diff Level level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffLevel_level
	 * @generated
	 */
	public Adapter createDiffLevel_levelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffModuleInstruction_module <em>Diff Module Instruction module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffModuleInstruction_module
	 * @generated
	 */
	public Adapter createDiffModuleInstruction_moduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffControl_instructions <em>Diff Control instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffControl_instructions
	 * @generated
	 */
	public Adapter createDiffControl_instructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffDelay <em>Diff Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffDelay
	 * @generated
	 */
	public Adapter createDiffDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffInputModule <em>Diff Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffInputModule
	 * @generated
	 */
	public Adapter createDiffInputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffOutputModule <em>Diff Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffOutputModule
	 * @generated
	 */
	public Adapter createDiffOutputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffConnector <em>Diff Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffConnector
	 * @generated
	 */
	public Adapter createDiffConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffConnector_pin <em>Diff Connector pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffConnector_pin
	 * @generated
	 */
	public Adapter createDiffConnector_pinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffConnector_module <em>Diff Connector module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffConnector_module
	 * @generated
	 */
	public Adapter createDiffConnector_moduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffRepeat <em>Diff Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffRepeat
	 * @generated
	 */
	public Adapter createDiffRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSensor <em>Diff Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSensor
	 * @generated
	 */
	public Adapter createDiffSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSensor_status <em>Diff Sensor status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSensor_status
	 * @generated
	 */
	public Adapter createDiffSensor_statusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffWhile <em>Diff While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffWhile
	 * @generated
	 */
	public Adapter createDiffWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffWhile_condition <em>Diff While condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffWhile_condition
	 * @generated
	 */
	public Adapter createDiffWhile_conditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffMathOperator_left <em>Diff Math Operator left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffMathOperator_left
	 * @generated
	 */
	public Adapter createDiffMathOperator_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffMathOperator_right <em>Diff Math Operator right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffMathOperator_right
	 * @generated
	 */
	public Adapter createDiffMathOperator_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffVariable <em>Diff Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffVariable
	 * @generated
	 */
	public Adapter createDiffVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSet <em>Diff Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSet
	 * @generated
	 */
	public Adapter createDiffSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSet_variable <em>Diff Set variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSet_variable
	 * @generated
	 */
	public Adapter createDiffSet_variableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffSet_value <em>Diff Set value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffSet_value
	 * @generated
	 */
	public Adapter createDiffSet_valueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffNumericalOperator <em>Diff Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffNumericalOperator
	 * @generated
	 */
	public Adapter createDiffNumericalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffBooleanOperator <em>Diff Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffBooleanOperator
	 * @generated
	 */
	public Adapter createDiffBooleanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffConstant <em>Diff Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffConstant
	 * @generated
	 */
	public Adapter createDiffConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffIf <em>Diff If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffIf
	 * @generated
	 */
	public Adapter createDiffIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffIf_condition <em>Diff If condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffIf_condition
	 * @generated
	 */
	public Adapter createDiffIf_conditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffFunction <em>Diff Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffFunction
	 * @generated
	 */
	public Adapter createDiffFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffFunction_paramDefs <em>Diff Function param Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffFunction_paramDefs
	 * @generated
	 */
	public Adapter createDiffFunction_paramDefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffFunction_instructions <em>Diff Function instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffFunction_instructions
	 * @generated
	 */
	public Adapter createDiffFunction_instructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffParameterDefinition <em>Diff Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffParameterDefinition
	 * @generated
	 */
	public Adapter createDiffParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffParameter_to_definition <em>Diff Parameter to definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffParameter_to_definition
	 * @generated
	 */
	public Adapter createDiffParameter_to_definitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffFunctionCall <em>Diff Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffFunctionCall
	 * @generated
	 */
	public Adapter createDiffFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffFunctionCall_definition <em>Diff Function Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffFunctionCall_definition
	 * @generated
	 */
	public Adapter createDiffFunctionCall_definitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffFunctionCall_parameters <em>Diff Function Call parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffFunctionCall_parameters
	 * @generated
	 */
	public Adapter createDiffFunctionCall_parametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffParameterCall <em>Diff Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffParameterCall
	 * @generated
	 */
	public Adapter createDiffParameterCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoDiffMM.DiffParameterCall_definition <em>Diff Parameter Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoDiffMM.DiffParameterCall_definition
	 * @generated
	 */
	public Adapter createDiffParameterCall_definitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArduinoRuleMMAdapterFactory
