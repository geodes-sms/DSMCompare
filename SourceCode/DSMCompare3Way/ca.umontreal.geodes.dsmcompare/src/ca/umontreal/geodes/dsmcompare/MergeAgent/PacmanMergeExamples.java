package ca.umontreal.geodes.dsmcompare.MergeAgent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.cdo.common.model.EMFUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.henshin.cpa.result.Conflict;
import org.eclipse.emf.henshin.cpa.result.ConflictKind;
import org.eclipse.emf.henshin.cpa.result.CriticalPair;
import org.eclipse.emf.henshin.cpa.result.Dependency;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.Interpreter;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.preprocessing.Granularity;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.DSRulesToHenshinText;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.DSRulesToHenshinTextCPANew;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.DSRulesToHenshinTextLeftRightSeparated;

import ca.umontreal.geodes.dsmcompare.core.CaV1V2DiffPathDetail;
import ca.umontreal.geodes.dsmcompare.core.DsmComparatorController;
import ca.umontreal.geodes.dsmcompare.core.RuleEngine.DsDiffModelToDsDiffRule;
import ca.umontreal.geodes.dsmcompare.core.threeWay.ComparisonResult;
import ca.umontreal.geodes.dsmcompare.core.threeWay.Version;
import ca.umontreal.geodes.dsmcompare.core.threeWay.VesrionInfo;
//import ca.umontreal.geodes.dsmcompare.dsmcHenshin.TransformCRRuleToHenshin;
import ca.umontreal.geodes.dsmcompare.crRuleHenshin.TransformCRRuleToHenshin;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.ConflictCPA;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.MMFineDiffRulesHenshinText;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.MultiCdaSolver;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.RuleAttributes;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.dsvcshenshin;
import ca.umontreal.geodes.dsmcompare.mmextension.MMExtension;
import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers;
import ca.umontreal.geodes.dsmcompare.verstexSorting.Vertex;
import ca.umontreal.geodes.dsmcompare.verstexSorting.VertexSorting;

import ca.umontreal.geodes.dsmcompare.dsmcHenshin.GenerateRandomTestConflictModel;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.MMToFineGrainedHenshinText;

import agg.parser.ExcludePairContainer.Entry;
import pacman.PacmanPackage;
import pacman2WayDiffMM.Pacman2WayDiffMMFactory;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;
import pacman2WayRuleMM.Pacman2WayRuleMMFactory;
import pacman2WayRuleMM.Pacman2WayRuleMMPackage;
import pacmanDiffMM.PacmanDiffMMFactory;
import pacmanDiffMM.PacmanDiffMMPackage;
import refactoring.RefactoringPackage;
import refactoring2WayDiffMM.Refactoring2WayDiffMMFactory;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;
import refactoring2WayRuleMM.Refactoring2WayRuleMMFactory;
import refactoring2WayRuleMM.Refactoring2WayRuleMMPackage;
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import java.awt.*;

import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ReferenceChange;
//import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.merge.*;

public class PacmanMergeExamples {
	String wsPath = System.getProperty("user.dir").replace("/", "\\"); // "D:\\_udemSVN\\DSMCompare-Project\\srcCode\\dsmMerge\\ca.umontreal.geodes.dsmcompare

