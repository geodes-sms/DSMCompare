package com.zadahmad.dsemfcompare.editor.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DsmcRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.RuleAttributes;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;

import dsmcompare.mmextension.MMExtension;
import oracleDiffMM.OracleDiffMMFactory;
import oracleDiffMM.OracleDiffMMPackage;
import oracleRuleMM.OracleRuleMMFactory;
import oracleRuleMM.OracleRuleMMPackage;

public class CaseStudyDsmcEcore {
	String caseStudyName="ecore";
	String caseStudyPath="dsls/ecoreRefactoring/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String v1="v1.xmi";
	String v2="v2.xmi";
	DsmComparatorController dsmc= new DsmComparatorController();
	DsmcRulesToHenshinText 	dsmcRulesToHenshinText = new DsmcRulesToHenshinText();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\dsls\\oracle\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList("Rule1.xmi","Rule2.xmi","Rule3.xmi","Rule4.xmi"));
	
	public void init() {
		 dsmc.setPathes(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "Ecore.ecore", v1, v2);
	}
	
	//@Test
	public void generateDsDiffMM() throws IOException {
		init();
		String rootClassName ="EPackage";
		URI fileURI = URI.createFileURI(dsmc.DSMMPath);
		MMExtension extender    = new MMExtension();
		Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName);
	 }
	
	@Test
	public void generateDsRuleMM() throws IOException {
		init();
		String rootClassName ="EPackage";
		URI fileURI = URI.createFileURI(dsmc.DSMMPath);
		MMExtension extender    = new MMExtension();
		URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI,".ecore","DiffMM.ecore");		 
		Resource	DsRuleMM = extender.generateDsRuleMM(diffmmURI, rootClassName);
	 }

	 public void emfCompareResultToFineGranularDsmdiff()  throws IOException {
		 init();
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	OracleDiffMMPackage.eNS_URI, OracleDiffMMPackage.eINSTANCE, OracleDiffMMFactory.eINSTANCE, 		 		 	
				 	OracleRuleMMPackage.eNS_URI, OracleRuleMMPackage.eINSTANCE, OracleRuleMMFactory.eINSTANCE,
				 	"oracle");		 
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
		dsmcRulesToHenshinText.ruleMM_eNSURI = OracleRuleMMPackage.eINSTANCE.eNS_URI;
		dsmcRulesToHenshinText.ruleMM_eIN = OracleRuleMMPackage.eINSTANCE;
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
		 mcdaSolver.domainName ="oracleDiffMM";
		 mcdaSolver.execute();
		 
		 //Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, dsmcRulesToHenshinText.rulesFilter);		 
		 vs.execute(null,null, 0);	
	}
	
}
