package com.zadahmad.dsemfcompare.editor.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DsmcRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;

import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoRuleMM.ArduinoRuleMMFactory;
import arduinoRuleMM.ArduinoRuleMMPackage;
import dsmcompare.mmextension.MMExtension;

public class CaseStudyDsmcArduino {
	String caseStudyName="arduino";
	String caseStudyPath="dsls/arduino/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String v1="tiggertail1.xmi";//%%%%
	String v2="tiggertail2.xmi";//%%%%
	DsmComparatorController dsmc= new DsmComparatorController();
	DsmcRulesToHenshinText 	dsmcRulesToHenshinText = new DsmcRulesToHenshinText();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\dsls\\ecoreRefactoring\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList(
 					"AddAFunction.xmi",
 					"AddMusicPlayer.xmi",
 					"DeleteARepeatLoop.xmi",
 					"DeleteIncompleteWhileLoop.xmi",
 					"FunctionCall.xmi",
 					"IncreaseRepeatIteration.xmi",
 					"RefactorARepeatLoop.xmi",
 					"RefactorAWhileLoop.xmi",
 					"RefactorToAnIfCondition.xmi",
 					"ResetFunctionalityEnabled.xmi",
 					"ServoFeatureEnabled.xmi",
 					"SupportInfraredConnections.xmi"));
	
	//@Test
	public void dsmcContainerForPacmanInit() throws IOException
	 {		 	 		 
		 String rootClassName ="Project";
		 dsmc.setPathes(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "arduino.ecore", v1, v2);
		 URI fileURI = URI.createFileURI(dsmc.DSMMPath);
		 MMExtension extender    = new MMExtension();
		 //Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName );
		 URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI,".ecore","DiffMM.ecore");		 
		 //Resource	DsRuleMM = extender.generateDsRuleMM(diffmmURI, rootClassName);
	 }
	
	@Test
	 public void emfCompareResultToFineGranularDsmdiff()  throws IOException
	 { 
		 dsmc.setPathes(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "refactoring.ecore", v1, v2);
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	ArduinoDiffMMPackage.eNS_URI, ArduinoDiffMMPackage.eINSTANCE, ArduinoDiffMMFactory.eINSTANCE, 		 		 	
				 	ArduinoRuleMMPackage.eNS_URI, ArduinoRuleMMPackage.eINSTANCE, ArduinoRuleMMFactory.eINSTANCE,
				 	"arduino");		 
		 dsmc.MapEmfCompareDiffsToFineGranularDSMDiffs(dsmc.VerBasePath, dsmc.VerNewPath, dsmc.DSMDiffPath, dsmc.result);		 
	 }

	//@Test
	public void dsmDiffRulesToHenshinTextRulesRun() 
	{
		dsmDiffRulesToHenshinTextRules(false);
	}

	public DsmcRulesToHenshinText dsmDiffRulesToHenshinTextRules(boolean isATempFile) 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath = caseStudyPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = caseStudyDsmcRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = caseStudyGeneratedHenshinRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
		dsmcRulesToHenshinText.ruleMM_eNSURI = ArduinoRuleMMPackage.eINSTANCE.eNS_URI;
		dsmcRulesToHenshinText.ruleMM_eIN = ArduinoRuleMMPackage.eINSTANCE;
		dsmcRulesToHenshinText.run(isATempFile);
		return dsmcRulesToHenshinText;
	}
	 
	 //@Test
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
		 mcdaSolver.domainName ="arduinoDiffMM";
		 mcdaSolver.execute();
		 
		//Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, dsmcRulesToHenshinText.rulesFilter);		 
		 vs.execute(null, null, 0);	
	}	
}
