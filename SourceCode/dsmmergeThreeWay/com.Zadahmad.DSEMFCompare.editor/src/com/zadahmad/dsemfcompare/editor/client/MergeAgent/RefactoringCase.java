package com.zadahmad.dsemfcompare.editor.client.MergeAgent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.cpa.result.Conflict;
import org.eclipse.emf.henshin.cpa.result.ConflictKind;
import org.eclipse.emf.henshin.cpa.result.CriticalPair;
import org.eclipse.emf.henshin.cpa.result.Dependency;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.Interpreter;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.preprocessing.Granularity;
import org.junit.Test;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.ConflictCPA;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.DSRulesToHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.GenerateRandomTestConflictModel;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MMFineDiffRulesHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MMToFineGrainedHenshinText;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.dsvcshenshin;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;
import com.zadahmad.dsmcompare.core.DsmComparatorController;
import com.zadahmad.dsmcompare.core.RuleEngine.DsDiffModelToDsDiffRule;
import com.zadahmad.dsmcompare.core.threeWay.Version;
import com.zadahmad.dsmcompare.core.threeWay.VesrionInfo;

import dsmcompare.mmextension.MMExtension;
import dsmcompare.mmextension.utils.EMFUtils;
import refactoring2WayDiffMM.Refactoring2WayDiffMMFactory;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;
import refactoring2WayRuleMM.Refactoring2WayRuleMMFactory;
import refactoring2WayRuleMM.Refactoring2WayRuleMMPackage;
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import java.awt.*
;public class RefactoringCase {

	String wsPath = System.getProperty("user.dir").replace("/", "\\"); // "D:\\_udemSVN\\DSMCompare-Project\\srcCode\\dsmMerge\\com.Zadahmad.DSEMFCompare.editor
	
	
	static void main() {
		
	}
	
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
	
	
	//**************** Optional: Semi-Auto Generate dsRules from dsModels ****************
	//examples stored in diffRules / GeneratedRules / [rule name] / 
	//	(dsModels(CA,V1,V2 copied manually)/dsmDiffModelGenerated (copied)/dsRuleModelTransformed/manuallyCorrected)
	//Needs to be automated later
	
	public void step000() {
		//Prepare CA,V1,V2 manually and put it in the original dsModels folder		
		// V1 needs to be changed (V2 does not need to be changed from CA, but we need it)
	}
	
	//@Test//1//
	public void step001() {
		 try {
			 //long startTime = System.nanoTime();
			 emfCompareResultToFineGranularDsmdiffMM(); 
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
		dsmcRuleFiles	= new ArrayList<String>(Arrays.asList("extractMethod3.xmi", "extractMethod4.xmi")); 
		// extractSuperclassAttr, extractSuperclassRef, mergeRefrences, moveAttribute, moveRefrence,
		// pullUpAttribute, pullUpRefrence, pushDownAttribute, pushDownRefrence, renameAttribute, flattenHierarchyAttr, mergeMetaClassAttr
		dsmDiffRulesToHenshinTextRulesRun();
	}
	
	//**************** Henshin Rules ****************
	
	//diffRules to Henshin rules
	@Test //1//
	public void step006() {
		//dsmcRuleFiles	= new ArrayList<String>(Arrays.asList("extractMethod4.xmi")); 

		dsmDiffRulesToHenshinTextRulesRun();
	}
	//diffRules to Henshin CPA conflict/dependancy detection rules
	//@Test
	public void step007() {
		dsmDiffRulesToHenshinTextRulesRunForCPA();
	}
	//Generate Henshin Post rules to set Author of Semantic difference
	//@Test
	public void step008() {
		dsmDiffRulesToHenshinTextPostRulesRun();
	}
	//(Auto) Generate Henshin Fine-Diff rules
	///@Test//1// It sometimes works in debug not in run
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
	//Find potential conflicts among Semantic/Fine Attribute change Rules
	//Kept only change rules, otherwise it takes a long time to 
	//Use CPA, as Multi-CDA cannot fine attribute changes
	//produce the conflict results
	//////@Test
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
	//@Test
	public void step0014() {
		try {//Static conflicts
			findSemanticSemantic_SemanticFineConflicts();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	//**************** Prepare refactoring model version out of conflicting commits ****************
	//Create java projects out of conflicting commits
	
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
	
	public String[] getAllSubDirectories(String srcDirectory) {
		File srcirectory = new File(srcDirectory);
		return srcirectory.list(new FilenameFilter() {
			  @Override
			  public boolean accept(File current, String name) {
			    return new File(current, name).isDirectory();
			  }
			});
	}	

	//Create Abstract projects out of three versions of each conflicting of each projects
	// Abstract projects : only having java files moved to a single pkg package 
	//1//@Test	
	public void step0001() throws IOException
	{
		//Get java project name
		String[] projDirectories = {"POSA-14"};// getAllSubDirectories(refConflictsRootDir);
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
					Stream<Path> srcPaths = Files.walk(Paths.get(srcCommitVersionPath));
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
	
	
	//Create all DsDiff Models for evaluation
	//@Test//1
	public void step0005() throws IOException {
		System.out.println("Start of Creating all DsDiff Models for evaluation!");
		boolean removeAllFineSemanticConflicts = true;
		//emfCompareResultToFineGranularDsmdiffMM(); //call over CA, Va, and V2 and create DSMDiff.xmi		
		initializeCaseStudy();
		dsmc.setDsdRulePackages(dsmcRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
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
							
							Resource rsourceDSMDiff = dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(vCAPath, vLeftPath, vRightPath, dsmDiffPath, resultFilePath);	
							
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
																		= EMFUtils.getEReferenceByNameNullDefault(rootDSDiff,refSemanticconflictsName);		
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
		boolean saveResult = true;
		String modelDirectoryPath = wsPath + "\\casesMergeConflict\\refactoring\\diffModels"  ;// "\\caseStudiesMerge\\diffModels\\realm-java"; \\casesMergeConflict\\refactoring\\diffModels
		HenshinResourceSet resourceSetModel = new HenshinResourceSet(modelDirectoryPath);		
		// Load a model:
		Resource model = resourceSetModel.getResource("DSMDiff.xmi"); //00c9dd117b4b3279c4f48238948005994c90a491_dsmDiff
		 
		// Load Henshin
		String henshinDirectoryPath = wsPath + "\\casesMergeConflict\\refactoring\\henshinRules";
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
		interpreter.saveGraph(graphResult, "DSMDiff_transformed3.xmi");
		
		
		// Find the unit to be applied:
		Unit unit = module.getUnit("unitSequntialStar");
		 
		// Apply the transformation 
		
		// Prepare the engine:
		Engine engine = new EngineImpl();
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

	
	public void step0006_Manual() {
		//Manual
		// Call  RefactoringRulesDSDiff_henshin_text.henshin over DSMDiff.xmi and create DSMDiff_transformed.xmi
	}
		
	//@Test
	public void step0007Test() throws IOException {	
		String[][] stringElementAndRuleSet = 
				new String[][] {
				{"extractMethod","methodBody"}, 
				{"extractMethod2","methodBody"},  
				{"extractMethod3","methodBody"},  
				{"extractMethod4","methodBody"}, 
				{"substituteAlgorithm","methodBody"}};
		String dsDiffFolder = wsPath + "\\caseStudiesMerge\\diffModels\\";
		String pdiffPth = dsDiffFolder 
				+ "\\titan\\"+"ef37b417f5532f1f2d6731f5d88c4119be4c53ae"+"_dsmDiff_transformed.xmi";
					
    	try {
			dsmc.postRuleApplicationAuthorSet(pdiffPth,diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
    	}catch(Exception ex) {
    		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>  Error:");
    		System.out.println("\nin: " + pdiffPth.toString());
    		System.out.println("\nException: \n" + ex.getLocalizedMessage());
    		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	}
	}
	
	//post Rule Application Author Set
	//@Test
	public void step0007() throws IOException {	
		//Manual part Not needed anymore: i.e, Calling  refactoringRulesDSDiffPostRules.henshin_text on _transformed.xmi files
		System.out.println("\nStart of post Rule Application Author Set!");		
		String diffModelsDirName 	= "diffModels";		
		ArrayList<String> dsDiffModelFoldersToSkip = new ArrayList<String>();
		dsDiffModelFoldersToSkip.add("_realm-java");
		
		String[][] stringElementAndRuleSet = 
				new String[][] {
				{"extractMethod","methodBody"}, 
				{"extractMethod2","methodBody"},  
				{"extractMethod3","methodBody"},  
				{"extractMethod4","methodBody"}, 
				{"substituteAlgorithm","methodBody"}};		
		
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

	
	//post Rule Application Author Set TEST
	//1//@Test//1//
	public void step0007_Test() throws IOException {	
		//Manual part Not needed anymore: i.e, Calling  refactoringRulesDSDiffPostRules.henshin_text on _transformed.xmi files
		System.out.println("\nStart of post Rule Application Author Set!");		
		String diffModelsDirName 	= "diffModels";		
		ArrayList<String> dsDiffModelFoldersToSkip = new ArrayList<String>();
		dsDiffModelFoldersToSkip.add("_realm-java");
		
		String[][] stringElementAndRuleSet = 
				new String[][] {
				{"extractMethod","methodBody"}, 
				{"extractMethod2","methodBody"},  
				{"extractMethod3","methodBody"},  
				{"extractMethod4","methodBody"}, 
				{"substituteAlgorithm","methodBody"}};	
				
		String p =wsPath + "\\caseStudiesMerge\\diffModels\\";
		p += "storm\\";
		p += "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed2_2.xmi";
				
	    dsmc.postRuleApplicationAuthorSet(p,diffMM_eNSURI, diffMM_eIN, stringElementAndRuleSet);	
		
		System.out.println("\nEnd of post Rule Application Author Set!");	
	}
	
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
		dsmcRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
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
		    List<Path> refDiffPathList = refDiffsPaths.filter(var -> var.toString().endsWith("_dsmDiff_transformed2.xmi")).collect(Collectors.toList());
		    
		    for(Path pdiffPth:refDiffPathList) 
		    {
		    	String p=pdiffPth.toString();
		    	//String p=wsPath + "\\caseStudiesMerge\\diffModels\\closure-compiler\\161666f048d59314dc1ecdcb57f0a578e68188a5_dsmDiff_transformed.xmi";
		    	System.out.println("\nDiff model:"+ p);
		    	try {
		    	 	dsmc.findSemanticFineDiffConflicts(p, diffMM_eNSURI, diffMM_eIN, 
		    				ruleMM2Way_eNSURI, ruleMM2Way_eIN, dsmcRuleFilePaths, changeConflictsCPA, 
		    				semanticFineConflictsMultiCDA, false);		

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
	
	//find Semantic<--->Fine-Diff Conflicts
	//@Test//1//
	public void step0008_Test() throws IOException {	
		System.out.println("\nStart of find Semantic<--->Fine-Diff Conflicts!");
		String ruleFolderPath = diffRulesPath;
		ArrayList<String> dsmcRuleFilePaths 	= new ArrayList<String>();		
		initializeCaseStudy();
		dsmcRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));
		ArrayList<ConflictCPA> changeConflictsCPA = getChangeConflictsCPA(henshinRulesPath + fileNameForChangeConflicts);		
		ArrayList<ConflictCPA> semanticFineConflictsMultiCDA = getSemanticFineConflictsMultiCDA(henshinRulesPath + fileNameForSemanticFineConflicts);	
		
		//String caseStudiesMergeDir  = wsPath + "\\caseStudiesMerge";
		//String diffModelsDirName 	= "diffModels";			
		//String  caseStudiesMergeDiffDir = caseStudiesMergeDir + dblSlash + diffModelsDirName;
		//String  caseDire = "realm-java";
		//String  commitId="semSemConflict";

		//String p= caseStudiesMergeDiffDir + dblSlash + caseDire + dblSlash + commitId + "_dsmDiff_transformed.xmi";
		//String p =wsPath + "\\casesMergeConflict\\refactoring\\diffModels\\Conflict_SemanticSemantic\\semSemConflict_dsmDiff_transformed.xmi";
		//String p =wsPath + "\\casesMergeConflict\\refactoring\\diffModels\\Equivalent_SemanticSemantic\\semSemEquivalent_dsmDiff_transformed.xmi";
		String p = wsPath + "\\caseStudiesMerge\\diffModels\\";
		p += "storm\\";
		p += "11768ba2025c89ec6cccc232f682c50a46865dc8_dsmDiff_transformed2_2.xmi";
		System.out.println("\nFile Path: " + p);

		dsmc.findSemanticFineDiffConflicts(p, diffMM_eNSURI, diffMM_eIN, ruleMM2Way_eNSURI, ruleMM2Way_eIN, 
				dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, true);		

		System.out.println("\nEnd of find Semantic<--->Fine-Diff Conflicts!");
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
		    		
		    		ResourceSet rsetDSMDiff	=	dsmc.setResourceSet(p,diffMM_eNSURI, diffMM_eIN);	
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
			    				EMFUtils.getAttrValueByAttrNameNullDefault(s,"name")));
			    		
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
    				EMFUtils.getAttrValueByAttrNameNullDefault(s,"name")));

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
	
	//@Test
	public void helperRemoveDuplicatesFromCsv() throws IOException {
		
		String csvDirInCaseStudy = csvDir;
		Stream<Path> csvFilePaths = Files.walk(Paths.get(csvDirInCaseStudy));
	    List<Path> csvFilePathList = csvFilePaths.filter(var -> var.toString().endsWith(".csv")).collect(Collectors.toList());
	    for(Path csvFilePath:csvFilePathList) {
	    	System.out.println("\ncsv file:"+ csvFilePath.toString());
	    	try {
				EMFUtils.removeDuplicatesFromCsv(csvFilePath.toString(), true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    System.out.println("\nAll csv files parsed and duplicate entries are removed.");		
	}
	

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
	
	
	
	//**************** Execution ****************
	//**************** Execution ****************
	//1. Create DsDiff Model
	//@Test//1//
	public void step1() {
		try {
			emfCompareResultToFineGranularDsmdiffMM(); //call over CA, V1, and V2 and create DSMDiff.xmi
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
		g.dsmCaseRuleFileNames = dsmcRuleFiles;
		g.ruleMM_eNSURI = ruleMM2Way_eNSURI;
		g.ruleMM_eIN = ruleMM2Way_eIN;
		g.run();
		return g;
	}
		
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
		dsmcRuleFiles.forEach(f->dsmcRuleFilePaths.add(ruleFolderPath+f));		
		
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
	 	
	 	
	 	dsmc.findSemanticFineDiffConflicts(diffPostFilePath,diffMM_eNSURI, diffMM_eIN, 
				ruleMM2Way_eNSURI, ruleMM2Way_eIN, dsmcRuleFilePaths, changeConflictsCPA, semanticFineConflictsMultiCDA, false);		
	}
	
	//Find conflicts among semantic/Fine-grained differences using Henshin CPA APIs
	//@Test  
	public void findSemantic_AttributeChangeConflicts() throws IOException 
	{		 
		//Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs		 
		dsvcshenshin dcpa 				= new dsvcshenshin();
		dcpa.useHenshinAPIToMatchRules	= false;
		dcpa.workingRuledirectory 		= henshinRulesPath;
		dcpa.dsdiffModuleName 			= henshinRulesCPAFileName;		 
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
		
	
	//Find conflict between rules by HENSHIN MULTI CDA APIs
	//@Test  //MULTI CDA - HENSHIN
	public void findSemanticSemantic_SemanticFineConflicts() throws IOException
	{
		 if(dsmcRulesToHenshinText==null || dsmcRulesToHenshinText.rulesFilter==null 
				 || dsmcRulesToHenshinText.rulesFilter.size()<1) {
		  	dsmcRulesToHenshinText = dsmDiffRulesToHenshinTextRules(true);
		 }
		 
		 //Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs			 
		 //Find conflict pairs among rules using Henshin MultiCda
		 //Could not seperate because of dependency to rulesFilter
		 MultiCdaSolver mcdaSolver= new MultiCdaSolver();
		 mcdaSolver.fullRulesSubDirectoryPath = henshinRulesPath;//diffRulesPath;
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
					conflicts.add(mcdaSolver.rules.get(i).getName() + ","+mcdaSolver.rules.get(j).getName() 
						 + "," + mcdaSolver.conflictFineMatrix[i][j]);
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
	public void emfCompareResultToFineGranularDsmdiffMM()  throws IOException {
		 initializeCaseStudy();
		 dsmc.setDsdRulePackages(dsmcRuleFiles, diffMM_eNSURI, diffMM_eIN, diffMMFactory_eIN, 		 		 	
				 	ruleMM2Way_eNSURI, ruleMM2Way_eIN, ruleMM2WayFactory_eIN, caseStudyName);		 
		 dsmc.ThreeWayEMFCompareDiffsToDSMCFineDiffs(dsmc.getVCAPath(),dsmc.getVLeftPath(), dsmc.getVRightPath(), 
				 	dsmc.getDSMDiffPath(), dsmc.getResultFilePath());		 
		System.out.println("emf-Compare result transformed to Fine-Grained DsmdiffMM!");
	}	

	//****************************************
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
	 		
	//****************************************	
	//Find conflict between rules by HENSHIN MULTI CDA APIs
	//@Test  //MULTI CDA - HENSHIN
	public void dsmcConflictManagement()
	{
		 if(dsmcRulesToHenshinText==null || dsmcRulesToHenshinText.rulesFilter==null || dsmcRulesToHenshinText.rulesFilter.size()<1) {
		  	dsmcRulesToHenshinText = dsmDiffRulesToHenshinTextRules(true);
		 }
		 
		 //Use corresponding henshin rules to find dependencies and conflicts between rules and to match dsdiffs	
		 
		 //Find conflict pairs among rules using Henshin MultiCda
		 //Could not seperate because of dependency to rulesFilter
		 MultiCdaSolver mcdaSolver= new MultiCdaSolver();
		 mcdaSolver.fullRulesSubDirectoryPath = diffRulesPath;
		 mcdaSolver.domainName = diffDomainName;
		 mcdaSolver.execute();
		 
		 //Conflict resolution: Generate the best execution order for the conflicting rules 
		 ArrayList<String> ruleNames= new ArrayList<String>();
		 mcdaSolver.rules.stream().forEach(r->ruleNames.add(r.getName()));
		 int[][] conflictFineMatrix=mcdaSolver.conflictFineMatrix.clone();		 
		 VertexSorting vs= new VertexSorting();
		 vs.ConflictResultToVSProblem(ruleNames,conflictFineMatrix, dsmcRulesToHenshinText.rulesFilter);		 
		 vs.execute(null,null, 0);	
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
	String dsModelsFolder			= "dsModels";
	String henshinRulesFolder		= "henshinRules";
	String metaModelsFolder			= "metaModels";
	String bkSlash					= "\\";
	String slash					= "/";	
	String henshinUrlPath			= caseStudyRootFolder	+ slash + caseStudyFolder + slash;
	String caseStudyPath			= wsPath 		+ bkSlash + caseStudyRootFolder		+ bkSlash	+ caseStudyFolder;
	String diffModelsPath			= caseStudyPath + bkSlash + diffModelsFolder 		+ bkSlash;
	String diffRulesPath			= caseStudyPath + bkSlash + diffRulesFolder  		+ bkSlash;
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
	String henshinRulesFileName		= caseStudyName + "RulesDsDiff_henshin_text.henshin";
	String henshinTextCPARulesFileName	= caseStudyName + "RulesCPA.henshin_text";
	String henshinRulesCPAFileName		= caseStudyName + "RulesCPA_henshin_text.henshin";
	
	String henshinTextPostRulesFileName	
									= caseStudyName + "PostRules.henshin_text";
	String henshinTextAutoGeneratedFineRulesFileName
									= caseStudyName + "AutoGeneratedFineRules.henshin_text";
	String henshinAutoGeneratedFineRulesFileName
									= caseStudyName + "AutoGeneratedFineRules_henshin_text.henshin";
	
	DsmComparatorController dsmc	= new DsmComparatorController();
	DSRulesToHenshinText 	dsmcRulesToHenshinText 			
									= new DSRulesToHenshinText();
	MMToFineGrainedHenshinText 	mmToFineGrainedHenshinText 	
									= new MMToFineGrainedHenshinText();
	
	ArrayList<String> dsmcRuleFiles	= new ArrayList<String>(
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

 					"extractAndMoveMethod2.xmi",
 					"extractAndMoveMethod3.xmi",
 					

 					"extractInterface2.xmi", 
 					"extractInterface.xmi", 					
					
 					"extractMethod.xmi",
 					"extractMethod1.xmi", 
 					"extractMethod2.xmi",
 					"extractMethod3.xmi",
 					"extractMethod4.xmi", 
 					"extractMethod5.xmi", 					

 					"extractSuperclass.xmi", 
 					"extractSuperclass2.xmi",
 					"extractSuperclass3.xmi",
 					"extractSuperclassAttr.xmi",  					
 					"extractSuperclassRef.xmi", 
 					
 					"moveAndRenameClass.xmi",
 					"moveAndRenameClassAcrossPackage.xmi",

 					
 					"moveClass.xmi", 
 					"moveClass2.xmi", 					 
 					"moveClass3.xmi", 
 					"moveClass4.xmi", 
 					"moveClass5.xmi", 
 					"moveClass6.xmi", 
 					 					 
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
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
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
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
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
		dsmcRulesToHenshinText.dsmCaseRuleFileNames = dsmcRuleFiles;
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
	        System.out.println("Successfully wrote to the file.");
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
	

	
	
	
}
