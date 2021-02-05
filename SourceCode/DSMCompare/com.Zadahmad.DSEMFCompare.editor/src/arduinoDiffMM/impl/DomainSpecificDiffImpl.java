/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.AnalogPin;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.BooleanOperator;
import arduinoDiffMM.Connector;
import arduinoDiffMM.Constant;
import arduinoDiffMM.Control;
import arduinoDiffMM.Delay;
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
import arduinoDiffMM.Repeat;
import arduinoDiffMM.Sensor;
import arduinoDiffMM.Set;
import arduinoDiffMM.Sketch;
import arduinoDiffMM.Status;
import arduinoDiffMM.Utilities;
import arduinoDiffMM.Value;
import arduinoDiffMM.Variable;
import arduinoDiffMM.While;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getName <em>Name</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Hardware <em>Domain Specific Diff Hardware</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Platform <em>Domain Specific Diff Platform</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Module <em>Domain Specific Diff Module</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DigitalPin <em>Domain Specific Diff Digital Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Pin <em>Domain Specific Diff Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_AnalogPin <em>Domain Specific Diff Analog Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Sketch <em>Domain Specific Diff Sketch</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Instruction <em>Domain Specific Diff Instruction</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Status <em>Domain Specific Diff Status</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Level <em>Domain Specific Diff Level</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_ModuleInstruction <em>Domain Specific Diff Module Instruction</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Control <em>Domain Specific Diff Control</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Utilities <em>Domain Specific Diff Utilities</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_IO <em>Domain Specific Diff IO</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Delay <em>Domain Specific Diff Delay</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_InputModule <em>Domain Specific Diff Input Module</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_OutputModule <em>Domain Specific Diff Output Module</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_NamedElement <em>Domain Specific Diff Named Element</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Connector <em>Domain Specific Diff Connector</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Repeat <em>Domain Specific Diff Repeat</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Sensor <em>Domain Specific Diff Sensor</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_While <em>Domain Specific Diff While</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_MathOperator <em>Domain Specific Diff Math Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Variable <em>Domain Specific Diff Variable</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Set <em>Domain Specific Diff Set</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_NumericalOperator <em>Domain Specific Diff Numerical Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_BooleanOperator <em>Domain Specific Diff Boolean Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Value <em>Domain Specific Diff Value</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Constant <em>Domain Specific Diff Constant</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_If <em>Domain Specific Diff If</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Function <em>Domain Specific Diff Function</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_ParameterDefinition <em>Domain Specific Diff Parameter Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Parameter <em>Domain Specific Diff Parameter</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_FunctionCall <em>Domain Specific Diff Function Call</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_ParameterCall <em>Domain Specific Diff Parameter Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainSpecificDiffImpl extends MinimalEObjectImpl.Container implements DomainSpecificDiff {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Hardware() <em>Domain Specific Diff Hardware</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Hardware()
	 * @generated
	 * @ordered
	 */
	protected EList<Hardware> domainSpecificDiff_Hardware;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Platform() <em>Domain Specific Diff Platform</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Platform()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> domainSpecificDiff_Platform;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Module() <em>Domain Specific Diff Module</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Module()
	 * @generated
	 * @ordered
	 */
	protected EList<arduinoDiffMM.Module> domainSpecificDiff_Module;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DigitalPin() <em>Domain Specific Diff Digital Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DigitalPin()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalPin> domainSpecificDiff_DigitalPin;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Pin() <em>Domain Specific Diff Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Pin()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> domainSpecificDiff_Pin;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_AnalogPin() <em>Domain Specific Diff Analog Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_AnalogPin()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogPin> domainSpecificDiff_AnalogPin;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Sketch() <em>Domain Specific Diff Sketch</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Sketch()
	 * @generated
	 * @ordered
	 */
	protected EList<Sketch> domainSpecificDiff_Sketch;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Instruction() <em>Domain Specific Diff Instruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Instruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> domainSpecificDiff_Instruction;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Status() <em>Domain Specific Diff Status</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Status()
	 * @generated
	 * @ordered
	 */
	protected EList<Status> domainSpecificDiff_Status;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Level() <em>Domain Specific Diff Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Level()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> domainSpecificDiff_Level;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_ModuleInstruction() <em>Domain Specific Diff Module Instruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_ModuleInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleInstruction> domainSpecificDiff_ModuleInstruction;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Control() <em>Domain Specific Diff Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Control()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> domainSpecificDiff_Control;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Utilities() <em>Domain Specific Diff Utilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Utilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Utilities> domainSpecificDiff_Utilities;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_IO() <em>Domain Specific Diff IO</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_IO()
	 * @generated
	 * @ordered
	 */
	protected EList<IO> domainSpecificDiff_IO;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Delay() <em>Domain Specific Diff Delay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Delay()
	 * @generated
	 * @ordered
	 */
	protected EList<Delay> domainSpecificDiff_Delay;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_InputModule() <em>Domain Specific Diff Input Module</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_InputModule()
	 * @generated
	 * @ordered
	 */
	protected EList<InputModule> domainSpecificDiff_InputModule;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_OutputModule() <em>Domain Specific Diff Output Module</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_OutputModule()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputModule> domainSpecificDiff_OutputModule;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_NamedElement() <em>Domain Specific Diff Named Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> domainSpecificDiff_NamedElement;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Connector() <em>Domain Specific Diff Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Connector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> domainSpecificDiff_Connector;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Repeat() <em>Domain Specific Diff Repeat</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Repeat()
	 * @generated
	 * @ordered
	 */
	protected EList<Repeat> domainSpecificDiff_Repeat;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Sensor() <em>Domain Specific Diff Sensor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Sensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> domainSpecificDiff_Sensor;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_While() <em>Domain Specific Diff While</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_While()
	 * @generated
	 * @ordered
	 */
	protected EList<While> domainSpecificDiff_While;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_MathOperator() <em>Domain Specific Diff Math Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_MathOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<MathOperator> domainSpecificDiff_MathOperator;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Variable() <em>Domain Specific Diff Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Variable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> domainSpecificDiff_Variable;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Set() <em>Domain Specific Diff Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Set()
	 * @generated
	 * @ordered
	 */
	protected EList<Set> domainSpecificDiff_Set;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_NumericalOperator() <em>Domain Specific Diff Numerical Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_NumericalOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<NumericalOperator> domainSpecificDiff_NumericalOperator;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_BooleanOperator() <em>Domain Specific Diff Boolean Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_BooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> domainSpecificDiff_BooleanOperator;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Value() <em>Domain Specific Diff Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Value()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> domainSpecificDiff_Value;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Constant() <em>Domain Specific Diff Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Constant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> domainSpecificDiff_Constant;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_If() <em>Domain Specific Diff If</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_If()
	 * @generated
	 * @ordered
	 */
	protected EList<If> domainSpecificDiff_If;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Function() <em>Domain Specific Diff Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Function()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> domainSpecificDiff_Function;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_ParameterDefinition() <em>Domain Specific Diff Parameter Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_ParameterDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinition> domainSpecificDiff_ParameterDefinition;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Parameter() <em>Domain Specific Diff Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Parameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> domainSpecificDiff_Parameter;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_FunctionCall() <em>Domain Specific Diff Function Call</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_FunctionCall()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionCall> domainSpecificDiff_FunctionCall;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_ParameterCall() <em>Domain Specific Diff Parameter Call</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_ParameterCall()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCall> domainSpecificDiff_ParameterCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificDiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hardware> getDomainSpecificDiff_Hardware() {
		if (domainSpecificDiff_Hardware == null) {
			domainSpecificDiff_Hardware = new EObjectResolvingEList<Hardware>(Hardware.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE);
		}
		return domainSpecificDiff_Hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Platform> getDomainSpecificDiff_Platform() {
		if (domainSpecificDiff_Platform == null) {
			domainSpecificDiff_Platform = new EObjectResolvingEList<Platform>(Platform.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM);
		}
		return domainSpecificDiff_Platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<arduinoDiffMM.Module> getDomainSpecificDiff_Module() {
		if (domainSpecificDiff_Module == null) {
			domainSpecificDiff_Module = new EObjectResolvingEList<arduinoDiffMM.Module>(arduinoDiffMM.Module.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE);
		}
		return domainSpecificDiff_Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DigitalPin> getDomainSpecificDiff_DigitalPin() {
		if (domainSpecificDiff_DigitalPin == null) {
			domainSpecificDiff_DigitalPin = new EObjectResolvingEList<DigitalPin>(DigitalPin.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN);
		}
		return domainSpecificDiff_DigitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pin> getDomainSpecificDiff_Pin() {
		if (domainSpecificDiff_Pin == null) {
			domainSpecificDiff_Pin = new EObjectResolvingEList<Pin>(Pin.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN);
		}
		return domainSpecificDiff_Pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnalogPin> getDomainSpecificDiff_AnalogPin() {
		if (domainSpecificDiff_AnalogPin == null) {
			domainSpecificDiff_AnalogPin = new EObjectResolvingEList<AnalogPin>(AnalogPin.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN);
		}
		return domainSpecificDiff_AnalogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sketch> getDomainSpecificDiff_Sketch() {
		if (domainSpecificDiff_Sketch == null) {
			domainSpecificDiff_Sketch = new EObjectResolvingEList<Sketch>(Sketch.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH);
		}
		return domainSpecificDiff_Sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction> getDomainSpecificDiff_Instruction() {
		if (domainSpecificDiff_Instruction == null) {
			domainSpecificDiff_Instruction = new EObjectResolvingEList<Instruction>(Instruction.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION);
		}
		return domainSpecificDiff_Instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Status> getDomainSpecificDiff_Status() {
		if (domainSpecificDiff_Status == null) {
			domainSpecificDiff_Status = new EObjectResolvingEList<Status>(Status.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS);
		}
		return domainSpecificDiff_Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Level> getDomainSpecificDiff_Level() {
		if (domainSpecificDiff_Level == null) {
			domainSpecificDiff_Level = new EObjectResolvingEList<Level>(Level.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL);
		}
		return domainSpecificDiff_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleInstruction> getDomainSpecificDiff_ModuleInstruction() {
		if (domainSpecificDiff_ModuleInstruction == null) {
			domainSpecificDiff_ModuleInstruction = new EObjectResolvingEList<ModuleInstruction>(ModuleInstruction.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION);
		}
		return domainSpecificDiff_ModuleInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getDomainSpecificDiff_Control() {
		if (domainSpecificDiff_Control == null) {
			domainSpecificDiff_Control = new EObjectResolvingEList<Control>(Control.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL);
		}
		return domainSpecificDiff_Control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Utilities> getDomainSpecificDiff_Utilities() {
		if (domainSpecificDiff_Utilities == null) {
			domainSpecificDiff_Utilities = new EObjectResolvingEList<Utilities>(Utilities.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES);
		}
		return domainSpecificDiff_Utilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IO> getDomainSpecificDiff_IO() {
		if (domainSpecificDiff_IO == null) {
			domainSpecificDiff_IO = new EObjectResolvingEList<IO>(IO.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO);
		}
		return domainSpecificDiff_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Delay> getDomainSpecificDiff_Delay() {
		if (domainSpecificDiff_Delay == null) {
			domainSpecificDiff_Delay = new EObjectResolvingEList<Delay>(Delay.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY);
		}
		return domainSpecificDiff_Delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputModule> getDomainSpecificDiff_InputModule() {
		if (domainSpecificDiff_InputModule == null) {
			domainSpecificDiff_InputModule = new EObjectResolvingEList<InputModule>(InputModule.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE);
		}
		return domainSpecificDiff_InputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputModule> getDomainSpecificDiff_OutputModule() {
		if (domainSpecificDiff_OutputModule == null) {
			domainSpecificDiff_OutputModule = new EObjectResolvingEList<OutputModule>(OutputModule.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE);
		}
		return domainSpecificDiff_OutputModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getDomainSpecificDiff_NamedElement() {
		if (domainSpecificDiff_NamedElement == null) {
			domainSpecificDiff_NamedElement = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT);
		}
		return domainSpecificDiff_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getDomainSpecificDiff_Connector() {
		if (domainSpecificDiff_Connector == null) {
			domainSpecificDiff_Connector = new EObjectResolvingEList<Connector>(Connector.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR);
		}
		return domainSpecificDiff_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repeat> getDomainSpecificDiff_Repeat() {
		if (domainSpecificDiff_Repeat == null) {
			domainSpecificDiff_Repeat = new EObjectResolvingEList<Repeat>(Repeat.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT);
		}
		return domainSpecificDiff_Repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getDomainSpecificDiff_Sensor() {
		if (domainSpecificDiff_Sensor == null) {
			domainSpecificDiff_Sensor = new EObjectResolvingEList<Sensor>(Sensor.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR);
		}
		return domainSpecificDiff_Sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<While> getDomainSpecificDiff_While() {
		if (domainSpecificDiff_While == null) {
			domainSpecificDiff_While = new EObjectResolvingEList<While>(While.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE);
		}
		return domainSpecificDiff_While;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathOperator> getDomainSpecificDiff_MathOperator() {
		if (domainSpecificDiff_MathOperator == null) {
			domainSpecificDiff_MathOperator = new EObjectResolvingEList<MathOperator>(MathOperator.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR);
		}
		return domainSpecificDiff_MathOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getDomainSpecificDiff_Variable() {
		if (domainSpecificDiff_Variable == null) {
			domainSpecificDiff_Variable = new EObjectResolvingEList<Variable>(Variable.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE);
		}
		return domainSpecificDiff_Variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Set> getDomainSpecificDiff_Set() {
		if (domainSpecificDiff_Set == null) {
			domainSpecificDiff_Set = new EObjectResolvingEList<Set>(Set.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET);
		}
		return domainSpecificDiff_Set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NumericalOperator> getDomainSpecificDiff_NumericalOperator() {
		if (domainSpecificDiff_NumericalOperator == null) {
			domainSpecificDiff_NumericalOperator = new EObjectResolvingEList<NumericalOperator>(NumericalOperator.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR);
		}
		return domainSpecificDiff_NumericalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanOperator> getDomainSpecificDiff_BooleanOperator() {
		if (domainSpecificDiff_BooleanOperator == null) {
			domainSpecificDiff_BooleanOperator = new EObjectResolvingEList<BooleanOperator>(BooleanOperator.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR);
		}
		return domainSpecificDiff_BooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Value> getDomainSpecificDiff_Value() {
		if (domainSpecificDiff_Value == null) {
			domainSpecificDiff_Value = new EObjectResolvingEList<Value>(Value.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE);
		}
		return domainSpecificDiff_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constant> getDomainSpecificDiff_Constant() {
		if (domainSpecificDiff_Constant == null) {
			domainSpecificDiff_Constant = new EObjectResolvingEList<Constant>(Constant.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT);
		}
		return domainSpecificDiff_Constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<If> getDomainSpecificDiff_If() {
		if (domainSpecificDiff_If == null) {
			domainSpecificDiff_If = new EObjectResolvingEList<If>(If.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF);
		}
		return domainSpecificDiff_If;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function> getDomainSpecificDiff_Function() {
		if (domainSpecificDiff_Function == null) {
			domainSpecificDiff_Function = new EObjectResolvingEList<Function>(Function.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION);
		}
		return domainSpecificDiff_Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterDefinition> getDomainSpecificDiff_ParameterDefinition() {
		if (domainSpecificDiff_ParameterDefinition == null) {
			domainSpecificDiff_ParameterDefinition = new EObjectResolvingEList<ParameterDefinition>(ParameterDefinition.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION);
		}
		return domainSpecificDiff_ParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getDomainSpecificDiff_Parameter() {
		if (domainSpecificDiff_Parameter == null) {
			domainSpecificDiff_Parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER);
		}
		return domainSpecificDiff_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionCall> getDomainSpecificDiff_FunctionCall() {
		if (domainSpecificDiff_FunctionCall == null) {
			domainSpecificDiff_FunctionCall = new EObjectResolvingEList<FunctionCall>(FunctionCall.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL);
		}
		return domainSpecificDiff_FunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterCall> getDomainSpecificDiff_ParameterCall() {
		if (domainSpecificDiff_ParameterCall == null) {
			domainSpecificDiff_ParameterCall = new EObjectResolvingEList<ParameterCall>(ParameterCall.class, this, ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL);
		}
		return domainSpecificDiff_ParameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return getName();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE:
				return getDomainSpecificDiff_Hardware();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM:
				return getDomainSpecificDiff_Platform();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE:
				return getDomainSpecificDiff_Module();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN:
				return getDomainSpecificDiff_DigitalPin();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN:
				return getDomainSpecificDiff_Pin();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN:
				return getDomainSpecificDiff_AnalogPin();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH:
				return getDomainSpecificDiff_Sketch();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION:
				return getDomainSpecificDiff_Instruction();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS:
				return getDomainSpecificDiff_Status();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL:
				return getDomainSpecificDiff_Level();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION:
				return getDomainSpecificDiff_ModuleInstruction();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL:
				return getDomainSpecificDiff_Control();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES:
				return getDomainSpecificDiff_Utilities();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO:
				return getDomainSpecificDiff_IO();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY:
				return getDomainSpecificDiff_Delay();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE:
				return getDomainSpecificDiff_InputModule();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE:
				return getDomainSpecificDiff_OutputModule();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT:
				return getDomainSpecificDiff_NamedElement();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR:
				return getDomainSpecificDiff_Connector();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT:
				return getDomainSpecificDiff_Repeat();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR:
				return getDomainSpecificDiff_Sensor();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE:
				return getDomainSpecificDiff_While();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR:
				return getDomainSpecificDiff_MathOperator();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE:
				return getDomainSpecificDiff_Variable();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET:
				return getDomainSpecificDiff_Set();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR:
				return getDomainSpecificDiff_NumericalOperator();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR:
				return getDomainSpecificDiff_BooleanOperator();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE:
				return getDomainSpecificDiff_Value();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT:
				return getDomainSpecificDiff_Constant();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF:
				return getDomainSpecificDiff_If();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION:
				return getDomainSpecificDiff_Function();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION:
				return getDomainSpecificDiff_ParameterDefinition();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER:
				return getDomainSpecificDiff_Parameter();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL:
				return getDomainSpecificDiff_FunctionCall();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL:
				return getDomainSpecificDiff_ParameterCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName((String)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE:
				getDomainSpecificDiff_Hardware().clear();
				getDomainSpecificDiff_Hardware().addAll((Collection<? extends Hardware>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM:
				getDomainSpecificDiff_Platform().clear();
				getDomainSpecificDiff_Platform().addAll((Collection<? extends Platform>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE:
				getDomainSpecificDiff_Module().clear();
				getDomainSpecificDiff_Module().addAll((Collection<? extends arduinoDiffMM.Module>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN:
				getDomainSpecificDiff_DigitalPin().clear();
				getDomainSpecificDiff_DigitalPin().addAll((Collection<? extends DigitalPin>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN:
				getDomainSpecificDiff_Pin().clear();
				getDomainSpecificDiff_Pin().addAll((Collection<? extends Pin>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN:
				getDomainSpecificDiff_AnalogPin().clear();
				getDomainSpecificDiff_AnalogPin().addAll((Collection<? extends AnalogPin>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH:
				getDomainSpecificDiff_Sketch().clear();
				getDomainSpecificDiff_Sketch().addAll((Collection<? extends Sketch>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION:
				getDomainSpecificDiff_Instruction().clear();
				getDomainSpecificDiff_Instruction().addAll((Collection<? extends Instruction>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS:
				getDomainSpecificDiff_Status().clear();
				getDomainSpecificDiff_Status().addAll((Collection<? extends Status>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL:
				getDomainSpecificDiff_Level().clear();
				getDomainSpecificDiff_Level().addAll((Collection<? extends Level>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION:
				getDomainSpecificDiff_ModuleInstruction().clear();
				getDomainSpecificDiff_ModuleInstruction().addAll((Collection<? extends ModuleInstruction>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL:
				getDomainSpecificDiff_Control().clear();
				getDomainSpecificDiff_Control().addAll((Collection<? extends Control>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES:
				getDomainSpecificDiff_Utilities().clear();
				getDomainSpecificDiff_Utilities().addAll((Collection<? extends Utilities>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO:
				getDomainSpecificDiff_IO().clear();
				getDomainSpecificDiff_IO().addAll((Collection<? extends IO>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY:
				getDomainSpecificDiff_Delay().clear();
				getDomainSpecificDiff_Delay().addAll((Collection<? extends Delay>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE:
				getDomainSpecificDiff_InputModule().clear();
				getDomainSpecificDiff_InputModule().addAll((Collection<? extends InputModule>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE:
				getDomainSpecificDiff_OutputModule().clear();
				getDomainSpecificDiff_OutputModule().addAll((Collection<? extends OutputModule>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT:
				getDomainSpecificDiff_NamedElement().clear();
				getDomainSpecificDiff_NamedElement().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR:
				getDomainSpecificDiff_Connector().clear();
				getDomainSpecificDiff_Connector().addAll((Collection<? extends Connector>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT:
				getDomainSpecificDiff_Repeat().clear();
				getDomainSpecificDiff_Repeat().addAll((Collection<? extends Repeat>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR:
				getDomainSpecificDiff_Sensor().clear();
				getDomainSpecificDiff_Sensor().addAll((Collection<? extends Sensor>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE:
				getDomainSpecificDiff_While().clear();
				getDomainSpecificDiff_While().addAll((Collection<? extends While>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR:
				getDomainSpecificDiff_MathOperator().clear();
				getDomainSpecificDiff_MathOperator().addAll((Collection<? extends MathOperator>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE:
				getDomainSpecificDiff_Variable().clear();
				getDomainSpecificDiff_Variable().addAll((Collection<? extends Variable>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET:
				getDomainSpecificDiff_Set().clear();
				getDomainSpecificDiff_Set().addAll((Collection<? extends Set>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR:
				getDomainSpecificDiff_NumericalOperator().clear();
				getDomainSpecificDiff_NumericalOperator().addAll((Collection<? extends NumericalOperator>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR:
				getDomainSpecificDiff_BooleanOperator().clear();
				getDomainSpecificDiff_BooleanOperator().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE:
				getDomainSpecificDiff_Value().clear();
				getDomainSpecificDiff_Value().addAll((Collection<? extends Value>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT:
				getDomainSpecificDiff_Constant().clear();
				getDomainSpecificDiff_Constant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF:
				getDomainSpecificDiff_If().clear();
				getDomainSpecificDiff_If().addAll((Collection<? extends If>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION:
				getDomainSpecificDiff_Function().clear();
				getDomainSpecificDiff_Function().addAll((Collection<? extends Function>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION:
				getDomainSpecificDiff_ParameterDefinition().clear();
				getDomainSpecificDiff_ParameterDefinition().addAll((Collection<? extends ParameterDefinition>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER:
				getDomainSpecificDiff_Parameter().clear();
				getDomainSpecificDiff_Parameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL:
				getDomainSpecificDiff_FunctionCall().clear();
				getDomainSpecificDiff_FunctionCall().addAll((Collection<? extends FunctionCall>)newValue);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL:
				getDomainSpecificDiff_ParameterCall().clear();
				getDomainSpecificDiff_ParameterCall().addAll((Collection<? extends ParameterCall>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE:
				getDomainSpecificDiff_Hardware().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM:
				getDomainSpecificDiff_Platform().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE:
				getDomainSpecificDiff_Module().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN:
				getDomainSpecificDiff_DigitalPin().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN:
				getDomainSpecificDiff_Pin().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN:
				getDomainSpecificDiff_AnalogPin().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH:
				getDomainSpecificDiff_Sketch().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION:
				getDomainSpecificDiff_Instruction().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS:
				getDomainSpecificDiff_Status().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL:
				getDomainSpecificDiff_Level().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION:
				getDomainSpecificDiff_ModuleInstruction().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL:
				getDomainSpecificDiff_Control().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES:
				getDomainSpecificDiff_Utilities().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO:
				getDomainSpecificDiff_IO().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY:
				getDomainSpecificDiff_Delay().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE:
				getDomainSpecificDiff_InputModule().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE:
				getDomainSpecificDiff_OutputModule().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT:
				getDomainSpecificDiff_NamedElement().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR:
				getDomainSpecificDiff_Connector().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT:
				getDomainSpecificDiff_Repeat().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR:
				getDomainSpecificDiff_Sensor().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE:
				getDomainSpecificDiff_While().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR:
				getDomainSpecificDiff_MathOperator().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE:
				getDomainSpecificDiff_Variable().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET:
				getDomainSpecificDiff_Set().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR:
				getDomainSpecificDiff_NumericalOperator().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR:
				getDomainSpecificDiff_BooleanOperator().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE:
				getDomainSpecificDiff_Value().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT:
				getDomainSpecificDiff_Constant().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF:
				getDomainSpecificDiff_If().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION:
				getDomainSpecificDiff_Function().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION:
				getDomainSpecificDiff_ParameterDefinition().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER:
				getDomainSpecificDiff_Parameter().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL:
				getDomainSpecificDiff_FunctionCall().clear();
				return;
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL:
				getDomainSpecificDiff_ParameterCall().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE:
				return domainSpecificDiff_Hardware != null && !domainSpecificDiff_Hardware.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM:
				return domainSpecificDiff_Platform != null && !domainSpecificDiff_Platform.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE:
				return domainSpecificDiff_Module != null && !domainSpecificDiff_Module.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN:
				return domainSpecificDiff_DigitalPin != null && !domainSpecificDiff_DigitalPin.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN:
				return domainSpecificDiff_Pin != null && !domainSpecificDiff_Pin.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN:
				return domainSpecificDiff_AnalogPin != null && !domainSpecificDiff_AnalogPin.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH:
				return domainSpecificDiff_Sketch != null && !domainSpecificDiff_Sketch.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION:
				return domainSpecificDiff_Instruction != null && !domainSpecificDiff_Instruction.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS:
				return domainSpecificDiff_Status != null && !domainSpecificDiff_Status.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL:
				return domainSpecificDiff_Level != null && !domainSpecificDiff_Level.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION:
				return domainSpecificDiff_ModuleInstruction != null && !domainSpecificDiff_ModuleInstruction.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL:
				return domainSpecificDiff_Control != null && !domainSpecificDiff_Control.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES:
				return domainSpecificDiff_Utilities != null && !domainSpecificDiff_Utilities.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO:
				return domainSpecificDiff_IO != null && !domainSpecificDiff_IO.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY:
				return domainSpecificDiff_Delay != null && !domainSpecificDiff_Delay.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE:
				return domainSpecificDiff_InputModule != null && !domainSpecificDiff_InputModule.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE:
				return domainSpecificDiff_OutputModule != null && !domainSpecificDiff_OutputModule.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT:
				return domainSpecificDiff_NamedElement != null && !domainSpecificDiff_NamedElement.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR:
				return domainSpecificDiff_Connector != null && !domainSpecificDiff_Connector.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT:
				return domainSpecificDiff_Repeat != null && !domainSpecificDiff_Repeat.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR:
				return domainSpecificDiff_Sensor != null && !domainSpecificDiff_Sensor.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE:
				return domainSpecificDiff_While != null && !domainSpecificDiff_While.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR:
				return domainSpecificDiff_MathOperator != null && !domainSpecificDiff_MathOperator.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE:
				return domainSpecificDiff_Variable != null && !domainSpecificDiff_Variable.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET:
				return domainSpecificDiff_Set != null && !domainSpecificDiff_Set.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR:
				return domainSpecificDiff_NumericalOperator != null && !domainSpecificDiff_NumericalOperator.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR:
				return domainSpecificDiff_BooleanOperator != null && !domainSpecificDiff_BooleanOperator.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE:
				return domainSpecificDiff_Value != null && !domainSpecificDiff_Value.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT:
				return domainSpecificDiff_Constant != null && !domainSpecificDiff_Constant.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF:
				return domainSpecificDiff_If != null && !domainSpecificDiff_If.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION:
				return domainSpecificDiff_Function != null && !domainSpecificDiff_Function.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION:
				return domainSpecificDiff_ParameterDefinition != null && !domainSpecificDiff_ParameterDefinition.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER:
				return domainSpecificDiff_Parameter != null && !domainSpecificDiff_Parameter.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL:
				return domainSpecificDiff_FunctionCall != null && !domainSpecificDiff_FunctionCall.isEmpty();
			case ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL:
				return domainSpecificDiff_ParameterCall != null && !domainSpecificDiff_ParameterCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainSpecificDiffImpl
