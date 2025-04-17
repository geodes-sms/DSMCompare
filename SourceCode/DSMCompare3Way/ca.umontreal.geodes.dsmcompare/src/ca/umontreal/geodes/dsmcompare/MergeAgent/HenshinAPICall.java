package ca.umontreal.geodes.dsmcompare.MergeAgent;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.Interpreter;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.junit.Test;

public class HenshinAPICall {
@Test
public void step0006() throws IOException {
	String wsPath = System.getProperty("user.dir").replace("/", "\\"); 
	//boolean saveResult = true;
	String modelDirectoryPath = wsPath;//+ "\\casesMergeConflict\\refactoring\\diffModels"  ;// "\\caseStudiesMerge\\diffModels\\realm-java"; \\casesMergeConflict\\refactoring\\diffModels
	HenshinResourceSet resourceSetModel = new HenshinResourceSet(modelDirectoryPath);		
	// Load a model:
	Resource model = resourceSetModel.getResource("DSMDiff.xmi"); //00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff
	 
	// Load Henshin
	String henshinDirectoryPath = wsPath;// + "\\casesMergeConflict\\refactoring\\henshinRules";
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

}
