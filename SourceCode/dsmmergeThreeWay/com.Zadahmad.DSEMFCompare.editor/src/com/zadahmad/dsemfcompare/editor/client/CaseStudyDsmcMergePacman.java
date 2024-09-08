package com.zadahmad.dsemfcompare.editor.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.cpa.result.Conflict;
import org.eclipse.emf.henshin.cpa.result.ConflictKind;
import org.eclipse.emf.henshin.cpa.result.CriticalPair;
import org.eclipse.emf.henshin.cpa.result.Dependency;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.ConflictCPA;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DSRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.GenerateRandomTestConflictModel;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MMFineDiffRulesHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MMToFineGrainedHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.dsvcshenshin;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;
import com.zadahmad.dsmcompare.core.DsmComparatorController;
import com.zadahmad.dsmcompare.core.threeWay.Version;
import com.zadahmad.dsmcompare.core.threeWay.VesrionInfo;

import dsmcompare.mmextension.MMExtension;
import pacman2WayRuleMM.Pacman2WayRuleMMFactory;
import pacman2WayRuleMM.Pacman2WayRuleMMPackage;
import pacmanDiffMM.PacmanDiffMMFactory;
import pacmanDiffMM.PacmanDiffMMPackage;

public class CaseStudyDsmcMergePacman {
	
	
	//Manual Process
	//1. Creat DsDiff Model
	//@Test
	public void step1() {
		try {
			emfCompareResultToFineGranularDsmdiffMM(); //call over CA, Va, and V2 and create DSMDiff.xmi
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//2. Find Semantic Differences
	public void step2() {
		// Call  pacmanRulesDSDiff_henshin_text.henshin over DSMDiff.xmi and create DSMDiff_transformed.xmi
	}
	//3. Find Fine/Semantic equivalent/contradicting Differences 
	public void step3() {
		// Call  pacmanRulesDSDiffPostRules.henshin_text over DSMDiff_transformed.xmi and create DSMDiff_transformed_transformed.xmi
	}
	
	
	//We alreay need to call cpaHenshin() to make conflicts.txt file ready
	//Find conflicts among semantic/Fine-grained differences using Henshin CPA APIs

		//public void cpaHenshin() 
	
	//4. Find Semantic-Fine conflicts
	@Test
	public void step4() {
		findSemanticConflicts(); // Call over DSMDiff_transformed_transformed.xmi and modify it
		System.out.println("\n End of finding Semantic Conflicts!");
	}
	
	
	// ********************* UNDER DEVELOPMENT *********************
	// Generate conflicting model
		// Get a Diff model, conflict list, and conflict models (Henshin/domain-specific)
		// Generate new Diff model including one or more new conflicts and Check:
			// 	Accuracy = (TP+TN)/total (Recall/Precision) 
			// 	Misclassification Rate = (FP+FN)/total 
			// 	Precision = TP/predicted yes
			//	...	
	//@Test
	public void generateConflictingModel() {
		System.out.println("\ngenerate Random Test Conflict Model Start!");
		GenerateRandomTestConflictModel(); 
		System.out.println("\ngenerate Random Test Conflict Model End!");	
	}
	
	public GenerateRandomTestConflictModel GenerateRandomTestConflictModel() 
	{
		GenerateRandomTestConflictModel g= new GenerateRandomTestConflictModel();
		g.dsmName = caseStudyName;
		g.dsmCasePath = caseStudyPath;
		g.dsmCaseRulesFolderName = caseStudyDsmcRulesFolderName;
		g.dsmCaseHenshinRulesFolderName = caseStudyGeneratedHenshinRulesFolderName;
		g.dsmCaseRuleFileNames = dsmcRuleFiles;
		g.ruleMM_eNSURI = Pacman2WayRuleMMPackage.eINSTANCE.eNS_URI;
		g.ruleMM_eIN = Pacman2WayRuleMMPackage.eINSTANCE;
		g.run();
		return g;
	}
	
	
	//****************************************
	//-->DSM-Compare SemConf Module 
	//find semantic conflicts
	//@Test
	public void findSemanticConflicts() 
	{
		//dsmDiffRulesToHenshinTextPostRules();
		initializeCaseStudy();
		String diffPostFilePath = transformedFolderPath + "DSMDiff_transformed.xmi";
		//dsmc.findConflictsBtwSemanticFineDiffs(diffPostFilePath,PacmanDiffMMPackage.eNS_URI, PacmanDiffMMPackage.eINSTANCE);
		ArrayList<String> dsmcRuleFilePaths = new ArrayList<String>();
		String ruleFolderPath=wsPath+"\\DSMMerge\\dsdiffrules\\";
		dsmcRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		
		String wsPath=System.getProperty("user.dir");		 
		 String wsPathForImports=wsPath.replace("\\", "/");
		 String workingRuledirectory = wsPath+"\\DSMMerge\\dsdiffrulesinhenshin";
		 String conflictsFilePath = workingRuledirectory + "\\conflicts.txt";
	 	 ArrayList<String> conflictsStringList = ReadConflictsFile(conflictsFilePath);
	 	 ArrayList<ConflictCPA> conflictsCPA = new ArrayList<ConflictCPA>();
	 	 for(String c:conflictsStringList) {
	 		ConflictCPA cCPA= new ConflictCPA();
	 		String[] cItems= c.split(",");
	 		cCPA.firstRule=cItems[0];
	 		cCPA.secondRule=cItems[1];
	 		cCPA.conflictKind = ConflictKind.valueOf(cItems[2].toUpperCase().replaceAll("-", "_"));
	 		conflictsCPA.add(cCPA);
	 	 }
	 	 
		
		dsmc.findSemanticFineDiffConflicts(diffPostFilePath,PacmanDiffMMPackage.eNS_URI, PacmanDiffMMPackage.eINSTANCE, 
				Pacman2WayRuleMMPackage.eNS_URI, Pacman2WayRuleMMPackage.eINSTANCE, dsmcRuleFilePaths, conflictsCPA,conflictsCPA, false);		
	}
	
	//Find conflicts among semantic/Fine-grained differences using Henshin CPA APIs
	//@Test  
	public void cpaHenshin() throws IOException 
	 {
		 String wsPath=System.getProperty("user.dir");		 
		 String wsPathForImports=wsPath.replace("\\", "/");
		 //Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs	
		 String workingRuledirectory = wsPath+"\\DSMMerge\\dsdiffrulesinhenshin";
		 // workingRuledirectory;// wsPath+"\\dsls\\pacman\\dsdiffrulesinhenshin";dsdiffafterruningatest
		 String workingDsDiffdirectory = wsPath+"\\DSMMerge\\dsdiffafterruningatest";
		 
		 //The following should be an xmi file
		 String dsdiffModuleName = "AutoGeneratedFineRules_henshin_text.henshin";
		 
		 //The auto-generated fine-grained rules		 
		 String cpaAutoFineDiffRulesModuleName = "AutoGeneratedFineRules_henshin_text.henshin";// "pacmanrulesCPA_henshin_text.henshin";
		 
		 //The semantic rules
		 String cpaSemanticDiffModuleName = "pacmanRulesDSDiff_henshin_text.henshin";
		 
		 String dsmDiffFileName = "DSMDiff.xmi";
		 
		 
		 dsvcshenshin dcpa = new dsvcshenshin();
		 dcpa.useHenshinAPIToMatchRules=false;
		 dcpa.workingRuledirectory = workingRuledirectory;
		 dcpa.dsdiffModuleName = dsdiffModuleName;
		 
		 dcpa.cpaAutoFineDiffRulesModuleName = cpaAutoFineDiffRulesModuleName;
		 dcpa.cpaSemanticDiffModuleName = cpaSemanticDiffModuleName;
		 dcpa.workingDsDiffdirectory = workingDsDiffdirectory;//wsPath+"\\dsls\\pacman\\dsdiffafterruningatest";// DSMDiffPath;
		 dcpa.dsdiffFileName = dsmDiffFileName;
		 dcpa.init();
		 //dcpa.runHenshinMatcher();
		 
		 dcpa.runDependencies = false;
		 
	 	 dcpa.runcpa();
	 
	 	 if(dcpa.runDependencies) {
			 System.out.println("#Dependencies#:*************************");
			 for(CriticalPair dpd : dcpa.dependencies) {
				System.out.println(
						dpd.getFirstRule().getName() + " --- " + 
				dpd.getSecondRule().getName() + "  [" +((Dependency) dpd).
				getDependencyKind().toString()+  "]"); 
			 }
	 	 }
	 	 
	 	 ArrayList<String> conflicts = new ArrayList<String>();
		 for(CriticalPair cf : dcpa.conflicts) {
			 conflicts.add(cf.getFirstRule().getName() + ","+cf.getSecondRule().getName() 
					 + "," + ((Conflict) cf).getConflictKind().toString());
		 }
		 String conflictsFilePath = workingRuledirectory + "\\conflicts.txt";
		 String text = "";
		 for(String c:conflicts)
			 text+=c+"\n";
		 
		 writeTextToFile(text, conflictsFilePath);
		 
		 
	 }
	
	
	//****************************************
	//---> DSM-	Compare SemDiff Module
	//Generate fine-grained Henshin rules out of domain-specific Meta-model (Java)
	//@Test
	public void mMFineDiffRulesHenshinText() 
	{
		System.out.println("\nMMFineDiffRulesHenshinText Start!");
		MMFineDiffRulesHenshinText m= new MMFineDiffRulesHenshinText();
		m.dsmName = caseStudyName;
		m.rootClassName = "Game";
		m.mmFolderPath = wsPath+"\\"+"DSMMerge"+"\\"+"MM"+"\\";
		m.mmFileName = "pacman.ecore";	
		m.henshinFolderPath = wsPath+"\\"+"DSMMerge"+"\\"+"dsdiffrulesinhenshin"+"\\";		
		m.MM_eNSURI = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eNS_URI; // PacmanPackage.eINSTANCE.eNS_URI;
		m.MM_eIN = org.eclipse.emf.ecore.EcorePackage.eINSTANCE;//PacmanPackage.eINSTANCE;
		m.run();
		
		System.out.println("\nMMFineDiffRulesHenshinText End!");
	}
		
	//Correct the auto-generated fine-grained change rules 
	//@Test
	public void mMFineDiffRulesCorrectChangeRules() 
	{
		System.out.println("correct Change Rules Start!");
		MMFineDiffRulesHenshinText m= new MMFineDiffRulesHenshinText();
		m.dsmName = caseStudyName;
		m.rootClassName = "Game";
		m.mmFolderPath = wsPath+"\\"+"DSMMerge"+"\\"+"MM"+"\\";
		m.mmFileName = "pacman.ecore";	
		m.henshinFolderPath = wsPath+"\\"+"DSMMerge"+"\\"+"dsdiffrulesinhenshin"+"\\";		
		m.MM_eNSURI = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eNS_URI; // PacmanPackage.eINSTANCE.eNS_URI;
		m.MM_eIN = org.eclipse.emf.ecore.EcorePackage.eINSTANCE;//PacmanPackage.eINSTANCE;
		m.correctChangeRules();
		
		System.out.println("\ncorrect Change Rules  End!");
	}
		
	//Generate Henshin rules out of domain-specific rules
	//@Test
	public void dsmDiffRulesToHenshinTextRulesRun() 
	{
		dsmDiffRulesToHenshinTextRules(false);

		System.out.println("dsm-Diff Rule transformed to henshin-Text rules!");
	}
	
	//Generate Post-Processor Henshin rules out of domain-specific rules (Find equivalences) 
	//@Test
	public void dsmDiffRulesToHenshinTextPostRulesRun() 
	{
		dsmDiffRulesToHenshinTextPostRules();
		System.out.println("dsm-Diff Rule transformed to henshin-Text rules!");
	}

	
	//****************************************
	//-->DSM-Compare Comparison Module
	//Create Diff model: Transform fine-grained EMF-Compare result to domain specific Diff model
	//@Test
	public void emfCompareResultToFineGranularDsmdiffMM()  throws IOException {
		 initializeCaseStudy();
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	PacmanDiffMMPackage.eNS_URI, PacmanDiffMMPackage.eINSTANCE, PacmanDiffMMFactory.eINSTANCE, 		 		 	
				 	Pacman2WayRuleMMPackage.eNS_URI, Pacman2WayRuleMMPackage.eINSTANCE, Pacman2WayRuleMMFactory.eINSTANCE,
				 	"pacman");		 
		 dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(
				 dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 dsmc.getDSMDiffPath(), dsmc.getResultFilePath());		 
		System.out.println("emf-Compare result transformed to Fine-Grained DsmdiffMM!");
	}	

	//****************************************
	//-->Prepare Meta-models
	//Generate 3-way domain-specific Diff-Model
	//@Test
	public void generate3WayDsDiffMM() throws IOException {
		initializeCaseStudy();
		String rootClassName ="Game";
		URI fileURI = URI.createFileURI(dsmc.getDSMMPath());
		MMExtension extender    = new MMExtension();
		Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName);
		System.out.println("generate 3Way-DsDiffMM (Serializable) finished!");
	 }	
	
