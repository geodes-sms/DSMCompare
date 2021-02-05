/**
 */
package arduinoDiffMM.util;

import arduinoDiffMM.AnalogPin;
import arduinoDiffMM.ArduinoDiffMMPackage;
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
 * @see arduinoDiffMM.ArduinoDiffMMPackage
 * @generated
 */
public class ArduinoDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoDiffMMPackage.eINSTANCE;
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
			case ArduinoDiffMMPackage.HARDWARE: {
				Hardware hardware = (Hardware)theEObject;
				T result = caseHardware(hardware);
				if (result == null) result = caseNamedElement(hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = caseNamedElement(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.MODULE: {
				arduinoDiffMM.Module module = (arduinoDiffMM.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIGITAL_PIN: {
				DigitalPin digitalPin = (DigitalPin)theEObject;
				T result = caseDigitalPin(digitalPin);
				if (result == null) result = casePin(digitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.ANALOG_PIN: {
				AnalogPin analogPin = (AnalogPin)theEObject;
				T result = caseAnalogPin(analogPin);
				if (result == null) result = casePin(analogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.SKETCH: {
				Sketch sketch = (Sketch)theEObject;
				T result = caseSketch(sketch);
				if (result == null) result = caseNamedElement(sketch);
				if (result == null) result = caseInstruction(sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.STATUS: {
				Status status = (Status)theEObject;
				T result = caseStatus(status);
				if (result == null) result = caseModuleInstruction(status);
				if (result == null) result = caseValue(status);
				if (result == null) result = caseInstruction(status);
				if (result == null) result = caseParameter(status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.LEVEL: {
				Level level = (Level)theEObject;
				T result = caseLevel(level);
				if (result == null) result = caseModuleInstruction(level);
				if (result == null) result = caseInstruction(level);
				if (result == null) result = caseParameter(level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION: {
				ModuleInstruction moduleInstruction = (ModuleInstruction)theEObject;
				T result = caseModuleInstruction(moduleInstruction);
				if (result == null) result = caseInstruction(moduleInstruction);
				if (result == null) result = caseParameter(moduleInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseInstruction(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.UTILITIES: {
				Utilities utilities = (Utilities)theEObject;
				T result = caseUtilities(utilities);
				if (result == null) result = caseInstruction(utilities);
				if (result == null) result = caseParameter(utilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.IO: {
				IO io = (IO)theEObject;
				T result = caseIO(io);
				if (result == null) result = caseInstruction(io);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseUtilities(delay);
				if (result == null) result = caseInstruction(delay);
				if (result == null) result = caseParameter(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.INPUT_MODULE: {
				InputModule inputModule = (InputModule)theEObject;
				T result = caseInputModule(inputModule);
				if (result == null) result = caseModule(inputModule);
				if (result == null) result = caseNamedElement(inputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.OUTPUT_MODULE: {
				OutputModule outputModule = (OutputModule)theEObject;
				T result = caseOutputModule(outputModule);
				if (result == null) result = caseModule(outputModule);
				if (result == null) result = caseNamedElement(outputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.REPEAT: {
				Repeat repeat = (Repeat)theEObject;
				T result = caseRepeat(repeat);
				if (result == null) result = caseControl(repeat);
				if (result == null) result = caseInstruction(repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseModuleInstruction(sensor);
				if (result == null) result = caseBooleanOperator(sensor);
				if (result == null) result = caseMathOperator(sensor);
				if (result == null) result = caseValue(sensor);
				if (result == null) result = caseInstruction(sensor);
				if (result == null) result = caseParameter(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseControl(while_);
				if (result == null) result = caseInstruction(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.MATH_OPERATOR: {
				MathOperator mathOperator = (MathOperator)theEObject;
				T result = caseMathOperator(mathOperator);
				if (result == null) result = caseValue(mathOperator);
				if (result == null) result = caseInstruction(mathOperator);
				if (result == null) result = caseParameter(mathOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseValue(variable);
				if (result == null) result = caseInstruction(variable);
				if (result == null) result = caseParameter(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseInstruction(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.NUMERICAL_OPERATOR: {
				NumericalOperator numericalOperator = (NumericalOperator)theEObject;
				T result = caseNumericalOperator(numericalOperator);
				if (result == null) result = caseMathOperator(numericalOperator);
				if (result == null) result = caseValue(numericalOperator);
				if (result == null) result = caseInstruction(numericalOperator);
				if (result == null) result = caseParameter(numericalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.BOOLEAN_OPERATOR: {
				BooleanOperator booleanOperator = (BooleanOperator)theEObject;
				T result = caseBooleanOperator(booleanOperator);
				if (result == null) result = caseMathOperator(booleanOperator);
				if (result == null) result = caseValue(booleanOperator);
				if (result == null) result = caseInstruction(booleanOperator);
				if (result == null) result = caseParameter(booleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseInstruction(value);
				if (result == null) result = caseParameter(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseValue(constant);
				if (result == null) result = caseInstruction(constant);
				if (result == null) result = caseParameter(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseControl(if_);
				if (result == null) result = caseInstruction(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.PARAMETER_DEFINITION: {
				ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
				T result = caseParameterDefinition(parameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseInstruction(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.PARAMETER_CALL: {
				ParameterCall parameterCall = (ParameterCall)theEObject;
				T result = caseParameterCall(parameterCall);
				if (result == null) result = caseInstruction(parameterCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF: {
				DomainSpecificDiff domainSpecificDiff = (DomainSpecificDiff)theEObject;
				T result = caseDomainSpecificDiff(domainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_HARDWARE: {
				DiffHardware diffHardware = (DiffHardware)theEObject;
				T result = caseDiffHardware(diffHardware);
				if (result == null) result = caseHardware(diffHardware);
				if (result == null) result = caseNamedElement(diffHardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS: {
				DiffHardware_platforms diffHardware_platforms = (DiffHardware_platforms)theEObject;
				T result = caseDiffHardware_platforms(diffHardware_platforms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES: {
				DiffHardware_modules diffHardware_modules = (DiffHardware_modules)theEObject;
				T result = caseDiffHardware_modules(diffHardware_modules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS: {
				DiffHardware_connectors diffHardware_connectors = (DiffHardware_connectors)theEObject;
				T result = caseDiffHardware_connectors(diffHardware_connectors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PLATFORM: {
				DiffPlatform diffPlatform = (DiffPlatform)theEObject;
				T result = caseDiffPlatform(diffPlatform);
				if (result == null) result = casePlatform(diffPlatform);
				if (result == null) result = caseNamedElement(diffPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS: {
				DiffPlatform_digitalPins diffPlatform_digitalPins = (DiffPlatform_digitalPins)theEObject;
				T result = caseDiffPlatform_digitalPins(diffPlatform_digitalPins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS: {
				DiffPlatform_analogPins diffPlatform_analogPins = (DiffPlatform_analogPins)theEObject;
				T result = caseDiffPlatform_analogPins(diffPlatform_analogPins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_DIGITAL_PIN: {
				DiffDigitalPin diffDigitalPin = (DiffDigitalPin)theEObject;
				T result = caseDiffDigitalPin(diffDigitalPin);
				if (result == null) result = caseDigitalPin(diffDigitalPin);
				if (result == null) result = casePin(diffDigitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_ANALOG_PIN: {
				DiffAnalogPin diffAnalogPin = (DiffAnalogPin)theEObject;
				T result = caseDiffAnalogPin(diffAnalogPin);
				if (result == null) result = caseAnalogPin(diffAnalogPin);
				if (result == null) result = casePin(diffAnalogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SKETCH: {
				DiffSketch diffSketch = (DiffSketch)theEObject;
				T result = caseDiffSketch(diffSketch);
				if (result == null) result = caseSketch(diffSketch);
				if (result == null) result = caseNamedElement(diffSketch);
				if (result == null) result = caseInstruction(diffSketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE: {
				DiffSketch_hardware diffSketch_hardware = (DiffSketch_hardware)theEObject;
				T result = caseDiffSketch_hardware(diffSketch_hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS: {
				DiffSketch_instructions diffSketch_instructions = (DiffSketch_instructions)theEObject;
				T result = caseDiffSketch_instructions(diffSketch_instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS: {
				DiffSketch_functions diffSketch_functions = (DiffSketch_functions)theEObject;
				T result = caseDiffSketch_functions(diffSketch_functions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PROJECT: {
				DiffProject diffProject = (DiffProject)theEObject;
				T result = caseDiffProject(diffProject);
				if (result == null) result = caseProject(diffProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE: {
				DiffProject_hardware diffProject_hardware = (DiffProject_hardware)theEObject;
				T result = caseDiffProject_hardware(diffProject_hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH: {
				DiffProject_sketch diffProject_sketch = (DiffProject_sketch)theEObject;
				T result = caseDiffProject_sketch(diffProject_sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PROJECT_MODULES: {
				DiffProject_modules diffProject_modules = (DiffProject_modules)theEObject;
				T result = caseDiffProject_modules(diffProject_modules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM: {
				DiffProject_platform diffProject_platform = (DiffProject_platform)theEObject;
				T result = caseDiffProject_platform(diffProject_platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS: {
				DiffProject_domainspecificdiffs diffProject_domainspecificdiffs = (DiffProject_domainspecificdiffs)theEObject;
				T result = caseDiffProject_domainspecificdiffs(diffProject_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS: {
				DiffInstruction_previous diffInstruction_previous = (DiffInstruction_previous)theEObject;
				T result = caseDiffInstruction_previous(diffInstruction_previous);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT: {
				DiffInstruction_next diffInstruction_next = (DiffInstruction_next)theEObject;
				T result = caseDiffInstruction_next(diffInstruction_next);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_STATUS: {
				DiffStatus diffStatus = (DiffStatus)theEObject;
				T result = caseDiffStatus(diffStatus);
				if (result == null) result = caseStatus(diffStatus);
				if (result == null) result = caseModuleInstruction(diffStatus);
				if (result == null) result = caseValue(diffStatus);
				if (result == null) result = caseInstruction(diffStatus);
				if (result == null) result = caseParameter(diffStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_STATUS_SENSOR: {
				DiffStatus_sensor diffStatus_sensor = (DiffStatus_sensor)theEObject;
				T result = caseDiffStatus_sensor(diffStatus_sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_LEVEL: {
				DiffLevel diffLevel = (DiffLevel)theEObject;
				T result = caseDiffLevel(diffLevel);
				if (result == null) result = caseLevel(diffLevel);
				if (result == null) result = caseModuleInstruction(diffLevel);
				if (result == null) result = caseInstruction(diffLevel);
				if (result == null) result = caseParameter(diffLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL: {
				DiffLevel_level diffLevel_level = (DiffLevel_level)theEObject;
				T result = caseDiffLevel_level(diffLevel_level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE: {
				DiffModuleInstruction_module diffModuleInstruction_module = (DiffModuleInstruction_module)theEObject;
				T result = caseDiffModuleInstruction_module(diffModuleInstruction_module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS: {
				DiffControl_instructions diffControl_instructions = (DiffControl_instructions)theEObject;
				T result = caseDiffControl_instructions(diffControl_instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_DELAY: {
				DiffDelay diffDelay = (DiffDelay)theEObject;
				T result = caseDiffDelay(diffDelay);
				if (result == null) result = caseDelay(diffDelay);
				if (result == null) result = caseUtilities(diffDelay);
				if (result == null) result = caseInstruction(diffDelay);
				if (result == null) result = caseParameter(diffDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_INPUT_MODULE: {
				DiffInputModule diffInputModule = (DiffInputModule)theEObject;
				T result = caseDiffInputModule(diffInputModule);
				if (result == null) result = caseInputModule(diffInputModule);
				if (result == null) result = caseModule(diffInputModule);
				if (result == null) result = caseNamedElement(diffInputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE: {
				DiffOutputModule diffOutputModule = (DiffOutputModule)theEObject;
				T result = caseDiffOutputModule(diffOutputModule);
				if (result == null) result = caseOutputModule(diffOutputModule);
				if (result == null) result = caseModule(diffOutputModule);
				if (result == null) result = caseNamedElement(diffOutputModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_CONNECTOR: {
				DiffConnector diffConnector = (DiffConnector)theEObject;
				T result = caseDiffConnector(diffConnector);
				if (result == null) result = caseConnector(diffConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN: {
				DiffConnector_pin diffConnector_pin = (DiffConnector_pin)theEObject;
				T result = caseDiffConnector_pin(diffConnector_pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE: {
				DiffConnector_module diffConnector_module = (DiffConnector_module)theEObject;
				T result = caseDiffConnector_module(diffConnector_module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_REPEAT: {
				DiffRepeat diffRepeat = (DiffRepeat)theEObject;
				T result = caseDiffRepeat(diffRepeat);
				if (result == null) result = caseRepeat(diffRepeat);
				if (result == null) result = caseControl(diffRepeat);
				if (result == null) result = caseInstruction(diffRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SENSOR: {
				DiffSensor diffSensor = (DiffSensor)theEObject;
				T result = caseDiffSensor(diffSensor);
				if (result == null) result = caseSensor(diffSensor);
				if (result == null) result = caseModuleInstruction(diffSensor);
				if (result == null) result = caseBooleanOperator(diffSensor);
				if (result == null) result = caseMathOperator(diffSensor);
				if (result == null) result = caseValue(diffSensor);
				if (result == null) result = caseInstruction(diffSensor);
				if (result == null) result = caseParameter(diffSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SENSOR_STATUS: {
				DiffSensor_status diffSensor_status = (DiffSensor_status)theEObject;
				T result = caseDiffSensor_status(diffSensor_status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_WHILE: {
				DiffWhile diffWhile = (DiffWhile)theEObject;
				T result = caseDiffWhile(diffWhile);
				if (result == null) result = caseWhile(diffWhile);
				if (result == null) result = caseControl(diffWhile);
				if (result == null) result = caseInstruction(diffWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_WHILE_CONDITION: {
				DiffWhile_condition diffWhile_condition = (DiffWhile_condition)theEObject;
				T result = caseDiffWhile_condition(diffWhile_condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT: {
				DiffMathOperator_left diffMathOperator_left = (DiffMathOperator_left)theEObject;
				T result = caseDiffMathOperator_left(diffMathOperator_left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT: {
				DiffMathOperator_right diffMathOperator_right = (DiffMathOperator_right)theEObject;
				T result = caseDiffMathOperator_right(diffMathOperator_right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_VARIABLE: {
				DiffVariable diffVariable = (DiffVariable)theEObject;
				T result = caseDiffVariable(diffVariable);
				if (result == null) result = caseVariable(diffVariable);
				if (result == null) result = caseValue(diffVariable);
				if (result == null) result = caseInstruction(diffVariable);
				if (result == null) result = caseParameter(diffVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SET: {
				DiffSet diffSet = (DiffSet)theEObject;
				T result = caseDiffSet(diffSet);
				if (result == null) result = caseSet(diffSet);
				if (result == null) result = caseInstruction(diffSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SET_VARIABLE: {
				DiffSet_variable diffSet_variable = (DiffSet_variable)theEObject;
				T result = caseDiffSet_variable(diffSet_variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_SET_VALUE: {
				DiffSet_value diffSet_value = (DiffSet_value)theEObject;
				T result = caseDiffSet_value(diffSet_value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR: {
				DiffNumericalOperator diffNumericalOperator = (DiffNumericalOperator)theEObject;
				T result = caseDiffNumericalOperator(diffNumericalOperator);
				if (result == null) result = caseNumericalOperator(diffNumericalOperator);
				if (result == null) result = caseMathOperator(diffNumericalOperator);
				if (result == null) result = caseValue(diffNumericalOperator);
				if (result == null) result = caseInstruction(diffNumericalOperator);
				if (result == null) result = caseParameter(diffNumericalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR: {
				DiffBooleanOperator diffBooleanOperator = (DiffBooleanOperator)theEObject;
				T result = caseDiffBooleanOperator(diffBooleanOperator);
				if (result == null) result = caseBooleanOperator(diffBooleanOperator);
				if (result == null) result = caseMathOperator(diffBooleanOperator);
				if (result == null) result = caseValue(diffBooleanOperator);
				if (result == null) result = caseInstruction(diffBooleanOperator);
				if (result == null) result = caseParameter(diffBooleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_CONSTANT: {
				DiffConstant diffConstant = (DiffConstant)theEObject;
				T result = caseDiffConstant(diffConstant);
				if (result == null) result = caseConstant(diffConstant);
				if (result == null) result = caseValue(diffConstant);
				if (result == null) result = caseInstruction(diffConstant);
				if (result == null) result = caseParameter(diffConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_IF: {
				DiffIf diffIf = (DiffIf)theEObject;
				T result = caseDiffIf(diffIf);
				if (result == null) result = caseIf(diffIf);
				if (result == null) result = caseControl(diffIf);
				if (result == null) result = caseInstruction(diffIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_IF_CONDITION: {
				DiffIf_condition diffIf_condition = (DiffIf_condition)theEObject;
				T result = caseDiffIf_condition(diffIf_condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_FUNCTION: {
				DiffFunction diffFunction = (DiffFunction)theEObject;
				T result = caseDiffFunction(diffFunction);
				if (result == null) result = caseFunction(diffFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS: {
				DiffFunction_paramDefs diffFunction_paramDefs = (DiffFunction_paramDefs)theEObject;
				T result = caseDiffFunction_paramDefs(diffFunction_paramDefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS: {
				DiffFunction_instructions diffFunction_instructions = (DiffFunction_instructions)theEObject;
				T result = caseDiffFunction_instructions(diffFunction_instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION: {
				DiffParameterDefinition diffParameterDefinition = (DiffParameterDefinition)theEObject;
				T result = caseDiffParameterDefinition(diffParameterDefinition);
				if (result == null) result = caseParameterDefinition(diffParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION: {
				DiffParameter_to_definition diffParameter_to_definition = (DiffParameter_to_definition)theEObject;
				T result = caseDiffParameter_to_definition(diffParameter_to_definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_FUNCTION_CALL: {
				DiffFunctionCall diffFunctionCall = (DiffFunctionCall)theEObject;
				T result = caseDiffFunctionCall(diffFunctionCall);
				if (result == null) result = caseFunctionCall(diffFunctionCall);
				if (result == null) result = caseInstruction(diffFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION: {
				DiffFunctionCall_definition diffFunctionCall_definition = (DiffFunctionCall_definition)theEObject;
				T result = caseDiffFunctionCall_definition(diffFunctionCall_definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS: {
				DiffFunctionCall_parameters diffFunctionCall_parameters = (DiffFunctionCall_parameters)theEObject;
				T result = caseDiffFunctionCall_parameters(diffFunctionCall_parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PARAMETER_CALL: {
				DiffParameterCall diffParameterCall = (DiffParameterCall)theEObject;
				T result = caseDiffParameterCall(diffParameterCall);
				if (result == null) result = caseParameterCall(diffParameterCall);
				if (result == null) result = caseInstruction(diffParameterCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION: {
				DiffParameterCall_definition diffParameterCall_definition = (DiffParameterCall_definition)theEObject;
				T result = caseDiffParameterCall_definition(diffParameterCall_definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //ArduinoDiffMMSwitch