	//-------------------------------- MERGE EVALUATION 2
	//**************************************************	
	//Step One: Create Diff012 And initial V012
	//@Test
	public void createDsmdiffMM_Example1() {
		 try {
			 //Set CA, V1, V2, ...
			 emfCompareResultToFineGranularDsmdiffMM(); 			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//-----------------------------------------------------------------------
	//Step Two: Manually Apply "refactoringRulesDSDiff_henshin_text.henshin" 
	//				and find semantic differences 
	//				[\casesMergeConflict\pacman\henshinRules\refactoringRulesDSDiff_henshin_text.henshin]
	
	

	//-----------------------------------------------------------------------
	//Step Three: Find Semantic-Fine Semantic-Semantic Conflicts
	//@Test
	public void FindSemanticFine_And_SemanticSemanticConflicts_Example1() {
		System.out.println("\nStart finding -Semantic-Semantic Diffs <--&&--> -Semantic-Fine Diffs Conflicts!");
		
		//Example 1 Pathes
		
		String ruleFolderPath = diffRulesPath;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);	
		String p = wsPath + "\\casesMergeConflict\\pacman\\diffModels\\";
		p += "DSMDiff_transformed.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed.xmi";
		
		
		System.out.println("\nFile Path: " + p);

		dsmc.find_SemanticFine_SemanticSemantic_Conflicts(p, diffMM_eNSURI, diffMM_eIN, ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
				dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, true, false, true, false);		

		System.out.println("\nEnd finding Semantic<--->Fine-Diff Conflicts!");

	}
	

	//-----------------------------------------------------------------------
	//Step Four: Manually Apply "refactoringCRRules_henshin_text.henshin" and find semantic differences [\casesMergeConflict\refactoring\henshinRules\refactoringCRRules_henshin_text.henshin]
	//				[\casesMergeConflict\pacman\henshinRules\refactoringCRRules_henshin_text.henshin]
	

	//-----------------------------------------------------------------------
	//Step Five: Repetitive step of [Automatic and Manual] conflict resolution and Merge, Maybe need to run step four and five or only five agaian and again
	//step00010(): dsmc.manage_ConflictResolution_Objects	
	//@Test
	public void conflictResolutionAndMerge_Example1() throws IOException {	
		System.out.println("\nStart of finding -Semantic-Semantic <--&&--> -Semantic-Fine Conflicts and and creating a conflict resolution object!");
		String ruleFolderPath = diffRulesPath;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);	
		/*
		String p = wsPath + "\\caseStudiesMerge\\diffModels\\";
		p += "querydsl";
		p += "\\";
		p += "f2710b1cf1ebbd7beada08ea5d97abc0e725e1e8";
		p += "_dsmDiff_transformed.xmi";
		*/
		String p = wsPath + "\\casesMergeConflict\\pacman\\diffModels\\";//+ "querydsl" + "\\";
		p += "DSMDiff_transformed_IncludingConflicts_transformed.xmi";//"11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed_IncludingConflicts_transformed.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed.xmi";
		
		
		System.out.println("\nFile Path: " + p);
		
		String v012FilePath = wsPath + "\\casesMergeConflict\\pacman\\dsModels\\";//+ "querydsl" + "\\";
		v012FilePath += "V012.xmi";//"DSMDiff_1.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_V012.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed.xmi";

		//%%%!!! The following needs to be changed to the commented values
		//%%%!!! But currently we used diffMM instead of MM
		String v012MM_eNSURI = diffMM_eNSURI;// MM_eNSURI;
		Object v012_eIN = diffMM_eIN;// MM_eIN;

		dsmc.perform_ConflictResolution(
				p, diffMM_eNSURI, diffMM_eIN, 
				ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
				dsmcRuleFilePaths, changeConflictsCPA, 
				semanticFineConflictsMultiCDA, true, 
				v012FilePath, v012MM_eNSURI, v012_eIN);		

		System.out.println("\nEnd of finding -Semantic-Semantic <--&&--> -Semantic-Fine Conflicts and and creating a conflict resolution object!");
	}
	
	
	//******************************************************************************
	//******************************************************************************
	
	
	
	//------------------- Transformers 
	
	
	//**************** Henshin CR-Rules ****************
	//@Test
	public void callTransformCRRulesToHenshin() {
		stepTransformCRRulesToHenshin();
	}
	
	
	//---------------------
	//@Test
	public void dsmDiffRulesToHenshinTextRulestepGenerateHenshin_SeperatedAuthorsRun() 
	{
		stepGenerateHenshin_SeperatedAuthors();

		System.out.println("dsm-Diff Rule transformed to henshin-Text rules!");
	}
	
	
	//----------------------
	//@Test
	public void dsmDiffRulesToHenshinTextRulesRun() 
	{
		dsmDiffRulesToHenshinTextRulesForCPANew();

		System.out.println("dsm-Diff Rule transformed to henshin-Text CPA rules!");
	}	
	
