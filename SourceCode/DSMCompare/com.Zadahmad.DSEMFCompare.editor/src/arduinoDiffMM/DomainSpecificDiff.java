/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getName <em>Name</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Hardware <em>Domain Specific Diff Hardware</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Platform <em>Domain Specific Diff Platform</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Module <em>Domain Specific Diff Module</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DigitalPin <em>Domain Specific Diff Digital Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Pin <em>Domain Specific Diff Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_AnalogPin <em>Domain Specific Diff Analog Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Sketch <em>Domain Specific Diff Sketch</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Instruction <em>Domain Specific Diff Instruction</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Status <em>Domain Specific Diff Status</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Level <em>Domain Specific Diff Level</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ModuleInstruction <em>Domain Specific Diff Module Instruction</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Control <em>Domain Specific Diff Control</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Utilities <em>Domain Specific Diff Utilities</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_IO <em>Domain Specific Diff IO</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Delay <em>Domain Specific Diff Delay</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_InputModule <em>Domain Specific Diff Input Module</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_OutputModule <em>Domain Specific Diff Output Module</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_NamedElement <em>Domain Specific Diff Named Element</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Connector <em>Domain Specific Diff Connector</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Repeat <em>Domain Specific Diff Repeat</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Sensor <em>Domain Specific Diff Sensor</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_While <em>Domain Specific Diff While</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_MathOperator <em>Domain Specific Diff Math Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Variable <em>Domain Specific Diff Variable</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Set <em>Domain Specific Diff Set</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_NumericalOperator <em>Domain Specific Diff Numerical Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_BooleanOperator <em>Domain Specific Diff Boolean Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Value <em>Domain Specific Diff Value</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Constant <em>Domain Specific Diff Constant</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_If <em>Domain Specific Diff If</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Function <em>Domain Specific Diff Function</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ParameterDefinition <em>Domain Specific Diff Parameter Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Parameter <em>Domain Specific Diff Parameter</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_FunctionCall <em>Domain Specific Diff Function Call</em>}</li>
 *   <li>{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ParameterCall <em>Domain Specific Diff Parameter Call</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff()
 * @model
 * @generated
 */
public interface DomainSpecificDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DomainSpecificDiff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Hardware</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Hardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Hardware</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Hardware()
	 * @model
	 * @generated
	 */
	EList<Hardware> getDomainSpecificDiff_Hardware();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Platform</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Platform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Platform</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Platform()
	 * @model
	 * @generated
	 */
	EList<Platform> getDomainSpecificDiff_Platform();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Module</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Module</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Module()
	 * @model
	 * @generated
	 */
	EList<arduinoDiffMM.Module> getDomainSpecificDiff_Module();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Digital Pin</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.DigitalPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Digital Pin</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DigitalPin()
	 * @model
	 * @generated
	 */
	EList<DigitalPin> getDomainSpecificDiff_DigitalPin();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Pin</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Pin</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Pin()
	 * @model
	 * @generated
	 */
	EList<Pin> getDomainSpecificDiff_Pin();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Analog Pin</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.AnalogPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Analog Pin</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_AnalogPin()
	 * @model
	 * @generated
	 */
	EList<AnalogPin> getDomainSpecificDiff_AnalogPin();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Sketch</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Sketch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Sketch</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Sketch()
	 * @model
	 * @generated
	 */
	EList<Sketch> getDomainSpecificDiff_Sketch();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Instruction</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Instruction</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Instruction()
	 * @model
	 * @generated
	 */
	EList<Instruction> getDomainSpecificDiff_Instruction();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Status</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Status</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Status()
	 * @model
	 * @generated
	 */
	EList<Status> getDomainSpecificDiff_Status();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Level</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Level</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Level()
	 * @model
	 * @generated
	 */
	EList<Level> getDomainSpecificDiff_Level();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Module Instruction</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.ModuleInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Module Instruction</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_ModuleInstruction()
	 * @model
	 * @generated
	 */
	EList<ModuleInstruction> getDomainSpecificDiff_ModuleInstruction();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Control</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Control</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Control()
	 * @model
	 * @generated
	 */
	EList<Control> getDomainSpecificDiff_Control();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Utilities</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Utilities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Utilities</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Utilities()
	 * @model
	 * @generated
	 */
	EList<Utilities> getDomainSpecificDiff_Utilities();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff IO</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.IO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff IO</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_IO()
	 * @model
	 * @generated
	 */
	EList<IO> getDomainSpecificDiff_IO();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Delay</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Delay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Delay</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Delay()
	 * @model
	 * @generated
	 */
	EList<Delay> getDomainSpecificDiff_Delay();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Input Module</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.InputModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Input Module</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_InputModule()
	 * @model
	 * @generated
	 */
	EList<InputModule> getDomainSpecificDiff_InputModule();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Output Module</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.OutputModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Output Module</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_OutputModule()
	 * @model
	 * @generated
	 */
	EList<OutputModule> getDomainSpecificDiff_OutputModule();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Named Element</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Named Element</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_NamedElement()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getDomainSpecificDiff_NamedElement();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Connector</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Connector</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Connector()
	 * @model
	 * @generated
	 */
	EList<Connector> getDomainSpecificDiff_Connector();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Repeat</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Repeat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Repeat</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Repeat()
	 * @model
	 * @generated
	 */
	EList<Repeat> getDomainSpecificDiff_Repeat();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Sensor</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Sensor</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Sensor()
	 * @model
	 * @generated
	 */
	EList<Sensor> getDomainSpecificDiff_Sensor();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff While</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.While}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff While</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_While()
	 * @model
	 * @generated
	 */
	EList<While> getDomainSpecificDiff_While();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Math Operator</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.MathOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Math Operator</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_MathOperator()
	 * @model
	 * @generated
	 */
	EList<MathOperator> getDomainSpecificDiff_MathOperator();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Variable</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Variable</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Variable()
	 * @model
	 * @generated
	 */
	EList<Variable> getDomainSpecificDiff_Variable();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Set</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Set}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Set</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Set()
	 * @model
	 * @generated
	 */
	EList<Set> getDomainSpecificDiff_Set();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Numerical Operator</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.NumericalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Numerical Operator</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_NumericalOperator()
	 * @model
	 * @generated
	 */
	EList<NumericalOperator> getDomainSpecificDiff_NumericalOperator();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Boolean Operator</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Boolean Operator</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_BooleanOperator()
	 * @model
	 * @generated
	 */
	EList<BooleanOperator> getDomainSpecificDiff_BooleanOperator();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Value</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Value</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Value()
	 * @model
	 * @generated
	 */
	EList<Value> getDomainSpecificDiff_Value();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Constant</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Constant</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Constant()
	 * @model
	 * @generated
	 */
	EList<Constant> getDomainSpecificDiff_Constant();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff If</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff If</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_If()
	 * @model
	 * @generated
	 */
	EList<If> getDomainSpecificDiff_If();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Function</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Function</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Function()
	 * @model
	 * @generated
	 */
	EList<Function> getDomainSpecificDiff_Function();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Parameter Definition</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Parameter Definition</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_ParameterDefinition()
	 * @model
	 * @generated
	 */
	EList<ParameterDefinition> getDomainSpecificDiff_ParameterDefinition();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Parameter</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Parameter</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Parameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getDomainSpecificDiff_Parameter();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Function Call</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Function Call</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_FunctionCall()
	 * @model
	 * @generated
	 */
	EList<FunctionCall> getDomainSpecificDiff_FunctionCall();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Parameter Call</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.ParameterCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Parameter Call</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_ParameterCall()
	 * @model
	 * @generated
	 */
	EList<ParameterCall> getDomainSpecificDiff_ParameterCall();

} // DomainSpecificDiff
