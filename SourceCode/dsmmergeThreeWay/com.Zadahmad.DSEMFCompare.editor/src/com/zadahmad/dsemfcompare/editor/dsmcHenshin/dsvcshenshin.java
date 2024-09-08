package com.zadahmad.dsemfcompare.editor.dsmcHenshin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.cpa.CPAOptions;
import org.eclipse.emf.henshin.cpa.CPAUtility;
import org.eclipse.emf.henshin.cpa.CpaByAGG;
import org.eclipse.emf.henshin.cpa.ICriticalPairAnalysis;
import org.eclipse.emf.henshin.cpa.UnsupportedRuleException;
import org.eclipse.emf.henshin.cpa.result.CPAResult;
import org.eclipse.emf.henshin.cpa.result.Conflict;
import org.eclipse.emf.henshin.cpa.result.CriticalPair;
import org.eclipse.emf.henshin.cpa.result.Dependency;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.ProfilingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WrapFactory;

public class dsvcshenshin {
	public String workingRuledirectory= "";
	public String workingDsDiffdirectory= "";
	public String dsdiffModuleName= "";//henshin file name  
	public String cpaSemanticDiffModuleName= "";//henshin file name  
	public String cpaAutoFineDiffRulesModuleName= "";//henshin Auto-generated fine-diff file name  
	public String dsdiffFileName=""; //xmi file name
	HenshinResourceSet henshinRuleResourceSet=null;
	HenshinResourceSet dsdiffModelResourceSet=null;
	
	Module dsDiffRuleModule = null;
	Module cpaSemanticRuleModule 	= null;
	Module cpaAutoFineRulesModule 	= null;
	
	Resource dsdiffModelResource=null;
	
	public boolean useHenshinAPIToMatchRules=false;
	
	
	//Outputs
	public CPAResult dependencies	=	null;
	
	public CPAResult conflicts		=	null;
	
	public ArrayList<CriticalPair> conflictListCriticalPair = new ArrayList<CriticalPair>() ;
	
	public boolean runDependencies	=	false;
	
