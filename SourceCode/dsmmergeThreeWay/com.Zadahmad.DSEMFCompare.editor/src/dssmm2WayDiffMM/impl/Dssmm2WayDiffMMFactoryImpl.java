/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dssmm2WayDiffMMFactoryImpl extends EFactoryImpl implements Dssmm2WayDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dssmm2WayDiffMMFactory init() {
		try {
			Dssmm2WayDiffMMFactory theDssmm2WayDiffMMFactory = (Dssmm2WayDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(Dssmm2WayDiffMMPackage.eNS_URI);
			if (theDssmm2WayDiffMMFactory != null) {
				return theDssmm2WayDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dssmm2WayDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayDiffMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT: return createDecisionSupport();
			case Dssmm2WayDiffMMPackage.MODEL: return createModel();
			case Dssmm2WayDiffMMPackage.LEAF_FACTOR: return createLeafFactor();
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR: return createCompositeFactor();
			case Dssmm2WayDiffMMPackage.OPTION: return createOption();
			case Dssmm2WayDiffMMPackage.VENDOR: return createVendor();
			case Dssmm2WayDiffMMPackage.SCORE: return createScore();
			case Dssmm2WayDiffMMPackage.SEMANTIC_DIFF: return createSemanticDiff();
			case Dssmm2WayDiffMMPackage.SEMANTIC_CONFLICT: return createSemanticConflict();
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT: return createDiffDecisionSupport();
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT_MODEL: return createDiffDecisionSupport_model();
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT_OPTIONS: return createDiffDecisionSupport_options();
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT_VENDORS: return createDiffDecisionSupport_vendors();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL: return createDiffModel();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL_ROOT_FACTOR: return createDiffModel_rootFactor();
			case Dssmm2WayDiffMMPackage.DIFF_FACTOR_SCORES: return createDiffFactor_scores();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR: return createDiffLeafFactor();
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR: return createDiffCompositeFactor();
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS: return createDiffCompositeFactor_subFactors();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION: return createDiffOption();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION_VENDOR: return createDiffOption_vendor();
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR: return createDiffVendor();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE: return createDiffScore();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE_SCORE_OPTION: return createDiffScore_score_option();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Dssmm2WayDiffMMPackage.CLASS_DIFF_KIND:
				return createClassDiffKindFromString(eDataType, initialValue);
			case Dssmm2WayDiffMMPackage.ASC_DIFF_KIND:
				return createAscDiffKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Dssmm2WayDiffMMPackage.CLASS_DIFF_KIND:
				return convertClassDiffKindToString(eDataType, instanceValue);
			case Dssmm2WayDiffMMPackage.ASC_DIFF_KIND:
				return convertAscDiffKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupport createDecisionSupport() {
		DecisionSupportImpl decisionSupport = new DecisionSupportImpl();
		return decisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafFactor createLeafFactor() {
		LeafFactorImpl leafFactor = new LeafFactorImpl();
		return leafFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFactor createCompositeFactor() {
		CompositeFactorImpl compositeFactor = new CompositeFactorImpl();
		return compositeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor createVendor() {
		VendorImpl vendor = new VendorImpl();
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score createScore() {
		ScoreImpl score = new ScoreImpl();
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticDiff createSemanticDiff() {
		SemanticDiffImpl semanticDiff = new SemanticDiffImpl();
		return semanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticConflict createSemanticConflict() {
		SemanticConflictImpl semanticConflict = new SemanticConflictImpl();
		return semanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffDecisionSupport createDiffDecisionSupport() {
		DiffDecisionSupportImpl diffDecisionSupport = new DiffDecisionSupportImpl();
		return diffDecisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffDecisionSupport_model createDiffDecisionSupport_model() {
		DiffDecisionSupport_modelImpl diffDecisionSupport_model = new DiffDecisionSupport_modelImpl();
		return diffDecisionSupport_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffDecisionSupport_options createDiffDecisionSupport_options() {
		DiffDecisionSupport_optionsImpl diffDecisionSupport_options = new DiffDecisionSupport_optionsImpl();
		return diffDecisionSupport_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffDecisionSupport_vendors createDiffDecisionSupport_vendors() {
		DiffDecisionSupport_vendorsImpl diffDecisionSupport_vendors = new DiffDecisionSupport_vendorsImpl();
		return diffDecisionSupport_vendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModel createDiffModel() {
		DiffModelImpl diffModel = new DiffModelImpl();
		return diffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModel_rootFactor createDiffModel_rootFactor() {
		DiffModel_rootFactorImpl diffModel_rootFactor = new DiffModel_rootFactorImpl();
		return diffModel_rootFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFactor_scores createDiffFactor_scores() {
		DiffFactor_scoresImpl diffFactor_scores = new DiffFactor_scoresImpl();
		return diffFactor_scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffLeafFactor createDiffLeafFactor() {
		DiffLeafFactorImpl diffLeafFactor = new DiffLeafFactorImpl();
		return diffLeafFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffCompositeFactor createDiffCompositeFactor() {
		DiffCompositeFactorImpl diffCompositeFactor = new DiffCompositeFactorImpl();
		return diffCompositeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffCompositeFactor_subFactors createDiffCompositeFactor_subFactors() {
		DiffCompositeFactor_subFactorsImpl diffCompositeFactor_subFactors = new DiffCompositeFactor_subFactorsImpl();
		return diffCompositeFactor_subFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffOption createDiffOption() {
		DiffOptionImpl diffOption = new DiffOptionImpl();
		return diffOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffOption_vendor createDiffOption_vendor() {
		DiffOption_vendorImpl diffOption_vendor = new DiffOption_vendorImpl();
		return diffOption_vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffVendor createDiffVendor() {
		DiffVendorImpl diffVendor = new DiffVendorImpl();
		return diffVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffScore createDiffScore() {
		DiffScoreImpl diffScore = new DiffScoreImpl();
		return diffScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffScore_score_option createDiffScore_score_option() {
		DiffScore_score_optionImpl diffScore_score_option = new DiffScore_score_optionImpl();
		return diffScore_score_option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind createClassDiffKindFromString(EDataType eDataType, String initialValue) {
		ClassDiffKind result = ClassDiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscDiffKind createAscDiffKindFromString(EDataType eDataType, String initialValue) {
		AscDiffKind result = AscDiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayDiffMMPackage getDssmm2WayDiffMMPackage() {
		return (Dssmm2WayDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dssmm2WayDiffMMPackage getPackage() {
		return Dssmm2WayDiffMMPackage.eINSTANCE;
	}

} //Dssmm2WayDiffMMFactoryImpl