	//Generate 2-way domain-specific Diff-Model (used to create the 2-way diff-model. We do not use it to create diff model in 3-way merge)
	//@Test
	public void generate2WayDsDiffMM() throws IOException {
		//It is need to be called before generate2WayDsRuleMM method
		initializeCaseStudy();
		String rootClassName ="Game";
		String path=dsmc.getDSMMPath();
		URI fileURI = URI.createFileURI(path);
		MMExtension extender    = new MMExtension();
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
		String rootClassName ="Game";
		String path2WayDiffMM=dsmc.getDSMMPath().replace(".ecore", "2WayDiffMM.ecore");
		URI fileURI2WayDiffMM = URI.createFileURI(path2WayDiffMM);
		MMExtension extender    = new MMExtension();
		//URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI2WayDiffMM,".ecore","DiffMM.ecore");	
		//Before the following method make sure you called generate2WayDsDiffMM() method
		Resource	DsRuleMM = extender.generate2WayDsRuleMM(fileURI2WayDiffMM, rootClassName);
				//extender.generateDsRuleMM(diffmmURI, rootClassName);
		System.out.println("generate 2Way-DsRuleMM (Serializable) finished!");
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
		 mcdaSolver.fullRulesSubDirectoryPath = workingRuledirectory;
		 mcdaSolver.domainName ="pacmanDiffMM";
		 mcdaSolver.execute();
		 
		 //Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, dsmcRulesToHenshinText.rulesFilter);		 
		 vs.execute(null,null, 0);	
	}


