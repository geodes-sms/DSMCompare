package com.zadahmad.dsemfcompare.editor.dsmcHenshin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.multicda.cda.ConflictAnalysis;
import org.eclipse.emf.henshin.multicda.cda.DependencyAnalysis;
import org.eclipse.emf.henshin.multicda.cda.MultiGranularAnalysis;
import org.eclipse.emf.henshin.multicda.cda.units.Atom;
import org.eclipse.emf.henshin.multicda.cda.units.Reason;
import org.eclipse.emf.henshin.multicda.cda.units.Span;
import org.eclipse.emf.henshin.preprocessing.Granularity;
import org.eclipse.emf.henshin.preprocessing.HenshinRuleLoader;
import org.eclipse.emf.henshin.preprocessing.NonDeletingPreparator;
import org.eclipse.emf.henshin.preprocessing.RulePair;
import org.eclipse.emf.henshin.preprocessing.RulePreparator;

public class MultiCdaSolver {	
	public String fullRulesSubDirectoryPath="";	
	public String domainName="";
	public List<Rule> rules;
	public int[][] conflictMatrix;
	public int[][] conflictCoarseMatrix;
	public int[][] conflictFineMatrix;
	public int[][] dependencyMatrix;
	
	
	public static List<Granularity> granularities =  Arrays.asList(
			Granularity.binary,
			Granularity.coarse,
			Granularity.fine
			);
	
	String logTimeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
	String path= domainName + "\\"+logTimeStamp+ ".log" ;
	private ResourceSetImpl resourceSet;

	private boolean WRITE_LOGS = false;

	public static void main(String[] args) {
		new MultiCdaSolver().run(granularities);
	}
	
	public void execute() {
		run(granularities);
	}
	
	public void run(List<Granularity> granularities) {
		init();		
		rules =  getRules(fullRulesSubDirectoryPath);
		prepareRules(rules);
		List<RulePair> nonDeleting = NonDeletingPreparator.prepareNonDeletingVersions(rules);
		doMultiGranularCdaConflictAnalysis(granularities, rules, nonDeleting);
		doMultiGranularCdaDependencyAnalysis(granularities, rules, nonDeleting);
	}
	

	public void init() {
		EcorePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		if (WRITE_LOGS )
			initLogs();
	}
	/*
	public List<Rule> getRules() {
		final File f = new File(MultiCdaSolver.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		String filePath = f.toString();
		String projectPath = filePath.replaceAll("bin", "");
		String subDirectoryPath = "src\\org\\eclipse\\emf\\henshin\\examples\\cda";
		String fullSubDirectoryPath = projectPath + subDirectoryPath;
		File dir = new File(fullSubDirectoryPath);
		return HenshinRuleLoader.loadAllRulesFromFileSystemPaths(dir);
	}
	*/
	public List<Rule> getRules(String fullRulesSubDirectoryPath) {
		File dir = new File(fullRulesSubDirectoryPath);
		return HenshinRuleLoader.loadAllRulesFromFileSystemPaths(dir);
	}
	