	public void init()
	{
		henshinRuleResourceSet = new HenshinResourceSet(workingRuledirectory);
		
		// Load the Henshin module:		
		dsDiffRuleModule 		= henshinRuleResourceSet.getModule(dsdiffModuleName);
		
		cpaAutoFineRulesModule 	= henshinRuleResourceSet.getModule(cpaAutoFineDiffRulesModuleName);
		cpaSemanticRuleModule 			= henshinRuleResourceSet.getModule(cpaSemanticDiffModuleName);
		
		
		if(useHenshinAPIToMatchRules) {
			// Load dsdiff-model 
			try {
				dsdiffModelResourceSet = new HenshinResourceSet(workingDsDiffdirectory);
				dsdiffModelResource = dsdiffModelResourceSet.getResource(dsdiffFileName);
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}
	
	public void runCpaForAttributeChange() {
		ICriticalPairAnalysis cpa;
		org.eclipse.emf.henshin.cpa.CPAOptions cpaoptions;
		cpa = new CpaByAGG();
		cpaoptions= new CPAOptions();
		
		List<Rule> allRules = new ArrayList<Rule>();
		
		List<Rule> rulesSemanticCPA     = CPAUtility.extractAllRules(cpaSemanticRuleModule);
		List<Rule> attributeChangeFineRules 		= CPAUtility.extractAllRules(cpaAutoFineRulesModule);
		
		
		try {
			Rule ruleUnitSequntialStar = rulesSemanticCPA.stream().filter(r->r.getName().contains("unitSequntialStar")).collect(Collectors.toList()).get(0);
			rulesSemanticCPA.remove(ruleUnitSequntialStar);
		} catch (Exception ex)
		{			
		}
		
		try {
			Rule ruleUnitSequntialStar = attributeChangeFineRules.stream().filter(r->r.getName().contains("unitSequntialStar")).collect(Collectors.toList()).get(0);
			attributeChangeFineRules.remove(ruleUnitSequntialStar);
		} catch (Exception ex)
		{			
		}
		
		try {
			List<Rule> noChangeRules = attributeChangeFineRules.stream().filter(r->!r.getName().toLowerCase().startsWith("change")).collect(Collectors.toList());
			attributeChangeFineRules.removeAll(noChangeRules);
		} catch (Exception ex)
		{			
		}
		
		try {
			//conflicts = new ArrayList<CriticalPair>();
			List<org.eclipse.emf.henshin.model.Rule> rulesToBeChecked = null;
			cpaoptions.setIgnore(true);			
			for(org.eclipse.emf.henshin.model.Rule ruleFirst:rulesSemanticCPA) {
				CPAResult conflictsTwo		=	null;				
				for(org.eclipse.emf.henshin.model.Rule ruleSecond:attributeChangeFineRules) {
					rulesToBeChecked = new ArrayList<org.eclipse.emf.henshin.model.Rule>();
					rulesToBeChecked.add(ruleFirst);
					rulesToBeChecked.add(ruleSecond);
					cpa.init(rulesToBeChecked, cpaoptions);
					conflictsTwo= cpa.runConflictAnalysis();
					for(CriticalPair c:conflictsTwo) {
						conflictListCriticalPair.add(c);
					}
				}				
			}
			
			//conflicts=conflictListCriticalPair;
			
		} catch (Exception ex) {
			System.out.print(ex.getMessage());		
		}
		
	}
	
	
	
	//run Critial Pair Analysis
	public void runcpa() {
		//CriticalPairAnalysis cpa= new CriticalPairAnalysis();
		// Create a resource set for the working directory "my/working/directory"
		
		
		//List<Unit> ruleunits= module.getUnits();
		
		// Prepare the engine:
		//Engine engine = new EngineImpl();
		
		ICriticalPairAnalysis cpa;
		org.eclipse.emf.henshin.cpa.CPAOptions cpaoptions;
		cpa = new CpaByAGG();
		cpaoptions= new CPAOptions();
		
		List<Rule> allRules = new ArrayList<Rule>();
		
		List<Rule> rulesSemanticCPA         = CPAUtility.extractAllRules(cpaSemanticRuleModule);
		List<Rule> rulesAutoFine = CPAUtility.extractAllRules(cpaAutoFineRulesModule);
		allRules.addAll(rulesSemanticCPA);
		allRules.addAll(rulesAutoFine);
		
		try {
			Rule ruleUnitSequntialStar = allRules.stream().filter(r->r.getName().contains("unitSequntialStar")).collect(Collectors.toList()).get(0);
			allRules.remove(ruleUnitSequntialStar);
		} catch (Exception ex)
		{			
		}
		
		try {
			cpa.init(allRules, cpaoptions);
			
			if(runDependencies) {
				dependencies= cpa.runDependencyAnalysis();
			}
			conflicts= cpa.runConflictAnalysis();			
		} catch (UnsupportedRuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void runHenshinMatcher()
	{
		// Prepare the engine:
		Engine engine = new EngineImpl();
		 
		// Initialize the graph:
		//EPackage dsdiffPackage = dsdiffModelResource.getContents().get(0).eClass().getEPackage();
		EGraph graph = new EGraphImpl(dsdiffModelResource); //dsdiffModelResource
		//graph.add(dsdiffModelResource.getContents().get(0));
		 
		// Find the unit to be applied:
		Unit unit = dsDiffRuleModule.getUnit("unitSequntialStar");
		 
		// Apply the unit
		
		UnitApplication application = new UnitApplicationImpl(engine, graph, unit, null);
		ProfilingApplicationMonitor monitor = new ProfilingApplicationMonitor();
		boolean isApplied = application.execute(monitor);
		
		if (!isApplied) {
			throw new RuntimeException("Error executing transformation");
		}

		monitor.printStats();
		
		
		try {
			/*
			// Load the instance model:
			EObject dsdiffModel = dsdiffModelResourceSet.getEObject(dsdiffFileName);
			// Wrap the instance model:
			Map<EObject,WObject> wrappedDsdiffModel = 
					WrapFactory.eINSTANCE.createWModelTree(Collections.singleton(dsdiffModel), true);
			WObject dsdiffModelWrapper = wrappedDsdiffModel.get(dsdiffModel);
			
			dsdiffModelResourceSet.saveEObject(dsdiffModelWrapper.getEObject(), "dsdiffTransformed.xmi");
			*/
					
			dsdiffModelResourceSet.saveEObject(graph.getRoots().get(0), "dsdiffTransformed.xmi");
			
			dsdiffModelResourceSet.saveEObject(application.getEGraph().getRoots().get(0), "dsdiffTransformed2.xmi");
			//dsdiffPackage.eResource().save(null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//EPackage result = (EPackage) application.getResultParameterValue("EPackage");

		//dsdiffModelResourceSet.saveEObject(result, "target.xmi");
	}
}
