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
import java.util.Objects;
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
import org.eclipse.emf.common.util.BasicEList;
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
import refactoring.RefactoringPackage;
import refactoring2WayDiffMM.Refactoring2WayDiffMMFactory;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;
import refactoring2WayRuleMM.Refactoring2WayRuleMMFactory;
import refactoring2WayRuleMM.Refactoring2WayRuleMMPackage;
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;

import refactoringCRRuleMM.RefactoringCRRuleMMFactory;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

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

public class RefactoringCase {

	String wsPath = System.getProperty("user.dir").replace("/", "\\"); // "D:\\_udemSVN\\DSMCompare-Project\\srcCode\\dsmMerge\\ca.umontreal.geodes.dsmcompare
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//-------------------------------- MERGE Tests
	//**************************************************	
	String testProject = "mamute";
	String testCommitId = "d8733654497fe0e41a5cd8ab89462ea4d003fcf1";
	
    //@Test//1// Find fine-grained diff and create V012	
	public void createDsmdiffMM() {
		 try {
			boolean createV012 = true;
			 vCaFileName	= dsModelsPath + testCommitId + "_CA_ref.xmi";
			 vLeftFileName	= dsModelsPath + testCommitId + "_V1_ref.xmi";
			 vRightFileName	= dsModelsPath + testCommitId + "_V2_ref.xmi";	
			 
			 String dsmDiffPath	= diffModelsPath + testCommitId + "_dsmDiff.xmi";
			 String resultFilePath	= diffModelsPath + testCommitId + "_emfCompareResult.txt";
			 
			 initializeCaseStudy();
			 dsmc.setDsdRulePackages(sdRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);	
			 Resource rsourceDSMDiff = dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(vCaFileName, vLeftFileName, vRightFileName, dsmDiffPath, resultFilePath, createV012);

			/*	//First Approach
				vCaFileName		= "b47932d899917a8a2d1a5d9a671a448b147a7432_CA_ref"+ ".xmi";//_CA_ref 
				vLeftFileName		= vCaFileName.replace("_CA_ref", "_V1_ref");//_gitMerged_ref
				vRightFileName	= vCaFileName.replace("_CA_ref", "_V2_ref");//
				emfCompareResultToFineGranularDsmdiffMM(createV012); 
			*/
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
    
	//---------------------------------------------------------------------------
	//Find semantic diffs
	public void ManuallyApply_refactoringRulesDSDiff_henshin_text() {
		//refactoringRulesDSDiff_henshin_text.henshin		
	}
			
	//---------------------------------------------------------------------------
	//find Semantic<--->Fine-Diff Conflicts	
	//We cannot find semantic diffs after first time of applying since it removes some eobjects	
	//@Test//1//
	public void step0008_Test() throws IOException {	
		System.out.println("\nStart finding -Semantic-Semantic Diffs <--&&--> -Semantic-Fine Diffs Conflicts!");
		String ruleFolderPath = diffRulesPath;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);	
		String p = wsPath + "\\casesMergeConflict\\refactoring\\diffModels\\";
		p += testCommitId + "_dsmDiff_transformed.xmi";// "DSMDiff_transformed.xmi";// 	"8ff635d78f16d967aa288b26c693267b925b921f_dsmDiff_transformed.xmi";
			
		System.out.println("\nFile Path: " + p);
		dsmc.find_SemanticFine_SemanticSemantic_Conflicts(p, diffMM_eNSURI, diffMM_eIN, ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
				dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, true, false, false, true);		

		System.out.println("\nEnd finding Semantic<--->Fine-Diff Conflicts!");
	}	
	
	//---------------------------------------------------------------------------
	public void ManuallyApply_refactoringCRRules_henshin_text() {
		//refactoringCRRules_henshin_text.henshin		
	}
	
	//---------------------------------------------------------------------------
	//Conflict resolution
	//@Test//1//
	public void stepConflictResolution_Test() throws IOException {	
		System.out.println("\nStart Conflict resolution!");
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
		String p = wsPath + "\\casesMergeConflict\\refactoring\\diffModels\\";
		p += testCommitId + "_dsmDiff_transformed_IncludingConflicts_transformed.xmi";//"DSMDiff_transformed_IncludingConflicts_transformed.xmi";//
		
		System.out.println("\nFile Path: " + p);
		
		String v012FilePath = wsPath + "\\casesMergeConflict\\refactoring\\dsModels\\";
		v012FilePath += testCommitId + "_V012.xmi";//"V012.xmi";//"DSMDiff_1.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_V012.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed.xmi";

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

		System.out.println("\nEnd Conflict resolution!");
	}

	//---------------------
	//@Test
	public void callStepReportFirstEvacuation_PrecisionRecall_RQ1_RQ2_Test() {
		stepReportFirstEvacuation_PrecisionRecall_RQ1_RQ2(testProject);
	}
		
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//-------------------------------- MERGE EVALUATION
	//**************************************************
	//Step One: Create Diff012 And initial V012 For All Cases
	//@Test
	public void stepDSMDiff_CA_ref__V1_ref__V2_ref() {		
		String domainDirName 	= "Refactoring";
		String caPostfix 		= "_CA_ref";
		String v1Postfix 		= "_V1_ref";
		String v2Postfix 		= "_V2_ref";			

		CreateDiff012AndInitialV012ForAllCases(domainDirName, caPostfix, v1Postfix, v2Postfix, "", true);
	}
	
	
	//---------------------------------------------------------------------------
	//Step Two: Manually Apply "refactoringRulesDSDiff_henshin_text.henshin" and find semantic differences [\casesMergeConflict\refactoring\henshinRules\refactoringRulesDSDiff_henshin_text.henshin]
	
	
	//---------------------------------------------------------------------------
	//Step Three: Find Semantic-Fine Semantic-Semantic Conflicts
	
	//@Test
	public void FindSemanticFine_And_SemanticSemanticConflicts() throws IOException {	//step0008()
		//Manual part Not needed anymore: i.e, Calling  refactoringRulesDSDiffPostRules.henshin_text on _transformed.xmi files
		System.out.println("\nStart finding Semantic-Fine and Semantic-Semantic Conflicts!");
		String diffModelsDirName 	= "diffModels";		
		ArrayList<String> dsDiffModelFoldersToSkip = new ArrayList<String>();
		dsDiffModelFoldersToSkip.add("_realm-java");	

		String ruleFolderPath = diffRulesPath;
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();
		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);				
		String[] projDirectories = getAllSubDirectories(caseStudiesMergeDiffDir);// { "android"};
		
		//%%%%%%%%%%%% Only for test purpose  //"error-prone","querydsl","redpen","POSA-14","android"
		//String[] projDirectories = {"POSA-14"};
		
		//%%%%%%%%%%%% Only for test purpose
		
		for(String projectName:projDirectories) {	
			System.out.println("\nProject Name:" + projectName);			
			if(dsDiffModelFoldersToSkip.contains(projectName)) {
				System.out.printf("\n%s project is skipped!\n", projectName);
				continue;
			}			
			String targetRefDiffInCaseStudy = caseStudiesMergeDiffDir + dblSlash + projectName;
			Stream<Path> refDiffsPaths = Files.walk(Paths.get(targetRefDiffInCaseStudy));
		    List<Path> refDiffPathList = refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff_transformed.xmi")).collect(Collectors.toList());
		    
		    for(Path pdiffPth:refDiffPathList) 
		    {
		    	String p=pdiffPth.toString();
		    	//String p=wsPath + "\\caseStudiesMerge\\diffModels\\closure-compiler\\161666f048d59314dc1ecdcb57f0a578e68188a5_dsmDiff_transformed.xmi";
		    	System.out.println("\nDiff model:"+ p);
		    	try {
		    	 	//dsmc.find_SemanticFine_SemanticSemantic_Conflicts(p, diffMM_eNSURI, diffMM_eIN, 
		    		//		ruleMM2Way_eNSURI, ruleMM2Way_eIN, dsmcRuleFilePaths, changeConflictsCPA, 
		    		//		semanticFineConflictsMultiCDA, false, true);
		    	 	
		    	 	dsmc.find_SemanticFine_SemanticSemantic_Conflicts(p, diffMM_eNSURI, diffMM_eIN, ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
		    				dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, true, false, false, true);	
		    	 	

					//dsmc.postRuleApplicationAuthorSet(pdiffPth.toString(),diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
		    	}catch(Exception ex) {
		    		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<  Error:");
		    		System.out.println("\nin: " + p);
		    		System.out.println("\nException: " + ex.getLocalizedMessage());
		    		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>");
		    	}
		    }		    		
		}
		System.out.println("\nEnd finding Semantic<--->Fine-Diff Conflicts!");	
	}
		

	//---------------------------------------------------------------------------
	//Step Four: Manually Apply "refactoringCRRules_henshin_text.henshin" and find semantic differences [\casesMergeConflict\refactoring\henshinRules\refactoringCRRules_henshin_text.henshin]
	
	
	
	//---------------------------------------------------------------------------
	//Step Five: Repetitive step of [Automatic and Manual] conflict resolution and Merge, Maybe need to run step four and five or only five agaian and again
	//---------------------------------------------------------------------------
	//Conflict resolution
	//@Test//1//
	public void stepConflictResolution() throws IOException {	
		System.out.println("\nStart - Conflict resolution");
		String ruleFolderPath = diffRulesPath;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);	

    	Charset charset = StandardCharsets.UTF_8;
		String v012MM_eNSURI = diffMM_eNSURI;// MM_eNSURI;
		Object v012_eIN = diffMM_eIN;// MM_eIN;
		String domainDirName 		= "Refactoring";
		String diffModelsDirName 	= "diffModels";
		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + "Refactoring";
		String[] projDirectories = getAllSubDirectories(caseStudiesMergeRefDir); // {"android"}; //
		
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			
			System.out.println("\nProject Name:" + projectName);
			String targetRefDirInCaseStudy = caseStudiesMergeDir + dblSlash + domainDirName + dblSlash + projectName;
			String diffModelsDir = caseStudiesMergeDir + dblSlash + diffModelsDirName + dblSlash + projectName;
			String logProjectFileContent = "\nProject Name:" + projectName +"\n\n\n";
			