	//----------------------------------------------------------
	//----------------------------------------------------------
	public void stepTransformCRRulesToHenshin() {		
		//Henshin CR-Rules 
		transformCRRuleToHenshin.dsmName = caseStudyName;
		transformCRRuleToHenshin.dsmCasePath =  henshinUrlPath;
		transformCRRuleToHenshin.dsmCaseRulesFolderName = crRulesFolder + slash;
		transformCRRuleToHenshin.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		transformCRRuleToHenshin.dsmCaseRuleFileNames = crRuleFiles;
		transformCRRuleToHenshin.ruleMM_eNSURI =  PacmanCRRuleMMPackage.eINSTANCE.eNS_URI;
		transformCRRuleToHenshin.ruleMM_eIN = PacmanCRRuleMMPackage.eINSTANCE;
		//transformCRRuleToHenshin.resourceSetPackage = DsmcHelpers.getResourceSet(RefactoringCRRuleMMPackage.eINSTANCE, p);
		transformCRRuleToHenshin.useWhileLoop = true;
		transformCRRuleToHenshin.run(false);
		System.out.println("Done! (Transforming CRRules To Henshin)");
	}	
	//---------------------------------------
	
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
	
	
	//3WayDsCRRulesMM Meta-model preparation 
	//@Test
	public void step04() {		 
		 try {
			 generate3WayDsCRRulesMM();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//---------------------------------
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
	
	
	
	//Generate generate 3WayDs CRRules MM
	//@Test
	public void generate3WayDsCRRulesMM() throws IOException {
		//According to new Process, we use 2-Way Rule models. As a result the dsl engineer  
		//	create rule models without considering Left/Right authors and 
		//	then the Henshin-rule generator, generates Henshin rules match semantic differences
		//	of left/right sides
		initializeCaseStudy();
		String path3WayDiffMM = dsmc.getDSMMPath().replace(".ecore", "DiffMM.ecore");
		URI fileURI3WayDiffMM = URI.createFileURI(path3WayDiffMM);
		MMExtension extender    = new MMExtension();
		//URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI2WayDiffMM,".ecore","DiffMM.ecore");	
		//Before the following method make sure you called generate2WayDsDiffMM() method
		Resource	DsRuleMM = extender.generate3WayDsCRRulesMM(fileURI3WayDiffMM, rootClassName);//generate2WayDsCRRulesMM
				//extender.generateDsRuleMM(diffmmURI, rootClassName);
		System.out.println("generate 3Way-DsCRRulesMM(Serializable) finished!");
	 }
	 	
	
	
	
		

	/*
	//diffRules to Henshin rules
	//@Test //1//
	public void step006() {
		//dsmcRuleFiles	= new ArrayList<String>(Arrays.asList("extractMethod4.xmi")); 

		dsmDiffRulesToHenshinTextRulesRun();
	}
	
	//diffRules to Henshin CPA conflict/dependancy detection rules
	//@Test
	public void step007() {
		dsmDiffRulesToHenshinTextRulesForCPANew();
		//Deprecated//dsmDiffRulesToHenshinTextRulesRunForCPA();
	}
	
	//The following is not needed anymore, we currently detect the Author while matching SDRules
	//Generate Henshin Post rules to set Author of Semantic difference
	//@Test
	//public void step008() {
	//	dsmDiffRulesToHenshinTextPostRulesRun();
	//}

	//(Auto) Generate Henshin Fine-Diff rules
	//@Test//1// It sometimes works in debug not in run
	public void step009() {
		mMAutoGenerateFineDiffRulesHenshinText();
	}
	//Transform to .Henshin Fine-Diff rules
	//@Test
	public void step0010_0011() {
		//Manually transform CPA and AutoGenerated Fine Henshin_Text to Henshin variant
	}
	//Correct the change rules
	//@Test
	public void step0012() {
		mMFineDiffRulesCorrectChangeRules();
	}
	*/
		
		
		
		
	//-------------------------- Potential Conflicts
	//------------------------------------------------------------------>>
	//------------------------------------------------------------------>>
	//Find potential conflicts among Semantic/Fine Attribute change Rules
	//Kept only change rules, otherwise it takes a long time to 
	//Use CPA, as Multi-CDA cannot fine attribute changes
	//produce the conflict results
	//Before this run correct changes
	//@Test
	public void step0013() {
		try {//Static conflicts
			findSemantic_AttributeChangeConflicts();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//------------------------------------------------------------------>>
	//Find potential conflicts among Semantic/Semantic and Semantic/Fine Diff Rules
	//Remove change rules, Use Multi-CDA for fast results
	//produce the conflict results
	//!!!// CORRECT to does not write lines with 0 values
	//@Test
	public void step0014() {
		try {//Static conflicts
			findSemanticSemantic_SemanticFineConflicts();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


		

	//-----------------------------------------------
	
	//Find conflicts among semantic/Fine-grained differences using Henshin CPA APIs (Potential-overlapping)
	//@Test  
	public void findSemantic_AttributeChangeConflicts() throws IOException 
	{		 
		//Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs		 
		dsvcshenshin dcpa 				= new dsvcshenshin();
		dcpa.useHenshinAPIToMatchRules	= false;
		dcpa.workingRuledirectory 		= henshinRulesPath;
		dcpa.dsdiffModuleName 			= henshinRulesDsDiffFileName; // henshinRulesCPAFileName;		 
		dcpa.cpaAutoFineDiffRulesModuleName 
										= henshinAutoGeneratedFineRulesFileName;
		dcpa.cpaSemanticDiffModuleName 	= henshinRulesCPAFileName;
		dcpa.workingDsDiffdirectory 	= dsModelsPath;
		dcpa.dsdiffFileName 			= diffFileName;
		dcpa.init();
		//dcpa.runHenshinMatcher();		 
		dcpa.runDependencies 			= false;		 
	 	//dcpa.runcpa();	 
	 	dcpa.runCpaForAttributeChange();
	 	
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
	 	if( dcpa.conflicts !=null) {
			for(CriticalPair cf : dcpa.conflicts) {
				conflicts.add(cf.getFirstRule().getName() + ","+cf.getSecondRule().getName() 
						 + "," + ((Conflict) cf).getConflictKind().toString());
			}
		}
	 	
	 	if( dcpa.conflictListCriticalPair !=null && dcpa.conflictListCriticalPair.size() > 0) {
			for(CriticalPair cf : dcpa.conflictListCriticalPair) {
				conflicts.add(cf.getFirstRule().getName() + ","+cf.getSecondRule().getName() 
						 + "," + ((Conflict) cf).getConflictKind().toString());
			}
		}
	 	
		String conflictsFilePathForChangeConflicts = henshinRulesPath + fileNameForChangeConflicts;
		String text = "";
		for(String c:conflicts)
			 text 	+= c+"\n";
		 
		writeTextToFile(text, conflictsFilePathForChangeConflicts);
	 }
		
	
	//Find conflict between rules by HENSHIN MULTI CDA APIs (Potential-overlapping)
	//@Test  //MULTI CDA - HENSHIN
	public void findSemanticSemantic_SemanticFineConflicts() throws IOException
	{
		 //Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs			 
		 //Find conflict pairs among rules using Henshin MultiCda
		 //Could not seperate because of dependency to rulesFilter
		 MultiCdaSolver mcdaSolver= new MultiCdaSolver();
		 mcdaSolver.fullRulesSubDirectoryPath = henshinRulesPath;//diffRulesPath;
		 mcdaSolver.cpaSemanticDiffModuleName = henshinRulesCPAFileName;
		 mcdaSolver.cpaAutoFineDiffRulesModuleName = henshinAutoGeneratedFineRulesFileName;
		 mcdaSolver.domainName = diffDomainName;
		 List<Granularity> granularities =  Arrays.asList(
					//Granularity.binary,
					//Granularity.coarse,
					Granularity.fine//, 
					//Granularity.atoms
					);
		 mcdaSolver.execute(granularities, true, false);
		 ArrayList<String> conflicts = new ArrayList<String>();
		 	
	 	if( mcdaSolver.conflictFineMatrix !=null && mcdaSolver.conflictFineMatrix.length > 0) {		 		
	 		for(int i=0;i<mcdaSolver.conflictFineMatrix.length;i++) {
				for(int j=0;j<mcdaSolver.conflictFineMatrix[i].length;j++) {
					if(mcdaSolver.conflictFineMatrix[i][j] != 0) {
						conflicts.add(mcdaSolver.rules.get(i).getName() + ","+mcdaSolver.rules.get(j).getName() 
						 + "," + mcdaSolver.conflictFineMatrix[i][j]);
					}					
				}
			}
	 	}
	 	
		String conflictsFilePathForChangeConflicts = henshinRulesPath + fileNameForSemanticFineConflicts;
		String text = "";
		for(String c:conflicts)
			 text 	+= c+"\n";
		 
		writeTextToFile(text, conflictsFilePathForChangeConflicts);
	}
	
			
			
	
	
	//------------------- Core
	public ComparisonResult emfCompareResultToFineGranularDsmdiffMM()  throws IOException {
		 initializeCaseStudy();
		 dsmc.setDsdRulePackages(sdRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
				 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);		 
		 dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 	dsmc.getDSMDiffPath(), dsmc.getResultFilePath(), true);		 
		System.out.println("emf-Compare result transformed to Fine-Grained DsmdiffMM!");
		return dsmc.comparisonResult;
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
	
	
	public MMToFineGrainedHenshinText mMToFineGrainedHenshinText() 
	{
		mmToFineGrainedHenshinText.dsmName = caseStudyName;
		mmToFineGrainedHenshinText.rootClassName = rootClassName;
		mmToFineGrainedHenshinText.mmFolderPath = metaModelsPath;
		mmToFineGrainedHenshinText.mmFileName = mmFileName;
		mmToFineGrainedHenshinText.henshinFolderPath = henshinRulesPath;	
		mmToFineGrainedHenshinText.MM_eNSURI = ecoreMM_eNSURI; // RefactoringPackage.eINSTANCE.eNS_URI;
		mmToFineGrainedHenshinText.MM_eIN = ecoreMM_eIN;//RefactoringPackage.eINSTANCE;
		mmToFineGrainedHenshinText.run();
		return mmToFineGrainedHenshinText;
	}
	

	//********************************************************************	
	//dsmcRules To HenshinText Left and Right Separated and Setting the Author
	//refactoringRulesDSDiff.henshin_text
	//@Test
	public void stepGenerateHenshin_SeperatedAuthors() {
		System.out.println("Started! (Transforming dsmcRules To HenshinText Left and Right Separated and Setting the Author)");
		try {
			DSRulesToHenshinTextLeftRightSeparated 		dsmcRulesToHenshinTextLeftRightSeparated 	= new DSRulesToHenshinTextLeftRightSeparated();
			dsmcRulesToHenshinTextLeftRightSeparated.dsmName = caseStudyName;
			dsmcRulesToHenshinTextLeftRightSeparated.dsmCasePath =  henshinUrlPath;
			dsmcRulesToHenshinTextLeftRightSeparated.dsmCaseRulesFolderName = diffRulesFolder + slash;
			dsmcRulesToHenshinTextLeftRightSeparated.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
			
			//Following is for a test purpose
			//ArrayList<String> dsmcRuleFiles	= new ArrayList<String>(Arrays.asList("extractSuperclass.xmi", "extractMethod.xmi"));
			
			ArrayList<String> sdRulesOrdered = getRulesByOrder();
			if(sdRulesOrdered.size()>0)
				dsmcRulesToHenshinTextLeftRightSeparated.dsmCaseRuleFileNames = sdRulesOrdered;
			else
				dsmcRulesToHenshinTextLeftRightSeparated.dsmCaseRuleFileNames = sdRuleFiles;
			dsmcRulesToHenshinTextLeftRightSeparated.ruleMM_eNSURI = ruleMM2Way_eNSURI;
			dsmcRulesToHenshinTextLeftRightSeparated.ruleMM_eIN = ruleMM2Way_eIN;
			dsmcRulesToHenshinTextLeftRightSeparated.useWhileLoop = true;
			dsmcRulesToHenshinTextLeftRightSeparated.run(false);
			System.out.println("Done! (Transforming dsmcRules To HenshinText Left and Right Separated and Setting the Author)");
		}catch(Exception ex) {
			System.out.println("Error:" + ex.toString());
		}
		
	}
	
	//*****************************************************
	
	//1. Transform Diff elements with diff_kind = DELETE to Henshin element with the delete action
	//2. Transform Diff elements with diff_kind = ADD to Henshin element with create action
	//3. Transform Diff elements with diff_kind = MODIFY to Henshin element with create (change attribute) action
	//4. Do not count on filters 
	//refactoringCRRules.henshin_text
	//@Test
	public void dsmDiffRulesToHenshinTextRulesForCPANew() 
	{		
		System.out.println("Started! (Transforming dsmcRules To HenshinText For CPA)");
		try {
			dsmcRulesToHenshinTextCPANew.dsmName = caseStudyName;
			dsmcRulesToHenshinTextCPANew.dsmCasePath =  henshinUrlPath;
			dsmcRulesToHenshinTextCPANew.dsmCaseRulesFolderName = diffRulesFolder + slash;
			dsmcRulesToHenshinTextCPANew.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
			dsmcRulesToHenshinTextCPANew.dsmCaseRuleFileNames = sdRuleFiles;
			dsmcRulesToHenshinTextCPANew.ruleMM_eNSURI = ruleMM2Way_eNSURI;
			dsmcRulesToHenshinTextCPANew.ruleMM_eIN = ruleMM2Way_eIN;
			dsmcRulesToHenshinTextCPANew.runForCPA();
			System.out.println("Done! (Transforming dsmcRules To HenshinText For CPA)");
		}catch(Exception ex) {
			System.out.println("Error:" + ex.toString());
		}
	}
	
	
	
	//----------------------Helpers
	public ArrayList<ConflictCPA> getChangeConflictsCPA(String filePathForChangeConflicts) {
		//String filePathForChangeConflicts	= henshinRulesPath + fileNameForChangeConflicts;
	 	ArrayList<String> changeConflictsStringList 	= ReadConflictsFile(filePathForChangeConflicts);
	 	ArrayList<ConflictCPA> changeConflictsCPA 	= new ArrayList<ConflictCPA>();
	 	for(String c:changeConflictsStringList) {
	 		ConflictCPA cCPA	= new ConflictCPA();
	 		String[] cItems		= c.split(",");
	 		cCPA.firstRule		= cItems[0];
	 		cCPA.secondRule		= cItems[1];
	 		cCPA.conflictKind 	= ConflictKind.valueOf(cItems[2].toUpperCase().replaceAll("-", "_"));
	 		changeConflictsCPA.add(cCPA);
	 	 } 
	 	return changeConflictsCPA;
	}
	
	public ArrayList<ConflictCPA> getSemanticFineConflictsMultiCDA(String filePathForSemanticFineConflicts){
	 	ArrayList<String> semanticFineConflictsStringList 	= ReadConflictsFile(filePathForSemanticFineConflicts);
	 	ArrayList<ConflictCPA> semanticFineConflictsMultiCDA 	= new ArrayList<ConflictCPA>();
	 	for(String c:semanticFineConflictsStringList) {
	 		ConflictCPA sfCPA	= new ConflictCPA();
	 		String[] cItems		= c.split(",");
	 		sfCPA.firstRule		= cItems[0];
	 		sfCPA.secondRule	= cItems[1];
	 		sfCPA.conflictCount	= Integer.parseInt(cItems[2]);
	 		semanticFineConflictsMultiCDA.add(sfCPA);
	 	 } 
	 	return semanticFineConflictsMultiCDA;
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
	
	public boolean writeTextToFile(String text, String path) {
	    try {
	        FileWriter myWriter = new FileWriter(path);
	        myWriter.write(text);
	        myWriter.close();
	        System.out.println("\nSuccessfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	        return false;
	      }		
		return true;
	}
	
	//------------------------------------------------------------------>>
	public ArrayList<String> getRulesByOrder(){
		String _RoleOrderFullPath = wsPath + dblSlash + caseStudyRootFolder + dblSlash + 
				caseStudyName + dblSlash + henshinRulesFolder + dblSlash + "_RoleOrderFull.txt";
		ArrayList<String> sdRulesOrdered = new ArrayList<String>();
		File myObj = new File(_RoleOrderFullPath);
		Scanner myReader;
		try {
			myReader = new Scanner(myObj);		
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String ruleName = data.split(",")[0];
				sdRulesOrdered.add(ruleName);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sdRulesOrdered;
	}
	
	
	//_____________________________________________________
		//****************** Data Members **********************
		String ecoreMM_eNSURI 			= org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eNS_URI;
		Object ecoreMM_eIN 				= org.eclipse.emf.ecore.EcorePackage.eINSTANCE;
		
		
		String MM_eNSURI 				= PacmanPackage.eNS_URI;
		Object MM_eIN  					= PacmanPackage.eINSTANCE;
		
		String diffMM2Way_eNSURI 		= Pacman2WayDiffMMPackage.eINSTANCE.eNS_URI;
		Object diffMM2Way_eIN 			= Pacman2WayDiffMMPackage.eINSTANCE;
		EFactory diffMM2WayFactory_eIN	= Pacman2WayDiffMMFactory.eINSTANCE;
		
		String ruleMM2Way_eNSURI 		= Pacman2WayRuleMMPackage.eINSTANCE.eNS_URI;
		Object ruleMM2Way_eIN 			= Pacman2WayRuleMMPackage.eINSTANCE;
		EFactory ruleMM2WayFactory_eIN  = Pacman2WayRuleMMFactory.eINSTANCE;
		
		String diffMM_eNSURI 			= PacmanDiffMMPackage.eNS_URI;
		Object diffMM_eIN  				= PacmanDiffMMPackage.eINSTANCE;
		EFactory diffMMFactory_eIN		= PacmanDiffMMFactory.eINSTANCE;
		
		String caseStudyName			= "pacman";
		String rootClassName			= "EPackage";
		
		
		String diffDomainName			= caseStudyName+"DiffMM";
		String caseStudyRootFolder		= "casesMergeConflict";	
		String caseStudyFolder			= "pacman";
		String diffModelsFolder			= "diffModels";
		String diffRulesFolder			= "diffRules";
		String crRulesFolder			= "crRules";
		String dsModelsFolder			= "dsModels";
		String henshinRulesFolder		= "henshinRules";
		String metaModelsFolder			= "metaModels";
		String bkSlash					= "\\";
		String slash					= "/";	
		String henshinUrlPath			= caseStudyRootFolder	+ slash + caseStudyFolder + slash;
		String caseStudyPath			= wsPath 		+ bkSlash + caseStudyRootFolder		+ bkSlash	+ caseStudyFolder;
		String diffModelsPath			= caseStudyPath + bkSlash + diffModelsFolder 		+ bkSlash;
		String diffRulesPath			= caseStudyPath + bkSlash + diffRulesFolder  		+ bkSlash;
		String crRulesPath				= caseStudyPath + bkSlash + crRulesFolder  		+ bkSlash;
		String dsModelsPath				= caseStudyPath + bkSlash + dsModelsFolder   		+ bkSlash;
		String henshinRulesPath			= caseStudyPath + bkSlash + henshinRulesFolder  	+ bkSlash;
		String metaModelsPath			= caseStudyPath + bkSlash + metaModelsFolder		+ bkSlash;	

		String mmFileName 				= "pacman.ecore";	
		String vCaFileName				= "CA.xmi";
		String vLeftFileName			= "V1.xmi";
		String vRightFileName			= "V2.xmi";
		String diffFileName				= "DSMDiff.xmi";
		String diffTransformedFileName	= "DSMDiff_transformed.xmi";
		String diffTransformedTransformedFileName	
										= "DSMDiff_transformed_transformed.xmi";
		String resultFileName			= "result.txt";
		String fileNameForChangeConflicts		= "changeConflicts.txt";
		String fileNameForSemanticFineConflicts = "semanticFineConflicts.txt";
		String henshinTextRulesFileName	= caseStudyName + "RulesDsDiff.henshin_text";
		String henshinRulesDsDiffFileName		= caseStudyName + "RulesDsDiff_henshin_text.henshin";
		String henshinTextCPARulesFileName	= caseStudyName + "RulesCPA.henshin_text";
		String henshinRulesCPAFileName		= caseStudyName + "RulesCPA_henshin_text.henshin";
		
		String henshinTextPostRulesFileName	
										= caseStudyName + "PostRules.henshin_text";
		String henshinTextAutoGeneratedFineRulesFileName
										= caseStudyName + "AutoGeneratedFineRules.henshin_text";
		String henshinAutoGeneratedFineRulesFileName
										= caseStudyName + "AutoGeneratedFineRules_henshin_text.henshin";
		
		DsmComparatorController 	dsmc	= new DsmComparatorController();
		DSRulesToHenshinText 		dsmcRulesToHenshinText 	= new DSRulesToHenshinText();
		DSRulesToHenshinTextCPANew 		dsmcRulesToHenshinTextCPANew 	= new DSRulesToHenshinTextCPANew();
		TransformCRRuleToHenshin 	transformCRRuleToHenshin = new TransformCRRuleToHenshin();
		MMToFineGrainedHenshinText 	mmToFineGrainedHenshinText 	
										= new MMToFineGrainedHenshinText();
		ArrayList<String> crRuleFiles	= 
				new ArrayList<String>(
						Arrays.asList(
								"PacmanMoveConflictResolution1.xmi", 
								"PacmanMoveConflictResolution2.xmi", 
								"GhostMoveConflictResolution1.xmi", 
								"GhostMoveConflictResolution2.xmi", 
								"KeepSemanticDifference.xmi"));
		
		ArrayList<String> sdRuleFiles	= new ArrayList<String>(
	 			Arrays.asList( 		
	 					"PacmanEatFood.xmi", 
	 					"PacmanDie.xmi",
	 					"PacmanJumpToEatFood.xmi",
	 					"PacmanMoveUP.xmi",
	 					"GhostMoveUp.xmi",
	 					"PacmanMoveDown.xmi",
	 					"GhostMoveDown.xmi",
	 					"PacmanMoveRight.xmi",
	 					"GhostMoveRight.xmi",
	 					"PacmanMoveLeft.xmi",
	 					"GhostMoveLeft.xmi",
	 					"PacmanMove.xmi",
	 					"GhostMove.xmi"
	 					)
	 			);
	

		String dblSlash = "\\";		
	
	
	

}
