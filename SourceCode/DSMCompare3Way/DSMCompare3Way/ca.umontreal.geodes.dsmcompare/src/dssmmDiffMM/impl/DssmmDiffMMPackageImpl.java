/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.AscDiffKind;
import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.ClassDiffKind;
import dssmmDiffMM.CompositeFactor;
import dssmmDiffMM.DecisionSupport;
import dssmmDiffMM.DiffCompositeFactor;
import dssmmDiffMM.DiffCompositeFactor_subFactors;
import dssmmDiffMM.DiffDecisionSupport;
import dssmmDiffMM.DiffDecisionSupport_model;
import dssmmDiffMM.DiffDecisionSupport_options;
import dssmmDiffMM.DiffDecisionSupport_vendors;
import dssmmDiffMM.DiffFactor_scores;
import dssmmDiffMM.DiffLeafFactor;
import dssmmDiffMM.DiffModel;
import dssmmDiffMM.DiffModel_rootFactor;
import dssmmDiffMM.DiffOption;
import dssmmDiffMM.DiffOption_vendor;
import dssmmDiffMM.DiffScore;
import dssmmDiffMM.DiffScore_score_option;
import dssmmDiffMM.DiffVendor;
import dssmmDiffMM.DssmmDiffMMFactory;
import dssmmDiffMM.DssmmDiffMMPackage;
import dssmmDiffMM.Factor;
import dssmmDiffMM.LeafFactor;
import dssmmDiffMM.Model;
import dssmmDiffMM.Option;
import dssmmDiffMM.Score;
import dssmmDiffMM.SemanticConflict;
import dssmmDiffMM.SemanticDiff;
import dssmmDiffMM.SemanticObject;
import dssmmDiffMM.Vendor;

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
public class DssmmDiffMMPackageImpl extends EPackageImpl implements DssmmDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDecisionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDecisionSupport_modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDecisionSupport_optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDecisionSupport_vendorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffModel_rootFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFactor_scoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffLeafFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffCompositeFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffCompositeFactor_subFactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffOption_vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffVendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffScore_score_optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classDiffKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascDiffKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeStatusEEnum = null;

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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DssmmDiffMMPackageImpl() {
		super(eNS_URI, DssmmDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DssmmDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DssmmDiffMMPackage init() {
		if (isInited) return (DssmmDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(DssmmDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDssmmDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DssmmDiffMMPackageImpl theDssmmDiffMMPackage = registeredDssmmDiffMMPackage instanceof DssmmDiffMMPackageImpl ? (DssmmDiffMMPackageImpl)registeredDssmmDiffMMPackage : new DssmmDiffMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDssmmDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theDssmmDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDssmmDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DssmmDiffMMPackage.eNS_URI, theDssmmDiffMMPackage);
		return theDssmmDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSupport() {
		return decisionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionSupport_Name() {
		return (EAttribute)decisionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupport_Model() {
		return (EReference)decisionSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupport_Options() {
		return (EReference)decisionSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupport_Vendors() {
		return (EReference)decisionSupportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupport_Diffmodel() {
		return (EReference)decisionSupportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupport_Diffoptions() {
		return (EReference)decisionSupportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSupport_Diffvendors() {
		return (EReference)decisionSupportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ModelID() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Goal() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Descr() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_NumFacts() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_RootFactor() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_DiffrootFactor() {
		return (EReference)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactor() {
		return factorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_FactorID() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Name() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Descr() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_GW() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_LW() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Del() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_HideOnLine() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactor_Scores() {
		return (EReference)factorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Hierarchy() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_MasterFactorID() {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactor_Diffscores() {
		return (EReference)factorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafFactor() {
		return leafFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFactor() {
		return compositeFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFactor_SubFactors() {
		return (EReference)compositeFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFactor_DiffsubFactors() {
		return (EReference)compositeFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_OptionID() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Sort() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Cost() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_NumOtherCosts() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Vendor() {
		return (EReference)optionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Description() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Diffvendor() {
		return (EReference)optionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendor() {
		return vendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendor_VendorID() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendor_Name() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendor_Description() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScore() {
		return scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_SScore() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_DScore() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_Descr() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_Comment() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScore_Score_option() {
		return (EReference)scoreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_MethodID() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScore_Diffscore_option() {
		return (EReference)scoreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticObject() {
		return semanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticObject_Name() {
		return (EAttribute)semanticObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DecisionSupport() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffCompositeFactor_subFactors() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffDecisionSupport_model() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffDecisionSupport_options() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffDecisionSupport_vendors() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffFactor_scores() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffModel_rootFactor() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffOption_vendor() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffScore_score_option() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Factor() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Model() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Option() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Score() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Vendor() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticDiff() {
		return semanticDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticDiff_Author() {
		return (EAttribute)semanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticConflict() {
		return semanticConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_Semanticdiffs() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffDecisionSupport() {
		return diffDecisionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_Diff_kind_Left() {
		return (EAttribute)diffDecisionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_Diff_kind_Right() {
		return (EAttribute)diffDecisionSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_ChangeStatus() {
		return (EAttribute)diffDecisionSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_New_Name_Left() {
		return (EAttribute)diffDecisionSupportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_New_Name_Right() {
		return (EAttribute)diffDecisionSupportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_NameChangeStatus() {
		return (EAttribute)diffDecisionSupportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffDecisionSupport_model() {
		return diffDecisionSupport_modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_model_Diff_kind_Left() {
		return (EAttribute)diffDecisionSupport_modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_model_Diff_kind_Right() {
		return (EAttribute)diffDecisionSupport_modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_model_ChangeStatus() {
		return (EAttribute)diffDecisionSupport_modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffDecisionSupport_model_EType() {
		return (EReference)diffDecisionSupport_modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffDecisionSupport_options() {
		return diffDecisionSupport_optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_options_Diff_kind_Left() {
		return (EAttribute)diffDecisionSupport_optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_options_Diff_kind_Right() {
		return (EAttribute)diffDecisionSupport_optionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_options_ChangeStatus() {
		return (EAttribute)diffDecisionSupport_optionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffDecisionSupport_options_EType() {
		return (EReference)diffDecisionSupport_optionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffDecisionSupport_vendors() {
		return diffDecisionSupport_vendorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_vendors_Diff_kind_Left() {
		return (EAttribute)diffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_vendors_Diff_kind_Right() {
		return (EAttribute)diffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffDecisionSupport_vendors_ChangeStatus() {
		return (EAttribute)diffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffDecisionSupport_vendors_EType() {
		return (EReference)diffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffModel() {
		return diffModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_Diff_kind_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_Diff_kind_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_ChangeStatus() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_ModelID_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_ModelID_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_ModelIDChangeStatus() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_Name_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_Name_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_NameChangeStatus() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_Goal_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_Goal_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_GoalChangeStatus() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_Descr_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_Descr_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_DescrChangeStatus() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_NumFacts_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_New_NumFacts_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_NumFactsChangeStatus() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffModel_rootFactor() {
		return diffModel_rootFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_rootFactor_Diff_kind_Left() {
		return (EAttribute)diffModel_rootFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_rootFactor_Diff_kind_Right() {
		return (EAttribute)diffModel_rootFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_rootFactor_ChangeStatus() {
		return (EAttribute)diffModel_rootFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffModel_rootFactor_EType() {
		return (EReference)diffModel_rootFactorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffFactor_scores() {
		return diffFactor_scoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFactor_scores_Diff_kind_Left() {
		return (EAttribute)diffFactor_scoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFactor_scores_Diff_kind_Right() {
		return (EAttribute)diffFactor_scoresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFactor_scores_ChangeStatus() {
		return (EAttribute)diffFactor_scoresEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffFactor_scores_EType() {
		return (EReference)diffFactor_scoresEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffLeafFactor() {
		return diffLeafFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_Diff_kind_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_Diff_kind_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_ChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_FactorID_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_FactorID_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_FactorIDChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Name_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Name_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_NameChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Descr_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Descr_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_DescrChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_GW_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_GW_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_GWChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_LW_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_LW_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_LWChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Del_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Del_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_DelChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_HideOnLine_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_HideOnLine_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_HideOnLineChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Hierarchy_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_Hierarchy_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_HierarchyChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_MasterFactorID_Left() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_New_MasterFactorID_Right() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffLeafFactor_MasterFactorIDChangeStatus() {
		return (EAttribute)diffLeafFactorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffCompositeFactor() {
		return diffCompositeFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_Diff_kind_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_Diff_kind_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_ChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_FactorID_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_FactorID_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_FactorIDChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Name_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Name_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_NameChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Descr_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Descr_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_DescrChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_GW_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_GW_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_GWChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_LW_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_LW_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_LWChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Del_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Del_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_DelChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_HideOnLine_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_HideOnLine_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_HideOnLineChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Hierarchy_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_Hierarchy_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_HierarchyChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_MasterFactorID_Left() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_New_MasterFactorID_Right() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_MasterFactorIDChangeStatus() {
		return (EAttribute)diffCompositeFactorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffCompositeFactor_subFactors() {
		return diffCompositeFactor_subFactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_subFactors_Diff_kind_Left() {
		return (EAttribute)diffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_subFactors_Diff_kind_Right() {
		return (EAttribute)diffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffCompositeFactor_subFactors_ChangeStatus() {
		return (EAttribute)diffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffCompositeFactor_subFactors_EType() {
		return (EReference)diffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffOption() {
		return diffOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_Diff_kind_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_Diff_kind_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_ChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_OptionID_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_OptionID_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_OptionIDChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Name_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Name_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_NameChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Sort_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Sort_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_SortChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Cost_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Cost_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_CostChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_NumOtherCosts_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_NumOtherCosts_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_NumOtherCostsChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Description_Left() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_New_Description_Right() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_DescriptionChangeStatus() {
		return (EAttribute)diffOptionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffOption_vendor() {
		return diffOption_vendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_vendor_Diff_kind_Left() {
		return (EAttribute)diffOption_vendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_vendor_Diff_kind_Right() {
		return (EAttribute)diffOption_vendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffOption_vendor_ChangeStatus() {
		return (EAttribute)diffOption_vendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffOption_vendor_EType() {
		return (EReference)diffOption_vendorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffVendor() {
		return diffVendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_Diff_kind_Left() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_Diff_kind_Right() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_ChangeStatus() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_New_VendorID_Left() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_New_VendorID_Right() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_VendorIDChangeStatus() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_New_Name_Left() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_New_Name_Right() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_NameChangeStatus() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_New_Description_Left() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_New_Description_Right() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffVendor_DescriptionChangeStatus() {
		return (EAttribute)diffVendorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffScore() {
		return diffScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_Diff_kind_Left() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_Diff_kind_Right() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_ChangeStatus() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_SScore_Left() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_SScore_Right() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_SScoreChangeStatus() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_DScore_Left() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_DScore_Right() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_DScoreChangeStatus() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_Descr_Left() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_Descr_Right() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_DescrChangeStatus() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_Comment_Left() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_Comment_Right() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_CommentChangeStatus() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_MethodID_Left() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_New_MethodID_Right() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_MethodIDChangeStatus() {
		return (EAttribute)diffScoreEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffScore_score_option() {
		return diffScore_score_optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_score_option_Diff_kind_Left() {
		return (EAttribute)diffScore_score_optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_score_option_Diff_kind_Right() {
		return (EAttribute)diffScore_score_optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScore_score_option_ChangeStatus() {
		return (EAttribute)diffScore_score_optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffScore_score_option_EType() {
		return (EReference)diffScore_score_optionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassDiffKind() {
		return classDiffKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAscDiffKind() {
		return ascDiffKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAUTHOR() {
		return authorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeStatus() {
		return changeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DssmmDiffMMFactory getDssmmDiffMMFactory() {
		return (DssmmDiffMMFactory)getEFactoryInstance();
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
		decisionSupportEClass = createEClass(DECISION_SUPPORT);
		createEAttribute(decisionSupportEClass, DECISION_SUPPORT__NAME);
		createEReference(decisionSupportEClass, DECISION_SUPPORT__MODEL);
		createEReference(decisionSupportEClass, DECISION_SUPPORT__OPTIONS);
		createEReference(decisionSupportEClass, DECISION_SUPPORT__VENDORS);
		createEReference(decisionSupportEClass, DECISION_SUPPORT__DIFFMODEL);
		createEReference(decisionSupportEClass, DECISION_SUPPORT__DIFFOPTIONS);
		createEReference(decisionSupportEClass, DECISION_SUPPORT__DIFFVENDORS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__MODEL_ID);
		createEAttribute(modelEClass, MODEL__NAME);
		createEAttribute(modelEClass, MODEL__GOAL);
		createEAttribute(modelEClass, MODEL__DESCR);
		createEAttribute(modelEClass, MODEL__NUM_FACTS);
		createEReference(modelEClass, MODEL__ROOT_FACTOR);
		createEReference(modelEClass, MODEL__DIFFROOT_FACTOR);

		factorEClass = createEClass(FACTOR);
		createEAttribute(factorEClass, FACTOR__FACTOR_ID);
		createEAttribute(factorEClass, FACTOR__NAME);
		createEAttribute(factorEClass, FACTOR__DESCR);
		createEAttribute(factorEClass, FACTOR__GW);
		createEAttribute(factorEClass, FACTOR__LW);
		createEAttribute(factorEClass, FACTOR__DEL);
		createEAttribute(factorEClass, FACTOR__HIDE_ON_LINE);
		createEReference(factorEClass, FACTOR__SCORES);
		createEAttribute(factorEClass, FACTOR__HIERARCHY);
		createEAttribute(factorEClass, FACTOR__MASTER_FACTOR_ID);
		createEReference(factorEClass, FACTOR__DIFFSCORES);

		leafFactorEClass = createEClass(LEAF_FACTOR);

		compositeFactorEClass = createEClass(COMPOSITE_FACTOR);
		createEReference(compositeFactorEClass, COMPOSITE_FACTOR__SUB_FACTORS);
		createEReference(compositeFactorEClass, COMPOSITE_FACTOR__DIFFSUB_FACTORS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__OPTION_ID);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__SORT);
		createEAttribute(optionEClass, OPTION__COST);
		createEAttribute(optionEClass, OPTION__NUM_OTHER_COSTS);
		createEReference(optionEClass, OPTION__VENDOR);
		createEAttribute(optionEClass, OPTION__DESCRIPTION);
		createEReference(optionEClass, OPTION__DIFFVENDOR);

		vendorEClass = createEClass(VENDOR);
		createEAttribute(vendorEClass, VENDOR__VENDOR_ID);
		createEAttribute(vendorEClass, VENDOR__NAME);
		createEAttribute(vendorEClass, VENDOR__DESCRIPTION);

		scoreEClass = createEClass(SCORE);
		createEAttribute(scoreEClass, SCORE__SSCORE);
		createEAttribute(scoreEClass, SCORE__DSCORE);
		createEAttribute(scoreEClass, SCORE__DESCR);
		createEAttribute(scoreEClass, SCORE__COMMENT);
		createEReference(scoreEClass, SCORE__SCORE_OPTION);
		createEAttribute(scoreEClass, SCORE__METHOD_ID);
		createEReference(scoreEClass, SCORE__DIFFSCORE_OPTION);

		semanticObjectEClass = createEClass(SEMANTIC_OBJECT);
		createEAttribute(semanticObjectEClass, SEMANTIC_OBJECT__NAME);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR);

		semanticDiffEClass = createEClass(SEMANTIC_DIFF);
		createEAttribute(semanticDiffEClass, SEMANTIC_DIFF__AUTHOR);

		semanticConflictEClass = createEClass(SEMANTIC_CONFLICT);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTICDIFFS);

		diffDecisionSupportEClass = createEClass(DIFF_DECISION_SUPPORT);
		createEAttribute(diffDecisionSupportEClass, DIFF_DECISION_SUPPORT__DIFF_KIND_LEFT);
		createEAttribute(diffDecisionSupportEClass, DIFF_DECISION_SUPPORT__DIFF_KIND_RIGHT);
		createEAttribute(diffDecisionSupportEClass, DIFF_DECISION_SUPPORT__CHANGE_STATUS);
		createEAttribute(diffDecisionSupportEClass, DIFF_DECISION_SUPPORT__NEW_NAME_LEFT);
		createEAttribute(diffDecisionSupportEClass, DIFF_DECISION_SUPPORT__NEW_NAME_RIGHT);
		createEAttribute(diffDecisionSupportEClass, DIFF_DECISION_SUPPORT__NAME_CHANGE_STATUS);

		diffDecisionSupport_modelEClass = createEClass(DIFF_DECISION_SUPPORT_MODEL);
		createEAttribute(diffDecisionSupport_modelEClass, DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND_LEFT);
		createEAttribute(diffDecisionSupport_modelEClass, DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND_RIGHT);
		createEAttribute(diffDecisionSupport_modelEClass, DIFF_DECISION_SUPPORT_MODEL__CHANGE_STATUS);
		createEReference(diffDecisionSupport_modelEClass, DIFF_DECISION_SUPPORT_MODEL__ETYPE);

		diffDecisionSupport_optionsEClass = createEClass(DIFF_DECISION_SUPPORT_OPTIONS);
		createEAttribute(diffDecisionSupport_optionsEClass, DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND_LEFT);
		createEAttribute(diffDecisionSupport_optionsEClass, DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND_RIGHT);
		createEAttribute(diffDecisionSupport_optionsEClass, DIFF_DECISION_SUPPORT_OPTIONS__CHANGE_STATUS);
		createEReference(diffDecisionSupport_optionsEClass, DIFF_DECISION_SUPPORT_OPTIONS__ETYPE);

		diffDecisionSupport_vendorsEClass = createEClass(DIFF_DECISION_SUPPORT_VENDORS);
		createEAttribute(diffDecisionSupport_vendorsEClass, DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND_LEFT);
		createEAttribute(diffDecisionSupport_vendorsEClass, DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND_RIGHT);
		createEAttribute(diffDecisionSupport_vendorsEClass, DIFF_DECISION_SUPPORT_VENDORS__CHANGE_STATUS);
		createEReference(diffDecisionSupport_vendorsEClass, DIFF_DECISION_SUPPORT_VENDORS__ETYPE);

		diffModelEClass = createEClass(DIFF_MODEL);
		createEAttribute(diffModelEClass, DIFF_MODEL__DIFF_KIND_LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__DIFF_KIND_RIGHT);
		createEAttribute(diffModelEClass, DIFF_MODEL__CHANGE_STATUS);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_MODEL_ID_LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_MODEL_ID_RIGHT);
		createEAttribute(diffModelEClass, DIFF_MODEL__MODEL_ID_CHANGE_STATUS);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_NAME_LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_NAME_RIGHT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NAME_CHANGE_STATUS);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_GOAL_LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_GOAL_RIGHT);
		createEAttribute(diffModelEClass, DIFF_MODEL__GOAL_CHANGE_STATUS);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_DESCR_LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_DESCR_RIGHT);
		createEAttribute(diffModelEClass, DIFF_MODEL__DESCR_CHANGE_STATUS);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_NUM_FACTS_LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NEW_NUM_FACTS_RIGHT);
		createEAttribute(diffModelEClass, DIFF_MODEL__NUM_FACTS_CHANGE_STATUS);

		diffModel_rootFactorEClass = createEClass(DIFF_MODEL_ROOT_FACTOR);
		createEAttribute(diffModel_rootFactorEClass, DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT);
		createEAttribute(diffModel_rootFactorEClass, DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT);
		createEAttribute(diffModel_rootFactorEClass, DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS);
		createEReference(diffModel_rootFactorEClass, DIFF_MODEL_ROOT_FACTOR__ETYPE);

		diffFactor_scoresEClass = createEClass(DIFF_FACTOR_SCORES);
		createEAttribute(diffFactor_scoresEClass, DIFF_FACTOR_SCORES__DIFF_KIND_LEFT);
		createEAttribute(diffFactor_scoresEClass, DIFF_FACTOR_SCORES__DIFF_KIND_RIGHT);
		createEAttribute(diffFactor_scoresEClass, DIFF_FACTOR_SCORES__CHANGE_STATUS);
		createEReference(diffFactor_scoresEClass, DIFF_FACTOR_SCORES__ETYPE);

		diffLeafFactorEClass = createEClass(DIFF_LEAF_FACTOR);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__DIFF_KIND_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_NAME_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_NAME_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_DESCR_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_GW_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_GW_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__GW_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_LW_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_LW_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__LW_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_DEL_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_DEL_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT);
		createEAttribute(diffLeafFactorEClass, DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS);

		diffCompositeFactorEClass = createEClass(DIFF_COMPOSITE_FACTOR);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__DIFF_KIND_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__DIFF_KIND_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__FACTOR_ID_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_NAME_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_NAME_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NAME_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_DESCR_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_DESCR_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__DESCR_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_GW_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_GW_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__GW_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_LW_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_LW_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__LW_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_DEL_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_DEL_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__DEL_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__HIDE_ON_LINE_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__HIERARCHY_CHANGE_STATUS);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID_LEFT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT);
		createEAttribute(diffCompositeFactorEClass, DIFF_COMPOSITE_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS);

		diffCompositeFactor_subFactorsEClass = createEClass(DIFF_COMPOSITE_FACTOR_SUB_FACTORS);
		createEAttribute(diffCompositeFactor_subFactorsEClass, DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND_LEFT);
		createEAttribute(diffCompositeFactor_subFactorsEClass, DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND_RIGHT);
		createEAttribute(diffCompositeFactor_subFactorsEClass, DIFF_COMPOSITE_FACTOR_SUB_FACTORS__CHANGE_STATUS);
		createEReference(diffCompositeFactor_subFactorsEClass, DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE);

		diffOptionEClass = createEClass(DIFF_OPTION);
		createEAttribute(diffOptionEClass, DIFF_OPTION__DIFF_KIND_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__DIFF_KIND_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__CHANGE_STATUS);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_OPTION_ID_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_OPTION_ID_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__OPTION_ID_CHANGE_STATUS);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_NAME_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_NAME_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NAME_CHANGE_STATUS);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_SORT_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_SORT_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__SORT_CHANGE_STATUS);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_COST_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_COST_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__COST_CHANGE_STATUS);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_DESCRIPTION_LEFT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__NEW_DESCRIPTION_RIGHT);
		createEAttribute(diffOptionEClass, DIFF_OPTION__DESCRIPTION_CHANGE_STATUS);

		diffOption_vendorEClass = createEClass(DIFF_OPTION_VENDOR);
		createEAttribute(diffOption_vendorEClass, DIFF_OPTION_VENDOR__DIFF_KIND_LEFT);
		createEAttribute(diffOption_vendorEClass, DIFF_OPTION_VENDOR__DIFF_KIND_RIGHT);
		createEAttribute(diffOption_vendorEClass, DIFF_OPTION_VENDOR__CHANGE_STATUS);
		createEReference(diffOption_vendorEClass, DIFF_OPTION_VENDOR__ETYPE);

		diffVendorEClass = createEClass(DIFF_VENDOR);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__DIFF_KIND_LEFT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__DIFF_KIND_RIGHT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__CHANGE_STATUS);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NEW_VENDOR_ID_LEFT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NEW_VENDOR_ID_RIGHT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NEW_NAME_LEFT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NEW_NAME_RIGHT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NAME_CHANGE_STATUS);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NEW_DESCRIPTION_LEFT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__NEW_DESCRIPTION_RIGHT);
		createEAttribute(diffVendorEClass, DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS);

		diffScoreEClass = createEClass(DIFF_SCORE);
		createEAttribute(diffScoreEClass, DIFF_SCORE__DIFF_KIND_LEFT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__DIFF_KIND_RIGHT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__CHANGE_STATUS);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_SSCORE_LEFT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_SSCORE_RIGHT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__SSCORE_CHANGE_STATUS);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_DSCORE_LEFT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_DSCORE_RIGHT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__DSCORE_CHANGE_STATUS);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_DESCR_LEFT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_DESCR_RIGHT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__DESCR_CHANGE_STATUS);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_COMMENT_LEFT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_COMMENT_RIGHT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__COMMENT_CHANGE_STATUS);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_METHOD_ID_LEFT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__NEW_METHOD_ID_RIGHT);
		createEAttribute(diffScoreEClass, DIFF_SCORE__METHOD_ID_CHANGE_STATUS);

		diffScore_score_optionEClass = createEClass(DIFF_SCORE_SCORE_OPTION);
		createEAttribute(diffScore_score_optionEClass, DIFF_SCORE_SCORE_OPTION__DIFF_KIND_LEFT);
		createEAttribute(diffScore_score_optionEClass, DIFF_SCORE_SCORE_OPTION__DIFF_KIND_RIGHT);
		createEAttribute(diffScore_score_optionEClass, DIFF_SCORE_SCORE_OPTION__CHANGE_STATUS);
		createEReference(diffScore_score_optionEClass, DIFF_SCORE_SCORE_OPTION__ETYPE);

		// Create enums
		classDiffKindEEnum = createEEnum(CLASS_DIFF_KIND);
		ascDiffKindEEnum = createEEnum(ASC_DIFF_KIND);
		authorEEnum = createEEnum(AUTHOR);
		changeStatusEEnum = createEEnum(CHANGE_STATUS);
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
		leafFactorEClass.getESuperTypes().add(this.getFactor());
		compositeFactorEClass.getESuperTypes().add(this.getFactor());
		semanticDiffEClass.getESuperTypes().add(this.getSemanticObject());
		semanticConflictEClass.getESuperTypes().add(this.getSemanticObject());
		diffDecisionSupportEClass.getESuperTypes().add(this.getDecisionSupport());
		diffModelEClass.getESuperTypes().add(this.getModel());
		diffLeafFactorEClass.getESuperTypes().add(this.getLeafFactor());
		diffCompositeFactorEClass.getESuperTypes().add(this.getCompositeFactor());
		diffOptionEClass.getESuperTypes().add(this.getOption());
		diffVendorEClass.getESuperTypes().add(this.getVendor());
		diffScoreEClass.getESuperTypes().add(this.getScore());

		// Initialize classes, features, and operations; add parameters
		initEClass(decisionSupportEClass, DecisionSupport.class, "DecisionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionSupport_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionSupport_Model(), this.getModel(), null, "model", null, 0, 1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionSupport_Options(), this.getOption(), null, "options", null, 0, -1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionSupport_Vendors(), this.getVendor(), null, "vendors", null, 0, -1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionSupport_Diffmodel(), this.getDiffDecisionSupport_model(), null, "diffmodel", null, 0, -1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionSupport_Diffoptions(), this.getDiffDecisionSupport_options(), null, "diffoptions", null, 0, -1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionSupport_Diffvendors(), this.getDiffDecisionSupport_vendors(), null, "diffvendors", null, 0, -1, DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_ModelID(), ecorePackage.getEInt(), "ModelID", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Goal(), ecorePackage.getEString(), "Goal", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Descr(), ecorePackage.getEString(), "Descr", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_NumFacts(), ecorePackage.getEString(), "NumFacts", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_RootFactor(), this.getFactor(), null, "rootFactor", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DiffrootFactor(), this.getDiffModel_rootFactor(), null, "diffrootFactor", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorEClass, Factor.class, "Factor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactor_FactorID(), ecorePackage.getEInt(), "FactorID", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_Descr(), ecorePackage.getEString(), "Descr", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_GW(), ecorePackage.getEFloat(), "GW", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_LW(), ecorePackage.getEFloat(), "LW", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_Del(), ecorePackage.getEBooleanObject(), "Del", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_HideOnLine(), ecorePackage.getEBoolean(), "HideOnLine", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactor_Scores(), this.getScore(), null, "scores", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_Hierarchy(), ecorePackage.getEString(), "Hierarchy", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_MasterFactorID(), ecorePackage.getEInt(), "MasterFactorID", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactor_Diffscores(), this.getDiffFactor_scores(), null, "diffscores", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafFactorEClass, LeafFactor.class, "LeafFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeFactorEClass, CompositeFactor.class, "CompositeFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFactor_SubFactors(), this.getFactor(), null, "subFactors", null, 0, -1, CompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeFactor_DiffsubFactors(), this.getDiffCompositeFactor_subFactors(), null, "diffsubFactors", null, 0, -1, CompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_OptionID(), ecorePackage.getEInt(), "OptionID", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Sort(), ecorePackage.getEInt(), "Sort", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Cost(), ecorePackage.getEFloat(), "Cost", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_NumOtherCosts(), ecorePackage.getEInt(), "NumOtherCosts", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Vendor(), this.getVendor(), null, "vendor", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Diffvendor(), this.getDiffOption_vendor(), null, "diffvendor", null, 0, -1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorEClass, Vendor.class, "Vendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendor_VendorID(), ecorePackage.getEInt(), "VendorID", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreEClass, Score.class, "Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScore_SScore(), ecorePackage.getEFloat(), "SScore", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_DScore(), ecorePackage.getEFloat(), "DScore", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_Descr(), ecorePackage.getEString(), "Descr", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_Comment(), ecorePackage.getEString(), "Comment", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScore_Score_option(), this.getOption(), null, "score_option", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_MethodID(), ecorePackage.getEInt(), "MethodID", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScore_Diffscore_option(), this.getDiffScore_score_option(), null, "diffscore_option", null, 0, -1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticObjectEClass, SemanticObject.class, "SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DecisionSupport(), this.getDecisionSupport(), null, "SemanticObject_DecisionSupport", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffCompositeFactor_subFactors(), this.getDiffCompositeFactor_subFactors(), null, "SemanticObject_DiffCompositeFactor_subFactors", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffDecisionSupport_model(), this.getDiffDecisionSupport_model(), null, "SemanticObject_DiffDecisionSupport_model", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffDecisionSupport_options(), this.getDiffDecisionSupport_options(), null, "SemanticObject_DiffDecisionSupport_options", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffDecisionSupport_vendors(), this.getDiffDecisionSupport_vendors(), null, "SemanticObject_DiffDecisionSupport_vendors", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffFactor_scores(), this.getDiffFactor_scores(), null, "SemanticObject_DiffFactor_scores", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffModel_rootFactor(), this.getDiffModel_rootFactor(), null, "SemanticObject_DiffModel_rootFactor", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffOption_vendor(), this.getDiffOption_vendor(), null, "SemanticObject_DiffOption_vendor", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffScore_score_option(), this.getDiffScore_score_option(), null, "SemanticObject_DiffScore_score_option", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Factor(), this.getFactor(), null, "SemanticObject_Factor", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Model(), this.getModel(), null, "SemanticObject_Model", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Option(), this.getOption(), null, "SemanticObject_Option", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Score(), this.getScore(), null, "SemanticObject_Score", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Vendor(), this.getVendor(), null, "SemanticObject_Vendor", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticDiffEClass, SemanticDiff.class, "SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticDiff_Author(), this.getAUTHOR(), "author", "NON", 1, 1, SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticConflictEClass, SemanticConflict.class, "SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticConflict_Semanticdiffs(), this.getSemanticDiff(), null, "semanticdiffs", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDecisionSupportEClass, DiffDecisionSupport.class, "DiffDecisionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffDecisionSupport_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_New_Name_Left(), ecorePackage.getEString(), "new_Name_Left", null, 1, 1, DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_New_Name_Right(), ecorePackage.getEString(), "new_Name_Right", null, 1, 1, DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_NameChangeStatus(), this.getChangeStatus(), "NameChangeStatus", "NON", 1, 1, DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDecisionSupport_modelEClass, DiffDecisionSupport_model.class, "DiffDecisionSupport_model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffDecisionSupport_model_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_model_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_model_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffDecisionSupport_model_EType(), this.getModel(), null, "eType", null, 1, 1, DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDecisionSupport_optionsEClass, DiffDecisionSupport_options.class, "DiffDecisionSupport_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffDecisionSupport_options_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_options_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_options_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffDecisionSupport_options_EType(), this.getOption(), null, "eType", null, 1, 1, DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDecisionSupport_vendorsEClass, DiffDecisionSupport_vendors.class, "DiffDecisionSupport_vendors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffDecisionSupport_vendors_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_vendors_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffDecisionSupport_vendors_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffDecisionSupport_vendors_EType(), this.getVendor(), null, "eType", null, 1, 1, DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffModelEClass, DiffModel.class, "DiffModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffModel_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_ModelID_Left(), ecorePackage.getEInt(), "new_ModelID_Left", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_ModelID_Right(), ecorePackage.getEInt(), "new_ModelID_Right", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_ModelIDChangeStatus(), this.getChangeStatus(), "ModelIDChangeStatus", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_Name_Left(), ecorePackage.getEString(), "new_Name_Left", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_Name_Right(), ecorePackage.getEString(), "new_Name_Right", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_NameChangeStatus(), this.getChangeStatus(), "NameChangeStatus", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_Goal_Left(), ecorePackage.getEString(), "new_Goal_Left", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_Goal_Right(), ecorePackage.getEString(), "new_Goal_Right", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_GoalChangeStatus(), this.getChangeStatus(), "GoalChangeStatus", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_Descr_Left(), ecorePackage.getEString(), "new_Descr_Left", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_Descr_Right(), ecorePackage.getEString(), "new_Descr_Right", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_DescrChangeStatus(), this.getChangeStatus(), "DescrChangeStatus", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_NumFacts_Left(), ecorePackage.getEString(), "new_NumFacts_Left", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_New_NumFacts_Right(), ecorePackage.getEString(), "new_NumFacts_Right", null, 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_NumFactsChangeStatus(), this.getChangeStatus(), "NumFactsChangeStatus", "NON", 1, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffModel_rootFactorEClass, DiffModel_rootFactor.class, "DiffModel_rootFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffModel_rootFactor_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_rootFactor_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_rootFactor_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffModel_rootFactor_EType(), this.getFactor(), null, "eType", null, 1, 1, DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFactor_scoresEClass, DiffFactor_scores.class, "DiffFactor_scores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFactor_scores_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFactor_scores_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFactor_scores_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffFactor_scores_EType(), this.getScore(), null, "eType", null, 1, 1, DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffLeafFactorEClass, DiffLeafFactor.class, "DiffLeafFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffLeafFactor_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_FactorID_Left(), ecorePackage.getEInt(), "new_FactorID_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_FactorID_Right(), ecorePackage.getEInt(), "new_FactorID_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_FactorIDChangeStatus(), this.getChangeStatus(), "FactorIDChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Name_Left(), ecorePackage.getEString(), "new_Name_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Name_Right(), ecorePackage.getEString(), "new_Name_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_NameChangeStatus(), this.getChangeStatus(), "NameChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Descr_Left(), ecorePackage.getEString(), "new_Descr_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Descr_Right(), ecorePackage.getEString(), "new_Descr_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_DescrChangeStatus(), this.getChangeStatus(), "DescrChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_GW_Left(), ecorePackage.getEFloat(), "new_GW_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_GW_Right(), ecorePackage.getEFloat(), "new_GW_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_GWChangeStatus(), this.getChangeStatus(), "GWChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_LW_Left(), ecorePackage.getEFloat(), "new_LW_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_LW_Right(), ecorePackage.getEFloat(), "new_LW_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_LWChangeStatus(), this.getChangeStatus(), "LWChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Del_Left(), ecorePackage.getEBooleanObject(), "new_Del_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Del_Right(), ecorePackage.getEBooleanObject(), "new_Del_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_DelChangeStatus(), this.getChangeStatus(), "DelChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_HideOnLine_Left(), ecorePackage.getEBoolean(), "new_HideOnLine_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_HideOnLine_Right(), ecorePackage.getEBoolean(), "new_HideOnLine_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_HideOnLineChangeStatus(), this.getChangeStatus(), "HideOnLineChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Hierarchy_Left(), ecorePackage.getEString(), "new_Hierarchy_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_Hierarchy_Right(), ecorePackage.getEString(), "new_Hierarchy_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_HierarchyChangeStatus(), this.getChangeStatus(), "HierarchyChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_MasterFactorID_Left(), ecorePackage.getEInt(), "new_MasterFactorID_Left", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_New_MasterFactorID_Right(), ecorePackage.getEInt(), "new_MasterFactorID_Right", null, 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffLeafFactor_MasterFactorIDChangeStatus(), this.getChangeStatus(), "MasterFactorIDChangeStatus", "NON", 1, 1, DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffCompositeFactorEClass, DiffCompositeFactor.class, "DiffCompositeFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffCompositeFactor_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_FactorID_Left(), ecorePackage.getEInt(), "new_FactorID_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_FactorID_Right(), ecorePackage.getEInt(), "new_FactorID_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_FactorIDChangeStatus(), this.getChangeStatus(), "FactorIDChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Name_Left(), ecorePackage.getEString(), "new_Name_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Name_Right(), ecorePackage.getEString(), "new_Name_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_NameChangeStatus(), this.getChangeStatus(), "NameChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Descr_Left(), ecorePackage.getEString(), "new_Descr_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Descr_Right(), ecorePackage.getEString(), "new_Descr_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_DescrChangeStatus(), this.getChangeStatus(), "DescrChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_GW_Left(), ecorePackage.getEFloat(), "new_GW_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_GW_Right(), ecorePackage.getEFloat(), "new_GW_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_GWChangeStatus(), this.getChangeStatus(), "GWChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_LW_Left(), ecorePackage.getEFloat(), "new_LW_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_LW_Right(), ecorePackage.getEFloat(), "new_LW_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_LWChangeStatus(), this.getChangeStatus(), "LWChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Del_Left(), ecorePackage.getEBooleanObject(), "new_Del_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Del_Right(), ecorePackage.getEBooleanObject(), "new_Del_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_DelChangeStatus(), this.getChangeStatus(), "DelChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_HideOnLine_Left(), ecorePackage.getEBoolean(), "new_HideOnLine_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_HideOnLine_Right(), ecorePackage.getEBoolean(), "new_HideOnLine_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_HideOnLineChangeStatus(), this.getChangeStatus(), "HideOnLineChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Hierarchy_Left(), ecorePackage.getEString(), "new_Hierarchy_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_Hierarchy_Right(), ecorePackage.getEString(), "new_Hierarchy_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_HierarchyChangeStatus(), this.getChangeStatus(), "HierarchyChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_MasterFactorID_Left(), ecorePackage.getEInt(), "new_MasterFactorID_Left", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_New_MasterFactorID_Right(), ecorePackage.getEInt(), "new_MasterFactorID_Right", null, 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_MasterFactorIDChangeStatus(), this.getChangeStatus(), "MasterFactorIDChangeStatus", "NON", 1, 1, DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffCompositeFactor_subFactorsEClass, DiffCompositeFactor_subFactors.class, "DiffCompositeFactor_subFactors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffCompositeFactor_subFactors_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_subFactors_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffCompositeFactor_subFactors_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffCompositeFactor_subFactors_EType(), this.getFactor(), null, "eType", null, 1, 1, DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffOptionEClass, DiffOption.class, "DiffOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffOption_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_OptionID_Left(), ecorePackage.getEInt(), "new_OptionID_Left", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_OptionID_Right(), ecorePackage.getEInt(), "new_OptionID_Right", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_OptionIDChangeStatus(), this.getChangeStatus(), "OptionIDChangeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Name_Left(), ecorePackage.getEString(), "new_Name_Left", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Name_Right(), ecorePackage.getEString(), "new_Name_Right", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_NameChangeStatus(), this.getChangeStatus(), "NameChangeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Sort_Left(), ecorePackage.getEInt(), "new_Sort_Left", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Sort_Right(), ecorePackage.getEInt(), "new_Sort_Right", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_SortChangeStatus(), this.getChangeStatus(), "SortChangeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Cost_Left(), ecorePackage.getEFloat(), "new_Cost_Left", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Cost_Right(), ecorePackage.getEFloat(), "new_Cost_Right", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_CostChangeStatus(), this.getChangeStatus(), "CostChangeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_NumOtherCosts_Left(), ecorePackage.getEInt(), "new_NumOtherCosts_Left", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_NumOtherCosts_Right(), ecorePackage.getEInt(), "new_NumOtherCosts_Right", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_NumOtherCostsChangeStatus(), this.getChangeStatus(), "NumOtherCostsChangeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Description_Left(), ecorePackage.getEString(), "new_Description_Left", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_New_Description_Right(), ecorePackage.getEString(), "new_Description_Right", null, 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_DescriptionChangeStatus(), this.getChangeStatus(), "DescriptionChangeStatus", "NON", 1, 1, DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffOption_vendorEClass, DiffOption_vendor.class, "DiffOption_vendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffOption_vendor_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_vendor_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffOption_vendor_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffOption_vendor_EType(), this.getVendor(), null, "eType", null, 1, 1, DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffVendorEClass, DiffVendor.class, "DiffVendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffVendor_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_New_VendorID_Left(), ecorePackage.getEInt(), "new_VendorID_Left", null, 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_New_VendorID_Right(), ecorePackage.getEInt(), "new_VendorID_Right", null, 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_VendorIDChangeStatus(), this.getChangeStatus(), "VendorIDChangeStatus", "NON", 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_New_Name_Left(), ecorePackage.getEString(), "new_Name_Left", null, 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_New_Name_Right(), ecorePackage.getEString(), "new_Name_Right", null, 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_NameChangeStatus(), this.getChangeStatus(), "NameChangeStatus", "NON", 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_New_Description_Left(), ecorePackage.getEString(), "new_Description_Left", null, 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_New_Description_Right(), ecorePackage.getEString(), "new_Description_Right", null, 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffVendor_DescriptionChangeStatus(), this.getChangeStatus(), "DescriptionChangeStatus", "NON", 1, 1, DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffScoreEClass, DiffScore.class, "DiffScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffScore_Diff_kind_Left(), this.getClassDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_Diff_kind_Right(), this.getClassDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_SScore_Left(), ecorePackage.getEFloat(), "new_SScore_Left", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_SScore_Right(), ecorePackage.getEFloat(), "new_SScore_Right", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_SScoreChangeStatus(), this.getChangeStatus(), "SScoreChangeStatus", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_DScore_Left(), ecorePackage.getEFloat(), "new_DScore_Left", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_DScore_Right(), ecorePackage.getEFloat(), "new_DScore_Right", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_DScoreChangeStatus(), this.getChangeStatus(), "DScoreChangeStatus", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_Descr_Left(), ecorePackage.getEString(), "new_Descr_Left", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_Descr_Right(), ecorePackage.getEString(), "new_Descr_Right", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_DescrChangeStatus(), this.getChangeStatus(), "DescrChangeStatus", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_Comment_Left(), ecorePackage.getEString(), "new_Comment_Left", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_Comment_Right(), ecorePackage.getEString(), "new_Comment_Right", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_CommentChangeStatus(), this.getChangeStatus(), "CommentChangeStatus", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_MethodID_Left(), ecorePackage.getEInt(), "new_MethodID_Left", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_New_MethodID_Right(), ecorePackage.getEInt(), "new_MethodID_Right", null, 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_MethodIDChangeStatus(), this.getChangeStatus(), "MethodIDChangeStatus", "NON", 1, 1, DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffScore_score_optionEClass, DiffScore_score_option.class, "DiffScore_score_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffScore_score_option_Diff_kind_Left(), this.getAscDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_score_option_Diff_kind_Right(), this.getAscDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScore_score_option_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffScore_score_option_EType(), this.getOption(), null, "eType", null, 1, 1, DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classDiffKindEEnum, ClassDiffKind.class, "ClassDiffKind");
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.ADD);
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.DELETE);
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.MODIFY);
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.NON);

		initEEnum(ascDiffKindEEnum, AscDiffKind.class, "AscDiffKind");
		addEEnumLiteral(ascDiffKindEEnum, AscDiffKind.ADD);
		addEEnumLiteral(ascDiffKindEEnum, AscDiffKind.DELETE);
		addEEnumLiteral(ascDiffKindEEnum, AscDiffKind.NON);

		initEEnum(authorEEnum, dssmmDiffMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, dssmmDiffMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, dssmmDiffMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, dssmmDiffMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, dssmmDiffMM.AUTHOR.MIXED);
		addEEnumLiteral(authorEEnum, dssmmDiffMM.AUTHOR.NON);

		initEEnum(changeStatusEEnum, ChangeStatus.class, "ChangeStatus");
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.EQUIVALENT);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.CONTRADICTING);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.NON);

		// Create resource
		createResource(eNS_URI);
	}

} //DssmmDiffMMPackageImpl
