package com.zadahmad.dsemfcompare.editor.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DsmcRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;

import dsmcompare.mmextension.MMExtension;
import ecoreDiffMM.EcoreDiffMMFactory;
import ecoreDiffMM.EcoreDiffMMPackage;
import ecoreRuleMM.EcoreRuleMMFactory;
import ecoreRuleMM.EcoreRuleMMPackage;

public class CaseStudyDsmcGMFgraph {
	String caseStudyName="GMFgraph";
	String caseStudyPath="dsls/GMFgraph/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String v1="gmfgraph_1.29.ecore";
	String v2="gmfgraph_1.30.ecore";
	DsmComparatorController dsmc= new DsmComparatorController();
	DsmcRulesToHenshinText 	dsmcRulesToHenshinText = new DsmcRulesToHenshinText();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\dsls\\GMFgraph\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList(
 					//"extractSuperclassAttr.xmi",
 					));
	
	public void init() {
		 dsmc.setPathes(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "ecore.ecore", v1, v2);
	}
	
	//@Test
	public void generateDsDiffMM() throws IOException {
		init();
		String rootClassName ="EPackage";
		URI fileURI = URI.createFileURI(dsmc.DSMMPath);
		MMExtension extender    = new MMExtension();
		Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName);
	 }
	
	//@Test
	public void generateDsRuleMM() throws IOException {
		init();
		String rootClassName ="EPackage";
		URI fileURI = URI.createFileURI(dsmc.DSMMPath);
		MMExtension extender    = new MMExtension();
		URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI,".ecore","DiffMM.ecore");		 
		Resource	DsRuleMM = extender.generateDsRuleMM(diffmmURI, rootClassName);
	 }
	
	@Test
	public void emfCompareResultToFineGranularDsmdiff()  throws IOException
	{ 
		 dsmc.setPathes(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "Ecore.ecore", v1, v2);
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	EcoreDiffMMPackage.eNS_URI, EcoreDiffMMPackage.eINSTANCE, EcoreDiffMMPackage.eINSTANCE.getEFactoryInstance(), 		 		 	
				 	EcoreRuleMMPackage.eNS_URI, EcoreRuleMMPackage.eINSTANCE, EcoreRuleMMPackage.eINSTANCE.getEFactoryInstance(),
				 	"ecore");		 	
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
		dsmcRulesToHenshinText.ruleMM_eNSURI = EcoreRuleMMPackage.eINSTANCE.eNS_URI;
		dsmcRulesToHenshinText.ruleMM_eIN = EcoreRuleMMPackage.eINSTANCE;
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
		 mcdaSolver.domainName ="refactoringDiffMM";
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
