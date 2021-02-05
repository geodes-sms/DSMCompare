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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoRuleMM.ArduinoRuleMMPackage
 * @generated
 */
public class ArduinoRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArduinoRuleMMPackage.PATTERN_HARDWARE: {
				Pattern_Hardware pattern_Hardware = (Pattern_Hardware)theEObject;
				T result = casePattern_Hardware(pattern_Hardware);
				if (result == null) result = caseHardware(pattern_Hardware);
				if (result == null) result = caseNamedElement(pattern_Hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_PLATFORM: {
				Pattern_Platform pattern_Platform = (Pattern_Platform)theEObject;
				T result = casePattern_Platform(pattern_Platform);
				if (result == null) result = casePlatform(pattern_Platform);
				if (result == null) result = caseNamedElement(pattern_Platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_MODULE: {
				Pattern_Module pattern_Module = (Pattern_Module)theEObject;
				T result = casePattern_Module(pattern_Module);
				if (result == null) result = caseModule(pattern_Module);
				if (result == null) result = caseNamedElement(pattern_Module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIGITAL_PIN: {
				Pattern_DigitalPin pattern_DigitalPin = (Pattern_DigitalPin)theEObject;
				T result = casePattern_DigitalPin(pattern_DigitalPin);
				if (result == null) result = caseDigitalPin(pattern_DigitalPin);
				if (result == null) result = casePin(pattern_DigitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_PIN: {
				Pattern_Pin pattern_Pin = (Pattern_Pin)theEObject;
				T result = casePattern_Pin(pattern_Pin);
				if (result == null) result = casePin(pattern_Pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_ANALOG_PIN: {
				Pattern_AnalogPin pattern_AnalogPin = (Pattern_AnalogPin)theEObject;
				T result = casePattern_AnalogPin(pattern_AnalogPin);
				if (result == null) result = caseAnalogPin(pattern_AnalogPin);
				if (result == null) result = casePin(pattern_AnalogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_SKETCH: {
				Pattern_Sketch pattern_Sketch = (Pattern_Sketch)theEObject;
				T result = casePattern_Sketch(pattern_Sketch);
				if (result == null) result = caseSketch(pattern_Sketch);
				if (result == null) result = caseNamedElement(pattern_Sketch);
				if (result == null) result = caseInstruction(pattern_Sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_PROJECT: {
				Pattern_Project pattern_Project = (Pattern_Project)theEObject;
				T result = casePattern_Project(pattern_Project);
				if (result == null) result = caseProject(pattern_Project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_INSTRUCTION: {
				Pattern_Instruction pattern_Instruction = (Pattern_Instruction)theEObject;
				T result = casePattern_Instruction(pattern_Instruction);
				if (result == null) result = caseInstruction(pattern_Instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_STATUS: {
				Pattern_Status pattern_Status = (Pattern_Status)theEObject;
				T result = casePattern_Status(pattern_Status);
				if (result == null) result = caseStatus(pattern_Status);
				if (result == null) result = caseModuleInstruction(pattern_Status);
				if (result == null) result = caseValue(pattern_Status);
				if (result == null) result = caseInstruction(pattern_Status);
				if (result == null) result = caseParameter(pattern_Status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_LEVEL: {
				Pattern_Level pattern_Level = (Pattern_Level)theEObject;
				T result = casePattern_Level(pattern_Level);
				if (result == null) result = caseLevel(pattern_Level);
				if (result == null) result = caseModuleInstruction(pattern_Level);
				if (result == null) result = caseInstruction(pattern_Level);
				if (result == null) result = caseParameter(pattern_Level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_MODULE_INSTRUCTION: {
				Pattern_ModuleInstruction pattern_ModuleInstruction = (Pattern_ModuleInstruction)theEObject;
				T result = casePattern_ModuleInstruction(pattern_ModuleInstruction);
				if (result == null) result = caseModuleInstruction(pattern_ModuleInstruction);
				if (result == null) result = caseInstruction(pattern_ModuleInstruction);
				if (result == null) result = caseParameter(pattern_ModuleInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_CONTROL: {
				Pattern_Control pattern_Control = (Pattern_Control)theEObject;
				T result = casePattern_Control(pattern_Control);
				if (result == null) result = caseControl(pattern_Control);
				if (result == null) result = caseInstruction(pattern_Control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_UTILITIES: {
				Pattern_Utilities pattern_Utilities = (Pattern_Utilities)theEObject;
				T result = casePattern_Utilities(pattern_Utilities);
				if (result == null) result = caseUtilities(pattern_Utilities);
				if (result == null) result = caseInstruction(pattern_Utilities);
				if (result == null) result = caseParameter(pattern_Utilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_IO: {
				Pattern_IO pattern_IO = (Pattern_IO)theEObject;
				T result = casePattern_IO(pattern_IO);
				if (result == null) result = caseIO(pattern_IO);
				if (result == null) result = caseInstruction(pattern_IO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DELAY: {
				Pattern_Delay pattern_Delay = (Pattern_Delay)theEObject;
				T result = casePattern_Delay(pattern_Delay);
				if (result == null) result = caseDelay(pattern_Delay);
				if (result == null) result = caseUtilities(pattern_Delay);
				if (result == null) result = caseInstruction(pattern_Delay);
				if (result == null) result = caseParameter(pattern_Delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_INPUT_MODULE: {
				Pattern_InputModule pattern_InputModule = (Pattern_InputModule)theEObject;
				T result = casePattern_InputModule(pattern_InputModule);
				if (result == null) result = caseInputModule(pattern_InputModule);
				if (result == null) result = caseModule(pattern_InputModule);
				if (result == null) result = caseNamedElement(pattern_InputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_OUTPUT_MODULE: {
				Pattern_OutputModule pattern_OutputModule = (Pattern_OutputModule)theEObject;
				T result = casePattern_OutputModule(pattern_OutputModule);
				if (result == null) result = caseOutputModule(pattern_OutputModule);
				if (result == null) result = caseModule(pattern_OutputModule);
				if (result == null) result = caseNamedElement(pattern_OutputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_NAMED_ELEMENT: {
				Pattern_NamedElement pattern_NamedElement = (Pattern_NamedElement)theEObject;
				T result = casePattern_NamedElement(pattern_NamedElement);
				if (result == null) result = caseNamedElement(pattern_NamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_CONNECTOR: {
				Pattern_Connector pattern_Connector = (Pattern_Connector)theEObject;
				T result = casePattern_Connector(pattern_Connector);
				if (result == null) result = caseConnector(pattern_Connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_REPEAT: {
				Pattern_Repeat pattern_Repeat = (Pattern_Repeat)theEObject;
				T result = casePattern_Repeat(pattern_Repeat);
				if (result == null) result = caseRepeat(pattern_Repeat);
				if (result == null) result = caseControl(pattern_Repeat);
				if (result == null) result = caseInstruction(pattern_Repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_SENSOR: {
				Pattern_Sensor pattern_Sensor = (Pattern_Sensor)theEObject;
				T result = casePattern_Sensor(pattern_Sensor);
				if (result == null) result = caseSensor(pattern_Sensor);
				if (result == null) result = caseModuleInstruction(pattern_Sensor);
				if (result == null) result = caseBooleanOperator(pattern_Sensor);
				if (result == null) result = caseMathOperator(pattern_Sensor);
				if (result == null) result = caseValue(pattern_Sensor);
				if (result == null) result = caseInstruction(pattern_Sensor);
				if (result == null) result = caseParameter(pattern_Sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_WHILE: {
				Pattern_While pattern_While = (Pattern_While)theEObject;
				T result = casePattern_While(pattern_While);
				if (result == null) result = caseWhile(pattern_While);
				if (result == null) result = caseControl(pattern_While);
				if (result == null) result = caseInstruction(pattern_While);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_MATH_OPERATOR: {
				Pattern_MathOperator pattern_MathOperator = (Pattern_MathOperator)theEObject;
				T result = casePattern_MathOperator(pattern_MathOperator);
				if (result == null) result = caseMathOperator(pattern_MathOperator);
				if (result == null) result = caseValue(pattern_MathOperator);
				if (result == null) result = caseInstruction(pattern_MathOperator);
				if (result == null) result = caseParameter(pattern_MathOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_VARIABLE: {
				Pattern_Variable pattern_Variable = (Pattern_Variable)theEObject;
				T result = casePattern_Variable(pattern_Variable);
				if (result == null) result = caseVariable(pattern_Variable);
				if (result == null) result = caseValue(pattern_Variable);
				if (result == null) result = caseInstruction(pattern_Variable);
				if (result == null) result = caseParameter(pattern_Variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_SET: {
				Pattern_Set pattern_Set = (Pattern_Set)theEObject;
				T result = casePattern_Set(pattern_Set);
				if (result == null) result = caseSet(pattern_Set);
				if (result == null) result = caseInstruction(pattern_Set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_NUMERICAL_OPERATOR: {
				Pattern_NumericalOperator pattern_NumericalOperator = (Pattern_NumericalOperator)theEObject;
				T result = casePattern_NumericalOperator(pattern_NumericalOperator);
				if (result == null) result = caseNumericalOperator(pattern_NumericalOperator);
				if (result == null) result = caseMathOperator(pattern_NumericalOperator);
				if (result == null) result = caseValue(pattern_NumericalOperator);
				if (result == null) result = caseInstruction(pattern_NumericalOperator);
				if (result == null) result = caseParameter(pattern_NumericalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_BOOLEAN_OPERATOR: {
				Pattern_BooleanOperator pattern_BooleanOperator = (Pattern_BooleanOperator)theEObject;
				T result = casePattern_BooleanOperator(pattern_BooleanOperator);
				if (result == null) result = caseBooleanOperator(pattern_BooleanOperator);
				if (result == null) result = caseMathOperator(pattern_BooleanOperator);
				if (result == null) result = caseValue(pattern_BooleanOperator);
				if (result == null) result = caseInstruction(pattern_BooleanOperator);
				if (result == null) result = caseParameter(pattern_BooleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_VALUE: {
				Pattern_Value pattern_Value = (Pattern_Value)theEObject;
				T result = casePattern_Value(pattern_Value);
				if (result == null) result = caseValue(pattern_Value);
				if (result == null) result = caseInstruction(pattern_Value);
				if (result == null) result = caseParameter(pattern_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_CONSTANT: {
				Pattern_Constant pattern_Constant = (Pattern_Constant)theEObject;
				T result = casePattern_Constant(pattern_Constant);
				if (result == null) result = caseConstant(pattern_Constant);
				if (result == null) result = caseValue(pattern_Constant);
				if (result == null) result = caseInstruction(pattern_Constant);
				if (result == null) result = caseParameter(pattern_Constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_IF: {
				Pattern_If pattern_If = (Pattern_If)theEObject;
				T result = casePattern_If(pattern_If);
				if (result == null) result = caseIf(pattern_If);
				if (result == null) result = caseControl(pattern_If);
				if (result == null) result = caseInstruction(pattern_If);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_FUNCTION: {
				Pattern_Function pattern_Function = (Pattern_Function)theEObject;
				T result = casePattern_Function(pattern_Function);
				if (result == null) result = caseFunction(pattern_Function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_PARAMETER_DEFINITION: {
				Pattern_ParameterDefinition pattern_ParameterDefinition = (Pattern_ParameterDefinition)theEObject;
				T result = casePattern_ParameterDefinition(pattern_ParameterDefinition);
				if (result == null) result = caseParameterDefinition(pattern_ParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_PARAMETER: {
				Pattern_Parameter pattern_Parameter = (Pattern_Parameter)theEObject;
				T result = casePattern_Parameter(pattern_Parameter);
				if (result == null) result = caseParameter(pattern_Parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_FUNCTION_CALL: {
				Pattern_FunctionCall pattern_FunctionCall = (Pattern_FunctionCall)theEObject;
				T result = casePattern_FunctionCall(pattern_FunctionCall);
				if (result == null) result = caseFunctionCall(pattern_FunctionCall);
				if (result == null) result = caseInstruction(pattern_FunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_PARAMETER_CALL: {
				Pattern_ParameterCall pattern_ParameterCall = (Pattern_ParameterCall)theEObject;
				T result = casePattern_ParameterCall(pattern_ParameterCall);
				if (result == null) result = caseParameterCall(pattern_ParameterCall);
				if (result == null) result = caseInstruction(pattern_ParameterCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: {
				Pattern_DomainSpecificDiff pattern_DomainSpecificDiff = (Pattern_DomainSpecificDiff)theEObject;
				T result = casePattern_DomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = caseDomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE: {
				Pattern_DiffHardware pattern_DiffHardware = (Pattern_DiffHardware)theEObject;
				T result = casePattern_DiffHardware(pattern_DiffHardware);
				if (result == null) result = caseDiffHardware(pattern_DiffHardware);
				if (result == null) result = caseHardware(pattern_DiffHardware);
				if (result == null) result = caseNamedElement(pattern_DiffHardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE_PLATFORMS: {
				Pattern_DiffHardware_platforms pattern_DiffHardware_platforms = (Pattern_DiffHardware_platforms)theEObject;
				T result = casePattern_DiffHardware_platforms(pattern_DiffHardware_platforms);
				if (result == null) result = caseDiffHardware_platforms(pattern_DiffHardware_platforms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE_MODULES: {
				Pattern_DiffHardware_modules pattern_DiffHardware_modules = (Pattern_DiffHardware_modules)theEObject;
				T result = casePattern_DiffHardware_modules(pattern_DiffHardware_modules);
				if (result == null) result = caseDiffHardware_modules(pattern_DiffHardware_modules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_HARDWARE_CONNECTORS: {
				Pattern_DiffHardware_connectors pattern_DiffHardware_connectors = (Pattern_DiffHardware_connectors)theEObject;
				T result = casePattern_DiffHardware_connectors(pattern_DiffHardware_connectors);
				if (result == null) result = caseDiffHardware_connectors(pattern_DiffHardware_connectors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PLATFORM: {
				Pattern_DiffPlatform pattern_DiffPlatform = (Pattern_DiffPlatform)theEObject;
				T result = casePattern_DiffPlatform(pattern_DiffPlatform);
				if (result == null) result = caseDiffPlatform(pattern_DiffPlatform);
				if (result == null) result = casePlatform(pattern_DiffPlatform);
				if (result == null) result = caseNamedElement(pattern_DiffPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PLATFORM_DIGITAL_PINS: {
				Pattern_DiffPlatform_digitalPins pattern_DiffPlatform_digitalPins = (Pattern_DiffPlatform_digitalPins)theEObject;
				T result = casePattern_DiffPlatform_digitalPins(pattern_DiffPlatform_digitalPins);
				if (result == null) result = caseDiffPlatform_digitalPins(pattern_DiffPlatform_digitalPins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PLATFORM_ANALOG_PINS: {
				Pattern_DiffPlatform_analogPins pattern_DiffPlatform_analogPins = (Pattern_DiffPlatform_analogPins)theEObject;
				T result = casePattern_DiffPlatform_analogPins(pattern_DiffPlatform_analogPins);
				if (result == null) result = caseDiffPlatform_analogPins(pattern_DiffPlatform_analogPins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_DIGITAL_PIN: {
				Pattern_DiffDigitalPin pattern_DiffDigitalPin = (Pattern_DiffDigitalPin)theEObject;
				T result = casePattern_DiffDigitalPin(pattern_DiffDigitalPin);
				if (result == null) result = caseDiffDigitalPin(pattern_DiffDigitalPin);
				if (result == null) result = caseDigitalPin(pattern_DiffDigitalPin);
				if (result == null) result = casePin(pattern_DiffDigitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_ANALOG_PIN: {
				Pattern_DiffAnalogPin pattern_DiffAnalogPin = (Pattern_DiffAnalogPin)theEObject;
				T result = casePattern_DiffAnalogPin(pattern_DiffAnalogPin);
				if (result == null) result = caseDiffAnalogPin(pattern_DiffAnalogPin);
				if (result == null) result = caseAnalogPin(pattern_DiffAnalogPin);
				if (result == null) result = casePin(pattern_DiffAnalogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH: {
				Pattern_DiffSketch pattern_DiffSketch = (Pattern_DiffSketch)theEObject;
				T result = casePattern_DiffSketch(pattern_DiffSketch);
				if (result == null) result = caseDiffSketch(pattern_DiffSketch);
				if (result == null) result = caseSketch(pattern_DiffSketch);
				if (result == null) result = caseNamedElement(pattern_DiffSketch);
				if (result == null) result = caseInstruction(pattern_DiffSketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH_HARDWARE: {
				Pattern_DiffSketch_hardware pattern_DiffSketch_hardware = (Pattern_DiffSketch_hardware)theEObject;
				T result = casePattern_DiffSketch_hardware(pattern_DiffSketch_hardware);
				if (result == null) result = caseDiffSketch_hardware(pattern_DiffSketch_hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH_INSTRUCTIONS: {
				Pattern_DiffSketch_instructions pattern_DiffSketch_instructions = (Pattern_DiffSketch_instructions)theEObject;
				T result = casePattern_DiffSketch_instructions(pattern_DiffSketch_instructions);
				if (result == null) result = caseDiffSketch_instructions(pattern_DiffSketch_instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SKETCH_FUNCTIONS: {
				Pattern_DiffSketch_functions pattern_DiffSketch_functions = (Pattern_DiffSketch_functions)theEObject;
				T result = casePattern_DiffSketch_functions(pattern_DiffSketch_functions);
				if (result == null) result = caseDiffSketch_functions(pattern_DiffSketch_functions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT: {
				Pattern_DiffProject pattern_DiffProject = (Pattern_DiffProject)theEObject;
				T result = casePattern_DiffProject(pattern_DiffProject);
				if (result == null) result = caseDiffProject(pattern_DiffProject);
				if (result == null) result = caseProject(pattern_DiffProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_HARDWARE: {
				Pattern_DiffProject_hardware pattern_DiffProject_hardware = (Pattern_DiffProject_hardware)theEObject;
				T result = casePattern_DiffProject_hardware(pattern_DiffProject_hardware);
				if (result == null) result = caseDiffProject_hardware(pattern_DiffProject_hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_SKETCH: {
				Pattern_DiffProject_sketch pattern_DiffProject_sketch = (Pattern_DiffProject_sketch)theEObject;
				T result = casePattern_DiffProject_sketch(pattern_DiffProject_sketch);
				if (result == null) result = caseDiffProject_sketch(pattern_DiffProject_sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_MODULES: {
				Pattern_DiffProject_modules pattern_DiffProject_modules = (Pattern_DiffProject_modules)theEObject;
				T result = casePattern_DiffProject_modules(pattern_DiffProject_modules);
				if (result == null) result = caseDiffProject_modules(pattern_DiffProject_modules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_PLATFORM: {
				Pattern_DiffProject_platform pattern_DiffProject_platform = (Pattern_DiffProject_platform)theEObject;
				T result = casePattern_DiffProject_platform(pattern_DiffProject_platform);
				if (result == null) result = caseDiffProject_platform(pattern_DiffProject_platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS: {
				Pattern_DiffProject_domainspecificdiffs pattern_DiffProject_domainspecificdiffs = (Pattern_DiffProject_domainspecificdiffs)theEObject;
				T result = casePattern_DiffProject_domainspecificdiffs(pattern_DiffProject_domainspecificdiffs);
				if (result == null) result = caseDiffProject_domainspecificdiffs(pattern_DiffProject_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_INSTRUCTION_PREVIOUS: {
				Pattern_DiffInstruction_previous pattern_DiffInstruction_previous = (Pattern_DiffInstruction_previous)theEObject;
				T result = casePattern_DiffInstruction_previous(pattern_DiffInstruction_previous);
				if (result == null) result = caseDiffInstruction_previous(pattern_DiffInstruction_previous);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_INSTRUCTION_NEXT: {
				Pattern_DiffInstruction_next pattern_DiffInstruction_next = (Pattern_DiffInstruction_next)theEObject;
				T result = casePattern_DiffInstruction_next(pattern_DiffInstruction_next);
				if (result == null) result = caseDiffInstruction_next(pattern_DiffInstruction_next);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_STATUS: {
				Pattern_DiffStatus pattern_DiffStatus = (Pattern_DiffStatus)theEObject;
				T result = casePattern_DiffStatus(pattern_DiffStatus);
				if (result == null) result = caseDiffStatus(pattern_DiffStatus);
				if (result == null) result = caseStatus(pattern_DiffStatus);
				if (result == null) result = caseModuleInstruction(pattern_DiffStatus);
				if (result == null) result = caseValue(pattern_DiffStatus);
				if (result == null) result = caseInstruction(pattern_DiffStatus);
				if (result == null) result = caseParameter(pattern_DiffStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_STATUS_SENSOR: {
				Pattern_DiffStatus_sensor pattern_DiffStatus_sensor = (Pattern_DiffStatus_sensor)theEObject;
				T result = casePattern_DiffStatus_sensor(pattern_DiffStatus_sensor);
				if (result == null) result = caseDiffStatus_sensor(pattern_DiffStatus_sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_LEVEL: {
				Pattern_DiffLevel pattern_DiffLevel = (Pattern_DiffLevel)theEObject;
				T result = casePattern_DiffLevel(pattern_DiffLevel);
				if (result == null) result = caseDiffLevel(pattern_DiffLevel);
				if (result == null) result = caseLevel(pattern_DiffLevel);
				if (result == null) result = caseModuleInstruction(pattern_DiffLevel);
				if (result == null) result = caseInstruction(pattern_DiffLevel);
				if (result == null) result = caseParameter(pattern_DiffLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_LEVEL_LEVEL: {
				Pattern_DiffLevel_level pattern_DiffLevel_level = (Pattern_DiffLevel_level)theEObject;
				T result = casePattern_DiffLevel_level(pattern_DiffLevel_level);
				if (result == null) result = caseDiffLevel_level(pattern_DiffLevel_level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_MODULE_INSTRUCTION_MODULE: {
				Pattern_DiffModuleInstruction_module pattern_DiffModuleInstruction_module = (Pattern_DiffModuleInstruction_module)theEObject;
				T result = casePattern_DiffModuleInstruction_module(pattern_DiffModuleInstruction_module);
				if (result == null) result = caseDiffModuleInstruction_module(pattern_DiffModuleInstruction_module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONTROL_INSTRUCTIONS: {
				Pattern_DiffControl_instructions pattern_DiffControl_instructions = (Pattern_DiffControl_instructions)theEObject;
				T result = casePattern_DiffControl_instructions(pattern_DiffControl_instructions);
				if (result == null) result = caseDiffControl_instructions(pattern_DiffControl_instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_DELAY: {
				Pattern_DiffDelay pattern_DiffDelay = (Pattern_DiffDelay)theEObject;
				T result = casePattern_DiffDelay(pattern_DiffDelay);
				if (result == null) result = caseDiffDelay(pattern_DiffDelay);
				if (result == null) result = caseDelay(pattern_DiffDelay);
				if (result == null) result = caseUtilities(pattern_DiffDelay);
				if (result == null) result = caseInstruction(pattern_DiffDelay);
				if (result == null) result = caseParameter(pattern_DiffDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_INPUT_MODULE: {
				Pattern_DiffInputModule pattern_DiffInputModule = (Pattern_DiffInputModule)theEObject;
				T result = casePattern_DiffInputModule(pattern_DiffInputModule);
				if (result == null) result = caseDiffInputModule(pattern_DiffInputModule);
				if (result == null) result = caseInputModule(pattern_DiffInputModule);
				if (result == null) result = caseModule(pattern_DiffInputModule);
				if (result == null) result = caseNamedElement(pattern_DiffInputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_OUTPUT_MODULE: {
				Pattern_DiffOutputModule pattern_DiffOutputModule = (Pattern_DiffOutputModule)theEObject;
				T result = casePattern_DiffOutputModule(pattern_DiffOutputModule);
				if (result == null) result = caseDiffOutputModule(pattern_DiffOutputModule);
				if (result == null) result = caseOutputModule(pattern_DiffOutputModule);
				if (result == null) result = caseModule(pattern_DiffOutputModule);
				if (result == null) result = caseNamedElement(pattern_DiffOutputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONNECTOR: {
				Pattern_DiffConnector pattern_DiffConnector = (Pattern_DiffConnector)theEObject;
				T result = casePattern_DiffConnector(pattern_DiffConnector);
				if (result == null) result = caseDiffConnector(pattern_DiffConnector);
				if (result == null) result = caseConnector(pattern_DiffConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONNECTOR_PIN: {
				Pattern_DiffConnector_pin pattern_DiffConnector_pin = (Pattern_DiffConnector_pin)theEObject;
				T result = casePattern_DiffConnector_pin(pattern_DiffConnector_pin);
				if (result == null) result = caseDiffConnector_pin(pattern_DiffConnector_pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONNECTOR_MODULE: {
				Pattern_DiffConnector_module pattern_DiffConnector_module = (Pattern_DiffConnector_module)theEObject;
				T result = casePattern_DiffConnector_module(pattern_DiffConnector_module);
				if (result == null) result = caseDiffConnector_module(pattern_DiffConnector_module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_REPEAT: {
				Pattern_DiffRepeat pattern_DiffRepeat = (Pattern_DiffRepeat)theEObject;
				T result = casePattern_DiffRepeat(pattern_DiffRepeat);
				if (result == null) result = caseDiffRepeat(pattern_DiffRepeat);
				if (result == null) result = caseRepeat(pattern_DiffRepeat);
				if (result == null) result = caseControl(pattern_DiffRepeat);
				if (result == null) result = caseInstruction(pattern_DiffRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SENSOR: {
				Pattern_DiffSensor pattern_DiffSensor = (Pattern_DiffSensor)theEObject;
				T result = casePattern_DiffSensor(pattern_DiffSensor);
				if (result == null) result = caseDiffSensor(pattern_DiffSensor);
				if (result == null) result = caseSensor(pattern_DiffSensor);
				if (result == null) result = caseModuleInstruction(pattern_DiffSensor);
				if (result == null) result = caseBooleanOperator(pattern_DiffSensor);
				if (result == null) result = caseMathOperator(pattern_DiffSensor);
				if (result == null) result = caseValue(pattern_DiffSensor);
				if (result == null) result = caseInstruction(pattern_DiffSensor);
				if (result == null) result = caseParameter(pattern_DiffSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SENSOR_STATUS: {
				Pattern_DiffSensor_status pattern_DiffSensor_status = (Pattern_DiffSensor_status)theEObject;
				T result = casePattern_DiffSensor_status(pattern_DiffSensor_status);
				if (result == null) result = caseDiffSensor_status(pattern_DiffSensor_status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_WHILE: {
				Pattern_DiffWhile pattern_DiffWhile = (Pattern_DiffWhile)theEObject;
				T result = casePattern_DiffWhile(pattern_DiffWhile);
				if (result == null) result = caseDiffWhile(pattern_DiffWhile);
				if (result == null) result = caseWhile(pattern_DiffWhile);
				if (result == null) result = caseControl(pattern_DiffWhile);
				if (result == null) result = caseInstruction(pattern_DiffWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_WHILE_CONDITION: {
				Pattern_DiffWhile_condition pattern_DiffWhile_condition = (Pattern_DiffWhile_condition)theEObject;
				T result = casePattern_DiffWhile_condition(pattern_DiffWhile_condition);
				if (result == null) result = caseDiffWhile_condition(pattern_DiffWhile_condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_MATH_OPERATOR_LEFT: {
				Pattern_DiffMathOperator_left pattern_DiffMathOperator_left = (Pattern_DiffMathOperator_left)theEObject;
				T result = casePattern_DiffMathOperator_left(pattern_DiffMathOperator_left);
				if (result == null) result = caseDiffMathOperator_left(pattern_DiffMathOperator_left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_MATH_OPERATOR_RIGHT: {
				Pattern_DiffMathOperator_right pattern_DiffMathOperator_right = (Pattern_DiffMathOperator_right)theEObject;
				T result = casePattern_DiffMathOperator_right(pattern_DiffMathOperator_right);
				if (result == null) result = caseDiffMathOperator_right(pattern_DiffMathOperator_right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_VARIABLE: {
				Pattern_DiffVariable pattern_DiffVariable = (Pattern_DiffVariable)theEObject;
				T result = casePattern_DiffVariable(pattern_DiffVariable);
				if (result == null) result = caseDiffVariable(pattern_DiffVariable);
				if (result == null) result = caseVariable(pattern_DiffVariable);
				if (result == null) result = caseValue(pattern_DiffVariable);
				if (result == null) result = caseInstruction(pattern_DiffVariable);
				if (result == null) result = caseParameter(pattern_DiffVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SET: {
				Pattern_DiffSet pattern_DiffSet = (Pattern_DiffSet)theEObject;
				T result = casePattern_DiffSet(pattern_DiffSet);
				if (result == null) result = caseDiffSet(pattern_DiffSet);
				if (result == null) result = caseSet(pattern_DiffSet);
				if (result == null) result = caseInstruction(pattern_DiffSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SET_VARIABLE: {
				Pattern_DiffSet_variable pattern_DiffSet_variable = (Pattern_DiffSet_variable)theEObject;
				T result = casePattern_DiffSet_variable(pattern_DiffSet_variable);
				if (result == null) result = caseDiffSet_variable(pattern_DiffSet_variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_SET_VALUE: {
				Pattern_DiffSet_value pattern_DiffSet_value = (Pattern_DiffSet_value)theEObject;
				T result = casePattern_DiffSet_value(pattern_DiffSet_value);
				if (result == null) result = caseDiffSet_value(pattern_DiffSet_value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_NUMERICAL_OPERATOR: {
				Pattern_DiffNumericalOperator pattern_DiffNumericalOperator = (Pattern_DiffNumericalOperator)theEObject;
				T result = casePattern_DiffNumericalOperator(pattern_DiffNumericalOperator);
				if (result == null) result = caseDiffNumericalOperator(pattern_DiffNumericalOperator);
				if (result == null) result = caseNumericalOperator(pattern_DiffNumericalOperator);
				if (result == null) result = caseMathOperator(pattern_DiffNumericalOperator);
				if (result == null) result = caseValue(pattern_DiffNumericalOperator);
				if (result == null) result = caseInstruction(pattern_DiffNumericalOperator);
				if (result == null) result = caseParameter(pattern_DiffNumericalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_BOOLEAN_OPERATOR: {
				Pattern_DiffBooleanOperator pattern_DiffBooleanOperator = (Pattern_DiffBooleanOperator)theEObject;
				T result = casePattern_DiffBooleanOperator(pattern_DiffBooleanOperator);
				if (result == null) result = caseDiffBooleanOperator(pattern_DiffBooleanOperator);
				if (result == null) result = caseBooleanOperator(pattern_DiffBooleanOperator);
				if (result == null) result = caseMathOperator(pattern_DiffBooleanOperator);
				if (result == null) result = caseValue(pattern_DiffBooleanOperator);
				if (result == null) result = caseInstruction(pattern_DiffBooleanOperator);
				if (result == null) result = caseParameter(pattern_DiffBooleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_CONSTANT: {
				Pattern_DiffConstant pattern_DiffConstant = (Pattern_DiffConstant)theEObject;
				T result = casePattern_DiffConstant(pattern_DiffConstant);
				if (result == null) result = caseDiffConstant(pattern_DiffConstant);
				if (result == null) result = caseConstant(pattern_DiffConstant);
				if (result == null) result = caseValue(pattern_DiffConstant);
				if (result == null) result = caseInstruction(pattern_DiffConstant);
				if (result == null) result = caseParameter(pattern_DiffConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_IF: {
				Pattern_DiffIf pattern_DiffIf = (Pattern_DiffIf)theEObject;
				T result = casePattern_DiffIf(pattern_DiffIf);
				if (result == null) result = caseDiffIf(pattern_DiffIf);
				if (result == null) result = caseIf(pattern_DiffIf);
				if (result == null) result = caseControl(pattern_DiffIf);
				if (result == null) result = caseInstruction(pattern_DiffIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_IF_CONDITION: {
				Pattern_DiffIf_condition pattern_DiffIf_condition = (Pattern_DiffIf_condition)theEObject;
				T result = casePattern_DiffIf_condition(pattern_DiffIf_condition);
				if (result == null) result = caseDiffIf_condition(pattern_DiffIf_condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION: {
				Pattern_DiffFunction pattern_DiffFunction = (Pattern_DiffFunction)theEObject;
				T result = casePattern_DiffFunction(pattern_DiffFunction);
				if (result == null) result = caseDiffFunction(pattern_DiffFunction);
				if (result == null) result = caseFunction(pattern_DiffFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_PARAM_DEFS: {
				Pattern_DiffFunction_paramDefs pattern_DiffFunction_paramDefs = (Pattern_DiffFunction_paramDefs)theEObject;
				T result = casePattern_DiffFunction_paramDefs(pattern_DiffFunction_paramDefs);
				if (result == null) result = caseDiffFunction_paramDefs(pattern_DiffFunction_paramDefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_INSTRUCTIONS: {
				Pattern_DiffFunction_instructions pattern_DiffFunction_instructions = (Pattern_DiffFunction_instructions)theEObject;
				T result = casePattern_DiffFunction_instructions(pattern_DiffFunction_instructions);
				if (result == null) result = caseDiffFunction_instructions(pattern_DiffFunction_instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION: {
				Pattern_DiffParameterDefinition pattern_DiffParameterDefinition = (Pattern_DiffParameterDefinition)theEObject;
				T result = casePattern_DiffParameterDefinition(pattern_DiffParameterDefinition);
				if (result == null) result = caseDiffParameterDefinition(pattern_DiffParameterDefinition);
				if (result == null) result = caseParameterDefinition(pattern_DiffParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_TO_DEFINITION: {
				Pattern_DiffParameter_to_definition pattern_DiffParameter_to_definition = (Pattern_DiffParameter_to_definition)theEObject;
				T result = casePattern_DiffParameter_to_definition(pattern_DiffParameter_to_definition);
				if (result == null) result = caseDiffParameter_to_definition(pattern_DiffParameter_to_definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_CALL: {
				Pattern_DiffFunctionCall pattern_DiffFunctionCall = (Pattern_DiffFunctionCall)theEObject;
				T result = casePattern_DiffFunctionCall(pattern_DiffFunctionCall);
				if (result == null) result = caseDiffFunctionCall(pattern_DiffFunctionCall);
				if (result == null) result = caseFunctionCall(pattern_DiffFunctionCall);
				if (result == null) result = caseInstruction(pattern_DiffFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_CALL_DEFINITION: {
				Pattern_DiffFunctionCall_definition pattern_DiffFunctionCall_definition = (Pattern_DiffFunctionCall_definition)theEObject;
				T result = casePattern_DiffFunctionCall_definition(pattern_DiffFunctionCall_definition);
				if (result == null) result = caseDiffFunctionCall_definition(pattern_DiffFunctionCall_definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_FUNCTION_CALL_PARAMETERS: {
				Pattern_DiffFunctionCall_parameters pattern_DiffFunctionCall_parameters = (Pattern_DiffFunctionCall_parameters)theEObject;
				T result = casePattern_DiffFunctionCall_parameters(pattern_DiffFunctionCall_parameters);
				if (result == null) result = caseDiffFunctionCall_parameters(pattern_DiffFunctionCall_parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_CALL: {
				Pattern_DiffParameterCall pattern_DiffParameterCall = (Pattern_DiffParameterCall)theEObject;
				T result = casePattern_DiffParameterCall(pattern_DiffParameterCall);
				if (result == null) result = caseDiffParameterCall(pattern_DiffParameterCall);
				if (result == null) result = caseParameterCall(pattern_DiffParameterCall);
				if (result == null) result = caseInstruction(pattern_DiffParameterCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_CALL_DEFINITION: {
				Pattern_DiffParameterCall_definition pattern_DiffParameterCall_definition = (Pattern_DiffParameterCall_definition)theEObject;
				T result = casePattern_DiffParameterCall_definition(pattern_DiffParameterCall_definition);
				if (result == null) result = caseDiffParameterCall_definition(pattern_DiffParameterCall_definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Hardware(Pattern_Hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Platform(Pattern_Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Module(Pattern_Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DigitalPin(Pattern_DigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Pin(Pattern_Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_AnalogPin(Pattern_AnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Sketch(Pattern_Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Project(Pattern_Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Instruction(Pattern_Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Status(Pattern_Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Level(Pattern_Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Module Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Module Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ModuleInstruction(Pattern_ModuleInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Control(Pattern_Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Utilities(Pattern_Utilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern IO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern IO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_IO(Pattern_IO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Delay(Pattern_Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Input Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Input Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_InputModule(Pattern_InputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Output Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Output Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_OutputModule(Pattern_OutputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_NamedElement(Pattern_NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Connector(Pattern_Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Repeat(Pattern_Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Sensor(Pattern_Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_While(Pattern_While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Math Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Math Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_MathOperator(Pattern_MathOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Variable(Pattern_Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Set(Pattern_Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Numerical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Numerical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_NumericalOperator(Pattern_NumericalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_BooleanOperator(Pattern_BooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Value(Pattern_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Constant(Pattern_Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_If(Pattern_If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Function(Pattern_Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ParameterDefinition(Pattern_ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Parameter(Pattern_Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_FunctionCall(Pattern_FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Parameter Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ParameterCall(Pattern_ParameterCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Domain Specific Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffHardware(Pattern_DiffHardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Hardware platforms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Hardware platforms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffHardware_platforms(Pattern_DiffHardware_platforms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Hardware modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Hardware modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffHardware_modules(Pattern_DiffHardware_modules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Hardware connectors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Hardware connectors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffHardware_connectors(Pattern_DiffHardware_connectors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPlatform(Pattern_DiffPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Platform digital Pins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Platform digital Pins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPlatform_digitalPins(Pattern_DiffPlatform_digitalPins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Platform analog Pins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Platform analog Pins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPlatform_analogPins(Pattern_DiffPlatform_analogPins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffDigitalPin(Pattern_DiffDigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffAnalogPin(Pattern_DiffAnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSketch(Pattern_DiffSketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Sketch hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Sketch hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSketch_hardware(Pattern_DiffSketch_hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Sketch instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Sketch instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSketch_instructions(Pattern_DiffSketch_instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Sketch functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Sketch functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSketch_functions(Pattern_DiffSketch_functions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffProject(Pattern_DiffProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Project hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Project hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffProject_hardware(Pattern_DiffProject_hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Project sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Project sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffProject_sketch(Pattern_DiffProject_sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Project modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Project modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffProject_modules(Pattern_DiffProject_modules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Project platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Project platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffProject_platform(Pattern_DiffProject_platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Project domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Project domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffProject_domainspecificdiffs(Pattern_DiffProject_domainspecificdiffs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Instruction previous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Instruction previous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffInstruction_previous(Pattern_DiffInstruction_previous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Instruction next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Instruction next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffInstruction_next(Pattern_DiffInstruction_next object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffStatus(Pattern_DiffStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Status sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Status sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffStatus_sensor(Pattern_DiffStatus_sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffLevel(Pattern_DiffLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Level level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Level level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffLevel_level(Pattern_DiffLevel_level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Module Instruction module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Module Instruction module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffModuleInstruction_module(Pattern_DiffModuleInstruction_module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Control instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Control instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffControl_instructions(Pattern_DiffControl_instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffDelay(Pattern_DiffDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Input Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Input Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffInputModule(Pattern_DiffInputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Output Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Output Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffOutputModule(Pattern_DiffOutputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffConnector(Pattern_DiffConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Connector pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Connector pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffConnector_pin(Pattern_DiffConnector_pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Connector module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Connector module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffConnector_module(Pattern_DiffConnector_module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffRepeat(Pattern_DiffRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSensor(Pattern_DiffSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Sensor status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Sensor status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSensor_status(Pattern_DiffSensor_status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffWhile(Pattern_DiffWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff While condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff While condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffWhile_condition(Pattern_DiffWhile_condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Math Operator left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Math Operator left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffMathOperator_left(Pattern_DiffMathOperator_left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Math Operator right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Math Operator right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffMathOperator_right(Pattern_DiffMathOperator_right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffVariable(Pattern_DiffVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSet(Pattern_DiffSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Set variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Set variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSet_variable(Pattern_DiffSet_variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Set value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Set value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffSet_value(Pattern_DiffSet_value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Numerical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Numerical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffNumericalOperator(Pattern_DiffNumericalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffBooleanOperator(Pattern_DiffBooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffConstant(Pattern_DiffConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffIf(Pattern_DiffIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff If condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff If condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffIf_condition(Pattern_DiffIf_condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFunction(Pattern_DiffFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Function param Defs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Function param Defs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFunction_paramDefs(Pattern_DiffFunction_paramDefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Function instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Function instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFunction_instructions(Pattern_DiffFunction_instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffParameterDefinition(Pattern_DiffParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Parameter to definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Parameter to definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffParameter_to_definition(Pattern_DiffParameter_to_definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFunctionCall(Pattern_DiffFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Function Call definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Function Call definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFunctionCall_definition(Pattern_DiffFunctionCall_definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Function Call parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Function Call parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFunctionCall_parameters(Pattern_DiffFunctionCall_parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Parameter Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffParameterCall(Pattern_DiffParameterCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Parameter Call definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Parameter Call definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffParameterCall_definition(Pattern_DiffParameterCall_definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardware(Hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(arduinoDiffMM.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalPin(DigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogPin(AnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketch(Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleInstruction(ModuleInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel(Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilities(Utilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIO(IO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputModule(InputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputModule(OutputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathOperator(MathOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperator(BooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalOperator(NumericalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCall(ParameterCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificDiff(DomainSpecificDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffHardware(DiffHardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Hardware platforms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Hardware platforms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffHardware_platforms(DiffHardware_platforms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Hardware modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Hardware modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffHardware_modules(DiffHardware_modules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Hardware connectors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Hardware connectors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffHardware_connectors(DiffHardware_connectors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPlatform(DiffPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Platform digital Pins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Platform digital Pins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPlatform_digitalPins(DiffPlatform_digitalPins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Platform analog Pins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Platform analog Pins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPlatform_analogPins(DiffPlatform_analogPins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffDigitalPin(DiffDigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffAnalogPin(DiffAnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSketch(DiffSketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Sketch hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Sketch hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSketch_hardware(DiffSketch_hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Sketch instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Sketch instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSketch_instructions(DiffSketch_instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Sketch functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Sketch functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSketch_functions(DiffSketch_functions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffProject(DiffProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Project hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Project hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffProject_hardware(DiffProject_hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Project sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Project sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffProject_sketch(DiffProject_sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Project modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Project modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffProject_modules(DiffProject_modules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Project platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Project platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffProject_platform(DiffProject_platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Project domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Project domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffProject_domainspecificdiffs(DiffProject_domainspecificdiffs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Instruction previous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Instruction previous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffInstruction_previous(DiffInstruction_previous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Instruction next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Instruction next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffInstruction_next(DiffInstruction_next object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffStatus(DiffStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Status sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Status sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffStatus_sensor(DiffStatus_sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffLevel(DiffLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Level level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Level level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffLevel_level(DiffLevel_level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Module Instruction module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Module Instruction module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffModuleInstruction_module(DiffModuleInstruction_module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Control instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Control instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffControl_instructions(DiffControl_instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffDelay(DiffDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Input Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Input Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffInputModule(DiffInputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Output Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Output Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffOutputModule(DiffOutputModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffConnector(DiffConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Connector pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Connector pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffConnector_pin(DiffConnector_pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Connector module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Connector module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffConnector_module(DiffConnector_module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffRepeat(DiffRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSensor(DiffSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Sensor status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Sensor status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSensor_status(DiffSensor_status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffWhile(DiffWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff While condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff While condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffWhile_condition(DiffWhile_condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Math Operator left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Math Operator left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffMathOperator_left(DiffMathOperator_left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Math Operator right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Math Operator right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffMathOperator_right(DiffMathOperator_right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffVariable(DiffVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSet(DiffSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Set variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Set variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSet_variable(DiffSet_variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Set value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Set value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffSet_value(DiffSet_value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Numerical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Numerical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffNumericalOperator(DiffNumericalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffBooleanOperator(DiffBooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffConstant(DiffConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffIf(DiffIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff If condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff If condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffIf_condition(DiffIf_condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFunction(DiffFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Function param Defs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Function param Defs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFunction_paramDefs(DiffFunction_paramDefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Function instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Function instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFunction_instructions(DiffFunction_instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffParameterDefinition(DiffParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Parameter to definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Parameter to definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffParameter_to_definition(DiffParameter_to_definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFunctionCall(DiffFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Function Call definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Function Call definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFunctionCall_definition(DiffFunctionCall_definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Function Call parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Function Call parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFunctionCall_parameters(DiffFunctionCall_parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Parameter Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffParameterCall(DiffParameterCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Parameter Call definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Parameter Call definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffParameterCall_definition(DiffParameterCall_definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinoRuleMMSwitch
