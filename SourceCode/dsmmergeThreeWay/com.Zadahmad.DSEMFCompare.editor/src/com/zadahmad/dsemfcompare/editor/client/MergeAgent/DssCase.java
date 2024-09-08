package com.zadahmad.dsemfcompare.editor.client.MergeAgent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DSRulesToHenshinTextNew;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MMToFineGrainedHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;
//import com.zadahmad.dsmcompare.core.DsmComparatorController;
import com.zadahmad.dsmcompare.core.DsmComparatorControllerNew;
import com.zadahmad.dsmcompare.core.RuleEngine.DsDiffModelToDsDiffRule;
import com.zadahmad.dsmcompare.core.threeWay.Version;
import com.zadahmad.dsmcompare.core.threeWay.VesrionInfo;

import dsmcompare.mmextension.MMExtension;
import dsmcompare.mmextension.utils.EMFUtils;
import dssmm.CompositeFactor;
import dssmm.DssmmFactory;
import dssmm.DssmmPackage;
import dssmm.Factor;
import dssmm.Option;
import dssmm2WayDiffMM.Dssmm2WayDiffMMFactory;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;
import dssmm2WayRuleMM.Dssmm2WayRuleMMFactory;
import dssmm2WayRuleMM.Dssmm2WayRuleMMPackage;
import dssmmDiffMM.DssmmDiffMMFactory;
import dssmmDiffMM.DssmmDiffMMPackage;



public class DssCase {
	//@Test
	public void loadComparison() throws IOException {
		EMFUtils.loadEMFCompareComparisonFromFile("casesMergeConflict/dss/diffModels/_diffModelsEMFCompare/cav1v2Test.compare");
	}	
	
	//####################################################################################
	//**************** Optional: Semi-Auto Generate dsRules from dsModels ****************
	//examples stored in diffRules / GeneratedRules / [rule name] / 
	//	(dsModels(CA,V1,V2 copied manually)/dsmDiffModelGenerated (copied)/dsRuleModelTransformed/manuallyCorrected)
	//Needs to be automated later
	
	public void step000() {
		//Prepare CA,V1,V2 manually and put it in the original dsModels folder		
		// V1 needs to be changed (V2 does not need to be changed from CA, but we need it)
	}
	
