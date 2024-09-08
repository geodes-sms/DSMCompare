package com.zadahmad.dsemfcompare.editor.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DSRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.RuleAttributes;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;
import com.zadahmad.dsmcompare.core.DsmComparatorController;
import com.zadahmad.dsmcompare.core.threeWay.Version;
import com.zadahmad.dsmcompare.core.threeWay.VesrionInfo;

import dsmcompare.mmextension.MMExtension;
//import mergetestDiffMM.MergetestDiffMMFactory;
//import mergetestDiffMM.MergetestDiffMMPackage;
//import mergetestRuleMM.MergetestRuleMMFactory;
//import mergetestRuleMM.MergetestRuleMMPackage;

public class CaseStudyDsmcMergeTest {/*
	String caseStudyName="mergetest";
	String caseStudyPath= "DSMMerge/";//"dsls/oracle/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String vLeftFileName="V1.xmi";
	String vRightFileName="V2.xmi";
	String vCaFileName="CA.xmi";
	DsmComparatorController dsmc= new DsmComparatorController();
	DSRulesToHenshinText 	dsmcRulesToHenshinText = new DSRulesToHenshinText();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\DSMMerge\\dsdiffrulesinhenshin";
										//"\\dsls\\oracle\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList("Rule1.xmi","Rule2.xmi","Rule3.xmi","Rule4.xmi"));
	
	public void initializeCaseStudy() {
		ArrayList<VesrionInfo> versionsInfo = new ArrayList<VesrionInfo>();
		VesrionInfo vCaInfo= new VesrionInfo();
		vCaInfo.fileName=vCaFileName;
		vCaInfo.source = "Author vCA";
		vCaInfo.version = Version.ORIGIN;
		versionsInfo.add(vCaInfo);	
		
		VesrionInfo v1Info= new VesrionInfo();
		v1Info.fileName=vLeftFileName;
		v1Info.source = "Author v1";
		v1Info.version = Version.LEFT;
		versionsInfo.add(v1Info);		
		
		VesrionInfo v2Info= new VesrionInfo();
		v2Info.fileName=vRightFileName;
		v2Info.source = "Author v2";
		v2Info.version = Version.RIGHT;
		versionsInfo.add(v2Info);
		
		 dsmc.initializeThreeWayComparison(	
				 wsPathForImports+"/"+caseStudyPath+"MM/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "mergetest.ecore", versionsInfo);
	}
	
	//@Test
	public void generateDsDiffMM() throws IOException {
		initializeCaseStudy();
		String rootClassName ="ROOT";
		URI fileURI = URI.createFileURI(dsmc.getDSMMPath());
		MMExtension extender    = new MMExtension();
		Resource	DsDiffMM = extender.generateDsDiffMM(fileURI, rootClassName, false);
		System.out.println("generate DsDiffMM finished!");
	 }
	
	//@Test
	public void generateDsRuleMM() throws IOException {
		initializeCaseStudy();
		String rootClassName ="ROOT";
		URI fileURI = URI.createFileURI(dsmc.getDSMMPath());
		MMExtension extender    = new MMExtension();
		URI         diffmmURI    = extender.appendTextToFileNameInTheURI(fileURI,".ecore","DiffMM.ecore");		 
		Resource	DsRuleMM = extender.generateDsRuleMM(diffmmURI, rootClassName, false);
		System.out.println("generate DsRuleMM finished!");
	 }

	@Test
	 public void emfCompareResultToFineGranularDsmdiff()  throws IOException {
		 initializeCaseStudy();
		 dsmc.setDsdRulePackages(dsmcRuleFiles, 
				 	MergetestDiffMMPackage.eNS_URI, MergetestDiffMMPackage.eINSTANCE, MergetestDiffMMFactory.eINSTANCE, 		 		 	
				 	MergetestRuleMMPackage.eNS_URI, MergetestRuleMMPackage.eINSTANCE, MergetestRuleMMFactory.eINSTANCE,
				 	"mergetest");		 
		 dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 dsmc.getDSMDiffPath(), dsmc.getResultFilePath(), false);		 
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
		dsmcRulesToHenshinText.ruleMM_eNSURI = MergetestRuleMMPackage.eINSTANCE.eNS_URI;
		dsmcRulesToHenshinText.ruleMM_eIN = MergetestRuleMMPackage.eINSTANCE;
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
	*/
}