			try {
				Stream<Path> refVersionPaths = Files.walk(Paths.get(targetRefDirInCaseStudy));
			    List<Path> v012PathList = refVersionPaths.filter(var -> var.toString().endsWith("_V012.xmi")).collect(Collectors.toList());

			    for(Path v012P:v012PathList) {
			    	try {
				    	String v012Path = v012P.toString();
				    	
				    	if(v012Path != "") {		
				    		String dsmDiffFileName = v012P.getFileName().toString().replace("_V012", "_dsmDiff_transformed_IncludingConflicts_transformed");
							String dsmDiffFilePath	= diffModelsDir + dblSlash + dsmDiffFileName;


							boolean succeed = dsmc.perform_ConflictResolution(
									dsmDiffFilePath, diffMM_eNSURI, diffMM_eIN, 
									ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
									dsmcRuleFilePaths, changeConflictsCPA, 
									semanticFineConflictsMultiCDA, true, 
									v012Path, v012MM_eNSURI, v012_eIN);	
														
							if(succeed) {
								logProjectFileContent +="\n" + "+ Successfull	: " + dsmDiffFileName;
							}else {
								logProjectFileContent +="\n" + "- Failed		: " + dsmDiffFileName;								
							}
							
						    System.out.println("\nSuccees : V012 Model created for: " + v012P.getFileName().toString());			    		
				    	}
				    	else {
						    System.out.println("\n-Failed : Couldn't generate V012 Model for: " + v012P.getFileName().toString());			    		
				    	}
			    	}catch(Exception ex) {
			    		System.out.println("\n-Failed : Exception. " + ex.getLocalizedMessage() + "\n" + v012P.getFileName().toString().replace("_CA_ref.xmi", "") );
			    	}			    	
			    }
			  //Log
			    String logProjectFilePath = diffModelsDir+ dblSlash + "log_V012_"+projectName+".txt";
			    File logPerProjectFile=new File(logProjectFilePath);
				Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				
			} catch (IOException e) {
				System.out.println("Exception in Project: " + projectName);	
				e.printStackTrace();
				logProjectFileContent += "\n"+e.getMessage();
				//Log
				String logProjectFilePath = diffModelsDir+ dblSlash + "log_V012_"+projectName+".txt";
			    File logPerProjectFile=new File(logProjectFilePath);
				try {
					Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

		System.out.println("\nEnd finding Conflict resolution");
	}
		
	
	//---------------------------------------------------------------------------
	//Step Six:DSMDiff _gitMerged_ref _gitMerged_ref _manualMerged_ref
	//@Test
	public void stepDSMDiff_manualMerged_ref_manualMerged_ref_gitMerged_ref() {		
		String domainDirName 	= "Refactoring";		
		String caPostfix 		= "_manualMerged_ref";
		String v1Postfix 		= "_manualMerged_ref";
		String v2Postfix 		= "_gitMerged_ref";
		String v2PostfixOther	= "_CA_ref";
				
		//The false below prevents creating wrong V012
		CreateDiff012AndInitialV012ForAllCases(domainDirName, caPostfix, v1Postfix, v2Postfix, v2PostfixOther, false);
	}
	
	@Test
	public void callStepReportFirstEvacuation_PrecisionRecall_RQ1_RQ2_All() {
		stepReportFirstEvacuation_PrecisionRecall_RQ1_RQ2(null);
	}
	
	
	
	
	
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//---------------------------------------------------------------------------
	//Step Seven:Calculate Precision Recall and Other Report For the First Evacuation
	//@Test
	public void stepReportFirstEvacuation_PrecisionRecall_RQ1_RQ2(String testProject) {
		String diffModelsDirName 		
			= "diffModels";
		String diffModels_gitMerged_manualMergedDirName 		
			= "diffModels_manualMerged_ref___manualMerged_ref___gitMerged_ref";
		String domainDirName 	= "Refactoring";		
		String manualMerged_refPostfix 		= "_manualMerged_ref";

		
    	Charset charset = StandardCharsets.UTF_8;
		String v012MM_eNSURI = diffMM_eNSURI;
		Object v012_eIN = diffMM_eIN;
		
		String  caseStudies_DsModels_Dir = caseStudiesMergeDir + dblSlash + domainDirName;
		String  caseStudies_DiffModels_Dir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		String  caseStudies_DiffModelsGitMergedManualMeged_Dir = caseStudiesMergeDir + dblSlash + diffModels_gitMerged_manualMergedDirName;
		String[] projDirectories = getAllSubDirectories(caseStudies_DiffModels_Dir);
		String log_PR_CRV_Content = "Project_name,Commit,TP_Semantic,TP_Semantic_Auto,TP_Semantic_Manual,FP,TN,FN,";
		log_PR_CRV_Content += "CR_Semantic,CR_Fine,FineDiffs,FineDiffs_Auto_Resolved,FineDiffs_Manual_Resolved";
		log_PR_CRV_Content += "\n";
		
		//The following two lines are for the test purpose
		if(testProject!=null && !testProject.trim().isEmpty()) {
			projectsListIncluded.clear();
			projectsListIncluded.add(testProject);
		}
		
		//---------------------------------------------------------------------------------------------------------------
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			
			//diffModelsDirName -->    
			//					"_dsmDiff_transformed_IncludingConflicts_transformed_2.xmi"
			//diffModels_gitMerged_ref___gitMerged_ref___manualMerged_ref   -->  
			//					"__dsmDiff_gitMerged_ref___gitMerged_ref___manualMerged_ref_transformed.xmi"
			System.out.println("\n======================================================================================");
			System.out.println("Project Name: " + projectName);
			//String targetRefDirInCaseStudy = caseStudiesMergeDir + dblSlash + diffModelsDirName + dblSlash + projectName;
			String diffModelsDir = caseStudies_DiffModels_Dir + dblSlash + projectName;
			String diffGitMergedManualDir = caseStudies_DiffModelsGitMergedManualMeged_Dir + dblSlash + projectName;
			String logProjectFileContent = "\nProject Name: " + projectName +"\n\n";
			
			try {
				Stream<Path> diffModelsPaths = Files.walk(Paths.get(diffModelsDir));
			    List<Path> dsmDiffModelsPathList = 
			    		diffModelsPaths.filter(var -> 
			    		var.toString().endsWith("_dsmDiff_transformed_IncludingConflicts_transformed_2.xmi")).collect(Collectors.toList());
			    
			    //The following line is for the test purpose
			    //dsmDiffModelsPathList = dsmDiffModelsPathList.stream().filter(f->f.getFileName().toString().contains("2819989001fe0352aa65201192358cdc69fc9356")).collect(Collectors.toList());
			    
			    
			    
			    for(Path dsmDiffModelP:dsmDiffModelsPathList) {
			    	String commitId = dsmDiffModelP.getFileName().toString().split("_")[0];
			    	Set<EObject> conflictResolutions_Semantic		= new HashSet<EObject>();			    	
			    	Set<EObject> conflictResolutions_Fine		= new HashSet<EObject>();
			    	Map<EObject, Set<EObject>> conflictResolutions_And_elements_LinkedToIt_Semantic =  //elements or Diffs ?
							new HashMap<EObject, Set<EObject>>();					
			    	
					int TP_Semantic_Auto = 0, TP_Semantic_Manual = 0, TP_Semantic = 0, TP_Fine = 0, TP = 0, FP = 0, FN = 0, TN = 0, 
							MissByRefConMiner = 0, CR_Semantic = 0, totalContradictingFineDiffs = 0;
					// true positive  (TP) : correctly indicates the presence of a condition or characteristic
					// true negative  (TN) : correctly indicates the absence of a condition or characteristic
					// false positive (FP) : wrongly   indicates that a particular condition or attribute is present
					// false negative (FN) : wrongly   indicates that a particular condition or attribute is absent
					//------------------------------------------------------------
					ArrayList<EObject>	semanticDiffs__DsmDiffModel = new ArrayList<EObject>();								
					Map<EObject, Set<EObject>> semanticDiffs_And_elements_LinkedToIt__DsmDiffModel =  //elements or Diffs ?
							new HashMap<EObject, Set<EObject>>();
					
					Set<EObject> CRsNotContainsContraDiffs_Semantic = new  HashSet<EObject>();
					Set<EObject> CRContraDiffs_Semantic_Manual = new  HashSet<EObject>();
					Set<EObject> CRsNotContainsContraDiffsDeleteDelete_Semantic = new  HashSet<EObject>();//DELETE | DELETE
					Set<EObject> contradictingFineDiffs = new  HashSet<EObject>();
					Set<EObject> contradictingFineDiffsResolvedMannually = new HashSet<EObject>();
					
					
					//------------------------------------------------------------
					
			    	try {
				    	String dsmDiffModelPath = dsmDiffModelP.toString();				    	
				    	if(dsmDiffModelPath != "") {	
				    		// diffModels_gitMerged_manualMergedDirName
				    		// "diffModels_manualMerged_ref___manualMerged_ref___gitMerged_ref"
				    		String dsmDiffFileName = 
				    				dsmDiffModelP.getFileName().toString().replace(
				    						"_dsmDiff_transformed_IncludingConflicts_transformed_2", 
				    						"__dsmDiff_manualMerged_ref___manualMerged_ref___gitMerged_ref_transformed"); //"_"+diffModels_gitMerged_manualMergedDirName + "_transformed"
				    		String manualMergedFileName = 
				    				dsmDiffModelP.getFileName().toString().replace(
				    						"_dsmDiff_transformed_IncludingConflicts_transformed_2", 
				    						"_manualMerged_ref");
				    		
				    		String diffGitMergedManualPath	= diffGitMergedManualDir + dblSlash + dsmDiffFileName;
				    		
				    		String manualMergedPath = caseStudies_DsModels_Dir+ dblSlash + projectName + dblSlash + manualMergedFileName;
							boolean doesExistsManualMergedPath = true;
							File fManualMergedPath = new File(manualMergedPath);
					    	if(!fManualMergedPath.exists()) { // && !fManualMergedPath.isDirectory()
					    		doesExistsManualMergedPath = false;
					    		logProjectFileContent += "!!!-Not Exists Manual Merged File-!!!- ";
					    	}
							
							
							ResourceSet rsetDsmDiffModel	=	DsmcHelpers.setResourceSet(dsmDiffModelPath,diffMM_eNSURI, diffMM_eIN);	
							Resource rsourceDsmDiffModel =	rsetDsmDiffModel.getResource(URI.createFileURI(dsmDiffModelPath) , true);
							
							EPackage 	ePackage 					= rsourceDsmDiffModel.getContents().get(0).eClass().getEPackage();
							
							String   	SemanticDiffClassName 			= "SemanticDiff";						
							EClassifier SemanticDiffEClassifier	= ePackage.getEClassifier(SemanticDiffClassName);	
							EClass		SemanticDiffClass				= (EClass)SemanticDiffEClassifier;
							String  	refC_semanticdiffs					= "semanticdiffs";
							//------------------------		
							String   	conflictClassName 			= "SemanticConflict";						
							EClassifier conflictClassEClassifier	= ePackage.getEClassifier(conflictClassName);	
							EClass		conflictClass				= (EClass)conflictClassEClassifier;
							String 		refName_semanticconflicts		= "semanticconflicts";
							//------------------------
							String   	ConflictResolutionClassName 			= "ConflictResolution";						
							EClassifier ConflictResolutionClassNameEClassifier	= ePackage.getEClassifier(ConflictResolutionClassName);	
							EClass		ConflictResolutionClass				= (EClass)ConflictResolutionClassNameEClassifier;	
							
							//------------------------------------------------------------
							

							for(EObject c:rsourceDsmDiffModel.getContents()) {
								if(c.eClass().getName().toLowerCase().equals(ConflictResolutionClassName.toLowerCase())) {
									boolean crHasSemanticConflict = ((List<EObject>) c.eGet(DsmcHelpers.getEReferenceByNameNullDefault(c, refName_semanticconflicts))).size() > 0;
									if(crHasSemanticConflict)
										conflictResolutions_Semantic.add(c);
									else
										conflictResolutions_Fine.add(c);
								}									
							}
							
							for(EObject conflictResolution:conflictResolutions_Fine) {
								for(EObject d:conflictResolution.eCrossReferences()) {
									Object changeStatusC = DsmcHelpers.getAttrValueByAttrNameNullDefault(d, "changeStatus");
									if(changeStatusC != null && changeStatusC.toString().equals("CONTRADICTING")){
										contradictingFineDiffsResolvedMannually.add(d);
									}
								}
							}
							
							for(EObject conflictResolution:conflictResolutions_Semantic) {
								Set<EObject> elementsLinkedToConflictResolution = new HashSet<EObject>();
								//Chhose semantic-fine or semantic-semantic   // conflictResolution.eCrossReferences().get(0).eCrossReferences() is a semantic conflict
								EObject semConflict = ((List<EObject>) conflictResolution.eGet(DsmcHelpers.getEReferenceByNameNullDefault(conflictResolution, refName_semanticconflicts))).get(0);
								Object conflict_Granularity = DsmcHelpers.getAttrValueByAttrNameNullDefault(semConflict, "conflict_Granularity");									
								if (conflict_Granularity!=null && conflict_Granularity.toString().toLowerCase().contains("semantic")) {
									for(EObject c:conflictResolution.eCrossReferences().get(0).eCrossReferences()) {
										if(!c.eClass().equals(SemanticDiffClass))
											elementsLinkedToConflictResolution.add(c);
										else{
											for(EObject d:c.eCrossReferences()) {
												Object changeStatusC = DsmcHelpers.getAttrValueByAttrNameNullDefault(d, "changeStatus");
												if(changeStatusC != null && changeStatusC.toString().equals("CONTRADICTING")){
													elementsLinkedToConflictResolution.add(d);
												}
											}											
										}
									}	
									if(elementsLinkedToConflictResolution.size()>0)
										conflictResolutions_And_elements_LinkedToIt_Semantic.put(conflictResolution, elementsLinkedToConflictResolution);
									}
							}
							
							for(EObject c:rsourceDsmDiffModel.getContents()) {
								if(c.eClass().getName().toLowerCase().equals(SemanticDiffClassName.toLowerCase()))//DiffMM_Package.getEClassifier("SemanticDiff")
									semanticDiffs__DsmDiffModel.add(c);
							}		
							
							for(EObject semanticDiff:semanticDiffs__DsmDiffModel) {
								Set<EObject> elementsLinkedToSemanticDiff = new HashSet<EObject>();
								for(EObject c:semanticDiff.eCrossReferences()) {
									elementsLinkedToSemanticDiff.add(c);
									/*Object changeStatusC = DsmcHelpers.getAttrValueByAttrNameNullDefault(c, "changeStatus");
									if(changeStatusC != null) {
										elementsLinkedToSemanticDiff.add(c);
									}*/					
								}	
								if(elementsLinkedToSemanticDiff.size()>0)
									semanticDiffs_And_elements_LinkedToIt__DsmDiffModel.put(semanticDiff, elementsLinkedToSemanticDiff);
							}
							
							
							Stream<Path> diffGitMergedManualModelPaths = Files.walk(Paths.get(diffGitMergedManualPath));
							if(diffGitMergedManualModelPaths.count()>0) {
								//--------------------------
								ResourceSet rsetGitMergedManualModel	=	DsmcHelpers.setResourceSet(diffGitMergedManualPath,diffMM_eNSURI, diffMM_eIN);	
								Resource rsourceDsmDiffGitMergedManualModel =	rsetGitMergedManualModel.getResource(URI.createFileURI(diffGitMergedManualPath) , true);	
								
								Set<EObject> allNodesOfDsmDiffGitMergedManualModel = DsmcHelpers.getAllNodes(rsourceDsmDiffGitMergedManualModel);
								Set<EObject> allNodesOfDsmDiff = DsmcHelpers.getAllNodes(rsourceDsmDiffModel);
								
								//-----------------------------------------------------------------------
								for(EObject linkedElement:allNodesOfDsmDiff) {
									Object changeStatusValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(linkedElement, "changeStatus");
									if(changeStatusValue!=null && changeStatusValue.toString().equals("CONTRADICTING")) {
										contradictingFineDiffs.add(linkedElement);
									}
								}
																
								//------------------------------------------------------------
								ArrayList<EObject>	semanticDiffs__DsmiffGitMergedManualModel = new ArrayList<EObject>();	
								Map<EObject, Set<EObject>> semanticDiffs_And_elements_LinkedToIt__DsmiffGitMergedManualModel =  //elements or Diffs ?
										new HashMap<EObject, Set<EObject>>();
								
								//------------------------------------------------------------
								for(EObject c:rsourceDsmDiffGitMergedManualModel.getContents()) {
									if(c.eClass().getName().toLowerCase().equals(SemanticDiffClassName.toLowerCase()))//DiffMM_Package.getEClassifier("SemanticDiff")
										semanticDiffs__DsmiffGitMergedManualModel.add(c);
								}

								for(EObject semanticDiff:semanticDiffs__DsmiffGitMergedManualModel) {
									Set<EObject> elementsLinkedToSemanticDiff = new HashSet<EObject>();
									for(EObject c:semanticDiff.eCrossReferences()) {
										elementsLinkedToSemanticDiff.add(c);
									}	
									if(elementsLinkedToSemanticDiff.size()>0)
										semanticDiffs_And_elements_LinkedToIt__DsmiffGitMergedManualModel.put(semanticDiff, elementsLinkedToSemanticDiff);
								}
								
								
								if(conflictResolutions_And_elements_LinkedToIt_Semantic.size() > 0) {//semanticDiffs__DsmDiffModel.size()>0 && semanticDiffs__DsmiffGitMergedManualModel.size()>0) {								
									
									for(var entry:conflictResolutions_And_elements_LinkedToIt_Semantic.entrySet()) {
										boolean contains = false;
										EObject semDiff = 
												DsmcHelpers.getERefTargetByERefName(DsmcHelpers.getERefTargetByERefName(entry.getKey(), "semanticconflicts").get(0), "semanticdiffs").get(0);
										String semDiff_name = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(semDiff, "name"),"").toLowerCase();
										String semDiff_author = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(semDiff, "author"),"").toLowerCase().trim();
																				
										for(var elementMerge:entry.getValue()){										
											String elementMerge_name ="";
											Object elementMerge_name_Object = DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "name");
											//It is a DiffEClass
											if(elementMerge_name_Object!=null)
												elementMerge_name = elementMerge_name_Object.toString();
											else {
												//It is a DiffEAssociation
												ArrayList<EObject> elementMerge_eType_Object = DsmcHelpers.getERefTargetByERefName(elementMerge, "eType");
												if(elementMerge_eType_Object!=null && elementMerge_eType_Object.size()>0) {
													elementMerge_name_Object = DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge_eType_Object.get(0), "name");
													if(elementMerge_name_Object!=null)
														elementMerge_name = elementMerge_name_Object.toString();
												}												
											}											
											
											
											if(elementMerge_name != null && elementMerge_name!="") {
												for(var entry2:semanticDiffs_And_elements_LinkedToIt__DsmiffGitMergedManualModel.entrySet()) {
													for(var linkedElement:entry2.getValue()) {														
														EObject equalElement = null;
														String equalElement_name ="";
														Object linkedElement_name_Object = DsmcHelpers.getAttrValueByAttrNameNullDefault(linkedElement, "name");
														//It is a DiffEClass
														if(linkedElement_name_Object!=null) {
															equalElement_name = linkedElement_name_Object.toString();
															equalElement = linkedElement;
														}
														else {
															//It is a DiffEAssociation
															ArrayList<EObject> linkedElement_eTypeObject = DsmcHelpers.getERefTargetByERefName(linkedElement, "eType");
															if(linkedElement_eTypeObject!=null && linkedElement_eTypeObject.size()>0) {
																linkedElement_name_Object = DsmcHelpers.getAttrValueByAttrNameNullDefault(linkedElement_eTypeObject.get(0), "name");
																if(linkedElement_name_Object!=null) {
																	equalElement_name = linkedElement_name_Object.toString();
																	equalElement = linkedElement_eTypeObject.get(0);
																}
															}												
														}
														
														
														if(equalElement_name!= null && equalElement_name!="" && elementMerge_name.equals(equalElement_name)) {
															if(DsmcHelpers.isEqual(equalElement, elementMerge) 
																|| (!semDiff_name.contains("extract method") && !semDiff_name.contains("inline method") 
																	&& !semDiff_name.contains("change parameters")))
															{
																////TP_Semantic += 1;//entry2.getValue().size();
																contains =true;
																break;
															}
															else if(semDiff_name.contains("extract method") || semDiff_name.contains("inline method")) {
																	String new_methodBody_Left_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_methodBody_Left"),"");
																	String new_methodBody_Right_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_methodBody_Right"),"");

																	String new_methodBody_Left_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_methodBody_Left"),"");																	
																	String new_methodBody_Right_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_methodBody_Right"),"");
																	
																	//----------------------------
																	if( 		(new_methodBody_Left_equalElement.contains(new_methodBody_Left_elementMerge) && (semDiff_author.equals("left") ||semDiff_author.equals("equals")))
																			|| 	(new_methodBody_Right_equalElement.contains(new_methodBody_Right_elementMerge) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																			
																			||	(new_methodBody_Left_elementMerge.contains(new_methodBody_Left_equalElement) && (semDiff_author.equals("left") ||semDiff_author.equals("equals"))) 
																			|| 	(new_methodBody_Right_elementMerge.contains(new_methodBody_Right_equalElement) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																	  ) 
																	{
																		contains =true;
																		break;
																	}
																	else if(	new_methodBody_Left_equalElement.contains(new_methodBody_Left_elementMerge) 
																			|| 	new_methodBody_Right_equalElement.contains(new_methodBody_Right_elementMerge) 
																			|| 	new_methodBody_Left_elementMerge.contains(new_methodBody_Left_equalElement)
																			||	new_methodBody_Right_elementMerge.contains(new_methodBody_Right_equalElement)
																			
																			||	new_methodBody_Left_equalElement.contains(new_methodBody_Right_elementMerge) 
																			|| 	new_methodBody_Right_equalElement.contains(new_methodBody_Left_elementMerge)
																			
																			|| 	new_methodBody_Right_elementMerge.contains(new_methodBody_Left_equalElement) 
																			|| 	new_methodBody_Left_elementMerge.contains(new_methodBody_Right_equalElement)  
																			) 
																	{
																		CRContraDiffs_Semantic_Manual.add(entry.getKey());
																		contains =true;
																		break;
																	}
																	else
																	{
																		contains = false;
																	}
															}
															else if(semDiff_name.contains("change parameters")) {
																String new_eparameters_Left_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_eparameters_Left"),"");
																String new_eparameters_Right_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_eparameters_Right"),"");

																String new_eparameters_Left_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_eparameters_Left"),"");																	
																String new_eparameters_Right_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_eparameters_Right"),"");
																
																
																//----------------------------
																if( 		(new_eparameters_Left_equalElement.contains(new_eparameters_Left_elementMerge) && (semDiff_author.equals("left") ||semDiff_author.equals("equals")))
																		|| 	(new_eparameters_Right_equalElement.contains(new_eparameters_Right_elementMerge) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																		
																		||	(new_eparameters_Left_elementMerge.contains(new_eparameters_Left_equalElement) && (semDiff_author.equals("left") ||semDiff_author.equals("equals"))) 
																		|| 	(new_eparameters_Right_elementMerge.contains(new_eparameters_Right_equalElement) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																  ) 
																{
																	contains =true;
																	break;
																}
																else if(	new_eparameters_Left_equalElement.contains(new_eparameters_Left_elementMerge) 
																		|| 	new_eparameters_Right_equalElement.contains(new_eparameters_Right_elementMerge) 
																		|| 	new_eparameters_Left_elementMerge.contains(new_eparameters_Left_equalElement)
																		||	new_eparameters_Right_elementMerge.contains(new_eparameters_Right_equalElement)
																		
																		||	new_eparameters_Left_equalElement.contains(new_eparameters_Right_elementMerge) 
																		|| 	new_eparameters_Right_equalElement.contains(new_eparameters_Left_elementMerge)
																		
																		|| 	new_eparameters_Right_elementMerge.contains(new_eparameters_Left_equalElement) 
																		|| 	new_eparameters_Left_elementMerge.contains(new_eparameters_Right_equalElement)  
																		) 
																{
																	CRContraDiffs_Semantic_Manual.add(entry.getKey());
																	contains =true;
																	break;
																}
																else
																{
																	contains = false;
																}
															}
														}
													}
													if(contains ==true)
														break;
												}
											}
											
											if(contains ==true)
												break;
											else {
												for(EObject linkedElement:allNodesOfDsmDiffGitMergedManualModel) {
													EObject equalElement = null;
													String equalElement_name ="";
													Object linkedElement_name_Object = DsmcHelpers.getAttrValueByAttrNameNullDefault(linkedElement, "name");
													//It is a DiffEClass
													if(linkedElement_name_Object!=null) {
														equalElement_name = linkedElement_name_Object.toString();
														equalElement = linkedElement;
													}
													else {
														//It is a DiffEAssociation
														ArrayList<EObject> linkedElement_eTypeObject = DsmcHelpers.getERefTargetByERefName(linkedElement, "eType");
														if(linkedElement_eTypeObject!=null && linkedElement_eTypeObject.size()>0) {
															linkedElement_name_Object = DsmcHelpers.getAttrValueByAttrNameNullDefault(linkedElement_eTypeObject.get(0), "name");
															if(linkedElement_name_Object!=null) {
																equalElement_name = linkedElement_name_Object.toString();
																equalElement = linkedElement_eTypeObject.get(0);
															}
														}												
													}
													
													
													if(equalElement_name!= null && equalElement_name!="" && elementMerge_name.equals(equalElement_name)) {
															if(DsmcHelpers.isEqual(equalElement, elementMerge) 
																|| (!semDiff_name.contains("extract method") && !semDiff_name.contains("inline method") 
																	&& !semDiff_name.contains("change parameters")))
															{
																////TP_Semantic += 1;//entry2.getValue().size();
																contains =true;
																break;
															}
															else if(semDiff_name.contains("extract method") || semDiff_name.contains("inline method")) {
																	String new_methodBody_Left_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_methodBody_Left"),"");
																	String new_methodBody_Right_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_methodBody_Right"),"");

																	String new_methodBody_Left_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_methodBody_Left"),"");																	
																	String new_methodBody_Right_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_methodBody_Right"),"");
																	
																	//----------------------------
																	if( 		(new_methodBody_Left_equalElement.contains(new_methodBody_Left_elementMerge) && (semDiff_author.equals("left") ||semDiff_author.equals("equals")))
																			|| 	(new_methodBody_Right_equalElement.contains(new_methodBody_Right_elementMerge) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																			
																			||	(new_methodBody_Left_elementMerge.contains(new_methodBody_Left_equalElement) && (semDiff_author.equals("left") ||semDiff_author.equals("equals"))) 
																			|| 	(new_methodBody_Right_elementMerge.contains(new_methodBody_Right_equalElement) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																	  ) 
																	{
																		contains =true;
																		break;
																	}
																	else if(	new_methodBody_Left_equalElement.contains(new_methodBody_Left_elementMerge) 
																			|| 	new_methodBody_Right_equalElement.contains(new_methodBody_Right_elementMerge) 
																			|| 	new_methodBody_Left_elementMerge.contains(new_methodBody_Left_equalElement)
																			||	new_methodBody_Right_elementMerge.contains(new_methodBody_Right_equalElement)
																			
																			||	new_methodBody_Left_equalElement.contains(new_methodBody_Right_elementMerge) 
																			|| 	new_methodBody_Right_equalElement.contains(new_methodBody_Left_elementMerge)
																			
																			|| 	new_methodBody_Right_elementMerge.contains(new_methodBody_Left_equalElement) 
																			|| 	new_methodBody_Left_elementMerge.contains(new_methodBody_Right_equalElement)  
																			) 
																	{
																		CRContraDiffs_Semantic_Manual.add(entry.getKey());
																		contains =true;
																		break;
																	}
																	else
																	{
																		contains = false;
																	}
															}
															else if(semDiff_name.contains("change parameters")) {
																String new_eparameters_Left_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_eparameters_Left"),"");
																String new_eparameters_Right_equalElement = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(equalElement, "new_eparameters_Right"),"");

																String new_eparameters_Left_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_eparameters_Left"),"");																	
																String new_eparameters_Right_elementMerge = Objects.toString(DsmcHelpers.getAttrValueByAttrNameNullDefault(elementMerge, "new_eparameters_Right"),"");
																
																
																//----------------------------
																if( 		(new_eparameters_Left_equalElement.contains(new_eparameters_Left_elementMerge) && (semDiff_author.equals("left") ||semDiff_author.equals("equals")))
																		|| 	(new_eparameters_Right_equalElement.contains(new_eparameters_Right_elementMerge) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																		
																		||	(new_eparameters_Left_elementMerge.contains(new_eparameters_Left_equalElement) && (semDiff_author.equals("left") ||semDiff_author.equals("equals"))) 
																		|| 	(new_eparameters_Right_elementMerge.contains(new_eparameters_Right_equalElement) && (semDiff_author.equals("right") ||semDiff_author.equals("equals")))
																  ) 
																{
																	contains =true;
																	break;
																}
																else if(	new_eparameters_Left_equalElement.contains(new_eparameters_Left_elementMerge) 
																		|| 	new_eparameters_Right_equalElement.contains(new_eparameters_Right_elementMerge) 
																		|| 	new_eparameters_Left_elementMerge.contains(new_eparameters_Left_equalElement)
																		||	new_eparameters_Right_elementMerge.contains(new_eparameters_Right_equalElement)
																		
																		||	new_eparameters_Left_equalElement.contains(new_eparameters_Right_elementMerge) 
																		|| 	new_eparameters_Right_equalElement.contains(new_eparameters_Left_elementMerge)
																		
																		|| 	new_eparameters_Right_elementMerge.contains(new_eparameters_Left_equalElement) 
																		|| 	new_eparameters_Left_elementMerge.contains(new_eparameters_Right_equalElement)  
																		) 
																{
																	CRContraDiffs_Semantic_Manual.add(entry.getKey());
																	contains =true;
																	break;
																}
																else
																{
																	contains = false;
																}
															}
														}
													if(contains ==true)
														break;
												}
											}
										}
										if(contains == false) {
											CRsNotContainsContraDiffs_Semantic.add(entry.getKey());
										}									
									}
									
								}else if(semanticDiffs__DsmDiffModel.size()>0 && semanticDiffs__DsmiffGitMergedManualModel.size()==0) {
									MissByRefConMiner = conflictResolutions_Semantic.size();
									FP = 0;
								}else if(semanticDiffs__DsmDiffModel.size()==0 && semanticDiffs__DsmiffGitMergedManualModel.size()>0) {
									
								}else {
									
								}
								
								try {
									CRsNotContainsContraDiffsDeleteDelete_Semantic.clear();
									CRsNotContainsContraDiffsDeleteDelete_Semantic.addAll(
											CRsNotContainsContraDiffs_Semantic.stream().filter(f->
												(DsmcHelpers.getAttrValueByAttrNameNullDefault(
													(((ArrayList<EObject>) DsmcHelpers.getERefTargetByERefName(
															f, "semanticconflicts")).get(0)), "name")).toString().replace(" ","").toUpperCase().contains("DELETE|DELETE")).collect(Collectors.toList()));
								}catch(Exception ex) {
									
								}
								
								//===================================================================================
								
								for(var c:CRsNotContainsContraDiffs_Semantic) {
									if(CRsNotContainsContraDiffsDeleteDelete_Semantic.size() ==0
										|| (CRsNotContainsContraDiffsDeleteDelete_Semantic.size()>0 
											&& !CRsNotContainsContraDiffsDeleteDelete_Semantic.contains(c))) {
										for(var v:c.eCrossReferences()) {
											Object changeStatusValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(v, "changeStatus");
											if(changeStatusValue!=null && changeStatusValue.toString().equals("CONTRADICTING")) {
												contradictingFineDiffsResolvedMannually.add(v);
											}
										}
									}
								}
								
								//===================================================================================
								TP_Fine = conflictResolutions_Fine.size();								
								totalContradictingFineDiffs = contradictingFineDiffs.size();
								TP_Semantic_Manual = CRContraDiffs_Semantic_Manual.size();									
								CR_Semantic = conflictResolutions_Semantic.size();
								FN=FP=0;
								String printCRs = printableCR(CRsNotContainsContraDiffs_Semantic, CRsNotContainsContraDiffsDeleteDelete_Semantic);
								if(printCRs.trim()!="") {
									printCRs = printableCR(CRsNotContainsContraDiffs_Semantic, CRsNotContainsContraDiffsDeleteDelete_Semantic);
									String[] pCSList = printCRs.trim().split("\\[#");	
																										
									for(String p:pCSList) {
										if(!p.trim().isEmpty()) {
											if(p.contains("DELETE"))
												++FP;
											else 
												++FN;
										}
									}
									
									printCRs = "	-->Not-Contains List = " + printCRs;
								}
								
								TP_Semantic_Auto = CR_Semantic - (FP + FN + TN + TP_Semantic_Manual);
								TP_Semantic = TP_Semantic_Auto + TP_Semantic_Manual;
									/*
									//conflictResolutions_And_elements_LinkedToIt
									- CRsNotContainsContraDiffs_Semantic.size()
									+ CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
									
					    		//----------------------------------------------------------------								
								////TP_Semantic += CRsNotContainsContraDiffsDeleteDelete.size();
								TN = CR_Semantic - TP_Semantic_Auto;
								TP = TP_Semantic_Auto + TP_Fine;
								*/
								
								TP_Semantic = TP_Semantic_Auto + TP_Semantic_Manual;
								
					    		logProjectFileContent += "Commit#: " + commitId + "	TP_Semantic = " + String.format("%-3s", TP_Semantic) 
					    				+" (Auto = " + String.format("%-3s", TP_Semantic_Auto)  + " , Manual = " + String.format("%-3s", TP_Semantic_Manual) + "),"
					    				+ " FP = " + FP + ", TN = " + TN + ", FN = " + FN 
					    				+ "	-CR_Semantic =	" + CR_Semantic 
					    				+ "	-CR_Fine =	" + conflictResolutions_Fine.size() 
					    				//+ " -SemDiff_Merge =	" + semanticDiffs__DsmiffGitMergedManualModel.size()
					    				//+ " -MissByRefConMiner = " +MissByRefConMiner
					    				//+ " -SemDiff_Diff012 =	" + semanticDiffs_And_elements_LinkedToIt__DsmDiffModel.size()
					    				+ "	-[#Contradicting FineDiffs =	" + totalContradictingFineDiffs
					    				+ "	(#Auto-Resolved:	" + (totalContradictingFineDiffs - (conflictResolutions_Fine.size() + TP_Semantic_Manual)) //contradictingFineDiffsResolvedMannually.size() + 
					    				+ "	, #Manual-Resolved:	" + String.format("%-3s",(conflictResolutions_Fine.size() + TP_Semantic_Manual)) + ")]" //contradictingFineDiffsResolvedMannually.size() + 
					    				+ "	-Status = Succees"
					    				+ printCRs;
								
					    		log_PR_CRV_Content += projectName + "," + commitId  + "," + TP_Semantic 
					    				+ "," + TP_Semantic_Auto+ "," + TP_Semantic_Manual 
					    				+ "," + FP + "," + TN + "," + FN  
					    				+ "," + CR_Semantic + "," + conflictResolutions_Fine.size()
					    				+ "," + totalContradictingFineDiffs + "," + (totalContradictingFineDiffs - (conflictResolutions_Fine.size() + TP_Semantic_Manual))
					    				+ "," + (conflictResolutions_Fine.size() + TP_Semantic_Manual);
					    		log_PR_CRV_Content += "\n";

					    		logProjectFileContent += "\n";
							    System.out.println("\nSuccees : Precision Recall and Other Report For the First Evacuation -" + commitId);			 
							}
					    	else {		
					    		CR_Semantic = conflictResolutions_Semantic.size();
								TP_Semantic_Auto = 
									CR_Semantic //conflictResolutions_And_elements_LinkedToIt
									- CRsNotContainsContraDiffs_Semantic.size()
									+ CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
					    		//----------------------------------------------------------------	
								FN = 0;
								TP_Fine = conflictResolutions_Fine.size() ;
								TP = TP_Semantic_Auto + TP_Fine - CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
								
								TP_Semantic_Manual = CRContraDiffs_Semantic_Manual.size();

					    		logProjectFileContent += "Commit Id: " + commitId + "		TP = " + TP +"	(TP_Semantic = " + TP_Semantic_Auto  + " , TP_Semantic_Manual = " + TP_Semantic_Manual  + " , TP_Fine = " + TP_Fine +   "), FP = " + FP + ", TN = " + TN + ", FN = " + FN 
					    				+ "		-CR_Semantic	=	" + CR_Semantic 
					    				+ "		-CR_Fine	=	" + conflictResolutions_Fine.size() 
					    				+ "		-SemDiff_Merge:	NIL" //+ semanticDiffs__DsmiffGitMergedManualModel.size()
					    				+ "		-MissByRefConMiner = " +MissByRefConMiner
					    				+ "		-SemDiff_Diff012:	" + semanticDiffs_And_elements_LinkedToIt__DsmDiffModel.size()
					    				+ "		-Succees"
							    		+ "		-Not-Contains: " + printableCR(CRsNotContainsContraDiffs_Semantic, CRsNotContainsContraDiffsDeleteDelete_Semantic);
							    

					    		logProjectFileContent += "\n";
					    		System.out.println("\nPrecision Recall and Other Report For the First Evacuation - " + commitId + " -diffGitMergedManualModelPaths.count() = 0");			    		
					    	}							   		
				    	}
			    	}
			    	catch(java.nio.file.NoSuchFileException ex1){
			    		CR_Semantic = conflictResolutions_Semantic.size();
						TP_Semantic_Auto = 
							CR_Semantic //conflictResolutions_And_elements_LinkedToIt
							- CRsNotContainsContraDiffs_Semantic.size()
							+ CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
			    		//----------------------------------------------------------------	
						FN = 0;
						TP_Fine = conflictResolutions_Fine.size() ;
						TP = TP_Semantic_Auto + TP_Fine - CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
						
						TP_Semantic_Manual = CRContraDiffs_Semantic_Manual.size();

			    		logProjectFileContent += "Commit Id: " + commitId + "		TP = " + TP +"	(TP_Semantic = " + TP_Semantic_Auto  + " , TP_Semantic_Manual = " + TP_Semantic_Manual  + " , TP_Fine = " + TP_Fine +   "), FP = " + FP + ", TN = " + TN + ", FN = " + FN 
			    				+ "		-CR_Semantic	=	" + CR_Semantic 
			    				+ "		-CR_Fine	=	" + conflictResolutions_Fine.size() 
			    				+ "		-SemDiff_Merge:	NIL" //+ semanticDiffs__DsmiffGitMergedManualModel.size()
			    				+ "		-MissByRefConMiner = " +MissByRefConMiner
			    				+ "		-SemDiff_Diff012:	" + semanticDiffs_And_elements_LinkedToIt__DsmDiffModel.size()
			    				+ "		-No Git File"
							    + "		-Not-Contains: " + printableCR(CRsNotContainsContraDiffs_Semantic, CRsNotContainsContraDiffsDeleteDelete_Semantic);
			    		
			    		logProjectFileContent += "\n";			    		
			    		System.out.println("\nPrecision Recall and Other Report For the First Evacuation - " + commitId + " -NoSuchFileException (Git is not generated): "+ ex1.getLocalizedMessage());
			    	}			    	
			    	catch(Exception ex) {
			    		CR_Semantic = conflictResolutions_Semantic.size();
						TP_Semantic_Auto = 
							CR_Semantic //conflictResolutions_And_elements_LinkedToIt
							- CRsNotContainsContraDiffs_Semantic.size()
							+ CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
			    		//----------------------------------------------------------------
						FN = 0;
						TP_Fine = conflictResolutions_Fine.size() ;
						TP = TP_Semantic_Auto + TP_Fine - CRsNotContainsContraDiffsDeleteDelete_Semantic.size();
						TP_Semantic_Manual = CRContraDiffs_Semantic_Manual.size();
						
			    		logProjectFileContent += "Commit Id: " + commitId + "		TP = " + TP +"	(TP_Semantic = " + TP_Semantic_Auto  + " , TP_Semantic_Manual = " + TP_Semantic_Manual  + " , TP_Fine = " + TP_Fine +   "), FP = " + FP + ", TN = " + TN + ", FN = " + FN + "		-	Exception"
					    		+ "		-Not-Contains: " + printableCR(CRsNotContainsContraDiffs_Semantic, CRsNotContainsContraDiffsDeleteDelete_Semantic);
			    		
			    		logProjectFileContent += "\n";
			    		System.out.println("\nPrecision Recall and Other Report For the First Evacuation - " + commitId + " -Exception: "+ ex.getLocalizedMessage());
			    	}	
			    }			    
			    String logProjectFilePath = diffModelsDir+ dblSlash + "log_PR_"+projectName+".txt";
			    File logPerProjectFile=new File(logProjectFilePath);
				Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				
				
			} catch (IOException e) {
				System.out.println(" ----> Exception in Project: " + projectName);	
				e.printStackTrace();
				logProjectFileContent += "\n"+e.getMessage();
				//Log
				String logProjectFilePath = diffModelsDir+ dblSlash + "log_PR_"+projectName+".txt";
			    File logPerProjectFile=new File(logProjectFilePath);
				try {
					Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}			
		}		
		
		try {//log_PR_CRV_Content
			String log_PR_CRV_ContentFilePath = caseStudies_DiffModels_Dir+ dblSlash + "log_PR.csv";
		    File log_PR_CRV_ContentFile=new File(log_PR_CRV_ContentFilePath);
			Files.write(log_PR_CRV_ContentFile.toPath(), log_PR_CRV_Content.getBytes(charset));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String printableCR(Set<EObject> notContains,Set<EObject> notContainsDeleteDelete) {
		try {
			notContainsDeleteDelete.clear();
			notContainsDeleteDelete.addAll(
			notContains.stream().filter(f->
			(DsmcHelpers.getAttrValueByAttrNameNullDefault(
					(((ArrayList<EObject>) DsmcHelpers.getERefTargetByERefName(f, "semanticconflicts")).get(0)), "name")).toString().replace(" ","").toUpperCase().contains("DELETE|DELETE")).collect(Collectors.toList()));
		}catch(Exception ex) {
			
		}
		String pCR = "";
		int i=0;
		for(EObject cr:notContains) {
			if(!notContainsDeleteDelete.contains(cr)) {
				++i;
				pCR += String.format("	[#%s]: ",i) + DsmcHelpers.getAttrValueByAttrNameNullDefault(cr, "name");
				EObject c = ((ArrayList<EObject>) DsmcHelpers.getERefTargetByERefName(cr, "semanticconflicts")).get(0);
				pCR+= " ==> " + DsmcHelpers.getAttrValueByAttrNameNullDefault(c, "name");
			}
		}
		return pCR;
	}

	//==================================================================
	/*	
	//Step Six: Create Diff012 And initial V012 For All Cases
	//@Test
	public void stepDSMDiff_CA_ref__gitMerged_ref__manualMerged_ref() {		
		String domainDirName 	= "Refactoring";		
		String caPostfix 		= "_CA_ref";
		String v1Postfix 		= "_gitMerged_ref";
		String v2Postfix 		= "_manualMerged_ref";
				
		CreateDiff012AndInitialV012ForAllCases(domainDirName, caPostfix, v1Postfix, v2Postfix);
	}
	
	
	//Step Six: DSMDiff _CA_ref _V012_2 _manualMerged_ref
	//DSMDiffs ===========================================================
	//@Test
	public void stepDSMDiff_CA_ref__V012_2__manualMerged_ref() {		
		String domainDirName 	= "Refactoring";		
		String caPostfix 		= "_CA_ref";
		String v1Postfix 		= "_V012_2";
		String v2Postfix 		= "_manualMerged_ref";
				
		CreateDiff012AndInitialV012ForAllCases(domainDirName, caPostfix, v1Postfix, v2Postfix);
	}	
	
	//-----------------------
	//@Test
	public void stepDSMDiff_V012__manualMerged_ref() {		
		String domainDirName 	= "Refactoring";		
		String caPostfix 		= "_CA_ref";
		String v1Postfix 		= "_V012";
		String v2Postfix 		= "_manualMerged_ref";
				
		CreateDiff012AndInitialV012ForAllCases(domainDirName, caPostfix, v1Postfix, v2Postfix);
	}*/
	//==================================================================

			
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//-------------------------------- Henshin CR-Rules , DSMDiff - seperated authors
	//@Test
	public void  callTransformCRRulesToHenshin() {
		stepTransformCRRulesToHenshin();
	}
	
	//---------------------------------------------------
	//@Test
	public void  callGenerateHenshinLeftRightSeparated() {
		stepGenerateHenshin_SeperatedAuthors();
	}
	
	
	//=======================================================================================

	public void CreateDiff012AndInitialV012ForAllCases(
			String domainDirName, String caPostfix, 
			String v1Postfix, String v2Postfix, String v2PostfixOther, boolean createV012) 
	{
		System.out.println("Start of Creating all DsDiff Models for evaluation!");
		String xmiExtention = ".xmi";
		String txtExtention = ".txt";
		String diffModelsDirName 	= "diffModels" + caPostfix + "__" + v1Postfix + "__" + v2Postfix;
		String dsmDiffPostfix 		="__dsmDiff" + caPostfix + "__" + v1Postfix + "__" + v2Postfix;
		String resultFilePostfix 	= "__emfCompareResult" + caPostfix + "__" + v1Postfix + "__" + v2Postfix;
		String logFilePrefix 		= "log__" + caPostfix + "__" + v1Postfix + "__" + v2Postfix + "__";
		
		boolean removeAllFineSemanticConflicts = true;
		//emfCompareResultToFineGranularDsmdiffMM(true); //call over CA, Va, and V2 and create DSMDiff.xmi		
		initializeCaseStudy();
		dsmc.setDsdRulePackages(sdRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
				 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);	
		////	String domainDirName 		= "Refactoring";
		////	String diffModelsDirName 	= "diffModels";
		
		//ArrayList<String> kdmFoldersToSkip = new ArrayList<String>();
		//kdmFoldersToSkip.add("realm-java");
		//kdmFoldersToSkip.add("_realm-java");

		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + domainDirName;////"Refactoring";
		String[] projDirectories =  getAllSubDirectories(caseStudiesMergeRefDir); //{"android"}; //

		 /*String[] projDirectories = { "android", "closure-compiler", "error-prone",
		 	"jabref", "junit4", "mamute", "mcMMO", "POSA-14", "querydsl", 
		 	"realm-java", "redpen", "storm", "syncany", "titan"};*/		
		
    	Charset charset = StandardCharsets.UTF_8;
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			System.out.println("\nProject Name:" + projectName);
			String targetRefDirInCaseStudy = caseStudiesMergeDir + dblSlash + domainDirName + dblSlash + projectName;
			String diffModelsDir = caseStudiesMergeDir + dblSlash + diffModelsDirName + dblSlash + projectName;
			String logProjectFileContent = "\nProject Name:" + projectName +"\n\n\n";
		    
			try {
				File diffModelsDirFile = new File(diffModelsDir);
			    if (!diffModelsDirFile.exists()){
			    	diffModelsDirFile.mkdirs();
			    }		    
			    FileUtils.cleanDirectory(diffModelsDirFile); 	
				
				Stream<Path> refVersionPaths = Files.walk(Paths.get(targetRefDirInCaseStudy));
				final String v2PostfixFinal = v2Postfix;
			    List<Path> refPathList = 
			    		refVersionPaths.filter(var -> 
			    			var.toString().endsWith(caPostfix + xmiExtention) 
			    			|| var.toString().endsWith(v1Postfix + xmiExtention)
			    			|| var.toString().endsWith(v2PostfixFinal + xmiExtention)
			    			|| var.toString().endsWith(v2PostfixOther + xmiExtention)
	    				).collect(Collectors.toList());
			    
			    List<Path> refPathList_CA = refPathList.stream().filter(p->p.getFileName().toString().contains(caPostfix + xmiExtention)).collect(Collectors.toList());
			    
			    
			    for(Path caP:refPathList_CA) {
			    	try {
			    		boolean v2PostfixOtherUsed = false;
			    		File fV2 = new File(caP.toString().replace(caPostfix + xmiExtention,v2Postfix + xmiExtention));
			    		File fV2Other = new File(caP.toString().replace(caPostfix + xmiExtention,v2PostfixOther + xmiExtention));
				    	if(!fV2.exists() && fV2Other.exists()) { // && !f.isDirectory()
				    		v2Postfix = v2PostfixOther;
				    		v2PostfixOtherUsed = true;
				    	}
			    		
				    	String vCAPath = caP.toString();
				    	String v1 = vCAPath.replace(caPostfix + xmiExtention,v1Postfix + xmiExtention);
				    	String v2 = vCAPath.replace(caPostfix + xmiExtention,v2Postfix + xmiExtention);
				    	
				    	String vLeftPath  = refPathList.stream().filter(f->f.toString().equals(v1)).count()>0 ? v1 : "";
				    	String vRightPath = refPathList.stream().filter(f->f.toString().equals(v2)).count()>0 ? v2 : "";
				    	if(vCAPath != "" && vLeftPath != "" && vRightPath != "") {		
				    		String dsmDiffFileName = caP.getFileName().toString().replace(caPostfix, dsmDiffPostfix);
							String dsmDiffPath	= diffModelsDir + dblSlash + dsmDiffFileName;
							String resultFilePath	= diffModelsDir + dblSlash + caP.getFileName().toString().replace(caPostfix + xmiExtention, resultFilePostfix + txtExtention);						
							
							Resource rsourceDSMDiff = dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(vCAPath, vLeftPath, vRightPath, dsmDiffPath, resultFilePath, createV012);	
							
							if(rsourceDSMDiff != null) {
								logProjectFileContent +="\n" + "+ Successfull	: " + dsmDiffFileName;
								if(v2PostfixOtherUsed) {
									logProjectFileContent +="\n" + "+ v2PostfixOther is used: " + v2PostfixOther;
								}
							}else {
								logProjectFileContent +="\n" + "- Failed		: " + dsmDiffFileName;								
							}
												
							
						    System.out.println("\n" + "v2PostfixOther is used: " + v2PostfixOther);		    		
						    System.out.println("DsDiff Models created for: " + caP.getFileName().toString().replace(caPostfix + xmiExtention, ""));			    		
				    	}
				    	else {
				    		System.out.println("\nCreate all DsDiff Models. ca != \"\" && v1 != \"\" && v2 != \"\", condittion not satisfied! " + caP.getFileName().toString().replace(caPostfix + xmiExtention, "") );
				    	}
			    	}catch(Exception ex) {
			    		System.out.println("\nCreate all DsDiff Models. Exception: " + ex.getLocalizedMessage() + "\n" + caP.getFileName().toString().replace(caPostfix + xmiExtention, "") );
			    	}			    	
			    }
			    //Log
			    String logProjectFilePath = diffModelsDir+ dblSlash + logFilePrefix+projectName+txtExtention;
			    File logPerProjectFile=new File(logProjectFilePath);
				Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				
			} catch (IOException e) {
				System.out.println("Exception in Project: " + projectName);	
				e.printStackTrace();
				logProjectFileContent += "\n"+e.getMessage();
				//Log
				String logProjectFilePath = diffModelsDir+ dblSlash + logFilePrefix+projectName+txtExtention;
			    File logPerProjectFile=new File(logProjectFilePath);
				try {
					Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}	
		}
		System.out.println("\nEnd of Creating all DsDiff Models for evaluation!");
	}
	
	//---------------------------------
	
	public void stepTransformCRRulesToHenshin(){		
		transformCRRuleToHenshin.dsmName = caseStudyName;
		transformCRRuleToHenshin.dsmCasePath =  henshinUrlPath;
		transformCRRuleToHenshin.dsmCaseRulesFolderName = crRulesFolder + slash;
		transformCRRuleToHenshin.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		loadCrRulePathList();
		if(crRuleFileNameList.size() > 0) {
			transformCRRuleToHenshin.dsmCaseRuleFileNames = crRuleFileNameList;
			transformCRRuleToHenshin.ruleMM_eNSURI =  RefactoringCRRuleMMPackage.eINSTANCE.eNS_URI;
			transformCRRuleToHenshin.ruleMM_eIN = RefactoringCRRuleMMPackage.eINSTANCE;
			//transformCRRuleToHenshin.resourceSetPackage = DsmcHelpers.getResourceSet(RefactoringCRRuleMMPackage.eINSTANCE, p);
			transformCRRuleToHenshin.useWhileLoop = true;
			transformCRRuleToHenshin.run(false);
			System.out.println("Done! (Transforming CRRules To Henshin)");
		}
		else {
			System.out.println("Couldn't find any rule! (Transforming CRRules To Henshin)");
		}
	}
	
	//----------------------------------------
	
	public void loadCrRulePathList() {
		crRuleFileNameList = new ArrayList<String>();
		List<Path> crRulePathList;
		Stream<Path> crRulePaths;
		try {
			crRulePaths = Files.walk(Paths.get(crRulesPath));
		    crRulePathList = crRulePaths.filter(var -> var.toString().endsWith(".xmi")).collect(Collectors.toList());
		    for(Path crRulePath:crRulePathList) {
		    	crRuleFileNameList.add(crRulePath.getFileName().toString());
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			ArrayList<String> sdRulesOrdered = getRulesByOrder();
			if(sdRulesOrdered.size()>0)
				dsmcRulesToHenshinTextCPANew.dsmCaseRuleFileNames = sdRulesOrdered;
			else
				dsmcRulesToHenshinTextCPANew.dsmCaseRuleFileNames = sdRuleFiles;	
			dsmcRulesToHenshinTextCPANew.ruleMM_eNSURI = ruleMM2Way_eNSURI;
			dsmcRulesToHenshinTextCPANew.ruleMM_eIN = ruleMM2Way_eIN;
			dsmcRulesToHenshinTextCPANew.runForCPA();
			System.out.println("Done! (Transforming dsmcRules To HenshinText For CPA)");
		}catch(Exception ex) {
			System.out.println("Error:" + ex.toString());
		}
	}
		
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
			find_Potential_Semantic_AttributeChangeConflicts();
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
			find_Potential_SemanticSemantic_SemanticFineConflicts();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	
	
	//------------------------------------------------------------------>>
	//@Test
	public void orderSDRulesUsingMultiCDA() {
		try {
			orderRulesUsingMultiCDA();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

	//------------------------------------------------------------------>>
	//@Test
	public void setRuleOrders() {
		try {			
			Map<String,Integer> rulePriorityMap = new HashMap<String,Integer>();
			Map<String,Integer> rulePriorityAltsMap = new HashMap<String,Integer>();
			
			String dsmCaseHenshinRulesFolderName = wsPath + dblSlash + caseStudyRootFolder + dblSlash + 
					caseStudyName + dblSlash + henshinRulesFolder + dblSlash + "_RoleOrderByPythonUnique.txt";
			File myObj = new File(dsmCaseHenshinRulesFolderName);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				//dsmcRuleFiles
				String data = myReader.nextLine();
				String ruleName = data.split("\\s+")[0]+".xmi";
				Integer priority = Integer.parseInt(data.split("\\s+")[1]);
				rulePriorityMap.put(ruleName, priority);
			}
			
			for (java.util.Map.Entry<String, Integer> es:rulePriorityMap.entrySet()) {
				String ruleName = es.getKey(); 
				Integer priority = es.getValue();
				List<String> alternativeRules = sdRuleFiles.stream().filter(f->!f.equals(ruleName) && f.toLowerCase().startsWith(ruleName.toLowerCase().split("\\.")[0])).collect(Collectors.toList());
				for(String alternativeRule:alternativeRules) {
					if(rulePriorityMap.get(alternativeRule) != null)
						System.out.println("Duplicate : " + alternativeRule + " - " + ruleName);
					else 
						rulePriorityAltsMap.put(alternativeRule, priority);
				}				
			}
			
			for (java.util.Map.Entry<String, Integer> es:rulePriorityAltsMap.entrySet()) {
				rulePriorityMap.put(es.getKey(), es.getValue());
			}
			
			System.out.println("Size : " + rulePriorityMap.size() + " - " + sdRuleFiles.size());
			
			//TreeMap<String, Integer> rulePrioritySorted = new TreeMap<String, Integer>(rulePriority);//Sorted by Keys - rulename
			Stream<Map.Entry<String, Integer>> rulePrioritySortedMap =									////Sorted by values - Priority
					rulePriorityMap.entrySet().stream()
				       .sorted(Map.Entry.comparingByValue());//sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

			
			myReader.close();	
			
			StringBuilder textRuleOrderFull = new StringBuilder();
			rulePrioritySortedMap.forEach(es->{
				textRuleOrderFull.append(String.format("%s,%s\n",es.getKey(), es.getValue()));
				System.out.println(es.getKey() + ","+es.getValue());
			});
			

			String _RoleOrderFullPath = wsPath + dblSlash + caseStudyRootFolder + dblSlash + 
					caseStudyName + dblSlash + henshinRulesFolder + dblSlash + "_RoleOrderFull.txt";
			 writeTextToFile(textRuleOrderFull.toString(),_RoleOrderFullPath);
			
		} catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }

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
		
	
	
	
	//*******************************************************************
	

	
	
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

	//**************** Henshin Rules ****************
	
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
	public void step008() {
		dsmDiffRulesToHenshinTextPostRulesRun();
	}

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
	
	
	

/* Used Above
	//------------------------------------------------------------------>>
	//------------------------------------------------------------------>>
	//Find potential conflicts among Semantic/Fine Attribute change Rules
	//Kept only change rules, otherwise it takes a long time to 
	//Use CPA, as Multi-CDA cannot fine attribute changes
	//produce the conflict results
	//@Test
	public void step0013() {
		try {//Static conflicts
			findSemantic_AttributeChangeConflicts();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
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
*/

	//**************** Prepare refactoring model version out of conflicting commits ****************
	//Create java projects out of conflicting commits
	//**********************************************************************************************

	// Create Abstract projects out of three versions of each conflicting of each projects
	// Abstract projects : only having java files moved to a single pkg package 
	//1//@Test	
	public void step0001() throws IOException
	{
		versionsPostfix= new String[][] {{"gitMerged","gitMerged"},{"manualMerged","manualMerged"}};//{"base","CA"},{"ours","V1"},{"theirs","V2"},		
		//String targetProjectRoot="D:\\ecliseTest";	
		dataDir = "D:\\_udemSVN\\DSMCompare-Project\\srcCode\\MergeScenarioMiner\\coding\\data"; //needs to be replaced		
		refConflictsRootDir 	= dataDir + dblSlash + "ref_conflicts";
		refConflictsAbsRootDir	= dataDir + dblSlash + "ref_conflicts_abs";
		
		
		//Get java project name
		String[] projDirectories = getAllSubDirectories(refConflictsRootDir);//{"android"};//
		for(String projectName:projDirectories) 
		{	
			//if(excludingList.contains(projectName))
			//	continue;
			System.out.println("\nStart abstracting Project:" + projectName);
			//Create java projects out of conflicting commits
			String srcProjectDirectory = refConflictsRootDir + dblSlash + projectName + dblSlash;
			String targetProjectDir = refConflictsAbsRootDir + dblSlash + projectName;
			String[] directories = getAllSubDirectories(srcProjectDirectory);			
			for(String commitId:directories ) {
				String targetProjectPath = targetProjectDir + dblSlash + commitId;
				for(String[] version:versionsPostfix ) {
					String projectId = commitId + version;
					String srcCommitVersionPath = srcProjectDirectory + commitId + dblSlash + version[0]+ dblSlash;
					//pull only java paths
					Stream<Path> srcPaths = null;
					try {
						srcPaths = Files.walk(Paths.get(srcCommitVersionPath));
					}catch(Exception ex) {
						System.out.printf("\n%s Couldn't find the path!", srcCommitVersionPath);
						break;
					}
				    //System.out.println("List of Java files:");
				    List<Path> srcPathList = srcPaths.filter(var -> var.toString().endsWith(".java")).collect(Collectors.toList());
				    if(srcPathList.size()==0) {
				    	System.out.printf("\n%s Project does not contain any java file!", projectName);
				    	continue;
				    }
				    
				    srcPathList.forEach(System.out::println);    
				    
				    //read each file and change the line containing package ... to ---> package pkg;
					Charset charset = StandardCharsets.UTF_8;
					for(Path srcPath:srcPathList) {
						String javaFileContent = new String(Files.readAllBytes(srcPath), charset);
						
						String packageDef = "";
						String rx = ".*package.*;";
						Pattern p = Pattern.compile(rx);
						Matcher matcher = p.matcher(javaFileContent);
						if (matcher.find()){
							packageDef = matcher.group();
						}	
						
						packageDef = packageDef.replace(";", "");
						
						packageDef = 
								packageDef.replace("package ", "\n	final String __packageName = " + '"')+'"' +";\n";
						
						javaFileContent = javaFileContent.replaceFirst(".*package.*;", "package pkg;");
						ArrayList<String> classDefs = new ArrayList<String>();
						
						rx = "class(.*?)[\\r\\n]\\{|class(.*?)\\{";
						p = Pattern.compile(rx);
						matcher = p.matcher(javaFileContent);
						while (matcher.find()){
							String classDef = matcher.group();						
							classDefs.add(classDef);
						}
						
						for(String classDef:classDefs) {
							javaFileContent = javaFileContent.replace(classDef,classDef+ "\n" + packageDef );
						}					
						
						//javaFileContent = javaFileContent.replaceAll("class(.*?)\\{", "{\n" + oldPackageName );
						
						
						String targetDirectoryName = targetProjectPath + "_" + version[1] + dblSlash + "src" + dblSlash + "pkg" + dblSlash;
						String targetProjectPathVersion = targetDirectoryName + srcPath.getFileName();
						//PrintWriter out = new PrintWriter(projectPathVersion);				
						
					    File targetDirectory = new File(targetDirectoryName);
					    if (!targetDirectory.exists()){
					        targetDirectory.mkdirs();
					        // If you require it to make the entire directory path including parents,
					        // use directory.mkdirs(); here instead.
					    }
		
					    File targetFile = new File(targetProjectPathVersion);//directoryName + "/" + fileName);
					    try{
					        FileWriter fw = new FileWriter(targetFile.getAbsoluteFile());
					        BufferedWriter bw = new BufferedWriter(fw);
					        bw.write(javaFileContent);
					        bw.close();
					    }
					    catch (IOException e){
					        e.printStackTrace();
					        System.exit(-1);
					    }			
					}
				}
			}

			System.out.println("\nEnd abstracting Project:" + projectName);
		}
		
		
	}

	//Create kdm files out of the conflicting commit java projects
	//@Test
	public void step0002(){
		//Manual, load created folder as project Modisco/Discovery	    
	}
	
	//Copy all the kdm files to the KDM folder of the project
	//@Test
	public void step0003() throws IOException {
		System.out.println("Start of Copy all the kdm files to the KDM folder of this case study!");
		//ArrayList<String> kdmFoldersToSkip = new ArrayList<String>();
		//kdmFoldersToSkip.add("realm-java");
		//kdmFoldersToSkip.add("realm");
		//Get java project name
		//String[] kdmVersionsPostfix= new String[] {"_gitMerged_kdm.xmi","_manualMerged_kdm.xmi"};//{"kdm.xmi"} is enough
		//String targetProjectRoot="D:\\ecliseTest";	
		dataDir = "D:\\_udemSVN\\DSMCompare-Project\\srcCode\\MergeScenarioMiner\\coding\\data"; //needs to be replaced		
		refConflictsAbsRootDir	= dataDir + dblSlash + "ref_conflicts_abs";
				
		
		String[] projDirectories = getAllSubDirectories(refConflictsAbsRootDir);
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			
			System.out.println("\nProject Name:" + projectName);			
			//if(kdmFoldersToSkip.contains(projectName)) {
			//	System.out.printf("\nS%s project is skipped!", projectName);
			//	continue;
			//}
			
			String kdmProjectDir = refConflictsAbsRootDir + dblSlash + projectName;
			Stream<Path> srcPaths = Files.walk(Paths.get(kdmProjectDir));
		    //System.out.println("List of Java files:");
		    List<Path> srcPathList = srcPaths.filter(var -> var.toString().endsWith("kdm.xmi")).collect(Collectors.toList()); //var -> var.toString().endsWith(kdmVersionsPostfix[0]) || var.toString().endsWith(kdmVersionsPostfix[1])
		    System.out.printf("%s KDM files ", srcPathList.size());	
			String targetKdmDirInCaseStudy = wsPath + "\\caseStudiesMerge\\KDM" + dblSlash + projectName;
			//String targetRefDirInCaseStudy = 
			//		wsPath + "\\caseStudiesMerge\\Refactoring" + dblSlash + projectName;
		    
		    File targetKdmDirInCaseStudyFile = new File(targetKdmDirInCaseStudy);
		    if (!targetKdmDirInCaseStudyFile.exists()){
		    	targetKdmDirInCaseStudyFile.mkdirs();
		    }		    
		    //FileUtils.cleanDirectory(targetKdmDirInCaseStudyFile); 
		    
		    for(Path srcPath:srcPathList) {
		    	String des = targetKdmDirInCaseStudy + dblSlash + srcPath.getFileName();
		    	Path desPath = Paths.get(des);
		    	Files.copy(srcPath, desPath, StandardCopyOption.REPLACE_EXISTING);
		    }		    
		    System.out.println("copied to: " + targetKdmDirInCaseStudy);
		}

		System.out.println("\nEnd of Copy all the kdm files to the KDM folder of this case study!");
	    
	}
	
	//Transform all the kdm files to the refactoring models
	//@Test
	public void step0004() throws IOException {
		System.out.println("Start of Transformin all the kdm files to the refactoring models!");
		String[] kdmVersionsPostfix= new String[] {"_gitMerged_kdm.xmi","_manualMerged_kdm.xmi"};//{"kdm.xmi"} is enough
		
		//ArrayList<String> kdmFoldersToSkip = new ArrayList<String>();
		//kdmFoldersToSkip.add("realm-java");
		//kdmFoldersToSkip.add("realm");
		//Get java project name
		String  caseStudiesMergeKdmDir = caseStudiesMergeDir + dblSlash + "KDM";
		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + "Refactoring";
		String[] projDirectories = getAllSubDirectories(caseStudiesMergeKdmDir);// {"mcMMO"};//
		
		
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			
			System.out.println("\nProject Name:" + projectName);			
			//if(kdmFoldersToSkip.contains(projectName)) {
			//	System.out.printf("\n%s project is skipped!\n", projectName);
			//	continue;
			//}			
			//String targetProjectDir = refConflictsAbsRootDir + dblSlash + projectName;	
			String targetKdmDirInCaseStudy = caseStudiesMergeKdmDir + dblSlash + projectName;
			String targetRefDirInCaseStudy = caseStudiesMergeRefDir + dblSlash + projectName;	
			
			//TransformCodeToModel transformCodeToModel= new TransformCodeToModel();
			Stream<Path> srcPaths = Files.walk(Paths.get(targetKdmDirInCaseStudy));
		    List<Path> srcPathList = srcPaths.filter(var -> var.toString().endsWith(kdmVersionsPostfix[0]) || var.toString().endsWith(kdmVersionsPostfix[1])).collect(Collectors.toList());
		    //
		    //var -> var.toString().endsWith("kdm.xmi")
	
		    File targetRefDirInCaseStudyFile = new File(targetRefDirInCaseStudy);
		    if (!targetRefDirInCaseStudyFile.exists()){
		    	targetRefDirInCaseStudyFile.mkdirs();
		    }	
		    //FileUtils.cleanDirectory(targetRefDirInCaseStudyFile); 	    
		    
	    	TransformCodeToModel transformCodeToModel= new TransformCodeToModel();
		    for(Path srcPath:srcPathList) {
		    	String des = targetRefDirInCaseStudy + dblSlash + srcPath.getFileName().toString().replace("kdm","ref");
		    	transformCodeToModel.kdmToRefactoringModel(srcPath, des);
		    	System.out.println("Generated:" + des);
		    }
		    
		    System.out.println("KDM models transformed to the refactoring model: " + targetRefDirInCaseStudy);		
		}
		System.out.println("\nEnd of Transformin all the kdm files to the refactoring models!");
	}

	//Create all DsDiff Models for evaluation
	//@Test//1
	public void step0005() throws IOException {
		System.out.println("Start of Creating all DsDiff Models for evaluation!");
		boolean removeAllFineSemanticConflicts = true;
		//emfCompareResultToFineGranularDsmdiffMM(true); //call over CA, Va, and V2 and create DSMDiff.xmi		
		initializeCaseStudy();
		dsmc.setDsdRulePackages(sdRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
				 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);	
		String domainDirName 		= "Refactoring";
		String diffModelsDirName 	= "diffModels";
		
		//ArrayList<String> kdmFoldersToSkip = new ArrayList<String>();
		//kdmFoldersToSkip.add("realm-java");
		//kdmFoldersToSkip.add("_realm-java");

		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + "Refactoring";
		String[] projDirectories = {"jabref"};//getAllSubDirectories(caseStudiesMergeRefDir); //

		
		
    	Charset charset = StandardCharsets.UTF_8;
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			System.out.println("\nProject Name:" + projectName);
			String targetRefDirInCaseStudy = caseStudiesMergeDir + dblSlash + domainDirName + dblSlash + projectName;
			String diffModelsDir = caseStudiesMergeDir + dblSlash + diffModelsDirName + dblSlash + projectName;
			String logProjectFileContent = "\nProject Name:" + projectName +"\n\n\n";
			//if(!kdmFoldersToSkip.contains(projectName)) {
			//	System.out.printf("\n%s project is skipped!\n", projectName);
			//	continue;
			//}			    
		    
			try {				
				
				
				File diffModelsDirFile = new File(diffModelsDir);
			    if (!diffModelsDirFile.exists()){
			    	diffModelsDirFile.mkdirs();
			    }		    
			    FileUtils.cleanDirectory(diffModelsDirFile); 	
				
				Stream<Path> refVersionPaths = Files.walk(Paths.get(targetRefDirInCaseStudy));
			    List<Path> refPathList = refVersionPaths.filter(var -> var.toString().endsWith("ref.xmi")).collect(Collectors.toList());
			    List<Path> refPathList_CA = refPathList.stream().filter(p->p.getFileName().toString().contains("_CA_ref.xmi")).collect(Collectors.toList());
			    
			    
			    for(Path caP:refPathList_CA) {
			    	try {
				    	String vCAPath = caP.toString();
				    	String v1 = vCAPath.replace("_CA_ref.xmi","_V1_ref.xmi");
				    	String v2 = vCAPath.replace("_CA_ref.xmi","_V2_ref.xmi");
				    	String vLeftPath  = refPathList.stream().filter(f->f.toString().equals(v1)).count()>0 ? v1 : "";
				    	String vRightPath = refPathList.stream().filter(f->f.toString().equals(v2)).count()>0 ? v2 : "";
				    	if(vCAPath != "" && vLeftPath != "" && vRightPath != "") {		
				    		String dsmDiffFileName = caP.getFileName().toString().replace("_CA_ref", "_dsmDiff");
							String dsmDiffPath	= diffModelsDir + dblSlash + dsmDiffFileName;
							String resultFilePath	= diffModelsDir + dblSlash + caP.getFileName().toString().replace("_CA_ref.xmi", "_emfCompareResult.txt");						
							
							Resource rsourceDSMDiff = dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(vCAPath, vLeftPath, vRightPath, dsmDiffPath, resultFilePath, true);	
							
							if(rsourceDSMDiff != null) {
								logProjectFileContent +="\n" + "+ Successfull	: " + dsmDiffFileName;
							}else {
								logProjectFileContent +="\n" + "- Failed		: " + dsmDiffFileName;								
							}
							
							
							if(removeAllFineSemanticConflicts == true && rsourceDSMDiff != null) {
								Map<String, Object> saveOptions = new HashMap<String, Object>();
								//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
								org.eclipse.emf.ecore.EObject rootDSDiff = rsourceDSMDiff.getContents().get(0);	
								org.eclipse.emf.ecore.EPackage ePackage = rootDSDiff.eClass().getEPackage();
								EFactory	DiffMM_Factory				= ePackage.getEFactoryInstance();
								String   	conflictClassName 			= "SemanticConflict";						
								org.eclipse.emf.ecore.EClassifier conflictClassEClassifier	
																		= ePackage.getEClassifier(conflictClassName);	
								org.eclipse.emf.ecore.EClass		conflictClass				
																		= (org.eclipse.emf.ecore.EClass)conflictClassEClassifier;	
								String		refSemanticconflictsName	= "semanticconflicts";
								org.eclipse.emf.ecore.EReference  refSemanticconflicts		
																		= DsmcHelpers.getEReferenceByNameNullDefault(rootDSDiff,refSemanticconflictsName);		
								EList<org.eclipse.emf.ecore.EObject> semanticConflicts		
																		= (EList<org.eclipse.emf.ecore.EObject>) rootDSDiff.eGet(refSemanticconflicts);
								EcoreUtil.removeAll(semanticConflicts);	
								rsourceDSMDiff.save(saveOptions);
							}
							
						    System.out.println("DsDiff Models created for: " + caP.getFileName().toString().replace("_CA_ref.xmi", ""));			    		
				    	}
				    	else {
				    		System.out.println("\nCreate all DsDiff Models. ca != \"\" && v1 != \"\" && v2 != \"\", condittion not satisfied! " + caP.getFileName().toString().replace("_CA_ref.xmi", "") );
				    	}
			    	}catch(Exception ex) {
			    		System.out.println("\nCreate all DsDiff Models. Exception: " + ex.getLocalizedMessage() + "\n" + caP.getFileName().toString().replace("_CA_ref.xmi", "") );
			    	}			    	
			    }
			    //Log
			    String logProjectFilePath = diffModelsDir+ dblSlash + "log_"+projectName+".txt";
			    File logPerProjectFile=new File(logProjectFilePath);
				Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
				
			} catch (IOException e) {
				System.out.println("Exception in Project: " + projectName);	
				e.printStackTrace();
				logProjectFileContent += "\n"+e.getMessage();
				//Log
				String logProjectFilePath = diffModelsDir+ dblSlash + "log_"+projectName+".txt";
			    File logPerProjectFile=new File(logProjectFilePath);
				Files.write(logPerProjectFile.toPath(), logProjectFileContent.getBytes(charset));
			}	
		}
		System.out.println("\nEnd of Creating all DsDiff Models for evaluation!");
	}
	
		
	//Didn't work, Have to do it manually
	//Call Henshin transformation automatically on all evaluation diff models and find semantic diffs
	//@Test
	
	//Didn't work, Have to do it manually
	//Call Henshin transformation automatically on all evaluation diff models and find semantic diffs
	//@Test
	public void step0006() throws IOException {
		String wsPath = System.getProperty("user.dir").replace("/", "\\"); 
		//boolean saveResult = true;
		String modelDirectoryPath = wsPath+ "\\casesMergeConflict\\refactoring\\diffModels"  ;// "\\caseStudiesMerge\\diffModels\\realm-java"; \\casesMergeConflict\\refactoring\\diffModels
		HenshinResourceSet resourceSetModel = new HenshinResourceSet(modelDirectoryPath);		
		// Load a model:
		Resource model = resourceSetModel.getResource("DSMDiff.xmi"); //00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff
		 
		// Load Henshin
		String henshinDirectoryPath = wsPath+ "\\casesMergeConflict\\refactoring\\henshinRules";
		//"src/org/eclipse/emf/henshin/examples/bank";
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSetHenshin = new HenshinResourceSet(henshinDirectoryPath);
		// Load the module:
		org.eclipse.emf.henshin.model.Module module = 
				resourceSetHenshin.getModule("refactoringRulesDSDiff_henshin_text.henshin");
	 
		// Initialize the graph:
		EGraph graph = new EGraphImpl(model);	
		
		//String resPath = henshinPath;// + "\\refactoringRulesDSDiff_henshin_text.henshin";
		Interpreter interpreter= new Interpreter(modelDirectoryPath);	
		EGraph graphResult = interpreter.executeUnit(graph, module, "unitSequntialStar");
		interpreter.saveGraph(graphResult, "DSMDiff_transformed.xmi");
		
		// Find the unit to be applied:
		Unit unit = module.getUnit("unitSequntialStar");
		 
		// Apply the transformation 
		
		// Prepare the engine:
		Engine engine = new EngineImpl();
		
		InterpreterUtil.applyToResource(unit, engine, model);
		model.save(null);
		
		
		
		/* Tried different ways but nine worked		
		
		// Apply the unit:
		UnitApplication application = new UnitApplicationImpl(engine, graph, unit, null);
		boolean executeResult = application.execute(null);
		 
		if (executeResult) {
			resourceSetModel.saveEObject(graph.getRoots().get(graph.getRoots().size()-1), "DSMDiff_transformed2.xmi");
			System.out.println("\nDSMDiff_transformed2.xmi Saved!");
			// Save the model:
			//model.save(null);
			//Map<String, Object> saveOptions = new HashMap<String, Object>();
			//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			model.save(null);//saveOptions);
		}
		*/
		

		/*
		// Load the example model into an EGraph:
		EGraph graph = 
				new EGraphImpl(resourceSetPr.getResource("00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff.xmi"));
		
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		UnitApplication unit_unitsubstituteAlgorithmStar = new UnitApplicationImpl(engine);
		unit_unitsubstituteAlgorithmStar.setEGraph(graph);
		unit_unitsubstituteAlgorithmStar.setUnit(module.getUnit("unitSequntialStar2"));
		
		//org.eclipse.emf.henshin.model.Rule rule = module.getAllRules().get(module.getAllRules().size()-1);
		//Iterable<org.eclipse.emf.henshin.interpreter.Match> m =engine.findMatches(rule, graph, null);
		//long s = StreamSupport.stream(m.spliterator(), false).count();
		
		//unitSequntialStar.setParameterValue("client", "Alice"); client:in
		//unitSequntialStar.setParameterValue("accountId", 5); accountId:in
		if (!unit_unitsubstituteAlgorithmStar.execute(null)) {
			System.out.println("Error executing unitsubstituteAlgorithmStar!");
			throw new RuntimeException("Error executing");
		}
		System.out.println("\nunitsubstituteAlgorithmStar Executed!");
				
		// Saving the result:
		if (saveResult) {
			resourceSetPr.saveEObject(graph.getRoots().get(0), "00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff_transformed2.xmi");

			System.out.println("\n0c9dd117b4b3279c4f48238948005994c90a491_dsmDiff_transformed2.xmi Saved!");
		}
		*/
	}
	
	public void step0006_Manual() {
		//Manual
		// Call  RefactoringRulesDSDiff_henshin_text.henshin over DSMDiff.xmi and create DSMDiff_transformed.xmi
	}
		
	//Do not need it, we set it while matching SDRules
	//post Rule Application Author Set (Last update, we do not need it, we set authors while finding semantic differences)
	//**************!!!!!!!!!!!!!******************
	//It is not working properly
	//Because we use name as ID but after save the semantic diff elements do not point to a correct element anymore
	//we need give ID to semantic diffs and assign it to found elements (not sure it is possible)
	//currently when we cannot find we assign LEFT to semantic diffs
	//**************!!!!!!!!!!!!!******************
	//@Test
	public void step0007() throws IOException {	
		//Manual part Not needed anymore: i.e, Calling  refactoringRulesDSDiffPostRules.henshin_text on _transformed.xmi files
		System.out.println("\nStart of post Rule Application Author Set!");		
		String diffModelsDirName 	= "diffModels";		
		ArrayList<String> dsDiffModelFoldersToSkip = new ArrayList<String>();
		dsDiffModelFoldersToSkip.add("_realm-java");
		
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		String[] projDirectories = getAllSubDirectories(caseStudiesMergeDiffDir);		
		excludingList= new ArrayList<String>(Arrays.asList("_realm-java", ".metadata"));

		for(String projectName:projDirectories) 	
		{
			if(excludingList.contains(projectName))
				continue;
			System.out.println("\nProject Name:" + projectName);	
			String targetRefDiffInCaseStudy = caseStudiesMergeDiffDir + dblSlash + projectName;
			Stream<Path> refDiffsPaths = Files.walk(Paths.get(targetRefDiffInCaseStudy));
		    List<Path> refDiffPathList = refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff_transformed.xmi")).collect(Collectors.toList());
		    for(Path pdiffPth:refDiffPathList) {
		    	System.out.println("\nDiff model:"+ pdiffPth.toString());
		    	try {
					dsmc.postRuleApplicationAuthorSet(pdiffPth.toString(),diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
		    	}catch(Exception ex) {
		    		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>  Error:");
		    		System.out.println("\nin: " + pdiffPth.toString());
		    		System.out.println("\nException: " + ex.getLocalizedMessage());
		    		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<");
		    	}
		    }		    		
		}
		System.out.println("\nEnd of post Rule Application Author Set!");	
	}
	
	//@Test

	
	//---------------------------------------------------->
	//---------------------------------------------------->
	
	//find Semantic<--->Fine-Diff Conflicts
	//@Test//1//
	public void step0008() throws IOException {	
		//Manual part Not needed anymore: i.e, Calling  refactoringRulesDSDiffPostRules.henshin_text on _transformed.xmi files
		System.out.println("\nStart of find Semantic<--->Fine-Diff Conflicts!");
		String diffModelsDirName 	= "diffModels";		
		ArrayList<String> dsDiffModelFoldersToSkip = new ArrayList<String>();
		dsDiffModelFoldersToSkip.add("_realm-java");	

		String ruleFolderPath = diffRulesPath;
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();
		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);				
		String[] projDirectories = getAllSubDirectories(caseStudiesMergeDiffDir);
		
		//%%%%%%%%%%%% Only for test purpose  //"error-prone","querydsl","redpen","POSA-14","android"
		//String[] projDirectories = {"POSA-14"};
		
		//%%%%%%%%%%%% Only for test purpose
		
		for(String projectName:projDirectories) {	
			System.out.println("\nProject Name:" + projectName);			
			if(dsDiffModelFoldersToSkip.contains(projectName)) {
				System.out.printf("\n%s project is skipped!\n", projectName);
				continue;
			}			
			String targetRefDiffInCaseStudy = caseStudiesMergeDiffDir + dblSlash + projectName;
			Stream<Path> refDiffsPaths = Files.walk(Paths.get(targetRefDiffInCaseStudy));
		    List<Path> refDiffPathList = refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff_transformed.xmi")).collect(Collectors.toList());
		    
		    for(Path pdiffPth:refDiffPathList) 
		    {
		    	String p=pdiffPth.toString();
		    	//String p=wsPath + "\\caseStudiesMerge\\diffModels\\closure-compiler\\161666f048d59314dc1ecdcb57f0a578e68188a5_dsmDiff_transformed.xmi";
		    	System.out.println("\nDiff model:"+ p);
		    	try {
		    	 	dsmc.find_SemanticFine_SemanticSemantic_Conflicts(p, diffMM_eNSURI, diffMM_eIN, 
		    				ruleMM2Way_eNSURI, ruleMM2Way_eIN, dsmcRuleFilePaths, changeConflictsCPA, 
		    				semanticFineConflictsMultiCDA, false, true, true, false);		

					//dsmc.postRuleApplicationAuthorSet(pdiffPth.toString(),diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
		    	}catch(Exception ex) {
		    		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<  Error:");
		    		System.out.println("\nin: " + p);
		    		System.out.println("\nException: " + ex.getLocalizedMessage());
		    		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>");
		    	}
		    }		    		
		}
		System.out.println("\nEnd of Start of find Semantic<--->Fine-Diff Conflicts!");	
	}
	
	
	
	//**************REPORT	
	//Create a public package to upload
	//@Test//1//
	public void step0009() throws IOException {
		System.out.println("Create a public package to upload...");
		String[] filePostfix= new String[] {"_CA_ref.xmi","_V1_v2Postfix + ","_V2_ref.xmi","_IncludingConflicts.xmi"};
		
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + "diffModels";
		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + "Refactoring";
		String  targetDir = caseStudiesMergeDir + dblSlash + "DSMComparePublictDataSet";
		
		String[] projDirectories = getAllSubDirectories(caseStudiesMergeDiffDir);
		ArrayList<CaV1V2DiffPathDetail>  caV1V2DiffPaths = new ArrayList<CaV1V2DiffPathDetail>();
		for(String projectName:projDirectories) {	
			if(!projectsListIncluded.contains(projectName))
				continue;
			
			System.out.println("\nProject Name:" + projectName);
			String projectFolderInDiffDir 	= caseStudiesMergeDiffDir + dblSlash + projectName;
			String projectFolderInRefDir 	= caseStudiesMergeRefDir + dblSlash + projectName;	
						
			Stream<Path> modelPathsProjectFolderInDiffDir = Files.walk(Paths.get(projectFolderInDiffDir));
			Stream<Path> modelPathsprojectFolderInRefDir = Files.walk(Paths.get(projectFolderInRefDir));
			List<Path> modelPaths = 
					Stream.concat(modelPathsProjectFolderInDiffDir, 
							modelPathsprojectFolderInRefDir).filter(var -> 
							var.toString().endsWith(filePostfix[0]) 
							|| var.toString().endsWith(filePostfix[1]) 
							|| var.toString().endsWith(filePostfix[2])
							|| var.toString().endsWith(filePostfix[3])).collect(Collectors.toList());
			
			Collections.sort(modelPaths);
			Set<Path> visited = new HashSet<Path>();
			for(Path p:modelPaths) {
				if(visited.contains(p))
					continue;
				
				String commitHash = p.getFileName().toString().split("_")[0];
				List<Path> allCommitFilePaths = modelPaths.stream().filter(f->f.toString().contains(commitHash)).collect(Collectors.toList());
				CaV1V2DiffPathDetail commitDirObject = new CaV1V2DiffPathDetail();
				commitDirObject.ProjectName = projectName;
				commitDirObject.CommitHash = commitHash;
				
				for(Path fp:allCommitFilePaths) {
					visited.add(fp);
					if(fp.toString().endsWith(filePostfix[0]))
						commitDirObject.CA = fp;
					else if(fp.toString().endsWith(filePostfix[1]))
						commitDirObject.V1 = fp;
					else if(fp.toString().endsWith(filePostfix[2]))
						commitDirObject.V2 = fp;
					else if(fp.toString().endsWith(filePostfix[3]))
						commitDirObject.Diff = fp;		
					
				}
				caV1V2DiffPaths.add(commitDirObject);
				
				System.out.println("--> " + projectName + " - " + commitHash);
			}
			for(CaV1V2DiffPathDetail c:caV1V2DiffPaths) {
				if(c.ProjectName !="" && c.CommitHash !="" && c.CA != null && c.V1 != null && c.V2 != null && c.Diff != null) {
					String targetProjectDir = targetDir + dblSlash + c.ProjectName;
					File targetProjectDirFile = new File(targetProjectDir);
				    if (!targetProjectDirFile.exists()){
				    	targetProjectDirFile.mkdirs();
				    }
				    String targetProjectCommitHashDir = targetDir + dblSlash + c.ProjectName+ dblSlash + c.CommitHash;
					File targetProjectCommitHashDirFile = new File(targetProjectCommitHashDir);
				    if (!targetProjectCommitHashDirFile.exists()){
				    	targetProjectCommitHashDirFile.mkdirs();
				    }
				    				    
				    String des = targetProjectCommitHashDir + dblSlash + c.CA.getFileName().toString();
			    	Path desPath = Paths.get(des);
			    	Files.copy(c.CA, desPath, StandardCopyOption.REPLACE_EXISTING);
			    	
			    	des = targetProjectCommitHashDir + dblSlash + c.V1.getFileName().toString();
			    	desPath = Paths.get(des);
			    	Files.copy(c.V1, desPath, StandardCopyOption.REPLACE_EXISTING);
			    	
			    	des = targetProjectCommitHashDir + dblSlash + c.V2.getFileName().toString();
			    	desPath = Paths.get(des);
			    	Files.copy(c.V2, desPath, StandardCopyOption.REPLACE_EXISTING);

			    	des = targetProjectCommitHashDir + dblSlash + c.Diff.getFileName().toString();
			    	desPath = Paths.get(des);
			    	Files.copy(c.Diff, desPath, StandardCopyOption.REPLACE_EXISTING);
				}
				
			}
			
			
		}
	}
	
	
	//-------------------------------------------------------------------------------	
	//@Test//1// produce Report Fine-Diffs
	public void produceReportFineDiffs() throws IOException {
		int countDiffs = 0;
		int countConflicts = 0;
		
		String[] projDirectories = { "junit4", "titan", "mcMMO", "closure-compiler",
				 "jabref", "realm-java", "redpen", "storm","syncany",
				 "error-prone", "querydsl", "POSA-14", "android"
				 //,"mamute","TestFX"
				 };
		String diffModelsDirName 	= "diffModels";		
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		for(String projectName:projDirectories) {
			String targetRefDiffInCaseStudy = caseStudiesMergeDiffDir + dblSlash + projectName;
			Stream<Path> refDiffsPaths = Files.walk(Paths.get(targetRefDiffInCaseStudy));
		    List<Path> refDiffPathList = 
		    		refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff.xmi")).collect(Collectors.toList());

		    System.out.println("\n\n>>>>DProject Name: "+ projectName);
		    for(Path pdiffPth:refDiffPathList) 
		    {
		    	String p=pdiffPth.toString();
		    	//System.out.println("\n\n>>>>Diff model:"+ p);
		    	try(FileInputStream inputStream = 
						new FileInputStream(p)){//"caseStudiesMerge/diffModels/android/7d3dc3566520a0fa5c598cb0832984e15eca6fec_dsmDiff.xmi")) {     
		    		
		    		String fileContent = IOUtils.toString(inputStream);
		    		int diffCount = fileContent.split(":Diff").length-1;
		    		int conflictCount = fileContent.split("CONTRADICTING").length-1;
		    		System.out.println("path: " + FilenameUtils.getName(p)+ " -diffCount: " + diffCount+ " -conflictCount: " + conflictCount);
		    		
				    countDiffs += diffCount;
				    countConflicts += conflictCount;
				}
		    }

		    System.out.print("Fine-Diff count: ");
		    System.out.println(countDiffs);
		    System.out.print("Fine-conflict count: ");
		    System.out.println(countConflicts);
			
		}
		
	}
	
	
	//@Test//1// produce Report Elements
	public void produceReportElements() throws IOException {
		int elementCounts = 0;
		//int countConflicts = 0;
		
		String[] projDirectories = { "junit4", "titan", "mcMMO", "closure-compiler",
				 "jabref", "realm-java", "redpen", "storm","syncany",
				 "error-prone", "querydsl", "POSA-14", "android"
				 //,"mamute","TestFX"
				 };
		String diffModelsDirName 	= "diffModels";		
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		for(String projectName:projDirectories) {
			String targetRefDiffInCaseStudy = caseStudiesMergeDiffDir + dblSlash + projectName;
			Stream<Path> refDiffsPaths = Files.walk(Paths.get(targetRefDiffInCaseStudy));
		    List<Path> refDiffPathList = 
		    		refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff.xmi")).collect(Collectors.toList());

		    System.out.println("\n\n>>>>DProject Name: "+ projectName);
		    for(Path pdiffPth:refDiffPathList) 
		    {
		    	String p=pdiffPth.toString();
		    	//System.out.println("\n\n>>>>Diff model:"+ p);
		    	try(FileInputStream inputStream = 
						new FileInputStream(p)){//"caseStudiesMerge/diffModels/android/7d3dc3566520a0fa5c598cb0832984e15eca6fec_dsmDiff.xmi")) {     
		    		
		    		String fileContent = IOUtils.toString(inputStream);
		    		int elementCount = fileContent.split("<").length-1;
		    		//int conflictCount = fileContent.split("CONTRADICTING").length-1;
		    		System.out.println("path: " + FilenameUtils.getName(p)+ " -elementCount: " + elementCount);
		    		
		    		elementCounts += elementCount;
				}
		    }

		    System.out.print("element count: ");
		    System.out.println(elementCounts);
			
		}
		
	}
	
	
	//produce Report Semantic-Diffs
	//1//@Test
	public void produceReportSemanticDiffs() throws IOException {
		System.out.println("\nStart of find Semantic<--->Fine-Diff Conflicts!");
		String diffModelsDirName 	= "diffModels";		
		ArrayList<String> dsDiffModelFoldersToSkip = new ArrayList<String>();
		dsDiffModelFoldersToSkip.add("_realm-java");	
		String ruleFolderPath = diffRulesPath;
		String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		//String[] projDirectories = getAllSubDirectories(caseStudiesMergeDiffDir);	
		String[] projDirectories = {"titan"};//realm-java
		for(String projectName:projDirectories) {	
			System.out.println("\nProject Name:" + projectName);			
			if(dsDiffModelFoldersToSkip.contains(projectName)) {
				System.out.printf("\n%s project is skipped!\n", projectName);
				continue;
			}			
			String targetRefDiffInCaseStudy = caseStudiesMergeDiffDir + dblSlash + projectName;
			Stream<Path> refDiffsPaths = Files.walk(Paths.get(targetRefDiffInCaseStudy));
		    List<Path> refDiffPathList = 
		    		refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff_transformed2.xmi")).collect(Collectors.toList());
		    
		    ArrayList<EObject>	totalSDiffObject = new ArrayList<EObject>();
		    ArrayList<String>   errornousPaths=  new ArrayList<String>();
		    
		    for(Path pdiffPth:refDiffPathList) 
		    {
		    	String p=pdiffPth.toString();
		    	System.out.println("\n\n>>>>Diff model:"+ p);
		    	try {
		    	 	
		    	 	File diffPostFile 	= new File(p);
		    		Charset charset 	= StandardCharsets.UTF_8;
		    		
		    		ResourceSet rsetDSMDiff	=	DsmcHelpers.setResourceSet(p,diffMM_eNSURI, diffMM_eIN);	
		    		Resource rsourceDSMDiff	=	rsetDSMDiff.getResource(URI.createFileURI(p) , true);	
		    		EObject rootDSDiff = rsourceDSMDiff.getContents().get(0);
		    		EReference refTypeDSD = rootDSDiff.eClass().getEAllReferences().stream().filter(
		    				r->r.getName().equalsIgnoreCase("domainspecificdiffs")).collect(
		    								Collectors.toList()).get(0);		
		    		List<EObject>	sDiffObject = (List<EObject>) rootDSDiff.eGet(refTypeDSD);
		    		
		    		if(sDiffObject.size()>0) {
			    		totalSDiffObject.addAll(sDiffObject);
			    		
			    		Map<Object, List<EObject>> sDiffObjectGrouped =
			    				sDiffObject.stream().collect(Collectors.groupingBy(s -> 
			    				DsmcHelpers.getAttrValueByAttrNameNullDefault(s,"name")));
			    		
			    		for (Map.Entry<Object, List<EObject>> entry : sDiffObjectGrouped.entrySet()) {
			                System.out.println("Key : " + entry.getKey() + "	size : "  + entry.getValue().size() + "\n	Value : " + entry.getValue() + "\n ---------- \n");
			            
			    		}
		    		}
		    		else {
		    			System.out.println("***");
		    		}
		    		
		    		
		    		//while(!sDiffObjectGrouped.isEmpty()) {
		    		//	sDiffObjectGrouped.entrySet()
		    		//	Object key  = sDiffObjectGrouped.
		    		//}
	
					//dsmc.postRuleApplicationAuthorSet(pdiffPth.toString(),diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
		    	}catch(Exception ex) {
		    		errornousPaths.add(p);
		    		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<  Error:");
		    		System.out.println("\nin: " + p);
		    		System.out.println("\nException: " + ex.getLocalizedMessage());
		    		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>");
		    	}
		    }	
		    
		    Map<Object, List<EObject>> totalSDiffObjectGrouped =
    				totalSDiffObject.stream().collect(Collectors.groupingBy(s -> 
    				DsmcHelpers.getAttrValueByAttrNameNullDefault(s,"name")));

		    System.out.println("\n\nProjet: " +projectName);
		    System.out.println("errornous Paths: #"+errornousPaths.size());
		    errornousPaths.forEach(System.out::println);
		    System.out.println("\n\n\n>>>Total: " + totalSDiffObject.size() + " semantic differences");    		
    		for (Map.Entry<Object, List<EObject>> entry : totalSDiffObjectGrouped.entrySet()) {
                System.out.println("# "  + entry.getValue().size() + " - " + entry.getKey());// + "\n	Value : " + entry.getValue() + "\n ---------- \n");
            
    		}
		    
		}
		System.out.println("\nEnd of Report!");	

	}

	//-------------------------------------------------------------------------------

	
	
	
	/*
	public String greatestCommonPrefix(String a, String b) {
	    int minLength = Math.min(a.length(), b.length());
	    for (int i = 0; i < minLength; i++) {
	        if (a.charAt(i) != b.charAt(i)) {
	            return a.substring(0, i);
	        }
	    }
	    return a.substring(0, minLength);
	}
	*/
	
	
	
	
	
	//-----------TEST--------------------------------------------------------------------
	
	//@Test//1// Find fine-grained diff
	public void step00123() {
		 try {
			 ComparisonResult comparisonResult = emfCompareResultToFineGranularDsmdiffMM(true); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
	//Transform a test kdm files to the refactoring model
	//@Test//1//
	public void step0004_test() throws IOException {
		System.out.println("Start of Transformin all the kdm files to the refactoring models!");
		String  caseStudiesMergeKdmDir = caseStudiesMergeDir + dblSlash + "KDM";
		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + "Refactoring";
		String projectName = "storm";
		String fileName= "gitMerged"; //"manualMerged"; //
		
		//String targetProjectDir = refConflictsAbsRootDir + dblSlash + projectName;	
		String targetKdmDirInCaseStudy = caseStudiesMergeKdmDir + dblSlash + projectName;
		String targetRefDirInCaseStudy = caseStudiesMergeRefDir + dblSlash + projectName;				
		TransformCodeToModel transformCodeToModel= new TransformCodeToModel();		
		String testKdmFileName = "3dc29e0dfde9923b54239714f5d7333cd1d11495"+"_"+fileName+"_kdm.xmi";
		String src = targetKdmDirInCaseStudy + dblSlash + testKdmFileName;
		String des = targetRefDirInCaseStudy + dblSlash + testKdmFileName.replace("kdm","refTest");
    	
		//Test destination
		des = wsPath + "\\casesMergeConflict\\refactoring\\dsModels\\";
		des +="3dc29e0dfde9923b54239714f5d7333cd1d11495"+"_"+fileName+"_ref.xmi";
		transformCodeToModel.kdmToRefactoringModel(Paths.get(src), des);
	    
	    System.out.println("KDM models transformed to the refactoring model: " + targetRefDirInCaseStudy);		    
	}
		
	//Start of Transform all the kdm files to the refactoring models
	//@Test//1//
	public void step0004_test2() throws IOException {
		System.out.println("Start of Transformin all the kdm files to the refactoring models!");
		String  caseStudiesMergeKdmDir = caseStudiesMergeDir + dblSlash + "KDM";
		String  caseStudiesMergeRefDir = caseStudiesMergeDir + dblSlash + "Refactoring";
		String projectName = "storm";
		String fileName="v2";
		
		//String targetProjectDir = refConflictsAbsRootDir + dblSlash + projectName;	
		String targetKdmDirInCaseStudy = caseStudiesMergeKdmDir + dblSlash + projectName;
		String targetRefDirInCaseStudy = caseStudiesMergeRefDir + dblSlash + projectName;				
		TransformCodeToModel transformCodeToModel= new TransformCodeToModel();		
		String testKdmFileName = "3dc29e0dfde9923b54239714f5d7333cd1d11495"+"_"+fileName+"_kdm.xmi";
		String src = targetKdmDirInCaseStudy + dblSlash + testKdmFileName;
		String des = targetRefDirInCaseStudy + dblSlash + testKdmFileName.replace("kdm","refTest");
    	
		//Test destination \\ D:\\_udemSVN\\DSMCompare-Project\\srcCode\\dsmMerge\\
		des = wsPath + "\\casesMergeConflict\\refactoring\\dsModels\\";
		des +=fileName+".xmi";
		transformCodeToModel.kdmToRefactoringModel(Paths.get(src), des);
	    
	    System.out.println("KDM models transformed to the refactoring model: " + targetRefDirInCaseStudy);		    
	}
	
	//*******************************
	//TEST
	//***********************************
	//diffRules to Henshin rules
	//@Test //1//
	public void step00611() {
		//dsmcRuleFiles	= new ArrayList<String>(Arrays.asList("extractMethod4.xmi")); 

		dsmDiffRulesToHenshinTextRulesRun();
	}
	

	//post Rule Application Author Set TEST (do not need it anymore)
	//@Test//1//
	public void step0007_Test() throws IOException {	
		//Manual part Not needed anymore: i.e, Calling  refactoringRulesDSDiffPostRules.henshin_text on _transformed.xmi files
		System.out.println("\nStart of post Rule Application Author Set!");		
				
		String p =wsPath + "\\caseStudiesMerge\\diffModels\\";
		p += "storm\\";
		p += "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed.xmi";
				
	    dsmc.postRuleApplicationAuthorSet(p,diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
		
		System.out.println("\nEnd of post Rule Application Author Set!");	
	}
	
	/*//Used Above
	//find Semantic<--->Fine-Diff Conflicts	
	//We cannot find semantic diffs after first time of applying since it removes some eobjects	
	@Test//1//
	public void step0008_Test() throws IOException {	
		System.out.println("\nStart of find -Semantic-Semantic Diffs <--&&--> -Semantic-Fine Diffs Conflicts!");
		String ruleFolderPath = diffRulesPath;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();		
		initializeCaseStudy();
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);	
		String p = wsPath + "\\casesMergeConflict\\refactoring\\diffModels\\";
		p += "6b4e69083998c9683e34f21d191f3e2f11412ec8_dsmDiff_transformed.xmi";// "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed.xmi";
		
		
		System.out.println("\nFile Path: " + p);

		dsmc.find_SemanticFine_SemanticSemantic_Conflicts(p, diffMM_eNSURI, diffMM_eIN, ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
				dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, true, true);		

		System.out.println("\nEnd of find Semantic<--->Fine-Diff Conflicts!");
	}*/
	
	
	
	//*********************************************************
	//**************Data and helpers***************************
	String dblSlash = "\\";		
	String[][] versionsPostfix= new String[][] {{"base","CA"},{"ours","V1"},{"theirs","V2"}};		
	//String targetProjectRoot="D:\\ecliseTest";	
	String dataDir = "D:\\_udemSVN\\DSMCompare-Project\\srcCode\\MergeScenarioMiner\\coding\\data"; //needs to be replaced
	String refConflictsAbsRootDir	= dataDir + dblSlash + "ref_conflicts_abs";
	String refConflictsRootDir 		= dataDir + dblSlash + "ref_conflicts";
	String csvDir 					= dataDir + dblSlash + "merge_scenarios_involved_refactorings";
	String caseStudiesMergeDir 		= wsPath + "\\caseStudiesMerge";
	ArrayList<String> projectsListIncluded= new ArrayList<String>(
			Arrays.asList(
					"android", "closure-compiler", "error-prone","jabref", 
					"junit4", "mamute", "mcMMO","POSA-14","querydsl", 
					"realm-java","redpen","storm", "syncany",  "titan"
			));
	ArrayList<String> excludingList= new ArrayList<String>(
			Arrays.asList(
					"android", "closure-compiler", "error-prone","jabref", 
					"junit4", "mamute", "mcMMO","POSA-14","querydsl", 
					"realm-java","redpen","storm", "syncany",  "titan",
					"antlr4",  "TestFX", ".metadata"
			)); 
					//"android", "closure-compiler", "error-prone","jabref", 
					//"junit4", "mamute", "mcMMO","POSA-14","querydsl", 
					//"realm-java","redpen","storm", "syncany",  "titan",
					//"antlr4",  "TestFX", ".metadata"
	
	
	String[][] stringElementAndRuleSet = //
			new String[][] {
			{"changePackage","packageName"},//
			
			{"extractAndMoveMethod2","methodBody"}, 
			{"extractAndMoveMethod3","methodBody"},
			
			{"extractInterface","implements"}, 	
			
			{"extractMethod","methodBody"}, 
			{"extractMethod2","methodBody"},  
			{"extractMethod3","methodBody"},  
			{"extractMethod4","methodBody"}, 
			{"extractMethod5","methodBody"}, 
			{"extractMethod6","methodBody"}, 
			
			{"extractSuperclass3","extends"}, 			
			 
			{"inlineMethod","methodBody"},			

			{"moveAttribute2","name"},			

			{"moveClass","name"},
			{"moveClass3","name"},
			{"moveClass4","name"},	
			
			{"moveMethod2","name"},
			{"moveMethod3","name"},
			
			{"pullUpAttribute2","name"},
			{"pullUpAttribute3","name"},
			
			{"pullUpMethod2","name"},
			{"pullUpMethod3","name"},
			

			{"pushDownAttribute2","name"},
			{"pushDownAttribute3","name"},
			

			{"pushDownMethod2","name"},
			{"pushDownMethod3","name"},
			{"pushDownMethod33","name"}
			
		};
	
	
	
	
	//*************************************************
	
	public String[] getAllSubDirectories(String srcDirectory) {
		File srcirectory = new File(srcDirectory);
		return srcirectory.list(new FilenameFilter() {
			  @Override
			  public boolean accept(File current, String name) {
			    return new File(current, name).isDirectory();
			  }
			});
	}
	
	
	
		
	//-------------------------------------------------------------------------------
	
	//@Test
	public void helperRemoveDuplicatesFromCsv() throws IOException {
		
		String csvDirInCaseStudy = csvDir;
		Stream<Path> csvFilePaths = Files.walk(Paths.get(csvDirInCaseStudy));
	    List<Path> csvFilePathList = csvFilePaths.filter(var -> var.toString().endsWith(".csv")).collect(Collectors.toList());
	    for(Path csvFilePath:csvFilePathList) {
	    	System.out.println("\ncsv file:"+ csvFilePath.toString());
	    	try {
				DsmcHelpers.removeDuplicatesFromCsv(csvFilePath.toString(), true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    System.out.println("\nAll csv files parsed and duplicate entries are removed.");		
	}
	
	//-------------------------------------------------------------------------------

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
	
		
	
	//**************** Optional: Semi-Auto Generate dsRules from dsModels ****************
	//examples stored in diffRules / GeneratedRules / [rule name] / 
	//	(dsModels(CA,V1,V2 copied manually)/dsmDiffModelGenerated (copied)/dsRuleModelTransformed/manuallyCorrected)
	//Needs to be automated later
	
	public void step000() {
		//Prepare CA,V1,V2 manually and put it in the original dsModels folder		
		// V1 needs to be changed (V2 does not need to be changed from CA, but we need it)
	}
	
	
	
	//@Test//1// Find fine-grained diff
	public void step001() {
		 try {
			 //long startTime = System.nanoTime();
			 emfCompareResultToFineGranularDsmdiffMM(true); 
			 /*
			 long endTime   = System.nanoTime();
			 long totalTime = endTime - startTime;
			 System.out.println(totalTime);
			 // 1 second = 1_000_000_000 nano seconds
		     double elapsedTimeInSecond = (double) totalTime / 1_000_000_000;
		     System.out.println(elapsedTimeInSecond + " seconds");
		     // TimeUnit
		     long convert = TimeUnit.SECONDS.convert(totalTime, TimeUnit.NANOSECONDS);
		     System.out.println(convert + " seconds");
		     */
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
	public void step005_2() {
		sdRuleFiles	= new ArrayList<String>(Arrays.asList("extractMethod3.xmi", "extractMethod4.xmi")); 
		// extractSuperclassAttr, extractSuperclassRef, mergeRefrences, moveAttribute, moveRefrence,
		// pullUpAttribute, pullUpRefrence, pushDownAttribute, pushDownRefrence, renameAttribute, flattenHierarchyAttr, mergeMetaClassAttr
		dsmDiffRulesToHenshinTextRulesRun();
	}
	
	
	//**************** Execution ****************
	//**************** Execution ****************
	//1. Create DsDiff Model
	//@Test//1//
	public void step1() {
		try {
			emfCompareResultToFineGranularDsmdiffMM(true); //call over CA, V1, and V2 and create DSMDiff.xmi
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//2. Find Semantic Differences
	public void step2() {
		// Call  refactoringRulesDSDiff_henshin_text.henshin over DSMDiff.xmi and create DSMDiff_transformed.xmi
	}
	//3. Find Fine/Semantic equivalent/contradicting Differences 
	public void step3() {
		// Call  refactoringRulesDSDiffPostRules.henshin_text over DSMDiff_transformed.xmi and create DSMDiff_transformed_transformed.xmi
	}
	
	//4. find All Fine Diff Conflicts
	//This one is combined with findSemanticSemanticFineConflicts
	//
	//public void stepDontApply1() {
	//	setSemanticFineChangeStatusAfterTransformation(); // Call over DSMDiff_transformed_transformed.xmi and modify it
	//}
	
	//@Test //4. post String Element Change (Author set)
	public void step4() {
		String[][] stringElementAndRuleSet = new String[][] {{"extractMethod","methodBody"}, {"extractMethod2","methodBody"}, {"extractMethod3","methodBody"}, {"extractMethod4","methodBody"}, {"substituteAlgorithm","methodBody"}};
		String diffPostFilePath = wsPath + "\\caseStudiesMerge\\diffModels\\realm-java\\00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff_transformed_transformed.xmi";// diffModelsPath + diffTransformedTransformedFileName;	
		dsmc.postStringElementChange(diffPostFilePath,diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
	}
	
	//5. Find Semantic-Fine conflicts
	//@Test
	public void step5() {
		findSemanticSemanticFineConflicts(); // Call over DSMDiff_transformed_transformed.xmi and modify it
		System.out.println("\n End of finding Semantic Conflicts!");
	}
	
	//*************************************************************
	public void setSemanticFineChangeStatusAfterTransformation() 
	{
		//dsmDiffRulesToHenshinTextPostRules(); 
		initializeCaseStudy();
		String diffPostFilePath 				= diffModelsPath + diffTransformedTransformedFileName;	 	
	 	
	 	dsmc.setSemanticFineChangeStatusAfterTransformation(diffPostFilePath,diffMM_eNSURI, diffMM_eIN);		
	}
	
		
	
	
	//---------------------------------------------------------->
	//****************************************
	//-->DSM-Compare SemConf Module 
	//find semantic conflicts
	//@Test
	public void findSemanticSemanticFineConflicts() 
	{
		//dsmDiffRulesToHenshinTextPostRules(); 
		initializeCaseStudy();
		String diffPostFilePath 				= diffModelsPath + diffTransformedTransformedFileName;
		//dsmc.findConflictsBtwSemanticFineDiffs(diffPostFilePath,diffMM_eNSURI, diffMM_eIN);
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();
		String ruleFolderPath=diffRulesPath;
		sdRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));		
		
		String filePathForChangeConflicts	= henshinRulesPath + fileNameForChangeConflicts;
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
		
		
		String filePathForSemanticFineConflicts	= henshinRulesPath + fileNameForSemanticFineConflicts;
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
	 	
	 	
	 	dsmc.find_SemanticFine_SemanticSemantic_Conflicts(diffPostFilePath,diffMM_eNSURI, diffMM_eIN, 
				ruleMM2Way_eNSURI, ruleMM2Way_eIN, dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, false, true, true, false);		
	}
	
	//Find conflicts among semantic/Fine-grained differences using Henshin CPA APIs (Potential-overlapping)
	//@Test  
	public void find_Potential_Semantic_AttributeChangeConflicts() throws IOException 
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
	public void find_Potential_SemanticSemantic_SemanticFineConflicts() throws IOException
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
	
	
	//****************************************
	//---> DSM-	Compare SemDiff Module
	//Generate fine-grained Henshin rules out of domain-specific Meta-model (Java)
	//@Test
	public void mMAutoGenerateFineDiffRulesHenshinText() 
	{
		System.out.println("\nStart Generate fine-grained Henshin rules out of domain-specific Meta-model!");
		MMFineDiffRulesHenshinText m= new MMFineDiffRulesHenshinText();
		m.dsmName 		= caseStudyName;
		m.rootClassName	= rootClassName;
		m.mmFolderPath 	= metaModelsPath;
		m.mmFileName 	= mmFileName;	
		m.henshinFolderPath 
						= henshinRulesPath;		
		m.henshinTextFileName
						= henshinTextAutoGeneratedFineRulesFileName;
		m.henshinFileName
						= henshinAutoGeneratedFineRulesFileName;
		m.MM_eNSURI 	= ecoreMM_eNSURI; // RefactoringPackage.eINSTANCE.eNS_URI;
		m.MM_eIN 		= ecoreMM_eIN;//RefactoringPackage.eINSTANCE;
		m.run();
		
		System.out.println("\nEnd Generate fine-grained Henshin rules out of domain-specific Meta-model!");
	}
		
	//Correct the auto-generated fine-grained change rules 
	//@Test
	public void mMFineDiffRulesCorrectChangeRules() 
	{
		System.out.println("correct Change Rules Start!");
		MMFineDiffRulesHenshinText m= new MMFineDiffRulesHenshinText();
		m.dsmName 		= caseStudyName;
		m.rootClassName = rootClassName;
		m.mmFolderPath 	= metaModelsPath;
		m.mmFileName 	= mmFileName;	
		m.henshinFolderPath 
						= henshinRulesPath;	
		m.henshinFileName
						= henshinAutoGeneratedFineRulesFileName;
		m.MM_eNSURI 	= ecoreMM_eNSURI; // RefactoringPackage.eINSTANCE.eNS_URI;
		m.MM_eIN 		= ecoreMM_eIN;//RefactoringPackage.eINSTANCE;
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
	
	//Generate Henshin rules out of domain-specific rules for CPA purpose
	//@Test
	public void dsmDiffRulesToHenshinTextRulesRunForCPA() 
	{
		dsmDiffRulesToHenshinTextRulesForCPA();

		System.out.println("dsm-Diff Rule transformed to henshin-Text rules for CPA purpose!");
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
	//1//@Test
	public ComparisonResult emfCompareResultToFineGranularDsmdiffMM(boolean createV012)  throws IOException {
		 initializeCaseStudy();
		 dsmc.setDsdRulePackages(sdRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
				 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);		 
		 dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 	dsmc.getDSMDiffPath(), dsmc.getResultFilePath(), createV012);		 
		System.out.println("emf-Compare result transformed to Fine-Grained DsmdiffMM!");
		return dsmc.comparisonResult;
	}	

	//****************************************
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
	 		
	
	//--------------------------------------------------------->
	//****************************************	
	//---->>>>>----->>>
	//Find conflict between rules by HENSHIN MULTI CDA APIs
	//@Test//1  //MULTI CDA - HENSHIN
	public void orderRulesUsingMultiCDA()
	{
		 ////  refactoringRulesCPA_henshin_text.henshin
		 //Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs			 
		 //Find conflict pairs among rules using Henshin MultiCda
		 //Could not seperate because of dependency to rulesFilter
		 MultiCdaSolver mcdaSolver= new MultiCdaSolver();
		 mcdaSolver.fullRulesSubDirectoryPath = henshinRulesPath;// diffRulesPath; // We need to put only one henshin file or make sure the rules are getting from ...DSDiff_henshin_text.henshin file		 
		 mcdaSolver.domainName = diffDomainName;
		 mcdaSolver.doRemoveAlternativeRules = true;//true for ordering of the SDRules
		 mcdaSolver.doRemoveAutoGeneratedFineRules = true;//true for ordering of the SDRules
		 mcdaSolver.cpaSemanticDiffModuleName = henshinRulesCPAFileName;
		 //mcdaSolver.cpaAutoFineDiffRulesModuleName = henshinAutoGeneratedFineRulesFileName;
		 mcdaSolver.WRITE_LOGS = false;
		 
		 List<Granularity> granularities =  Arrays.asList(
					//Granularity.binary,
					//Granularity.coarse,
					Granularity.fine//, 
					//Granularity.atoms
					);
		 mcdaSolver.execute(granularities, true, false);	//mcdaSolver.execute();	 		 
		 
		 //Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 
		 ArrayList<RuleAttributes> ruleAttributes= calculateRuleAttributes(ruleNames, true);
		 
		 //Order rules
		 //The produced order was not completely correct, we use a python code instead
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, ruleAttributes);	//dsmcRulesToHenshinText.rulesFilter	 
		 vs.execute(null,null, 0);		 
		 
		 writeTextToFile(matrixToText(conflictFineMatrix),henshinRulesPath + "_conflictsMatrix.txt");			 
		 //writeTextToFile(rulesToString(vs._vertices),henshinRulesPath + "_ruleNamesUniqueOrdered.txt");		 
		 //writeTextToFile(vsOrderToString(vs._vertices),henshinRulesPath + "_ruleOrderUnique.txt");	
		 String pythonCode = prepareInputDataAndCodeForPythonVertexSorting(vs, diffDomainName, conflictFineMatrix);
		 writeTextToFile(pythonCode,henshinRulesPath + "_pythonVertexSortingCallCode.py");	
		 
	}
	
	public String prepareInputDataAndCodeForPythonVertexSorting(VertexSorting vs, String diffDomainName, int[][] conflictFineMatrix) {
		String DSL = "theDSL";
		String NL = "\n";
		
		String debug = "DEBUG = False";
		
		int edgesCount = vs._edges.size();
		String edgesText = "";
		for(int i=0;i<edgesCount-1;i++) {
			edgesText += String.format("(%d,%d),",vs._edges.get(i)._from._id,vs._edges.get(i)._to._id);
			if(i%8 == 0)
				edgesText += NL;
		}
		edgesText += String.format("(%d,%d)",vs._edges.get(edgesCount-1)._from._id,vs._edges.get(edgesCount-1)._to._id);
		String useNamesValue = "True";
		String sdRules = "";
		int sdRulesCount = vs._ruleNames.size();
		for(int i=0;i<sdRulesCount-1;i++) {
			sdRules += String.format("\"%s\",",vs._ruleNames.get(i));
			if(i%8 == 0)
				sdRules += NL;
		}
		sdRules += String.format("\"%s\"",vs._ruleNames.get(sdRulesCount-1));
		
		String set_order_heuristics = "set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))";
		String conflict_adjacency_matrix = matrixToText(conflictFineMatrix); 
		String runAndPrint = String.format("%s.order_vertices(reverse_edges=True, debug=DEBUG)%sprint(%s.ordered2str())",DSL,NL,DSL);
			    
			    

		String pythonCode = "";
		pythonCode += String.format("%s%sprint('%s')%s%s = Graph(%d,[%s],%s,[%s],name='%s')%s%s.%s%s%s.set_adjacency_matrix([%s])%s%s",
						debug,NL,diffDomainName,NL,DSL,edgesCount,edgesText,useNamesValue,sdRules,diffDomainName,NL,
						DSL,set_order_heuristics,NL,DSL,conflict_adjacency_matrix,NL,runAndPrint);		
		
		
		return pythonCode;
	}
	
	//*****
	public String matrixToText(int[][] matrix) {
		String text = Arrays
		        .stream(matrix)
		        .map(Arrays::toString) 
		        .collect(Collectors.joining(','+System.lineSeparator()));
		return text;
	}
	
	public String rulesToString(ArrayList<Vertex> vertices) {
		StringJoiner sj = new StringJoiner(System.lineSeparator());
		for (Vertex v : vertices) {
		    sj.add(v._name);
		}
		String text = sj.toString();
		return text;
	}
	
	public String vsOrderToString(ArrayList<Vertex> vertices) {
		StringJoiner sj = new StringJoiner(System.lineSeparator());
		for (Vertex v : vertices) {
		    sj.add(v._order + "   "+v._name);
		}
		String text = sj.toString();
		return text;
	}
	
	//@Test
	public void calculateandWriteRuleAttributes() {
		sdRuleFiles.add("extractAndMoveMethod2.xmi");
		sdRuleFiles.add("extractAndMoveMethod3.xmi");
		ArrayList<RuleAttributes> ruleAttributes = calculateRuleAttributes(sdRuleFiles, false);
		String _RuleAttributesPath = wsPath + dblSlash + caseStudyRootFolder + dblSlash + 
				caseStudyName + dblSlash + henshinRulesFolder + dblSlash + "_RulesAttributes_ruleName_Elem_Diff_Filter.txt";
		StringBuilder ruleAttributesString = new StringBuilder();
		ruleAttributes.forEach(r->{ruleAttributesString.append(String.format("%s,%s,%s,%s\n", r._ruleName, r._elementsCount, r._diffElementsCount, r._filtersCount));});
		
		 writeTextToFile(ruleAttributesString.toString(),_RuleAttributesPath);		
	}
	
	//*****
	public ArrayList<RuleAttributes> calculateRuleAttributes(ArrayList<String> ruleNames, boolean replaceEqualAndAddXMIExtenstion) {
		ArrayList<RuleAttributes> rulesFilter= new ArrayList<RuleAttributes>();
		ResourceSet resourceSet = DsmcHelpers.getResourceSetXMI(diffRulesPath, ruleMM2Way_eNSURI, ruleMM2Way_eIN);		
		for(String  ruleName:ruleNames) {
			int filtersCount = 0, elementsCount  = 0, diffElementsCount = 0;
			ArrayList<EObject>allDsDiffRuleNodes = 	new ArrayList<EObject>();			
			String rulePath = diffRulesPath;
			if(replaceEqualAndAddXMIExtenstion == true)
				rulePath += ruleName.replace("_equal","")+".xmi";
			else
				rulePath += ruleName;
			Resource resource = DsmcHelpers.getResource(rulePath, resourceSet);;//resourceSet.getResource(URI.createURI(rulePath), true);		
			
		  	EObject ruleNode	 	=	resource.getContents().get(0);
		  	EObject root 	=	ruleNode.eContents().get(0);
	  		allDsDiffRuleNodes	=	DsmComparatorController.getAllNodes(root, true, false);//DsmComparatorController.getAllNodes(ruleNode, true, true);
		  	
		  	for(int i=1; i< ruleNode.eContents().size();i++)
		  	{
		  		var node = ruleNode.eContents().get(i);
		  		allDsDiffRuleNodes.addAll(DsmComparatorController.getAllNodes(node, true, false));
		  	}
		  	
		  	var allDsDiffRuleNodesSet = new HashSet<EObject>(allDsDiffRuleNodes);
		  	
		  	elementsCount = allDsDiffRuleNodesSet.size();
		  	for(EObject n:allDsDiffRuleNodesSet) {
		  		Object diff_KindValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "diff_kind");
		  		if(diff_KindValue != null)
		  			diffElementsCount++;
		  		Object filterValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "filter");
		  		if(filterValue != null && filterValue.toString().equalsIgnoreCase("true")) {
		  			filtersCount++;
		  		}
		  	}
			
			RuleAttributes ra= new RuleAttributes(ruleName, filtersCount, elementsCount, diffElementsCount);
			rulesFilter.add(ra);		
		}
		
		return rulesFilter;
	}
	
	//_____________________________________________________
	//****************** Auto ds DiffModel To DsDiff Rule **********************
	
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
	
	
	
	
	

	//_____________________________________________________
	//****************** Data Members **********************
	String ecoreMM_eNSURI 			= org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eNS_URI;
	Object ecoreMM_eIN 				= org.eclipse.emf.ecore.EcorePackage.eINSTANCE;
	
	
	String MM_eNSURI 				= RefactoringPackage.eNS_URI;
	Object MM_eIN  					= RefactoringPackage.eINSTANCE;
	
	String diffMM2Way_eNSURI 		= Refactoring2WayDiffMMPackage.eINSTANCE.eNS_URI;
	Object diffMM2Way_eIN 			= Refactoring2WayDiffMMPackage.eINSTANCE;
	EFactory diffMM2WayFactory_eIN	= Refactoring2WayDiffMMFactory.eINSTANCE;
	
	String ruleMM2Way_eNSURI 		= Refactoring2WayRuleMMPackage.eINSTANCE.eNS_URI;
	Object ruleMM2Way_eIN 			= Refactoring2WayRuleMMPackage.eINSTANCE;
	EFactory ruleMM2WayFactory_eIN  = Refactoring2WayRuleMMFactory.eINSTANCE;
	
	String diffMM_eNSURI 			= RefactoringDiffMMPackage.eNS_URI;
	Object diffMM_eIN  				= RefactoringDiffMMPackage.eINSTANCE;
	EFactory diffMMFactory_eIN		= RefactoringDiffMMFactory.eINSTANCE;
	
	String caseStudyName			= "refactoring";
	String rootClassName			= "EPackage";
	
	
	String diffDomainName			= caseStudyName+"DiffMM";
	String caseStudyRootFolder		= "casesMergeConflict";	
	String caseStudyFolder			= "refactoring";
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

	String mmFileName 				= "refactoring.ecore";	
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
	ArrayList<String> crRuleFileNameList;
	
	ArrayList<String> sdRuleFiles	= new ArrayList<String>(
 			Arrays.asList( 		
 					"pullUpMethod.xmi", 
 					"pullUpMethod2.xmi", 
 					"pullUpMethod3.xmi", 
 					"pullUpMethod4.xmi", 
 					"pullUpMethod5.xmi", 
 					"pullUpMethod6.xmi", 
 					"pullUpMethod7.xmi", 	
 					"pullUpMethodInterface.xmi", 


 					"pushDownMethod33.xmi",
 					"pushDownMethod.xmi",
 					"pushDownMethod2.xmi",
 					"pushDownMethod3.xmi",
 					"pushDownMethod4.xmi",
 					"pushDownMethod5.xmi",
 					"pushDownMethod6.xmi",
 					
 					"pullUpAttribute.xmi", 
 					"pullUpAttribute2.xmi",
 					"pullUpAttribute3.xmi",  
 					
 					"pushDownAttribute.xmi",
 					"pushDownAttribute2.xmi",
 					"pushDownAttribute3.xmi",
 					
 					"renamePackage.xmi", 
 					"changePackage.xmi", 
 					"moveClassAcrossPackage.xmi", 

 					//"extractAndMoveMethod2.xmi",
 					//"extractAndMoveMethod3.xmi",
 					

 					"extractInterface2.xmi", 
 					"extractInterface.xmi", 					
					
 					"extractMethod.xmi",
 					"extractMethod1.xmi", 
 					"extractMethod2.xmi",
 					"extractMethod3.xmi",
 					"extractMethod4.xmi", 
 					"extractMethod5.xmi", 					
 					"inlineMethod.xmi", 				

 					"extractSuperclass.xmi", 
 					"extractSuperclass2.xmi",
 					"extractSuperclass3.xmi",
 					"extractSuperclassAttr.xmi",  					
 					"extractSuperclassRef.xmi", 	
 					
 					"moveAndRenameClassAcrossPackage.xmi",

 					
 					"moveClass.xmi", 
 					"moveClass2.xmi", 					 
 					"moveClass3.xmi", 
 					"moveClass4.xmi", 
 					"moveClass5.xmi", 
 					"moveClass6.xmi",  
 					"moveClass7.xmi",
 					 					 
 					"moveMethod.xmi",
 					"moveMethod2.xmi",
 					"moveMethod3.xmi",
 					"moveMethod4.xmi",
 					
 					"moveAttribute.xmi", 
 					"moveAttribute2.xmi", 

 					"renameClass.xmi",
 					
 					"renameMethod.xmi",
 					
 					"renameAttribute.xmi", 
 					
 					"flattenHierarchyAttr.xmi",
 					
 					"mergeMetaClassAttr.xmi",
 					
 					"mergeRefrences.xmi", 					
 					
 					"pushDownRefrence.xmi",	
 					
 					"pullUpRefrence.xmi"
 					
 					
 					
 					//,"substituteAlgorithm.xmi" 					
 					)
 			);


	//NOT-Working: Generate fine-grained Henshin rules out of domain-specific Meta-model (Extend)
	//@Test
	public void mMToFine_GrainedHenshinTextRun() 
	{
		mMToFineGrainedHenshinText();
		System.out.println("dsm-Diff Rule transformed to henshin-Text rules!");
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
	
	public DSRulesToHenshinText dsmDiffRulesToHenshinTextPostRules() 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath = henshinUrlPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = diffRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = sdRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = ruleMM2Way_eNSURI;
		dsmcRulesToHenshinText.ruleMM_eIN = ruleMM2Way_eIN;
		dsmcRulesToHenshinText.runPostRuleGenerator();
		return dsmcRulesToHenshinText;
	}
	
	public DSRulesToHenshinText dsmDiffRulesToHenshinTextRules(boolean isATempFile) 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath =  henshinUrlPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = diffRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = sdRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = ruleMM2Way_eNSURI;
		dsmcRulesToHenshinText.ruleMM_eIN = ruleMM2Way_eIN;
		dsmcRulesToHenshinText.useWhileLoop = true;
		dsmcRulesToHenshinText.run(isATempFile);
		return dsmcRulesToHenshinText;
	}
	
	public DSRulesToHenshinText dsmDiffRulesToHenshinTextRulesForCPA() 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath =  henshinUrlPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = diffRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = sdRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = ruleMM2Way_eNSURI;
		dsmcRulesToHenshinText.ruleMM_eIN = ruleMM2Way_eIN;
		dsmcRulesToHenshinText.runForCPA();
		return dsmcRulesToHenshinText;
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
	
	
	//@Test
	public void henshinRuleCall() {
		String PATH = wsPath + "\\henshin.examles\\bankExample";
		run(PATH, true);
	}
	
	private void run(String path, boolean saveResult) {
		
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		
		// Load the module:
		Module module = resourceSet.getModule("bank.henshin", false);

		// Load the example model into an EGraph:
		EGraph graph = new EGraphImpl(resourceSet.getResource("example-bank.xmi"));
		
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		UnitApplication createAccountApp = new UnitApplicationImpl(engine);
		createAccountApp.setEGraph(graph);
		
		// Creating a new account for Alice...
		createAccountApp.setUnit(module.getUnit("createAccount"));
		createAccountApp.setParameterValue("client", "Alice");
		createAccountApp.setParameterValue("accountId", 5);
		if (!createAccountApp.execute(null)) {
			throw new RuntimeException("Error creating account for Alice");
		}

		UnitApplication transferMoneyApp = new UnitApplicationImpl(engine);
		transferMoneyApp.setEGraph(graph);
		// Transferring some money:
		transferMoneyApp.setUnit(module.getUnit("transferMoney"));
		transferMoneyApp.setParameterValue("client", "Alice");
		transferMoneyApp.setParameterValue("fromId", 1);
		transferMoneyApp.setParameterValue("toId", 2);
		transferMoneyApp.setParameterValue("amount", 50.0d); // double
		if (!transferMoneyApp.execute(null)) { // parameters x and y will be matched by the engine
			throw new RuntimeException("Error transferring money");
		}
		
		// Deleting all accounts of Charles:
		UnitApplication deleteAccountsApp = new UnitApplicationImpl(engine);
		deleteAccountsApp.setEGraph(graph);
		deleteAccountsApp.setUnit(module.getUnit("deleteAllAccounts"));
		deleteAccountsApp.setParameterValue("client", "Charles");
		if (!deleteAccountsApp.execute(null)) {
			throw new RuntimeException("Error deleting Charles' accounts");
		}
		
		// Saving the result:
		if (saveResult) {
			resourceSet.saveEObject(graph.getRoots().get(0), "example-result.xmi");
		}
	}
	

	//********************************************************************
	//********************************************************************
	//@Test
	public void outputComparisonResult() {
		 try {
			 ComparisonResult comparisonResult = emfCompareResultToFineGranularDsmdiffMM(true); 
			 
			 String jsonC= generateJSONStringFromObject(comparisonResult.comparison3Way);
			 /*
			 FileOutputStream fs = new FileOutputStream(diffModelsPath + "comparisonResult_comparison3Way.cmp");
			 ObjectOutputStream os = new ObjectOutputStream(fs);
			 os.writeObject(comparisonResult.comparison3Way);	*/
			 System.out.println("comparison Result is serialialixed to : " + diffModelsPath + "comparisonResult_comparison3Way.cmp");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Method that returns String through a Object as a parameter i.e to be converted	
	public String  generateJSONStringFromObject(Comparison comparison3Way) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        String jsonString = mapper.writeValueAsString(comparison3Way);
        
        return jsonString;
	}

	// Method that returns Object through a String as a parameter 
	public Comparison generateObjectFromJSONString(String jsonString){
        Gson gson = new Gson();
        Comparison thirdPartyClassObject = gson.fromJson(jsonString, Comparison.class);
        return thirdPartyClassObject;
	}
		
	//*********************************************************************************************************
	//*********************************************************************************************************
	public void runHenshinTransformation(String pathHenshin,String pathDiffModel,String HENSHIN_FILE_NAME,
			String INPUT_INSTANCE_FILE_NAME,String RESULT_INSTANCE_FILE_NAME,String UNIT_NAME,  boolean saveResult) {
		final HenshinResourceSet resourceSet = new HenshinResourceSet(pathHenshin);
		final HenshinResourceSet resourceSetDiffModel = new HenshinResourceSet(pathDiffModel);
		final Module module = resourceSet.getModule(HENSHIN_FILE_NAME, false);
		final EGraph graph = new EGraphImpl(resourceSetDiffModel.getResource(INPUT_INSTANCE_FILE_NAME));
		final UnitApplication unitSequntialStarApplication = new UnitApplicationImpl(new EngineImpl());
		unitSequntialStarApplication.setEGraph(graph);
		unitSequntialStarApplication.setUnit(module.getUnit(UNIT_NAME));
		LoggingApplicationMonitor monitor = new LoggingApplicationMonitor();
		
		if (!unitSequntialStarApplication.execute(monitor)) {
			System.out.println("Error in applying " + UNIT_NAME + " rule!");
		} else if (saveResult) {
			resourceSetDiffModel.saveEObject(graph.getRoots().get(0), RESULT_INSTANCE_FILE_NAME);
			System.out.println(UNIT_NAME + " domain-specific rule applied and result is saved!");
		}
		
		List<Match> matches = InterpreterUtil.findAllMatches(new EngineImpl(), module, graph); 
		System.out.println(matches.toString());
	}
	
	//@Test
	public void callHenshinTofindSemanticDiffs() throws IOException {
		String PATH_Henshin = wsPath + "\\casesMergeConflict\\refactoring\\henshinRules";
		String PATH_DiffModel = wsPath + "\\casesMergeConflict\\refactoring\\diffModels";

		String HENSHIN_FILE_NAME = "test_henshin_text.henshin";//"refactoringRulesDSDiff_henshin_text.henshin";
		String FileName = "6b4e69083998c9683e34f21d191f3e2f11412ec8_dsmDiff";
		String INPUT_INSTANCE_FILE_NAME = FileName + ".xmi";
		String UNIT_NAME = "unitSequntialStar";// "unitpullUpMethodLeftStar";
		String RESULT_INSTANCE_FILE_NAME = FileName + UNIT_NAME + "_applied.xmi";
		runHenshinTransformation(PATH_Henshin, PATH_DiffModel, HENSHIN_FILE_NAME, INPUT_INSTANCE_FILE_NAME,RESULT_INSTANCE_FILE_NAME,UNIT_NAME, true);
	}
		
	public void runHenshinTransformation2(String pathHenshin,String pathDiffModel,String HENSHIN_FILE_NAME,
			String INPUT_INSTANCE_FILE_NAME,String RESULT_INSTANCE_FILE_NAME,String UNIT_NAME,  boolean saveResult) {

		final HenshinResourceSet resourceSet = new HenshinResourceSet(pathHenshin);
		final HenshinResourceSet resourceSetDiffModel = new HenshinResourceSet(pathDiffModel);
		final Module module = resourceSet.getModule(HENSHIN_FILE_NAME, false);
		Resource resourceDiffModel = resourceSetDiffModel.getResource(INPUT_INSTANCE_FILE_NAME);
		final EGraph graph = new EGraphImpl(resourceDiffModel);
		Engine engine = new EngineImpl();
		UnitApplication app = new UnitApplicationImpl(engine);
		app.setEGraph(graph);
		Unit unit = module.getUnit(UNIT_NAME);
		app.setUnit(unit);
		InterpreterUtil.executeOrDie(app);
		EGraph graphResult = app.getEGraph();
		resourceSetDiffModel.saveEObject(graphResult.getRoots().get(0), RESULT_INSTANCE_FILE_NAME);
		
		
		UnitApplication application = new UnitApplicationImpl(engine, graph, unit, null);
		LoggingApplicationMonitor monitor = new LoggingApplicationMonitor();
		application.execute(monitor);
		resourceSetDiffModel.saveEObject(application.getEGraph().getRoots().get(0), "2"+RESULT_INSTANCE_FILE_NAME);
		
		org.eclipse.emf.henshin.model.Rule rule = module.getAllRules().stream().filter(r->r.getName().equals("pullUpAttribute")).collect(Collectors.toList()).get(0);
		RuleApplication app2 = new RuleApplicationImpl(engine, graph, rule, null);
		LoggingApplicationMonitor monitor2 = new LoggingApplicationMonitor();
		app2.execute(monitor2);
		
		InterpreterUtil.executeOrDie(app2);
		resourceSetDiffModel.saveEObject(app2.getEGraph().getRoots().get(0), "3"+RESULT_INSTANCE_FILE_NAME);
		
		System.out.println(UNIT_NAME + " domain-specific rule applied and result is saved!");		
	}
		
	//*********************************************************************************************************
	public void runHenshinUniversityCoursesExample(String path, boolean saveResult) {
		String HENSHIN_FILE_NAME = "universityCourses.henshin";
		String INPUT_INSTANCE_FILE_NAME = "exampleUniversity.xmi";
		String RESULT_INSTANCE_FILE_NAME = "exampleUniversity_manageCourses-applied.xmi";
		String UNIT_NAME = "manageCourses";
		String PARAMETER_NAME = "startHour";
		Object PARAMETER_VALUE = 8;
		
		final HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		final Module module = resourceSet.getModule(HENSHIN_FILE_NAME, false);
		final EGraph graph = new EGraphImpl(resourceSet.getResource(INPUT_INSTANCE_FILE_NAME));
		final UnitApplication manageCoursesApplication = new UnitApplicationImpl(new EngineImpl());
		manageCoursesApplication.setEGraph(graph);
		manageCoursesApplication.setUnit(module.getUnit(UNIT_NAME));
		manageCoursesApplication.setParameterValue(PARAMETER_NAME, PARAMETER_VALUE);
		
		if (!manageCoursesApplication.execute(null)) {
			throw new RuntimeException("Error managing courses");
		} else if (saveResult) {
			resourceSet.saveEObject(graph.getRoots().get(0), RESULT_INSTANCE_FILE_NAME);
		}
	}
	
	public void runHenshinUniversityCoursesExample2(String path, boolean saveResult) {
		String HENSHIN_FILE_NAME = "universityCourses.henshin";
		String INPUT_INSTANCE_FILE_NAME = "exampleUniversity.xmi";
		String RESULT_INSTANCE_FILE_NAME = "exampleUniversity_manageCourses-applied3.xmi";
		String UNIT_NAME = "cleanupUninterestingCoursesUnit";
		
		final HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		final Module module = resourceSet.getModule(HENSHIN_FILE_NAME, false);
		final EGraph graph = new EGraphImpl(resourceSet.getResource(INPUT_INSTANCE_FILE_NAME));
		final UnitApplication manageCoursesApplication = new UnitApplicationImpl(new EngineImpl());
		manageCoursesApplication.setEGraph(graph);
		manageCoursesApplication.setUnit(module.getUnit(UNIT_NAME));
		
		if (!manageCoursesApplication.execute(null)) {
			throw new RuntimeException("Error managing courses");
		} else if (saveResult) {
			resourceSet.saveEObject(graph.getRoots().get(0), RESULT_INSTANCE_FILE_NAME);
		}
	}
		
	//@Test
	public void callRunHenshinUniversityCoursesExample() throws IOException {
		String workspacePath = System.getProperty("user.dir").replace("/", "\\");
		String path = workspacePath + "\\HenshinExample";
		//runHenshinUniversityCoursesExample(path, true);
		runHenshinUniversityCoursesExample2(path, true);
	}

	//@Test
	public void findSemanticDiffs() throws IOException {
		boolean saveResult = true;
		String modelDirectoryPath = wsPath + "\\casesMergeConflict\\refactoring\\diffModels";
		HenshinResourceSet resourceSetModel = new HenshinResourceSet(modelDirectoryPath);		
		// Load a model:
		Resource model = resourceSetModel.getResource("6b4e69083998c9683e34f21d191f3e2f11412ec8_dsmDiff.xmi"); 
		 
		// Load Henshin
		String henshinDirectoryPath = wsPath + "\\casesMergeConflict\\refactoring\\henshinRules";
		HenshinResourceSet resourceSetHenshin = new HenshinResourceSet(henshinDirectoryPath);
		// Load the module:
		org.eclipse.emf.henshin.model.Module module = 
				resourceSetHenshin.getModule("test_henshin_text.henshin");	 
		// Initialize the graph:
		EGraph graph = new EGraphImpl(model);	
		Interpreter interpreter= new Interpreter(modelDirectoryPath);	
		EGraph graphResult = interpreter.executeUnit(graph, module, "unitSequntialStar");
		
		
		interpreter.saveGraph(graphResult, "6b4e69083998c9683e34f21d191f3e2f11412ec8_dsmDiff_transformed_HenshinAPI.xmi");
		
		
		// Find the unit to be applied:
		///Unit unit = module.getUnit("unitSequntialStar");
		 
		// Apply the transformation 		
		// Prepare the engine:
		////Engine engine = new EngineImpl();
		/*
		InterpreterUtil.applyToResource(unit, engine, model);
		model.save(null);
		*/	
		/*
		// Apply the unit:
		UnitApplication application = new UnitApplicationImpl(engine, graph, unit, null);
		boolean executeResult = application.execute(null);
		 
		if (executeResult) {
			resourceSetModel.saveEObject(graph.getRoots().get(graph.getRoots().size()-1), "DSMDiff_transformed2.xmi");
			System.out.println("\nDSMDiff_transformed2.xmi Saved!");
			// Save the model:
			//model.save(null);
			//Map<String, Object> saveOptions = new HashMap<String, Object>();
			//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			model.save(null);//saveOptions);
		}
		*/		

		/*
		// Load the example model into an EGraph:
		EGraph graph = 
				new EGraphImpl(resourceSetPr.getResource("00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff.xmi"));
		
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		UnitApplication unit_unitsubstituteAlgorithmStar = new UnitApplicationImpl(engine);
		unit_unitsubstituteAlgorithmStar.setEGraph(graph);
		unit_unitsubstituteAlgorithmStar.setUnit(module.getUnit("unitSequntialStar2"));
		
		//org.eclipse.emf.henshin.model.Rule rule = module.getAllRules().get(module.getAllRules().size()-1);
		//Iterable<org.eclipse.emf.henshin.interpreter.Match> m =engine.findMatches(rule, graph, null);
		//long s = StreamSupport.stream(m.spliterator(), false).count();
		
		//unitSequntialStar.setParameterValue("client", "Alice"); client:in
		//unitSequntialStar.setParameterValue("accountId", 5); accountId:in
		if (!unit_unitsubstituteAlgorithmStar.execute(null)) {
			System.out.println("Error executing unitsubstituteAlgorithmStar!");
			throw new RuntimeException("Error executing");
		}
		System.out.println("\nunitsubstituteAlgorithmStar Executed!");
				
		// Saving the result:
		if (saveResult) {
			resourceSetPr.saveEObject(graph.getRoots().get(0), "00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff_transformed2.xmi");

			System.out.println("\n0c9dd117b4b3279c4f48238948005994c90a491_dsmDiff_transformed2.xmi Saved!");
		}
		*/
	}
	//*********************************************************************************************************

	 	// Let's merge every single diff
	 	////IMerger pseudoConflictMerger = new PseudoConflictMerger();			 
	 	//IMerger.Registry mergerRegistry = new IMerger.RegistryImpl();
	 	////IMerger conflictMerger = new ConflictMerger();
		////IMerger attributeChangeMerger = new AttributeChangeMerger();
    	// merger.copyAllRightToLeft(differences3Way, new BasicMonitor());
		 /*		 
		 resourceMergeResult = matchedResources.get(0).getRight();			 
		 URI uriRight = URI.createFileURI(resourceMergeResult.getURI().toString().replace("file:/", "").replace(".xmi", "_MergeResult.xmi"));
		 resourceMergeResult.setURI(uriRight);			 
		 resourceMergeResult.save(saveOptions);
		 */
	
	//*********************************************************************************************************
	//*********************************************************************************************************
	static void main() {
		
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
		g.dsmCasePath = henshinUrlPath;
		g.dsmCaseRulesFolderName = diffRulesFolder + slash;
		g.dsmCaseHenshinRulesFolderName = henshinRulesFolder + slash;
		g.dsmCaseRuleFileNames = sdRuleFiles;
		g.ruleMM_eNSURI = ruleMM2Way_eNSURI;
		g.ruleMM_eIN = ruleMM2Way_eIN;
		g.run();
		return g;
	}
	
	
	//*********************************************************************************************************
	
	
	
	
	/*ArrayList<String> dsmcRuleFiles	= new ArrayList<String>(
		Arrays.asList( 		
				"pullUpMethod.xmi", "pullUpMethod2.xmi", 
				"pullUpMethod3.xmi", "pullUpMethod4.xmi", "pullUpMethod5.xmi", "pullUpMethod6.xmi", "pullUpMethod7.xmi", "pullUpMethodInterface.xmi", 
				
				"pushDownMethod33.xmi", "pushDownMethod.xmi", "pushDownMethod2.xmi",
				"pushDownMethod3.xmi", "pushDownMethod4.xmi", "pushDownMethod5.xmi", "pushDownMethod6.xmi",
				
				"pullUpAttribute.xmi", "pullUpAttribute2.xmi","pullUpAttribute3.xmi",  		 					
				"pushDownAttribute.xmi", "pushDownAttribute2.xmi", "pushDownAttribute3.xmi",		 					
				"renamePackage.xmi",  "changePackage.xmi", "moveClassAcrossPackage.xmi", 
				//"extractAndMoveMethod2.xmi", "extractAndMoveMethod3.xmi",	
				"extractInterface.xmi", "extractInterface2.xmi", 		
				"extractMethod.xmi", "extractMethod1.xmi", 
				//"extractMethod2.xmi", "extractMethod3.xmi", "extractMethod4.xmi", "extractMethod5.xmi",
				"inlineMethod.xmi", 	
				"extractSuperclass.xmi", "extractSuperclass2.xmi",		 					
				//"extractSuperclass3.xmi",	 
				//"extractSuperclassAttr.xmi",  					
				//"extractSuperclassRef.xmi", 
				"moveAndRenameClassAcrossPackage.xmi",
				"moveClass.xmi", "moveClass2.xmi", 					 
				//"moveClass3.xmi", "moveClass4.xmi", "moveClass5.xmi", "moveClass6.xmi", "moveClass7.xmi",		 					 					 
				"moveMethod.xmi", "moveMethod2.xmi",		 					
				"moveMethod3.xmi", "moveMethod4.xmi",		 					
				"moveAttribute.xmi", "moveAttribute2.xmi", 
				"renameClass.xmi",		 					
				"renameMethod.xmi",		 					
				"renameAttribute.xmi"//, 		 							 					
				//"flattenHierarchyAttr.xmi",		 					
				//"mergeMetaClassAttr.xmi",		 					
				//"mergeRefrences.xmi", 
				//"pushDownRefrence.xmi",	
				//"pullUpRefrence.xmi"	
				//,"substituteAlgorithm.xmi" 					
				)
		);
	 */	
	
	
 					/*"extractSuperclassAttr.xmi",
 					"extractSuperclassRef.xmi",
 					"flattenHierarchyAttr.xmi",
 					"flattenHierarchyRef.xmi",
 					"mergeMetaclassAttr.xmi",
 					"mergeMetaclassRef.xmi",
 					"mergeReferences.xmi",
 					"moveAttribute.xmi",
 					"moveMethod.xmi",
 					"moveReference.xmi",
 					"pullUpAttribute.xmi",
 					"pullUpMethod.xmi",
 					"pullUpReference.xmi",
 					"pushDownAttribute.xmi",
 					"pushDownMethod.xmi",
 					"pushDownReference.xmi",
 					"removeMiddleMan.xmi",
 					"renameAttribute.xmi",
 					"renameMethod.xmi",
 					"renameReference.xmi"*/
	//_____________________________________________________
	//********************* Utilities *********************
	

	/*
	//@Test
	public void testMerge() { //Need to put conflicts and differences in comparisonResult and get set there not from comparison3Way
		 try {
			 initializeCaseStudy();
			 dsmc.setDsdRulePackages(sdRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
					 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);
			 Comparison comparison3Way= dsmc.ThreeWayEMFCompareDiffs(dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
					 	dsmc.getDSMDiffPath(), dsmc.getResultFilePath());	
			 EList<Diff> differences3Way = comparison3Way.getDifferences();
		     IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
		     IBatchMerger merger = new BatchMerger(mergerRegistry);
		     
		     //List<Diff> differences3WayToMerge = differences3Way.stream().filter(f->f instanceof AttributeChange).collect(Collectors.toList());
		     //merger.copyAllRightToLeft(differences3WayToMerge, new BasicMonitor());
		     
		     //Turn wrong same object ADD-ADD reported as contradicting conflict to equivalent conflict
		     List<org.eclipse.emf.compare.Conflict> conflicts = comparison3Way.getConflicts();
		     //ArrayList<org.eclipse.emf.compare.Conflict> wrongConflicts = new ArrayList<org.eclipse.emf.compare.Conflict>();
		     //ArrayList<Diff> wrongDiffs = new ArrayList<Diff>();
		     
		     for(org.eclipse.emf.compare.Conflict conflict: conflicts) {
		    	List<Diff> diffListLeft = conflict.getLeftDifferences();
		    	List<Diff> diffListRight = conflict.getRightDifferences();
		    	
		    	if(diffListLeft.size()==1 && diffListRight.size()==1) {
	    			Diff diffLeft = diffListLeft.get(0);
	    			Diff diffRight = diffListRight.get(0);
	    			if(diffLeft.getKind() == DifferenceKind.ADD 
	    					&& diffRight.getKind() == DifferenceKind.ADD) {
	    				EObject leftValue = ((ReferenceChange)diffLeft).getValue();
	    				EObject rightValue = ((ReferenceChange)diffRight).getValue();
	    				if(DsmcHelpers.isEqual(leftValue, rightValue)) {
	    					conflict.setKind(org.eclipse.emf.compare.ConflictKind.PSEUDO);
	    					//wrongConflicts.add(conflict);
    						//wrongDiffs.add(diffLeft);
    						//wrongDiffs.add(diffRight);
	    				}				
	    			}
	    		}
		     }	
		     //ADD-DELTE ....
		     //comparison3Way.getDifferences().removeAll(wrongDiffs);//It sets comparison3Way.Differences to null !!!
		     //comparison3Way.getConflicts().removeAll(wrongConflicts);//It sets comparison3Way.Differences to null !!!

		     //differences3Way.removeAll(wrongDiffs);
		    // conflicts.removeAll(wrongConflicts);
		     
		     
		     List<Diff> differences3WithoutConflict = 
		    		 differences3Way.stream().filter(f->f.getConflict() == null
		    		 ).collect(Collectors.toList());
		     merger.copyAllRightToLeft(differences3WithoutConflict, new BasicMonitor());
		     
		     List<Diff> differences3WithConflictLeft = 
		    		 differences3Way.stream().filter(f->f.getConflict() != null
		    		 && f.getConflict().getKind() == org.eclipse.emf.compare.ConflictKind.REAL 
		    		 && f.getSource() == DifferenceSource.LEFT).collect(Collectors.toList());		     
		     
		     
		     
		    for(Diff diffLeft:differences3WithConflictLeft) {
		    	//diff.discard();
		    	if(diffLeft instanceof AttributeChange){
		    		//MODIFY-MODIFY (CHANGE - CHANGE)
		    		//MODIFY-DELETE
		    		//Set to original value and let user to decide
		    		AttributeChange ac =  ((AttributeChange) diffLeft);
		    		ac.getMatch().getLeft().eSet(
		    				ac.getAttribute(), 
		    				ac.getMatch().getOrigin().eGet(ac.getAttribute()));	
		    	}
		    	else
		    	{
		    		org.eclipse.emf.compare.Conflict conflict = diffLeft.getConflict();
		    		
			    	List<Diff> diffListLeft = conflict.getLeftDifferences();
			    	List<Diff> diffListRight = conflict.getRightDifferences();
			    	
			    	if(diffListLeft.size()==1 && diffListRight.size()==1) {
		    			Diff diffRight = diffListRight.get(0);
		    			//DELETE - MODIFY (Class)
		    			if(diffLeft.getKind() == DifferenceKind.DELETE 
	    					&& diffRight.getKind() == DifferenceKind.CHANGE) {
		    				EObject diffLeftRCValueOrigin = ((ReferenceChange)diffLeft).getValue();//it gets from Origin
		    				EObject valueClone = DsmcHelpers.clone(diffLeftRCValueOrigin);		    				
		    				EObject diffLeftContainer = diffLeft.getMatch().getLeft();
		    				EReference refContainment = diffLeftRCValueOrigin.eContainmentFeature();		    						    				
		    				DsmcHelpers.setContainment(diffLeftContainer, refContainment, valueClone);		    						    				
		    			}
			    	}	    		
		    	}
		     }
		     
			 EList<MatchResource> matchedResources = comparison3Way.getMatchedResources();
			 Resource resourceMergeResult = null;
			 Map<String, Object> saveOptions = new HashMap<String, Object>();
			 
			 resourceMergeResult = matchedResources.get(0).getLeft();			 
			 URI uriLeft = URI.createFileURI(
					 resourceMergeResult.getURI().toString().replace("file:/", "").replace(".xmi", "_MergeResult_WithoutConflict.xmi"));
			 resourceMergeResult.setURI(uriLeft);
			 resourceMergeResult.save(saveOptions);
			 
			 System.out.println("Models are merged!");
			 Files.write(dsmc.vBranchLeft_File.toPath(), dsmc.contentVBranchLeftFile.getBytes(dsmc.charset));
			 Files.write(dsmc.vBranchRight_File.toPath(), dsmc.contentVBranchRightFile.getBytes(dsmc.charset));
			 Files.write(dsmc.VCommonAncestor_File.toPath(), dsmc.contentVCommonAncestorFile.getBytes(dsmc.charset));			 
		 } catch (IOException e) {
			 System.out.println("Problem occured in merging the Models!");
			 e.printStackTrace();
			 System.out.println("Models are merged!");
			 try {
				Files.write(dsmc.vBranchLeft_File.toPath(), dsmc.contentVBranchLeftFile.getBytes(dsmc.charset));
				Files.write(dsmc.vBranchRight_File.toPath(), dsmc.contentVBranchRightFile.getBytes(dsmc.charset));
				Files.write(dsmc.VCommonAncestor_File.toPath(), dsmc.contentVCommonAncestorFile.getBytes(dsmc.charset));
			} catch (IOException e1) {
				e1.printStackTrace();
			}			 
		}
	}
	*/

	
	
}