	//@Test
	public void step001() {
		 try {
			 emfCompareResultToFineGranularDsmdiffMM(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//dsDiffModel to dsDiffRule
	//@Test
	public void step002() {
		dsDiffModelToDsDiffRuleTransform();
	}
	
	public void step003() {	
		//Manually correct the bugs, and set filters
	}	
	
	//@Test
	public void step004() {		
		//Remove associations from domainSpecificDiff (SemanticDiff) object to the (diff) objects their filter set to true
		removeFilteredAssociations();
	}

	public void step005() {	
		//final Manual corrections; set name and constraints
	}
	
	//Transform the generated rule to Henshin and Test it on the dsDiff model
	
	//@Test
	public void step0051() {
		dsmcRuleFiles	= 
				new ArrayList<String>(Arrays.asList("pullUpHierarchy.xmi", 
				"pushDownHierarchy.xmi", "moveFactor.xmi")); 
		//pullUpHierarchyGen.xmi
		// extractSuperclassAttr, extractSuperclassRef, mergeRefrences, moveAttribute, moveRefrence,
		// pullUpAttribute, pullUpRefrence, pushDownAttribute, pushDownRefrence, renameAttribute, flattenHierarchyAttr, mergeMetaClassAttr
		dsmDiffRulesToHenshinTextRulesRun();
	}
	
	//ds-Diff Model To ds-Diff Rule name
	private void dsDiffModelToDsDiffRuleTransform() {
		DsDiffModelToDsDiffRule dsDiffModelToDsDiffRule = initializeDsDiffModelToDsDiffRule();		
		dsDiffModelToDsDiffRule.Transform();
		System.out.println("End: transform ds-DiffModel To DsDiffRule");

	}
	
	//Remove associations from domainSpecificDiff (SemanticDiff) object to the (diff) objects their filter set to true
	private void removeFilteredAssociations() {
		DsDiffModelToDsDiffRule dsDiffModelToDsDiffRule = initializeDsDiffModelToDsDiffRule();
		dsDiffModelToDsDiffRule.RemoveFilteredReferencesFromDSDObjet();
		System.out.println("End: Remove associations from domainSpecificDiff (SemanticDiff) object to the (diff) objects their filter set to true");
	}
	
	
	private DsDiffModelToDsDiffRule initializeDsDiffModelToDsDiffRule() {

		DsDiffModelToDsDiffRule dsDiffModelToDsDiffRule = new DsDiffModelToDsDiffRule();
		dsDiffModelToDsDiffRule.dsDiffModelFolder = diffModelsPath;
		dsDiffModelToDsDiffRule.dsDiffModelFileName = diffFileName;
		dsDiffModelToDsDiffRule.dsDiffRuleFolder = diffModelsPath;
		dsDiffModelToDsDiffRule.dsDiffRuleFileName = "rule"+diffFileName;		
		
		dsDiffModelToDsDiffRule.diffMM2Way_eNSURI 		= diffMM2Way_eNSURI;
		dsDiffModelToDsDiffRule.diffMM2Way_eIN 			= diffMM2Way_eNSURI;
		dsDiffModelToDsDiffRule.diffMM2WayFactory_eIN	= diffMM2WayFactory_eIN;
		
		dsDiffModelToDsDiffRule.ruleMM2Way_eNSURI 		= ruleMM2Way_eNSURI;
		dsDiffModelToDsDiffRule.ruleMM2Way_eIN 			= ruleMM2Way_eIN;
		dsDiffModelToDsDiffRule.ruleMM2WayFactory_eIN  	= ruleMM2WayFactory_eIN;
		
		dsDiffModelToDsDiffRule.diffMM_eNSURI 			= diffMM_eNSURI;
		dsDiffModelToDsDiffRule.diffMM_eIN  			= diffMM_eIN;
		dsDiffModelToDsDiffRule.diffMMFactory_eIN		= diffMMFactory_eIN;	
		return dsDiffModelToDsDiffRule;
		
	}
	
	//####################################################################################
	
	//emf-Compare Result to Fine-Grained DsmdiffMM (Diff012)
	//@Test//1//
	public void step1() {
		try {
			emfCompareResultToFineGranularDsmdiffMM(); //call over CA, V1, and V2 and create DSMDiff.xmi
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void emfCompareResultToFineGranularDsmdiffMM()  throws IOException {
		 initializeCaseStudy();
		 ComparisonFileVirtualPath ="";
		 dsmc.setDsdRulePackages(dsmcRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
				 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);		 
		 dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 	dsmc.getDSMDiffPath(), dsmc.getResultFilePath(), ComparisonFileVirtualPath);		 
		System.out.println("emf-Compare result transformed to Fine-Grained DsmdiffMM!");
	}	
	

	//****************************************	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//****************************************	
	//Find conflict between rules by HENSHIN MULTI CDA APIs
	//@Test  //MULTI CDA - HENSHIN
	public void dsmcConflictManagement()
	{
		 if(dsmcRulesToHenshinText==null || dsmcRulesToHenshinText.rulesFilter==null || dsmcRulesToHenshinText.rulesFilter.size()<1) {
		  	dsmcRulesToHenshinText = dsmDiffRulesToHenshinTextRules(true);
		 }
		 
		 //Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs	
		 
		 //Find conflict pairs among rules using Henshin MultiCda
		 //Could not seperate because of dependency to rulesFilter
		 MultiCdaSolver mcdaSolver= new MultiCdaSolver();
		 mcdaSolver.fullRulesSubDirectoryPath = diffRulesPath;
		 mcdaSolver.domainName = diffDomainName;
		 mcdaSolver.execute();
		 
		 //Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, dsmcRulesToHenshinText.rulesFilter);		 
		 vs.execute(null,null, 0);	
	}
		
	//**************** Henshin Rules ****************
	
	//diffRules to Henshin rules
	@Test//1//
	public void step006() {
		//dsmcRuleFiles	= new ArrayList<String>(Arrays.asList("extractMethod3.xmi", "extractMethod4.xmi")); 

		dsmDiffRulesToHenshinTextRulesRun();
	}
	
	public void dsmDiffRulesToHenshinTextRulesRun() 
	{
		dsmDiffRulesToHenshinTextRules(false);

		System.out.println("dsm-Diff Rule transformed to henshin-Text rules!");
	}
	
	public DSRulesToHenshinTextNew dsmDiffRulesToHenshinTextRules(boolean isATempFile) 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath =  henshinUrlPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = diffRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = ruleMM2Way_eNSURI;
		dsmcRulesToHenshinText.ruleMM_eIN = ruleMM2Way_eIN;
		dsmcRulesToHenshinText.run(isATempFile);
		return dsmcRulesToHenshinText;
	}
	
	public void initializeCaseStudy() {
		ArrayList<VesrionInfo> versionsInfo = new ArrayList<VesrionInfo>();
		VesrionInfo vCaInfo= new VesrionInfo();
		vCaInfo.fileName=vCaFileName;
		vCaInfo.source = "AuthorCA";
		vCaInfo.version = Version.ORIGIN;
		versionsInfo.add(vCaInfo);	
		
		VesrionInfo v1Info= new VesrionInfo();
		v1Info.fileName=vLeftFileName;
		v1Info.source = "AuthorV1";
		v1Info.version = Version.LEFT;
		versionsInfo.add(v1Info);		
		
		VesrionInfo v2Info= new VesrionInfo();
		v2Info.fileName=vRightFileName;
		v2Info.source = "AuthorV2";
		v2Info.version = Version.RIGHT;
		versionsInfo.add(v2Info);
		
		dsmc.initializeThreeWayComparison(metaModelsPath, dsModelsPath, diffRulesPath, 
				diffModelsPath, mmFileName, versionsInfo);
	}
	//_____________________________________________________
	//****************** Data Members **********************
	//String ecoreMM_eNSURI 			= org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eNS_URI;
	//Object ecoreMM_eIN 				= org.eclipse.emf.ecore.EcorePackage.eINSTANCE;
	
	String dssMM_eNSURI 			= DssmmPackage.eNS_URI;
	Object dssMM_eIN  				= DssmmPackage.eINSTANCE;
	
	String diffMM2Way_eNSURI 		= Dssmm2WayDiffMMPackage.eINSTANCE.eNS_URI;
	Object diffMM2Way_eIN 			= Dssmm2WayDiffMMPackage.eINSTANCE;
	EFactory diffMM2WayFactory_eIN	= Dssmm2WayDiffMMFactory.eINSTANCE;
	
	String ruleMM2Way_eNSURI 		= Dssmm2WayRuleMMPackage.eINSTANCE.eNS_URI;
	Object ruleMM2Way_eIN 			= Dssmm2WayRuleMMPackage.eINSTANCE;
	EFactory ruleMM2WayFactory_eIN  = Dssmm2WayRuleMMFactory.eINSTANCE;
	
	String diffMM_eNSURI 			= DssmmDiffMMPackage.eNS_URI;
	Object diffMM_eIN  				= DssmmDiffMMPackage.eINSTANCE;
	EFactory diffMMFactory_eIN		= DssmmDiffMMFactory.eINSTANCE;
	
	String caseStudyName			= DssmmPackage.eINSTANCE.getName();
	String rootClassName			= "DecisionSupport";
	
	
	String diffDomainName			= caseStudyName+"DiffMM";
	String caseStudyRootFolder		= "casesMergeConflict";	
	String caseStudyFolder			= "dss";
	String diffModelsFolder			= "diffModels";
	String diffRulesFolder			= "diffRules";
	String dsModelsFolder			= "dsModels";
	String henshinRulesFolder		= "henshinRules";
	String metaModelsFolder			= "metaModels";
	String bkSlash					= "\\";
	String slash					= "/";
	String wsPath					= System.getProperty("user.dir").replace("/", "\\");	
	String henshinUrlPath			= caseStudyRootFolder	+ slash + caseStudyFolder + slash;
	String caseStudyPath			= wsPath 		+ bkSlash + caseStudyRootFolder		+ bkSlash	+ caseStudyFolder;
	String diffModelsPath			= caseStudyPath + bkSlash + diffModelsFolder 		+ bkSlash;
	String diffRulesPath			= caseStudyPath + bkSlash + diffRulesFolder  		+ bkSlash;
	String dsModelsPath				= caseStudyPath + bkSlash + dsModelsFolder   		+ bkSlash;
	String henshinRulesPath			= caseStudyPath + bkSlash + henshinRulesFolder  	+ bkSlash;
	String metaModelsPath			= caseStudyPath + bkSlash + metaModelsFolder		+ bkSlash;	

	String mmFileName 				= "DSSMM.ecore";	
	String vCaFileName				= "CA.xmi";
	String vLeftFileName			= "V1.xmi";
	String vRightFileName			= "V2.xmi";
	String ComparisonFileVirtualPath="casesMergeConflict/dss/diffModels/_diffModelsEMFCompare/cav1v2Test.compare";
	String diffFileName				= "DSMDiff.xmi";
	String diffTransformedFileName	= "DSMDiff_transformed.xmi";
	String diffTransformedTransformedFileName	
									= "DSMDiff_transformed_transformed.xmi";
	String resultFileName			= "result.txt";
	String fileNameForChangeConflicts		= "changeConflicts.txt";
	String fileNameForSemanticFineConflicts = "semanticFineConflicts.txt";
	String henshinTextRulesFileName	= caseStudyName + "RulesDsDiff.henshin_text";
	String henshinRulesFileName		= caseStudyName + "RulesDsDiff_henshin_text.henshin";
	String henshinTextCPARulesFileName	= caseStudyName + "RulesCPA.henshin_text";
	String henshinRulesCPAFileName		= caseStudyName + "RulesCPA_henshin_text.henshin";
	
	String henshinTextPostRulesFileName	
									= caseStudyName + "PostRules.henshin_text";
	String henshinTextAutoGeneratedFineRulesFileName
									= caseStudyName + "AutoGeneratedFineRules.henshin_text";
	String henshinAutoGeneratedFineRulesFileName
									= caseStudyName + "AutoGeneratedFineRules_henshin_text.henshin";
	
	DsmComparatorControllerNew dsmc	= new DsmComparatorControllerNew();
	DSRulesToHenshinTextNew 	dsmcRulesToHenshinText 			
									= new DSRulesToHenshinTextNew();
	MMToFineGrainedHenshinText 	mmToFineGrainedHenshinText 	
									= new MMToFineGrainedHenshinText();
	
	ArrayList<String> dsmcRuleFiles	= new ArrayList<String>(
 			Arrays.asList( 	
 					"splitChildren.xmi",
 					"splitChildrenCF.xmi",
 					"mergefactors.xmi",
 					"mergefactorsCF.xmi",
 					"pullUpHierarchy.xmi", 	
 					"pullUpHierarchyCF.xmi", 	
 					"pushDownHierarchy.xmi", 
 					"pushDownHierarchyCF.xmi", 					
 					"moveFactor.xmi",					
 					"moveFactorCF.xmi",
 					"renameFactor.xmi",
 					"renameFactorCF.xmi",
 					"scoreEnhanced.xmi",
 					"scoreDegraded.xmi" 	
 					/*,  
 					"pruneChildren.xmi"
 					*/			
 					)
 			);

	//_____________________________________________________
	//********************* Utilities *********************
	
	//**************** Generation of Meta-Model ****************
	//2WayDsDiffMM Meta-model preparation 
	//@Test
	public void step01() {
		 try {
			generate2WayDsDiffMM();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//2WayDsRuleMM Meta-model preparation 
	//@Test
	public void step02() {		 
		 try {
			generate2WayDsRuleMM();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//3WayDsDiffMM Meta-model preparation 
	//@Test
	public void step03() {
		 try {
			generate3WayDsDiffMM();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Generate 2-way domain-specific Diff-Model (used to create the 2-way diff-model. We do not use it to create diff model in 3-way merge)
	//@Test
	public void generate2WayDsDiffMM() throws IOException {
		//It is need to be called before generate2WayDsRuleMM method
		initializeCaseStudy();
		String path = dsmc.getDSMMPath();
		URI fileURI = URI.createFileURI(path);
		MMExtension extender = new MMExtension();
		Resource	DsDiffMM = extender.generate2WayDsDiffMM(fileURI, rootClassName);
		System.out.println("generate 2Way-DsDiffMM (Serializable) finished!");
	 }	
	
	//Generate 2-way domain-specific Rule-Model (It will be used to generate rule-model/editor, It dosn't take into account the authors)
	//@Test
	public void generate2WayDsRuleMM() throws IOException {
		//According to new Process, we use 2-Way Rule models. As a result the dsl engineer  
		//	create rule models without considering Left/Right authors and 
		//	then the Henshin-rule generator, generates Henshin rules match semantic differences
		//	of left/right sides
		initializeCaseStudy();
		String path2WayDiffMM = dsmc.getDSMMPath().replace(".ecore", "2WayDiffMM.ecore");
		URI fileURI2WayDiffMM = URI.createFileURI(path2WayDiffMM);
		MMExtension extender    = new MMExtension();
		//URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI2WayDiffMM,".ecore","DiffMM.ecore");	
		//Before the following method make sure you called generate2WayDsDiffMM() method
		Resource	DsRuleMM = extender.generate2WayDsRuleMM(fileURI2WayDiffMM, rootClassName);
				//extender.generateDsRuleMM(diffmmURI, rootClassName);
		System.out.println("generate 2Way-DsRuleMM (Serializable) finished!");
	 }
	
	
	//****************************************
	//-->Prepare Meta-models
	//Generate 3-way domain-specific Diff-Model
	//@Test
	public void generate3WayDsDiffMM() throws IOException {
		initializeCaseStudy();
		URI fileURI = URI.createFileURI(dsmc.getDSMMPath());
		MMExtension extender    = new MMExtension();
		Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName);
		System.out.println("generate 3Way-DsDiffMM (Serializable) finished!");
	 }	
	 
	
	//******************************
	public dssmm.DecisionSupport ds;// = DssmmFactory.eINSTANCE.createDecisionSupport();
	public ArrayList<Factor> factrsFlatMode;// =  new ArrayList<Factor>();
	
	String excelImportDir;// = "D:/_udemSVN/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/casesMergeConflict/dss/rawData/";
	String excelExportVirtualDir;
	String[] filesToTransform = {"CA.xls","v1.xls","v2.xls","v11.xls"};
    
	
	String excelCAfileName;// = "Discrete ERP-MVCS Experiment - Version 0-Original.xls";
    String excelCAFilePath;//= excelFileDir + excelCAfileName;
    //excelCAFilePath = "D:/_udemSVN/Papers/ThreeWayDiff/docs/4/results.xlsx";
    
    InputStream excelInputStream;// = new FileInputStream(excelCAFilePath);
    XSSFWorkbook  wb;// = new  XSSFWorkbook (excelInputStream);
    int nameCellNum = 4;
    
    int factorSheetId = 0;
    int vendorSheetId = 1;
    int optionSheetId = 1;
    int scoreSheetId = 3;
    int modelId;
    
    //@Test
    public void excelToDss() throws IOException {
    	init();
    	for(String f:filesToTransform) {
    		excelCAfileName = f;
    	    excelCAFilePath= excelImportDir + excelCAfileName;	    
    	    excelInputStream = new FileInputStream(excelCAFilePath);
    	    wb = new  XSSFWorkbook (excelInputStream);
    	    ds = DssmmFactory.eINSTANCE.createDecisionSupport();
    		factrsFlatMode =  new ArrayList<Factor>();
    		excelToDssDataImport();
    		exportDssModelToFile();
    	}
    }
    	
	
	public void excelToDssDataImport() throws IOException {		
		modelImport(); // Excel = Model  (No change) // Our Analysis are only for one model	
		vendorOptionImport(); //option=Alternatives
		factorImport(); // Hierarchy = Path1.Path2. ... LW LocalWeight GW Global Weight , Del (rule) , 	
		scoreImport();//=Rating  //Method(Ignore), 
	}
	
	public void exportDssModelToFile() throws IOException {
		 // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(caseStudyName, new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        String transformedFileName = excelCAfileName.replace(".xls", "."+caseStudyName);
        Resource resource = resSet.createResource(URI
                .createURI(excelExportVirtualDir + transformedFileName));////filePathToSave  //CA.dssmm
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(ds);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println(transformedFileName + " is saved in :" + excelExportVirtualDir);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public void init() throws IOException {
		excelImportDir = "casesMergeConflict/dss/rawData/";
		//excelImportDir = "D:/_udemSVN/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/casesMergeConflict/dss/rawData/";
		//filesToTransform = {"CA.xls","v1.xls","v2.xls","v11.xls"};
		excelExportVirtualDir ="casesMergeConflict/dss/dsModels/";
		
		modelId = 46;
	}
	//****************************************	
	public void modelImport() {
		//As model (and method) do not change we do not need to store model changes
		try {
			XSSFSheet sheet = wb.getSheetAt(factorSheetId);
		    int rows = sheet.getPhysicalNumberOfRows();
		    if(rows>=2) {		    
		    	XSSFRow row= sheet.getRow(1);			        
		        ds.setModel(DssmmFactory.eINSTANCE.createModel());
		        ds.getModel().setName(row.getCell(nameCellNum).toString());
		        ds.getModel().setModelID(modelId);
		    }						
		}
		catch(Exception ioe) {
	    ioe.printStackTrace();
		}
	}
	//****************************************	
	public void factorImport() {
		try {			
			XSSFSheet sheet = wb.getSheetAt(factorSheetId);
		    int rows = sheet.getPhysicalNumberOfRows();
		    for(int r = 1; r < rows; r++) {
		        factorImportSingle(sheet, rows, r);
		    }

		} catch(Exception ioe) {
		    ioe.printStackTrace();
		}
	}
	
	public void factorImportSingle(XSSFSheet sheet, int rows, int rowNumber) {
		XSSFRow row= sheet.getRow(rowNumber);	
		if(row != null) {
			XSSFCell cell = row.getCell(0);
	        String hierarchy = cell.toString();	
	        
	    	int hierarchyDepth= getHierarchyDepth(hierarchy);	
        	boolean isACompositeFactor = false;
	    	if(rowNumber!=rows-1) {
	    		String hierarchyNextRow = sheet.getRow(rowNumber+1).getCell(0).toString();
	    		int hierarchyDepthNextRow= getHierarchyDepth(hierarchyNextRow);
	    		isACompositeFactor = hierarchyDepthNextRow > hierarchyDepth;
	    	}
	    	dssmm.Factor factor;
	    	if(isACompositeFactor || hierarchy.trim().toLowerCase().equals("root")) {
	    		factor = DssmmFactory.eINSTANCE.createCompositeFactor();		
	    	}else {
	    		factor = DssmmFactory.eINSTANCE.createLeafFactor();	
	    	}
	    	factor.setHierarchy(hierarchy);
		    factor.setFactorID((int)Double.parseDouble(row.getCell(2).toString()));
	    	factor.setName(row.getCell(nameCellNum+hierarchyDepth+1).toString());	
	    	factor.setMasterFactorID((int)Double.parseDouble(row.getCell(2).toString()));
	    	try {
	    	factor.setLW((float)Double.parseDouble(row.getCell(10).toString()));
	    	}catch(Exception ex) {}
	    	try {
	    		factor.setGW((float)Double.parseDouble(row.getCell(11).toString()));
	    	}catch(Exception ex) {}
	    	factor.setDescr(row.getCell(12).toString());	    					    	
	    	
	    	CompositeFactor parent= (CompositeFactor) getParent(hierarchy);
	    	if(parent != null)
	        	parent.getSubFactors().add(factor);		
	    	else if(hierarchy.trim().toLowerCase().equals("root"))
	    		ds.getModel().setRootFactor(factor);
	    	factrsFlatMode.add(factor);
        }
	}
	
	public Factor getParent(String hierarchyChild) {
		if(ds.getModel().getRootFactor() == null)
			return null;
		int lastIndexOfPoint=hierarchyChild.lastIndexOf(".");
		if(lastIndexOfPoint==-1)
			return ds.getModel().getRootFactor();
		String hierarchyParent= hierarchyChild.substring(0, lastIndexOfPoint);
		//factrsFlatMode.stream().filter(f->f.)
		for(Factor f:factrsFlatMode) 
			if(f instanceof CompositeFactor && f.getHierarchy().trim().equals(hierarchyParent))
					return f;
		return ds.getModel().getRootFactor();			
	}

	public int getHierarchyDepth(String hierarchy) {
		return hierarchy.length() - hierarchy.replace(".", "").length();	
	}
	
	public Factor getFactorByHierarchy(String hierarchy) {
		for(Factor f:factrsFlatMode) 
			if(f.getHierarchy().trim().equals(hierarchy))
					return f;	
		return null;
	}
	//****************************************		
	public void vendorOptionImport() {
		try {			
			XSSFSheet sheet = wb.getSheetAt(vendorSheetId);//optionSheetId
		    int rows = sheet.getPhysicalNumberOfRows();		    	
		    for(int r = 1; r < rows; r++) {
		    	vendorImportSingle(sheet, rows, r);
		    	optionImportSingle(sheet, rows, r);
		    }

		} catch(Exception ioe) {
		    ioe.printStackTrace();
		}
	}
	//********
	public void vendorImportSingle(XSSFSheet sheet, int rows, int rowNumber) {
		XSSFRow row= sheet.getRow(rowNumber);	
		if(row != null) {
			dssmm.Vendor vendor= DssmmFactory.eINSTANCE.createVendor();
		    vendor.setName(row.getCell(9).toString());
		    vendor.setDescription(row.getCell(10).toString());
		    vendor.setVendorID((int)Double.parseDouble(row.getCell(11).toString()));	
	    	
	    	ds.getVendors().add(vendor);
        }
	}
	//*******	
	public void optionImportSingle(XSSFSheet sheet, int rows, int rowNumber) {
		XSSFRow row= sheet.getRow(rowNumber);	
		if(row != null) {
			dssmm.Option option= DssmmFactory.eINSTANCE.createOption();			
		    option.setOptionID((int)Double.parseDouble(row.getCell(8).toString()));	
		    option.setName(row.getCell(0).toString());	
		    option.setCost((float)Double.parseDouble(row.getCell(5).toString()));//BaseCost/Benefit
		    option.setNumOtherCosts((int)Double.parseDouble(row.getCell(4).toString()));//TotalCost/Benefit	  
		    
		    int vendorId = ((int)Double.parseDouble(row.getCell(11).toString()));
		    dssmm.Vendor vendor=ds.getVendors().stream().filter(v->v.getVendorID()== vendorId).findFirst().get();
		    if(vendor!=null)
		    	option.setVendor(vendor);
		    
	    	ds.getOptions().add(option);
        }
	}
	
	
	//****************************************	
	public void scoreImport() {
		try {			
			XSSFSheet sheet = wb.getSheetAt(scoreSheetId);
		    int rows = sheet.getPhysicalNumberOfRows();
		    for(int r = 1; r < rows; r++) {
		    	scoreImportSingle(sheet, rows, r);
		    }

		} catch(Exception ioe) {
		    ioe.printStackTrace();
		}
	}

	public void scoreImportSingle(XSSFSheet sheet, int rows, int rowNumber) {
		XSSFRow row= sheet.getRow(rowNumber);	
		if(row != null) {
			XSSFCell cell = row.getCell(0);
	        String hierarchy = cell.toString();	
	        Factor factor = getFactorByHierarchy(hierarchy);
			
	        Option oABW =ds.getOptions().stream().filter(o->o.getName().equals("ABW")).findFirst().get();
	        Option oAptean =ds.getOptions().stream().filter(o->o.getName().equals("Aptean Industrial Manufacturing Made2Manage Edition")).findFirst().get();
	        Option oAptus =ds.getOptions().stream().filter(o->o.getName().equals("Aptus Appteck ERP")).findFirst().get();
	        Option oAXIOM =ds.getOptions().stream().filter(o->o.getName().equals("AXIOM")).findFirst().get();
	        Option oDynamics =ds.getOptions().stream().filter(o->o.getName().equals("Dynamics 365")).findFirst().get();
	        Option oEpicor =ds.getOptions().stream().filter(o->o.getName().equals("Epicor Kinetic")).findFirst().get();
	        
	        int MethodID = 0;
	        try{
	        	MethodID = ((int)Double.parseDouble(row.getCell(7).toString()));
	        }catch(Exception ex) {};
	        
	        dssmm.Score scoreABW= DssmmFactory.eINSTANCE.createScore();
	        //scoreABW.setMethodID(MethodID);
	        scoreABW.setDescr(row.getCell(8).toString());
	        scoreABW.setComment(row.getCell(14).toString());
	        scoreABW.setScore_option(oABW);
	        
	        dssmm.Score scoreAptean= DssmmFactory.eINSTANCE.createScore();
	        scoreAptean.setDescr(row.getCell(9).toString());
	        scoreAptean.setComment(row.getCell(15).toString());
	        scoreAptean.setScore_option(oAptean);
	        
	        dssmm.Score scoreAptus= DssmmFactory.eINSTANCE.createScore();
	        scoreAptus.setDescr(row.getCell(10).toString());
	        scoreAptus.setComment(row.getCell(16).toString());
	        scoreAptus.setScore_option(oAptus);
	        
	        dssmm.Score scoreAXIOM= DssmmFactory.eINSTANCE.createScore();
	        scoreAXIOM.setDescr(row.getCell(11).toString());
	        scoreAXIOM.setComment(row.getCell(17).toString());
	        scoreAXIOM.setScore_option(oAXIOM);
	        
	        dssmm.Score scoreDynamics= DssmmFactory.eINSTANCE.createScore();
	        scoreDynamics.setDescr(row.getCell(12).toString());
	        scoreDynamics.setComment(row.getCell(18).toString());
	        scoreDynamics.setScore_option(oDynamics);
	        
	        dssmm.Score scoreEpicor= DssmmFactory.eINSTANCE.createScore();
	        scoreEpicor.setDescr(row.getCell(13).toString());
	        scoreEpicor.setComment(row.getCell(19).toString());
	        scoreEpicor.setScore_option(oEpicor);

	        if(factor.getScores()==null)
	        	System.out.println("factor.getScores()==null");
	        
	        
	        factor.getScores().add(scoreABW);
	        factor.getScores().add(scoreAptean);
	        factor.getScores().add(scoreAptus);
	        factor.getScores().add(scoreAXIOM);
	        factor.getScores().add(scoreDynamics);
	        factor.getScores().add(scoreEpicor);
	        
		    
		    // You can get sscore, dscore from method
	        //Method for a all factors of a method is almost same so we dont need to record method and related properties  
	    	
        }
	}
	
	
	

}