	//****************************************
	//////////////////// Data Members /////////////////
	String caseStudyName="pacman";
	String caseStudyPath= "DSMMerge/";//"dsls/oracle/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String vLeftFileName="V1.xmi";
	String vRightFileName="V2.xmi";
	String vCaFileName="CA.xmi";
	DsmComparatorController dsmc= new DsmComparatorController();
	DSRulesToHenshinText 	dsmcRulesToHenshinText 			= new DSRulesToHenshinText();
	MMToFineGrainedHenshinText 	mmToFineGrainedHenshinText 	= new MMToFineGrainedHenshinText();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\DSMMerge\\dsdiffrulesinhenshin";
	String transformedFolderPath 	=	wsPath+"\\"+"DSMMerge"+"\\"+"dsdiffafterruningatest"+"\\"; 
										//"\\dsls\\oracle\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList(
 					"PacmanEatFood.xmi",
 					"PacmanDie.xmi", 					
 					"GhostMoveRight.xmi",
 					"GhostMoveLeft.xmi",
 					"GhostMoveUp.xmi",
 					"GhostMoveDown.xmi",
 					"GhostMove.xmi", 					
 					"PacmanMoveRight.xmi",
 					"PacmanMoveLeft.xmi",
 					"PacmanMoveUp.xmi",
 					"PacmanMoveDown.xmi",
 					"PacmanMove.xmi"
 					//"eqAddCompositePowerToCompound.xmi",
 					//"eqAddSimplePowerToCompound.xmi",
 					)
 			);
	
	//****************************************
	//////////////////// Utilities /////////////////////	
	

	//Generate fine-grained Henshin rules out of domain-specific Meta-model (Extend)
	//@Test
	public void mMToFine_GrainedHenshinTextRun() 
	{
		mMToFineGrainedHenshinText();
		System.out.println("dsm-Diff Rule transformed to henshin-Text rules!");
	}
		

	public MMToFineGrainedHenshinText mMToFineGrainedHenshinText() 
	{
		mmToFineGrainedHenshinText.dsmName = caseStudyName;
		mmToFineGrainedHenshinText.rootClassName = "Game";
		mmToFineGrainedHenshinText.mmFolderPath = wsPath+"\\"+"DSMMerge"+"\\"+"MM"+"\\";
		mmToFineGrainedHenshinText.mmFileName = "pacman.ecore";	
		mmToFineGrainedHenshinText.henshinFolderPath = wsPath+"\\"+"DSMMerge"+"\\"+"dsdiffrulesinhenshin"+"\\";		
		mmToFineGrainedHenshinText.MM_eNSURI = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eNS_URI; // PacmanPackage.eINSTANCE.eNS_URI;
		mmToFineGrainedHenshinText.MM_eIN = org.eclipse.emf.ecore.EcorePackage.eINSTANCE;//PacmanPackage.eINSTANCE;
		mmToFineGrainedHenshinText.run();
		return mmToFineGrainedHenshinText;
	}
	
	public DSRulesToHenshinText dsmDiffRulesToHenshinTextPostRules() 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath = caseStudyPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = caseStudyDsmcRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = caseStudyGeneratedHenshinRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = Pacman2WayRuleMMPackage.eINSTANCE.eNS_URI;
		dsmcRulesToHenshinText.ruleMM_eIN = Pacman2WayRuleMMPackage.eINSTANCE;
		dsmcRulesToHenshinText.runPostRuleGenerator();
		return dsmcRulesToHenshinText;
	}
	
	public DSRulesToHenshinText dsmDiffRulesToHenshinTextRules(boolean isATempFile) 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath = caseStudyPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = caseStudyDsmcRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = caseStudyGeneratedHenshinRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = Pacman2WayRuleMMPackage.eINSTANCE.eNS_URI;
		dsmcRulesToHenshinText.ruleMM_eIN = Pacman2WayRuleMMPackage.eINSTANCE;
		dsmcRulesToHenshinText.run(isATempFile);
		return dsmcRulesToHenshinText;
	}
	 	
	public boolean writeTextToFile(String text, String path) {
	    try {
	        FileWriter myWriter = new FileWriter(path);
	        myWriter.write(text);
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	        return false;
	      }		
		return true;
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
		
		 dsmc.initializeThreeWayComparison(	
				 wsPathForImports+"/"+caseStudyPath+"MM/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "pacman.ecore", versionsInfo);
	}
	
	public ArrayList<String> ReadConflictsFile(String path) {
		    try {
		      File myObj = new File(path);
		      Scanner myReader = new Scanner(myObj);
		      ArrayList<String> conflictsStringList = new ArrayList<String>();
		      while (myReader.hasNextLine()) {
		        String conflictItem = myReader.nextLine();
		        conflictsStringList.add(conflictItem);
		      }
		      myReader.close();
		      return conflictsStringList;
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    return null;
		}
	
	//****************************************
	////////////////////////////////////////////

	/*
	//@Test
	public void generateDsRuleMMO() throws IOException {
		initializeCaseStudy();
		String rootClassName ="Game";
		URI fileURI = URI.createFileURI(dsmc.getDSMMPath());
		MMExtension extender    = new MMExtension();
		URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI,".ecore","DiffMMO.ecore");		 
		Resource	DsRuleMM = extender.generateDsRuleMM(diffmmURI, rootClassName);
		System.out.println("generate DsRuleMMO (Operational) finished!");
	 }	
	
	//@Test
	 public void emfCompareResultToFineGranularDsmdiffMMO()  throws IOException {
		 initializeCaseStudy();
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	PacmanDiffMMOPackage.eNS_URI, PacmanDiffMMOPackage.eINSTANCE, PacmanDiffMMOFactory.eINSTANCE, 		 		 	
				 	PacmanRuleMMPackage.eNS_URI, PacmanRuleMMPackage.eINSTANCE, PacmanRuleMMFactory.eINSTANCE,
				 	"pacman");		 
		 Resource rsourceDSMDiff = dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(
				 dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 dsmc.getDSMDiffPath(), dsmc.getResultFilePath());	
		 
		 String DSMDiffPathSerialize = dsmc.getDSMDiffPath().replace(".xmi", "O.ser");
		 //ComparisonResult comparisonResult=dsmc.getComparisonResult();
		 //ResourceIOWrapper<ComparisonResult> rw= new ResourceIOWrapper<ComparisonResult>();		 
		 //ResourceIOWrapper<Resource> rw= new ResourceIOWrapper<Resource>();
		 //rw.WriteObjectToFile(rsourceDSMDiff, DSMDiffPathSerialize); //It did not work 		 
	 }
	*/
	
	/*
	//@Test
	public void generateDsDiffMMO() throws IOException {
		initializeCaseStudy();
		String rootClassName ="Game";
		URI fileURI = URI.createFileURI(dsmc.getDSMMPath());
		MMExtension extender    = new MMExtension();
		Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName);
		System.out.println("generate DsDiffMMO (Operational) finished!");
	 }
	
	//@Test
	public void TestWriteEMap()
	{
		BasicEList<Integer> el= new BasicEList<Integer>();
		el.add(444);
		el.add(666);
		Map<String, EList<Integer>> bm = new HashMap<String, EList<Integer>>();
		bm.put("A", el);
        ResourceIOWrapper<Map<String, EList<Integer>>> rw= new ResourceIOWrapper<Map<String, EList<Integer>>>();
        String DSMDiffPathSerialize = "d:\\test.src";//dsmc.getDSMDiffPath().replace(".xmi", "O.ser");
        rw.WriteObjectToFile(bm, DSMDiffPathSerialize);
	}
	
	//@Test
	public void TestReadEMap()
	{
		BasicEList<Integer> el= new BasicEList<Integer>();
		Map<String, EList<Integer>> bm = new HashMap<String, EList<Integer>>();
        ResourceIOWrapper<Map<String, EList<Integer>>> rw= new ResourceIOWrapper<Map<String, EList<Integer>>>();
        String DSMDiffPathSerialize = "d:\\test.src";//dsmc.getDSMDiffPath().replace(".xmi", "O.ser");
        bm = rw.ReadObjectFromFile(DSMDiffPathSerialize);
        Iterator it = bm.entrySet().iterator();
        while (it.hasNext()) {
        	Map.Entry entry = (Map.Entry)it.next(); 
        	String Key = ((Map.Entry)entry).getKey().toString();
        	el= (BasicEList<Integer>) ((Map.Entry)entry).getValue();
        }        
        for(Integer i:el) {
        	System.out.println(i);
        }        
	}
	
	//@Test
	public void tst() {
		String text = "A\nB\nC\n";
		String workingRuledirectory = wsPath+"\\DSMMerge\\dsdiffrulesinhenshin";
		String conflictsFilePath = workingRuledirectory + "\\conflicts.txt";
		writeTextToFile(text, conflictsFilePath);
	}
	*/
}
