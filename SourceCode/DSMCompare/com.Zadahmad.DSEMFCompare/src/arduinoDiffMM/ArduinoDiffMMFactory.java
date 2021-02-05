/**
 */
package arduinoDiffMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoDiffMM.ArduinoDiffMMPackage
 * @generated
 */
public interface ArduinoDiffMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoDiffMMFactory eINSTANCE = arduinoDiffMM.impl.ArduinoDiffMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware</em>'.
	 * @generated
	 */
	Hardware createHardware();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Pin</em>'.
	 * @generated
	 */
	DigitalPin createDigitalPin();

	/**
	 * Returns a new object of class '<em>Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Pin</em>'.
	 * @generated
	 */
	AnalogPin createAnalogPin();

	/**
	 * Returns a new object of class '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch</em>'.
	 * @generated
	 */
	Sketch createSketch();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level</em>'.
	 * @generated
	 */
	Level createLevel();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Input Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Module</em>'.
	 * @generated
	 */
	InputModule createInputModule();

	/**
	 * Returns a new object of class '<em>Output Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Module</em>'.
	 * @generated
	 */
	OutputModule createOutputModule();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat</em>'.
	 * @generated
	 */
	Repeat createRepeat();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While</em>'.
	 * @generated
	 */
	While createWhile();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	Set createSet();

	/**
	 * Returns a new object of class '<em>Numerical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Operator</em>'.
	 * @generated
	 */
	NumericalOperator createNumericalOperator();

	/**
	 * Returns a new object of class '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Operator</em>'.
	 * @generated
	 */
	BooleanOperator createBooleanOperator();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Call</em>'.
	 * @generated
	 */
	ParameterCall createParameterCall();

	/**
	 * Returns a new object of class '<em>Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Diff</em>'.
	 * @generated
	 */
	DomainSpecificDiff createDomainSpecificDiff();

	/**
	 * Returns a new object of class '<em>Diff Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Hardware</em>'.
	 * @generated
	 */
	DiffHardware createDiffHardware();

	/**
	 * Returns a new object of class '<em>Diff Hardware platforms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Hardware platforms</em>'.
	 * @generated
	 */
	DiffHardware_platforms createDiffHardware_platforms();

	/**
	 * Returns a new object of class '<em>Diff Hardware modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Hardware modules</em>'.
	 * @generated
	 */
	DiffHardware_modules createDiffHardware_modules();

	/**
	 * Returns a new object of class '<em>Diff Hardware connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Hardware connectors</em>'.
	 * @generated
	 */
	DiffHardware_connectors createDiffHardware_connectors();

	/**
	 * Returns a new object of class '<em>Diff Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Platform</em>'.
	 * @generated
	 */
	DiffPlatform createDiffPlatform();

	/**
	 * Returns a new object of class '<em>Diff Platform digital Pins</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Platform digital Pins</em>'.
	 * @generated
	 */
	DiffPlatform_digitalPins createDiffPlatform_digitalPins();

	/**
	 * Returns a new object of class '<em>Diff Platform analog Pins</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Platform analog Pins</em>'.
	 * @generated
	 */
	DiffPlatform_analogPins createDiffPlatform_analogPins();

	/**
	 * Returns a new object of class '<em>Diff Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Digital Pin</em>'.
	 * @generated
	 */
	DiffDigitalPin createDiffDigitalPin();

	/**
	 * Returns a new object of class '<em>Diff Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Analog Pin</em>'.
	 * @generated
	 */
	DiffAnalogPin createDiffAnalogPin();

	/**
	 * Returns a new object of class '<em>Diff Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Sketch</em>'.
	 * @generated
	 */
	DiffSketch createDiffSketch();

	/**
	 * Returns a new object of class '<em>Diff Sketch hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Sketch hardware</em>'.
	 * @generated
	 */
	DiffSketch_hardware createDiffSketch_hardware();

	/**
	 * Returns a new object of class '<em>Diff Sketch instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Sketch instructions</em>'.
	 * @generated
	 */
	DiffSketch_instructions createDiffSketch_instructions();

	/**
	 * Returns a new object of class '<em>Diff Sketch functions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Sketch functions</em>'.
	 * @generated
	 */
	DiffSketch_functions createDiffSketch_functions();

	/**
	 * Returns a new object of class '<em>Diff Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Project</em>'.
	 * @generated
	 */
	DiffProject createDiffProject();

	/**
	 * Returns a new object of class '<em>Diff Project hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Project hardware</em>'.
	 * @generated
	 */
	DiffProject_hardware createDiffProject_hardware();

	/**
	 * Returns a new object of class '<em>Diff Project sketch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Project sketch</em>'.
	 * @generated
	 */
	DiffProject_sketch createDiffProject_sketch();

	/**
	 * Returns a new object of class '<em>Diff Project modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Project modules</em>'.
	 * @generated
	 */
	DiffProject_modules createDiffProject_modules();

	/**
	 * Returns a new object of class '<em>Diff Project platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Project platform</em>'.
	 * @generated
	 */
	DiffProject_platform createDiffProject_platform();

	/**
	 * Returns a new object of class '<em>Diff Project domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Project domainspecificdiffs</em>'.
	 * @generated
	 */
	DiffProject_domainspecificdiffs createDiffProject_domainspecificdiffs();

	/**
	 * Returns a new object of class '<em>Diff Instruction previous</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Instruction previous</em>'.
	 * @generated
	 */
	DiffInstruction_previous createDiffInstruction_previous();

	/**
	 * Returns a new object of class '<em>Diff Instruction next</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Instruction next</em>'.
	 * @generated
	 */
	DiffInstruction_next createDiffInstruction_next();

	/**
	 * Returns a new object of class '<em>Diff Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Status</em>'.
	 * @generated
	 */
	DiffStatus createDiffStatus();

	/**
	 * Returns a new object of class '<em>Diff Status sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Status sensor</em>'.
	 * @generated
	 */
	DiffStatus_sensor createDiffStatus_sensor();

	/**
	 * Returns a new object of class '<em>Diff Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Level</em>'.
	 * @generated
	 */
	DiffLevel createDiffLevel();

	/**
	 * Returns a new object of class '<em>Diff Level level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Level level</em>'.
	 * @generated
	 */
	DiffLevel_level createDiffLevel_level();

	/**
	 * Returns a new object of class '<em>Diff Module Instruction module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Module Instruction module</em>'.
	 * @generated
	 */
	DiffModuleInstruction_module createDiffModuleInstruction_module();

	/**
	 * Returns a new object of class '<em>Diff Control instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Control instructions</em>'.
	 * @generated
	 */
	DiffControl_instructions createDiffControl_instructions();

	/**
	 * Returns a new object of class '<em>Diff Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Delay</em>'.
	 * @generated
	 */
	DiffDelay createDiffDelay();

	/**
	 * Returns a new object of class '<em>Diff Input Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Input Module</em>'.
	 * @generated
	 */
	DiffInputModule createDiffInputModule();

	/**
	 * Returns a new object of class '<em>Diff Output Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Output Module</em>'.
	 * @generated
	 */
	DiffOutputModule createDiffOutputModule();

	/**
	 * Returns a new object of class '<em>Diff Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Connector</em>'.
	 * @generated
	 */
	DiffConnector createDiffConnector();

	/**
	 * Returns a new object of class '<em>Diff Connector pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Connector pin</em>'.
	 * @generated
	 */
	DiffConnector_pin createDiffConnector_pin();

	/**
	 * Returns a new object of class '<em>Diff Connector module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Connector module</em>'.
	 * @generated
	 */
	DiffConnector_module createDiffConnector_module();

	/**
	 * Returns a new object of class '<em>Diff Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Repeat</em>'.
	 * @generated
	 */
	DiffRepeat createDiffRepeat();

	/**
	 * Returns a new object of class '<em>Diff Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Sensor</em>'.
	 * @generated
	 */
	DiffSensor createDiffSensor();

	/**
	 * Returns a new object of class '<em>Diff Sensor status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Sensor status</em>'.
	 * @generated
	 */
	DiffSensor_status createDiffSensor_status();

	/**
	 * Returns a new object of class '<em>Diff While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff While</em>'.
	 * @generated
	 */
	DiffWhile createDiffWhile();

	/**
	 * Returns a new object of class '<em>Diff While condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff While condition</em>'.
	 * @generated
	 */
	DiffWhile_condition createDiffWhile_condition();

	/**
	 * Returns a new object of class '<em>Diff Math Operator left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Math Operator left</em>'.
	 * @generated
	 */
	DiffMathOperator_left createDiffMathOperator_left();

	/**
	 * Returns a new object of class '<em>Diff Math Operator right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Math Operator right</em>'.
	 * @generated
	 */
	DiffMathOperator_right createDiffMathOperator_right();

	/**
	 * Returns a new object of class '<em>Diff Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Variable</em>'.
	 * @generated
	 */
	DiffVariable createDiffVariable();

	/**
	 * Returns a new object of class '<em>Diff Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Set</em>'.
	 * @generated
	 */
	DiffSet createDiffSet();

	/**
	 * Returns a new object of class '<em>Diff Set variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Set variable</em>'.
	 * @generated
	 */
	DiffSet_variable createDiffSet_variable();

	/**
	 * Returns a new object of class '<em>Diff Set value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Set value</em>'.
	 * @generated
	 */
	DiffSet_value createDiffSet_value();

	/**
	 * Returns a new object of class '<em>Diff Numerical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Numerical Operator</em>'.
	 * @generated
	 */
	DiffNumericalOperator createDiffNumericalOperator();

	/**
	 * Returns a new object of class '<em>Diff Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Boolean Operator</em>'.
	 * @generated
	 */
	DiffBooleanOperator createDiffBooleanOperator();

	/**
	 * Returns a new object of class '<em>Diff Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Constant</em>'.
	 * @generated
	 */
	DiffConstant createDiffConstant();

	/**
	 * Returns a new object of class '<em>Diff If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff If</em>'.
	 * @generated
	 */
	DiffIf createDiffIf();

	/**
	 * Returns a new object of class '<em>Diff If condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff If condition</em>'.
	 * @generated
	 */
	DiffIf_condition createDiffIf_condition();

	/**
	 * Returns a new object of class '<em>Diff Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Function</em>'.
	 * @generated
	 */
	DiffFunction createDiffFunction();

	/**
	 * Returns a new object of class '<em>Diff Function param Defs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Function param Defs</em>'.
	 * @generated
	 */
	DiffFunction_paramDefs createDiffFunction_paramDefs();

	/**
	 * Returns a new object of class '<em>Diff Function instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Function instructions</em>'.
	 * @generated
	 */
	DiffFunction_instructions createDiffFunction_instructions();

	/**
	 * Returns a new object of class '<em>Diff Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Parameter Definition</em>'.
	 * @generated
	 */
	DiffParameterDefinition createDiffParameterDefinition();

	/**
	 * Returns a new object of class '<em>Diff Parameter to definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Parameter to definition</em>'.
	 * @generated
	 */
	DiffParameter_to_definition createDiffParameter_to_definition();

	/**
	 * Returns a new object of class '<em>Diff Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Function Call</em>'.
	 * @generated
	 */
	DiffFunctionCall createDiffFunctionCall();

	/**
	 * Returns a new object of class '<em>Diff Function Call definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Function Call definition</em>'.
	 * @generated
	 */
	DiffFunctionCall_definition createDiffFunctionCall_definition();

	/**
	 * Returns a new object of class '<em>Diff Function Call parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Function Call parameters</em>'.
	 * @generated
	 */
	DiffFunctionCall_parameters createDiffFunctionCall_parameters();

	/**
	 * Returns a new object of class '<em>Diff Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Parameter Call</em>'.
	 * @generated
	 */
	DiffParameterCall createDiffParameterCall();

	/**
	 * Returns a new object of class '<em>Diff Parameter Call definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Parameter Call definition</em>'.
	 * @generated
	 */
	DiffParameterCall_definition createDiffParameterCall_definition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinoDiffMMPackage getArduinoDiffMMPackage();

} //ArduinoDiffMMFactory
