package com.zadahmad.dsemfcompare.editor.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DSRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;
import com.zadahmad.dsmcompare.core.DsmComparatorController;

import pacmanDiffMM.PacmanDiffMMFactory;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacman2WayRuleMM.Pacman2WayRuleMMFactory;
import pacman2WayRuleMM.Pacman2WayRuleMMPackage;


public class CaseStudyDsmcPacman {
	String caseStudyName="pacman";
	String caseStudyPath="dsls/pacman/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String v1="V1.xmi";
	String v2="V2.xmi";
	DsmComparatorController dsmc= new DsmComparatorController();
	DSRulesToHenshinText 	dsmcRulesToHenshinText = new DSRulesToHenshinText();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\dsls\\pacman\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList(
 					"ghostmoves.xmi",  
 					"ghostmovesbottom.xmi",
 					"ghostmovesleft.xmi", 
 					"ghostmovesright.xmi", 
 					"ghostmovesup.xmi",
 					"pacmandies.xmi",
 					"pacmaneatsfood.xmi",
 					"pacmanmoves.xmi",  
 					"pacmanmovesbottom.xmi",
 					"pacmanmovesleft.xmi", 
 					"pacmanmovesright.xmi", 
 					"pacmanmovesup.xmi"));
	
	//@Test
	public void emfCompareResultToFineGranularDsmdiff()  throws IOException
	{ 
		 dsmc.initializeThreeWayComparison(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "Pacman.ecore", null);
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	PacmanDiffMMPackage.eNS_URI, PacmanDiffMMPackage.eINSTANCE, PacmanDiffMMFactory.eINSTANCE, 		 		 	
				 	Pacman2WayRuleMMPackage.eNS_URI, Pacman2WayRuleMMPackage.eINSTANCE, Pacman2WayRuleMMFactory.eINSTANCE,
				 	"Pacman");		 
		 dsmc.MapEmfCompareDiffsToFineGranularDSMDiffs(dsmc.getVLeftPath(), dsmc.getVRightPath(), dsmc.getDSMDiffPath(), dsmc.getResultFilePath());		 
	}

	//@Test
	public void dsmDiffRulesToHenshinTextRulesRun() 
	{
		dsmDiffRulesToHenshinTextRules(false);
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
	 
	@Test
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
		 mcdaSolver.domainName ="PacmanDiffMM";
		 mcdaSolver.execute();
		 
		 //Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, dsmcRulesToHenshinText.rulesFilter);		 
		 vs.execute(null,null,0);	
	}
}
