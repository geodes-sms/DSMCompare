package ca.umontreal.geodes.dsmcompare.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import ca.umontreal.geodes.dsmcompare.crRuleHenshin.TransformCRRuleToHenshin; 
import ca.umontreal.geodes.dsmcompare.core.DsmComparatorController;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.MultiCdaSolver;
import ca.umontreal.geodes.dsmcompare.verstexSorting.Edge;
import ca.umontreal.geodes.dsmcompare.verstexSorting.EdgeType;
import ca.umontreal.geodes.dsmcompare.verstexSorting.Vertex;
import ca.umontreal.geodes.dsmcompare.verstexSorting.VertexSorting;
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;
//import refactoringRuleMM.RefactoringRuleMMFactory;
//import refactoringRuleMM.RefactoringRuleMMPackage;

public class CaseStudyDsmcRefactoring {
	String caseStudyName="refactoring";
	String caseStudyPath="dsls/ecoreRefactoring/";
	String caseStudyDsmcRulesFolderName="dsdiffrules/";
	String caseStudyGeneratedHenshinRulesFolderName="dsdiffrulesinhenshin/";
	String v1="UML_1.4.2_CD_T.xmi";
	String v2="UML_2.0_CD_T.xmi";	
	//String v1="gmfgraph_1.29.xmi";
	//String v2="gmfgraph_1.30.xmi";	
	//String v1="mappings_1.45.xmi";
	//String v2="mappings_1.46.xmi";	
	//String v1="mappings_1.48.xmi";
	//String v2="mappings_1.49.xmi";//DSMDiff_mappings_1.55-mappings_1.56
	//String v1="mappings_1.51.xmi";
	//String v2="mappings_1.52.xmi";
	//String v1="mappings_1.55.xmi";
	//String v2="mappings_1.56.xmi";
	
	DsmComparatorController dsmc= new DsmComparatorController();
	TransformCRRuleToHenshin 	dsmcRulesToHenshinText = new TransformCRRuleToHenshin();
	String wsPath=System.getProperty("user.dir");		 
	String wsPathForImports=wsPath.replace("\\", "/");
	String workingRuledirectory = wsPath+"\\dsls\\ecoreRefactoring\\dsdiffrulesinhenshin";
	ArrayList<String> dsmcRuleFiles=new ArrayList<String>(
 			Arrays.asList(
 					"extractSuperclassAttr.xmi",
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
 					"renameReference.xmi"));
	
	@Test
	 public void emfCompareResultToFineGranularDsmdiff()  throws IOException
	 { 
		 dsmc.initializeThreeWayComparison(	
				 wsPathForImports+"/"+caseStudyPath+"metamodels/",  
				 wsPathForImports+"/"+caseStudyPath+"versionsfortest/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffrules/", 
				 wsPathForImports+"/"+caseStudyPath+"dsdiffafterruningatest/",
				 "refactoring.ecore", null);
		//dsmc.setDsdRulePackages(dsmcRuleFiles, 
		//		 	RefactoringDiffMMPackage.eNS_URI, RefactoringDiffMMPackage.eINSTANCE, RefactoringDiffMMFactory.eINSTANCE, 		 		 	
		//		 	RefactoringRuleMMPackage.eNS_URI, RefactoringRuleMMPackage.eINSTANCE, RefactoringRuleMMFactory.eINSTANCE,
		//		 	"refactoring");		 
		 dsmc.MapEmfCompareDiffsToFineGranularDSMDiffs(dsmc.getVLeftPath(), dsmc.getVRightPath(), dsmc.getDSMDiffPath(), dsmc.getResultFilePath());		 
	 }

	//@Test
	public void dsmDiffRulesToHenshinTextRulesRun() 
	{
		dsmDiffRulesToHenshinTextRules(false);
	}

	public TransformCRRuleToHenshin dsmDiffRulesToHenshinTextRules(boolean isATempFile) 
	{
		dsmcRulesToHenshinText.dsmName = caseStudyName;
		dsmcRulesToHenshinText.dsmCasePath = caseStudyPath;
		dsmcRulesToHenshinText.dsmCaseRulesFolderName = caseStudyDsmcRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseHenshinRulesFolderName = caseStudyGeneratedHenshinRulesFolderName;
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
		//dsmcRulesToHenshinText.ruleMM_eNSURI = RefactoringRuleMMPackage.eINSTANCE.eNS_URI;
		//dsmcRulesToHenshinText.ruleMM_eIN = RefactoringRuleMMPackage.eINSTANCE;
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
