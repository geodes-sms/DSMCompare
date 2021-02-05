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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduinoDiffMM.ArduinoDiffMMPackage
 * @generated
 */
public class ArduinoDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoDiffMMPackage.eINSTANCE;
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
	protected ArduinoDiffMMSwitch<Adapter> modelSwitch =
		new ArduinoDiffMMSwitch<Adapter>() {
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
			public Adapter caseDigitalPin(DigitalPin object) {
				return createDigitalPinAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseAnalogPin(AnalogPin object) {
				return createAnalogPinAdapter();
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
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
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
			public Adapter caseModuleInstruction(ModuleInstruction object) {
				return createModuleInstructionAdapter();
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
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseMathOperator(MathOperator object) {
				return createMathOperatorAdapter();
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
			public Adapter caseBooleanOperator(BooleanOperator object) {
				return createBooleanOperatorAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
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
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
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

} //ArduinoDiffMMAdapterFactory