	protected void doMultiGranularCdaConflictAnalysis(List<Granularity> granularities,  List<Rule> rules,
			List<RulePair> nonDeleting) {
		logbn("Starting CDA with " + rules.size() + " rules CONFLICT Analysis.");

		if (granularities.contains(Granularity.atoms)) {
			logn("[MultiCDA] Computing conflict atoms-computeAtoms:");
			for (Rule r1 : rules) {
				for (RulePair r2 : nonDeleting) {
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new ConflictAnalysis(r1, r2.getCopy());
					Set<? extends Atom> result = ca.computeAtoms();
					log(result.size() + " ");
					tlog(System.currentTimeMillis() - time + " ");
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}

		if (granularities.contains(Granularity.binary)) {
			conflictMatrix = new int[rules.size()][rules.size()];
			int i=-1,j;
			logn("[MultiCDA] Computing binary granularity-computeResultsBinary:");
			for (Rule r1 : rules) {
				String exMsg="";
				++i;
				j=-1;
				for (RulePair r2 : nonDeleting) {
					++j;
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new ConflictAnalysis(r1, r2.getCopy());
					try {
						Span result = ca.computeResultsBinary();						
						log(result == null ? "0 " : "1 ");
						conflictMatrix[i][j]= result == null ? 0  : 1;
						tlog(System.currentTimeMillis() - time + " ");
					}
					catch(Exception ex) {
						log("0 ");//e:Exception
						exMsg += "["+r2.getCopy().getName()+"]";
						conflictMatrix[i][j]= -1;
						tlog(System.currentTimeMillis() - time + " ");
					}
					
				}
				log("   | " + r1.getName());
				logbn("   |Exceptions: " + exMsg);
			}
			logbn("");
		}

		if (granularities.contains(Granularity.coarse)) {
			conflictCoarseMatrix = new int[rules.size()][rules.size()];
			int i=-1,j;
			logn("[MultiCDA] Computing minimal conflict reasons-computeResultsCoarse:");
			for (Rule r1 : rules) {
				++i;
				j=-1;
				for (RulePair r2 : nonDeleting) {
					++j;
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new ConflictAnalysis(r1, r2.getCopy());
					try {
						Set<? extends Reason> result = ca.computeResultsCoarse();
						log(result.size() + " ");
						conflictCoarseMatrix[i][j]= result == null ? 0  : result.size();
					}
					catch(Exception ex) {
						log("0" + " ");
						conflictCoarseMatrix[i][j]= -1;
					}
					tlog(System.currentTimeMillis() - time + " ");
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}

		if (granularities.contains(Granularity.fine)) {
			conflictFineMatrix = new int[rules.size()][rules.size()];
			int i=-1,j;
			logn("[MultiCDA] Computing initial conflict reasons-computeResultsFine:");
			for (Rule r1 : rules) {
				++i;
				j=-1;
				List<Integer> resultRow = new ArrayList<Integer>();
				for (RulePair r2 : nonDeleting) {
					++j;
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new ConflictAnalysis(r1, r2.getCopy());
					try{
						Set<? extends Reason> result = ca.computeResultsFine();
						log(result.size() + ", ");
						conflictFineMatrix[i][j]= result == null ? 0  : result.size();
					
						tlog(System.currentTimeMillis() - time + " ");
						resultRow.add(result.size());
					}
					catch(Exception ex) {
						log("0" + ", ");
						conflictFineMatrix[i][j]= -1;
						resultRow.add(0);
					}
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}
	}

	
	
	protected void doMultiGranularCdaDependencyAnalysis(List<Granularity> granularities,  List<Rule> rules,
			List<RulePair> nonDeleting) {
		logbn("Starting CDA with " + rules.size() + " rules for DEPENDENCY Analysis.");

		if (granularities.contains(Granularity.atoms)) {
			logn("[MultiCDA] Computing conflict atoms:");
			for (Rule r1 : rules) {
				for (RulePair r2 : nonDeleting) {
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new DependencyAnalysis(r1, r2.getCopy());
					Set<? extends Atom> result = ca.computeAtoms();
					log(result.size() + " ");
					tlog(System.currentTimeMillis() - time + " ");
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}

		if (granularities.contains(Granularity.binary)) {
			dependencyMatrix = new int[rules.size()][rules.size()];
			int i=-1,j;
			logn("[MultiCDA] Computing binary granularity:");
			for (Rule r1 : rules) {
				++i;
				j=-1;
				for (RulePair r2 : nonDeleting) {
					++j;
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new DependencyAnalysis(r1, r2.getCopy());
					Span result = ca.computeResultsBinary();
					log(result == null ? "0 " : "1 ");
					dependencyMatrix[i][j]=result == null ? 0 : 1;
					tlog(System.currentTimeMillis() - time + " ");
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}

		if (granularities.contains(Granularity.coarse)) {
			logn("[MultiCDA] Computing minimal conflict reasons:");
			for (Rule r1 : rules) {
				for (RulePair r2 : nonDeleting) {
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new DependencyAnalysis(r1, r2.getCopy());
					Set<? extends Reason> result = ca.computeResultsCoarse();
					log(result.size() + " ");
					tlog(System.currentTimeMillis() - time + " ");
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}

		if (granularities.contains(Granularity.fine)) {
			logn("[MultiCDA] Computing initial conflict reasons:");
			for (Rule r1 : rules) {
				List<Integer> resultRow = new ArrayList<Integer>();
				for (RulePair r2 : nonDeleting) {
					long time = System.currentTimeMillis();
					MultiGranularAnalysis ca = 
							 new DependencyAnalysis(r1, r2.getCopy());
					Set<? extends Reason> result = ca.computeResultsFine();
					log(result.size() + " ");
					tlog(System.currentTimeMillis() - time + " ");
					resultRow.add(result.size());
				}
				logbn("   | " + r1.getName());
			}
			logbn("");
		}
	}

	protected void initLogs() {
		try {
			Files.write(Paths.get( "logs\\time\\"+path), new String().getBytes(), StandardOpenOption.CREATE_NEW);
			Files.write(Paths.get( "logs\\results\\"+path), new String().getBytes(), StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void logbn(String string) {
		log(string+"\n");
		tlog(string+"\n");
	}

	protected void tlog(String string) {
		if (WRITE_LOGS) {
			try {
				Files.write(Paths.get( "logs\\time\\"+path), string.getBytes(), StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void log(String string) {
		System.out.print(string);
		

		if (WRITE_LOGS) {
		try {
			Files.write(Paths.get( "logs\\results\\"+path), string.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}

	protected void logn(String string) {
		log(string+ "\n");
	}



	private static void prepareRules(List<Rule> rules) {
		List<Rule> prepared = new ArrayList<Rule>();
		rules.removeAll(rules.stream().filter(r -> !r.getMultiRules().isEmpty()).collect(Collectors.toList()));
		rules.forEach(r -> prepared.add(RulePreparator.prepareRule(r)));
		rules.clear();
		rules.addAll(prepared);
	}
}
