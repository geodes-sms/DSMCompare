/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Project#getHardware <em>Hardware</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getSketch <em>Sketch</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getModules <em>Modules</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getPlatform <em>Platform</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getDiffhardware <em>Diffhardware</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getDiffsketch <em>Diffsketch</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getDiffmodules <em>Diffmodules</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getDiffplatform <em>Diffplatform</em>}</li>
 *   <li>{@link arduinoDiffMM.Project#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference.
	 * @see #setHardware(Hardware)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Hardware()
	 * @model containment="true"
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Project#getHardware <em>Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' containment reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Hardware value);

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Sketch()
	 * @model containment="true"
	 * @generated
	 */
	Sketch getSketch();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Project#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	void setSketch(Sketch value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<arduinoDiffMM.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.Platform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Platform()
	 * @model containment="true"
	 * @generated
	 */
	EList<Platform> getPlatform();

	/**
	 * Returns the value of the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainspecificdiffs</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Domainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificDiff> getDomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Diffhardware</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffProject_hardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffhardware</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Diffhardware()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffProject_hardware> getDiffhardware();

	/**
	 * Returns the value of the '<em><b>Diffsketch</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffProject_sketch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffsketch</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Diffsketch()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffProject_sketch> getDiffsketch();

	/**
	 * Returns the value of the '<em><b>Diffmodules</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffProject_modules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmodules</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Diffmodules()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffProject_modules> getDiffmodules();

	/**
	 * Returns the value of the '<em><b>Diffplatform</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffProject_platform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplatform</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Diffplatform()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffProject_platform> getDiffplatform();

	/**
	 * Returns the value of the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffProject_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdomainspecificdiffs</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getProject_Diffdomainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffProject_domainspecificdiffs> getDiffdomainspecificdiffs();

} // Project
