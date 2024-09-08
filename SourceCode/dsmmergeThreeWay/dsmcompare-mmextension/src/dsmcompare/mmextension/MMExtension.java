package dsmcompare.mmextension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import dsmcompare.mmextension.extensions.*;
import dsmcompare.mmextension.utils.DSDIFF;
import dsmcompare.mmextension.utils.DiffRef;
import dsmcompare.mmextension.utils.EMFUtils;
//import dsmcompare.mmextension.utils.EMFUtils;
import dsmcompare.mmextension.utils.EMFUtils.ChangeStatus;
import dsmcompare.mmextension.utils.EMFUtils.AUTHOR;
import dsmcompare.mmextension.utils.EMFUtils.DiffKind;

public class MMExtension {
	
	//*********generate 3Way DsDiffMM and 3Way DsRuleMM	
	
	private List<IMMExtension> extensions() {
		//3Way extensions
		List<IMMExtension> extensions = new ArrayList<>();
		extensions.add(new DiffClass());
		extensions.add(new DiffReference());
		return extensions;
	}
	
	//*********generate 3Way DsDiffMM
	public Resource generateDsDiffMM(URI ecoreFileURI, String rootClassName)
	{
		//3Way DsDiffMM
		if(ecoreFileURI!=null)
		{
			String diffMMPostfix = "DiffMM"; //Uses Custom EMap (for serialization purpose)
			//CLONE the MM
			// read the resource inside the file
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(ecoreFileURI, true);
			
			// read all metamodels from the content and add to the newly created resource set 	
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) {
				if (obj instanceof EPackage) {						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}			
			
			// extend the MM 
			List<IMMExtension> extensions = extensions();
			
			for (EPackage pack : metamodel) {
				pack.setName(pack.getName()+diffMMPostfix);
				pack.setNsPrefix(pack.getNsPrefix()+diffMMPostfix);
				pack.setNsURI(pack.getNsURI()+diffMMPostfix);
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//Add two Enum to the Meta-Model
				if(classifiers!=null)
				{					
					EEnum eeDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeDiffKind.setName("DiffKind");
					for(DiffKind cDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(cDiffKind.name());
					    eEnumLiteral.setLiteral(cDiffKind.name());
					    eEnumLiteral.setValue(cDiffKind.ordinal()); 
					    eeDiffKind.getELiterals().add(eEnumLiteral);	
					}	
					
					EEnum eeAuthor = EcoreFactory.eINSTANCE.createEEnum();
					eeAuthor.setName("AUTHOR");
					for(AUTHOR aAuthor:AUTHOR.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aAuthor.name());
					    eEnumLiteral.setLiteral(aAuthor.name());
					    eEnumLiteral.setValue(aAuthor.ordinal()); 
					    eeAuthor.getELiterals().add(eEnumLiteral);	
					}
					

					EEnum eeChangeStatus = EcoreFactory.eINSTANCE.createEEnum();
					eeChangeStatus.setName("ChangeStatus");
					for(ChangeStatus aChangeStatus:ChangeStatus.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aChangeStatus.name());
					    eEnumLiteral.setLiteral(aChangeStatus.name());
					    eEnumLiteral.setValue(aChangeStatus.ordinal()); 
					    eeChangeStatus.getELiterals().add(eEnumLiteral);	
					}
					
					pack.getEClassifiers().add(eeDiffKind);
					pack.getEClassifiers().add(eeAuthor);
					pack.getEClassifiers().add(eeChangeStatus);
										
					EObject Root=null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					// Create a SemanticObject class
					EClass semanticObjectClass = EMFUtils.createEClass("SemanticObject", false, pack);
					EMFUtils.createEAttribute("name", semanticObjectClass, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, false, false);					
					pack.getEClassifiers().add(semanticObjectClass);				
					
					// Create a SemanticDiff (DomainSpecificDiff) class
					EClass semanticDiff = EMFUtils.createEClass("SemanticDiff", true, pack,semanticObjectClass);
					EMFUtils.createEAttribute("author", semanticDiff, pack.getEClassifier("AUTHOR"), 
							1, 1, false, false, true, false, "NON");
					pack.getEClassifiers().add(semanticDiff);
					//EMFUtils.createEReference("semanticdiffs", (EClass) Root, dsdDiffClass, 0, -1, true);	//(EClass) pack.getEClassifier("DomainSpecificDiff")									
					
					// Create a SemanticConflict class
					EClass SemanticConflictClass = EMFUtils.createEClass("SemanticConflict", true, pack, semanticObjectClass);
					pack.getEClassifiers().add(SemanticConflictClass);				
					EMFUtils.createEReference("semanticdiffs", SemanticConflictClass, semanticDiff, 0, -1, true, false);	
					//EMFUtils.createEReference("semanticconflicts", (EClass) Root, SemanticConflictClass, 0, -1, true);								
									
					//Extend Meta-Model
					for (EClassifier cl : classifiers) {
						extensions.forEach(extension -> extension.extend(cl));
						if (cl instanceof EClass) {
							List<EStructuralFeature> features = new ArrayList<>(((EClass)cl).getEStructuralFeatures());
							for (EStructuralFeature feature : features) {
								extensions.forEach(extension -> extension.extend(feature));
							}
						}
					}
					
					// Add a reference from SemanticDiff (DomainSpecificDiff) class to some other classes 				
					
					List<EClassifier>  classifiersToBeLinkedFromSemanticObject = 
							findClassifiersToBeLinkedFromSemanticObject(Root, classifiers, pack.getEClassifiers());	
					
					for(EClassifier clr : classifiersToBeLinkedFromSemanticObject) {
							EMFUtils.createEReference(semanticObjectClass.getName()+"_"+clr.getName(), semanticObjectClass, clr, 0, -1, false, false);//@@@@@ change true to false    //"domainspecificdiffs"					
					}					
					
					//Add a reference from SemanticConflictClass class to all other Diff classes  
					/****
					for(EClassifier c : pack.getEClassifiers()) {
						if(!c.eClass().toString().toLowerCase().contains("eenum")) {
							for(EAttribute a:((EClass)c).getEAllAttributes()) {
								if(a.getEType().getName().equals("DiffKind") || a.getEType().getName().equals("DiffKind")) {
									EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+c.getName(), SemanticConflictClass, c, 0, -1, false);
									break;
								}
							}
						}
					}
					
					EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+semanticDiff.getName(), 
							SemanticConflictClass, semanticDiff, 0, -1, false);
					****/
				}
			}			
			
						
			URI         path    = appendTextToFileNameInTheURI(ecoreFileURI,".ecore",diffMMPostfix + ".ecore");
			Resource    newfile = resourceSet.createResource(path);
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		
		return null;
	}

	//*********generate 2Way DsDiffMM and 2Way DsRuleMM
	
	
	private List<IMMExtension> extensions2WayDiffMM () {
		List<IMMExtension> extensions = new ArrayList<>();
		extensions.add(new DiffClass2Way());
		extensions.add(new DiffReference2Way());
		return extensions;
	}

	private List<EClassifier> findClassifiersToBeLinkedFromSemanticObject(EObject root, 
			List<EClassifier> classifiers, List<EClassifier> extensionClassifiers) {
		Set<EClassifier>  classifiersToBeLinkedFrodmDsDiff = new HashSet<EClassifier>();
		//Classes to be linked from dsdDiffClass
		for(EClassifier c : classifiers) {
			if(//!c.equals(Root) &&  // Commented beacause we need to consider the changes in the root when finding semantic diffs and  conflicts
				 !c.eClass().toString().toLowerCase().contains("eenum") 
				&& ((EClass)c).getESuperTypes().size()==0)
			{
				classifiersToBeLinkedFrodmDsDiff.add(c);
			}
		}
		//association diff Classes to be linked from dsdDiffClass
		for(EClassifier c : extensionClassifiers) {
			if(!c.eClass().toString().toLowerCase().contains("eenum")) {
				for(EAttribute a:((EClass)c).getEAllAttributes()) {
					if(a.getEType().getName().equals("DiffKind")) {
						classifiersToBeLinkedFrodmDsDiff.add(c);
						break;
					}
				}
			}
		}	
		
		return classifiersToBeLinkedFrodmDsDiff.stream().sorted(new Comparator<EClassifier>() {
		    @Override
		    public int compare(EClassifier o1, EClassifier o2) {
		        return ((EClass)o1).getName().compareTo(((EClass)o2).getName());
		    }
		}).collect(Collectors.toList());
	}

	
	public Resource generate2WayDsDiffMM(URI ecoreFileURI, String rootClassName)
	{
		//2Way DsDiffMM
		if(ecoreFileURI!=null)
		{
			String diffMMPostfix = "2WayDiffMM"; //Uses Custom EMap (for serialization purpose)
			//CLONE the MM
			// read the resource inside the file
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(ecoreFileURI, true);
			
			// read all metamodels from the content and add to the newly created resource set 	
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) {
				if (obj instanceof EPackage) {						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}			
			
			// extend the MM 
			List<IMMExtension> extensions = extensions2WayDiffMM();
			
			for (EPackage pack : metamodel) {
				pack.setName(pack.getName()+diffMMPostfix);
				pack.setNsPrefix(pack.getNsPrefix()+diffMMPostfix);
				pack.setNsURI(pack.getNsURI()+diffMMPostfix);
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//Add two Enum to the Meta-Model
				if(classifiers!=null)
				{					
					EEnum eeClassDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeClassDiffKind.setName("DiffKind");
					for(DiffKind cDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(cDiffKind.name());
					    eEnumLiteral.setLiteral(cDiffKind.name());
					    eEnumLiteral.setValue(cDiffKind.ordinal()); 
					    eeClassDiffKind.getELiterals().add(eEnumLiteral);	
					}	
					pack.getEClassifiers().add(eeClassDiffKind);
					
					/*			
					EEnum eeAscDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeAscDiffKind.setName("DiffKind");
					
					
					for(DiffKind aDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aDiffKind.name());
					    eEnumLiteral.setLiteral(aDiffKind.name());
					    eEnumLiteral.setValue(aDiffKind.ordinal()); 
					    eeAscDiffKind.getELiterals().add(eEnumLiteral);	
					}	
					pack.getEClassifiers().add(eeAscDiffKind);
					*/	
					
					EObject Root=null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					// Create a SemanticObject class
					EClass semanticObjectClass = EMFUtils.createEClass("SemanticObject", false, pack);
					EMFUtils.createEAttribute("name", semanticObjectClass, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, false, false);
					pack.getEClassifiers().add(semanticObjectClass);				
					
					// Create a SemanticDiff (DomainSpecificDiff) class
					EClass semanticDiff = EMFUtils.createEClass("SemanticDiff", true, pack,semanticObjectClass);
					pack.getEClassifiers().add(semanticDiff);

					// Create a SemanticConflict class
					EClass SemanticConflictClass = EMFUtils.createEClass("SemanticConflict", true, pack, semanticObjectClass);
					pack.getEClassifiers().add(SemanticConflictClass);				
					EMFUtils.createEReference("semanticdiffs", SemanticConflictClass, semanticDiff, 0, -1, true, false);	
					
									
					//Extend Meta-Model
					for (EClassifier cl : classifiers) {
						extensions.forEach(extension -> extension.extend(cl));
						if (cl instanceof EClass) {
							List<EStructuralFeature> features = new ArrayList<>(((EClass)cl).getEStructuralFeatures());
							for (EStructuralFeature feature : features) {
								extensions.forEach(extension -> extension.extend(feature));
							}
						}
					}
					
					// Add a reference from SemanticDiff (DomainSpecificDiff) class to some other classes 				
					
					List<EClassifier>  classifiersToBeLinkedFromSemanticObject = 
							findClassifiersToBeLinkedFromSemanticObject(Root, classifiers, pack.getEClassifiers());	
					
					for(EClassifier clr : classifiersToBeLinkedFromSemanticObject) {
							EMFUtils.createEReference(semanticObjectClass.getName()+"_"+clr.getName(), semanticObjectClass, clr, 0, -1, false, false);//@@@@@ change true to false    //"domainspecificdiffs"					
					}
					
					
					//Add a reference from SemanticConflictClass class to all other Diff classes  
					
					/****
					for(EClassifier c : pack.getEClassifiers()) {
						if(!c.eClass().toString().toLowerCase().contains("eenum")) {
							for(EAttribute a:((EClass)c).getEAllAttributes()) {
								if(a.getEType().getName().equals("DiffKind") || a.getEType().getName().equals("DiffKind")) {
									EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+c.getName(), SemanticConflictClass, c, 0, -1, false);
									break;
								}
							}
						}
					}
					
					
					EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+semanticDiff.getName(), 
							SemanticConflictClass, semanticDiff, 0, -1, false);
					****/
				}				
			}	
			
						
			URI         path    = appendTextToFileNameInTheURI(ecoreFileURI,".ecore",diffMMPostfix + ".ecore");
			Resource    newfile = resourceSet.createResource(path);
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		
		return null;
	}
	
	public Resource generate2WayDsRuleMM(URI dsdiffFileURI, String rootClassName)
	{
		if(dsdiffFileURI!=null)
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(dsdiffFileURI, true);
			
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) 
			{
				if (obj instanceof EPackage) 
				{						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}
			
			List<IMMExtension> extensions = extensions();			
			EPackage packNew= EcoreFactory.eINSTANCE.createEPackage();
			EPackage pack = metamodel.get(0);
			packNew.setName(pack.getName().replaceAll("DiffMM","RuleMM"));
			packNew.setNsPrefix(pack.getNsPrefix().replaceAll("DiffMM","RuleMM"));
			packNew.setNsURI(pack.getNsURI().replaceAll("DiffMM","RuleMM"));					
			
			List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());				
			if(classifiers!=null)
			{					
				EClass ecRule = EcoreFactory.eINSTANCE.createEClass();
				ecRule.setName("Rule");					
				EMFUtils.createEAttribute("name", ecRule, EcorePackage.eINSTANCE.getEString(), 
						1, 1, false, false, true, true);
				EMFUtils.createEAttribute("constraints", ecRule, EcorePackage.eINSTANCE.getEString(), 
						0, -1, false, false, true, true);	
				
				EObject Root= null;
				if(rootClassName!=null && rootClassName!="") {
					Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
				}
				else {
					Root = EMFUtils.getTheRoot(pack);
				}
				System.out.println(Root);					
				
				//Create Patterns and find the Type of the Rule.RLHS					
				for (EClassifier diffClass : classifiers) 
				{
					if (diffClass instanceof EClass)
					{
						EClass srcClass = (EClass)diffClass;
						EClass patternRuleClass = 
								EMFUtils.createEClass("Pattern_"+diffClass.getName(), !srcClass.isAbstract(), packNew, srcClass);

						EMFUtils.createEAttribute("ID_Pattern", patternRuleClass, EcorePackage.eINSTANCE.getEInt(),
								1, 1, false, false, true, true);
						
						//if(!diffClass.getName().equals("DomainSpecificDiff")) 
						{
							EMFUtils.createEAttribute("filter", patternRuleClass, EcorePackage.eINSTANCE.getEBoolean(), 
									1, 1, false, false, true, true);
							EAttribute attrIsForbidden = 
									EMFUtils.createEAttribute("isForbidden", patternRuleClass, 
											EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, true, true);
							attrIsForbidden.setDefaultValue(false);	
						}
					}
				}
				
				List<EClassifier>  classifiersToBeLinkedFromSemanticObject = 
						findClassifiersToBeLinkedFromSemanticObject(Root, classifiers, pack.getEClassifiers());	
				
				for(EClassifier clr : classifiersToBeLinkedFromSemanticObject) {
					EMFUtils.createEReference("rulePattern_"+((EClass) clr).getName(), ecRule, (EClass) clr, 0, -1, true, false);					
					//EMFUtils.createEReference(semanticObjectClass.getName()+"_"+clr.getName(), semanticObjectClass, clr, 0, -1, false);//@@@@@ change true to false    //"domainspecificdiffs"					
				}
				
				
				//We will point to Root instead of Pattern_Root
				//%%%%//EMFUtils.createEReference("pattern", ecRule, (EClass) Root, 0, 1, true);
				packNew.getEClassifiers().add(ecRule);	
				resource.getContents().add(packNew);			
			}
			
			// save result in new file
			URI         path    = null;
			path    = appendTextToFileNameInTheURI(dsdiffFileURI,"DiffMM.ecore","RuleMM.ecore");
			Resource    newfile = resourceSet.createResource(path);	
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		return null;
	}
		
	
	//##############################################
	//*********generate 3Way DsDiffMM
	public Resource generateDsDiffMMOld(URI ecoreFileURI, String rootClassName)
	{
		//3Way DsDiffMM
		if(ecoreFileURI!=null)
		{
			String diffMMPostfix = "DiffMM"; //Uses Custom EMap (for serialization purpose)
			//CLONE the MM
			// read the resource inside the file
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(ecoreFileURI, true);
			
			// read all metamodels from the content and add to the newly created resource set 	
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) {
				if (obj instanceof EPackage) {						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}			
			
			// extend the MM 
			List<IMMExtension> extensions = extensions();
			
			for (EPackage pack : metamodel) {
				pack.setName(pack.getName()+diffMMPostfix);
				pack.setNsPrefix(pack.getNsPrefix()+diffMMPostfix);
				pack.setNsURI(pack.getNsURI()+diffMMPostfix);
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//Add two Enum to the Meta-Model
				if(classifiers!=null)
				{					
					EEnum eeClassDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeClassDiffKind.setName("DiffKind");
					for(DiffKind cDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(cDiffKind.name());
					    eEnumLiteral.setLiteral(cDiffKind.name());
					    eEnumLiteral.setValue(cDiffKind.ordinal()); 
					    eeClassDiffKind.getELiterals().add(eEnumLiteral);	
					}					
					/*				
					EEnum eeAscDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeAscDiffKind.setName("DiffKind");
					for(DiffKind aDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aDiffKind.name());
					    eEnumLiteral.setLiteral(aDiffKind.name());
					    eEnumLiteral.setValue(aDiffKind.ordinal()); 
					    eeAscDiffKind.getELiterals().add(eEnumLiteral);	
					}	
					*/
					EEnum eeAuthor = EcoreFactory.eINSTANCE.createEEnum();
					eeAuthor.setName("AUTHOR");
					for(AUTHOR aAuthor:AUTHOR.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aAuthor.name());
					    eEnumLiteral.setLiteral(aAuthor.name());
					    eEnumLiteral.setValue(aAuthor.ordinal()); 
					    eeAuthor.getELiterals().add(eEnumLiteral);	
					}
					

					EEnum eeChangeStatus = EcoreFactory.eINSTANCE.createEEnum();
					eeChangeStatus.setName("ChangeStatus");
					for(ChangeStatus aChangeStatus:ChangeStatus.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aChangeStatus.name());
					    eEnumLiteral.setLiteral(aChangeStatus.name());
					    eEnumLiteral.setValue(aChangeStatus.ordinal()); 
					    eeChangeStatus.getELiterals().add(eEnumLiteral);	
					}
					
					pack.getEClassifiers().add(eeClassDiffKind);
					//pack.getEClassifiers().add(eeAscDiffKind);
					pack.getEClassifiers().add(eeAuthor);
					pack.getEClassifiers().add(eeChangeStatus);
										
					EObject Root=null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					// Create a SemanticDiff (DomainSpecificDiff) class
					EClass dsdDiffClass = EMFUtils.createEClass("DomainSpecificDiff", true, pack);
					EMFUtils.createEAttribute("name", dsdDiffClass, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, false, false);
					EMFUtils.createEAttribute("author", dsdDiffClass, pack.getEClassifier("AUTHOR"), 
							1, 1, false, false, true, false, "NON");
					pack.getEClassifiers().add(dsdDiffClass);
					EMFUtils.createEReference("domainspecificdiffs", (EClass) Root, dsdDiffClass, 0, -1, true, false);	//(EClass) pack.getEClassifier("DomainSpecificDiff")									
				

					// Create a SemanticConflict class
					EClass SemanticConflictClass = EMFUtils.createEClass("SemanticConflict", true, pack);
					EMFUtils.createEAttribute("name", SemanticConflictClass, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, false, false);
					pack.getEClassifiers().add(SemanticConflictClass);
					EMFUtils.createEReference("semanticconflicts", (EClass) Root, SemanticConflictClass, 0, -1, true, false);								
					
				
					//Extend Meta-Model
					for (EClassifier cl : classifiers) {
						extensions.forEach(extension -> extension.extend(cl));
						if (cl instanceof EClass) {
							List<EStructuralFeature> features = new ArrayList<>(((EClass)cl).getEStructuralFeatures());
							for (EStructuralFeature feature : features) {
								extensions.forEach(extension -> extension.extend(feature));
							}
						}
					}
					
					//Add a reference from dsdDiffClass class to some other Diff classes 
					
					List<EClassifier>  classifiersToBeLinkedFrodmDsDiff = 
							findClassifiersToBeLinkedFromSemanticObject(Root, classifiers, pack.getEClassifiers());	
					
					for(EClassifier clr : classifiersToBeLinkedFrodmDsDiff) {
						EMFUtils.createEReference(dsdDiffClass.getName()+"_"+clr.getName(), dsdDiffClass, clr, 0, -1, false, false);//@@@@@ change true to false    //"domainspecificdiffs"					
					}
					
					
					//Add a reference from SemanticConflictClass class to all other Diff classes  
					
					for(EClassifier c : pack.getEClassifiers()) {
						if(!c.eClass().toString().toLowerCase().contains("eenum")) {
							for(EAttribute a:((EClass)c).getEAllAttributes()) {
								if(a.getEType().getName().equals("DiffKind") || a.getEType().getName().equals("DiffKind")) {
									EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+c.getName(), SemanticConflictClass, c, 0, -1, false);
									break;
								}
							}
						}
					}
					EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+dsdDiffClass.getName(), 
							SemanticConflictClass, dsdDiffClass, 0, -1, false, false);
					

				}
			}			
			
						
			URI         path    = appendTextToFileNameInTheURI(ecoreFileURI,".ecore",diffMMPostfix + ".ecore");
			Resource    newfile = resourceSet.createResource(path);
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		
		return null;
	}

	//The following is not used in 3Way diffing, merging
	public Resource generateDsRuleMMOld(URI dsdiffFileURI, String rootClassName)
	{
		//3Way DsRuleMM
		//Resource resource= EcoreUtil.copy(resource1) ;
		if(dsdiffFileURI!=null)
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(dsdiffFileURI, true);
			
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) 
			{
				if (obj instanceof EPackage) 
				{						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}
			
			List<IMMExtension> extensions = extensions();
			
			
			//for (EPackage pack : metamodel) 
			{
				EPackage packNew= EcoreFactory.eINSTANCE.createEPackage();
				////////%%%%%%%%EPackage pack = metamodel.get(1);
				EPackage pack = metamodel.get(0);
				packNew.setName(pack.getName().replaceAll("DiffMM","RuleMM"));
				packNew.setNsPrefix(pack.getNsPrefix().replaceAll("DiffMM","RuleMM"));
				packNew.setNsURI(pack.getNsURI().replaceAll("DiffMM","RuleMM"));					
				
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//EObject Root=null;
				
				if(classifiers!=null)
				{					
					EClass ecRule = EcoreFactory.eINSTANCE.createEClass();
					ecRule.setName("Rule");					
					EMFUtils.createEAttribute("name", ecRule, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, true, true);
					EMFUtils.createEAttribute("constraints", ecRule, EcorePackage.eINSTANCE.getEString(), 
							0, -1, false, false, true, true);	
					
					EObject Root= null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					
					System.out.println(Root);
					//org.eclipse.emf.ecore.impl.EClassImpl@701fc37a (name: Root) (instanceClassName: null) (abstract: false, interface: false)					
					//Following didnot work
					//System.out.println(EcoreUtil.getRootContainer(pack));
					//org.eclipse.emf.ecore.impl.EPackageImpl@44a3ec6b (name: PacmanGoAugmentedRuleMM) (nsURI: http://www.zadahmad.org/dsmcompare/PacmanGoAugmentedRuleMM, nsPrefix: PacmanGoAugmentedRuleMM)
									
					EObject Pattern_Root=null;
					EObject Pattern_DiffRoot=null;
					
					//Create Patterns and find the Type of the Rule.RLHS					
					for (EClassifier diffClass : classifiers) 
					{
						if (diffClass instanceof EClass)
						{
							EClass srcClass = (EClass)diffClass;
							EClass patternRuleClass = 
									EMFUtils.createEClass("Pattern_"+diffClass.getName(), !srcClass.isAbstract(), packNew, srcClass);
							//For Custom map
							//if(diffClass.getInstanceTypeName() != null && diffClass.getInstanceTypeName().equalsIgnoreCase("java.util.Map$Entry"))
							//	patternRuleClass.setInstanceTypeName("java.util.Map$Entry");
							EMFUtils.createEAttribute("ID_Pattern", patternRuleClass, EcorePackage.eINSTANCE.getEInt(),
									1, 1, false, false, true, true);
							//EMFUtils.createEAttribute("ID_Pattern", pCl, EcorePackage.eINSTANCE.getEInt(), 1, 1, true);
							//EAttribute Id = EMFUtils.getIdEAttribute(pCl);
							//if(Id!=null)
							//	Id.setID(false);
							EMFUtils.createEAttribute("filter", patternRuleClass, EcorePackage.eINSTANCE.getEBoolean(), 
									1, 1, false, false, true, true);
							
							//Boolean isForbiddenExist= ((EClass) diffClass).getESuperTypes().size() >0 ;
							//Boolean isListContainer= ((EClass) diffClass).getName().startsWith("_List");

							//if(!isForbiddenExist && !isListContainer) 
							{
								EAttribute attrIsForbidden = 
										EMFUtils.createEAttribute("isForbidden", patternRuleClass, 
												EcorePackage.eINSTANCE.getEBoolean(), 
												1, 1, false, false, true, true);
								attrIsForbidden.setDefaultValue(false);	
							}
							//EMFUtils.createEReference("pattern"+cl.getName(), ecRule, (EClass) pCl, 1, -1, true);
							//EMFUtils.createEReference("pattern", ecRule, (EClass) pCl, 1, -1, true);
							if(srcClass.getName()==((EClass) Root).getName())
							{
								Pattern_Root=patternRuleClass;
							}
							
							if(srcClass.getName().equals(("Diff" + ((EClass) Root).getName())))
							{
								Pattern_DiffRoot=patternRuleClass;
							}
							
							
							
							//attrIsForbidden = EMFUtils.createEAttribute("isForbidden", (EClass) dsdDiffClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false);
							//attrIsForbidden.setDefaultValue(false);
							
						}
					}				
					
					
					EMFUtils.createEReference("pattern", ecRule, (EClass) Pattern_Root, 0, 1, true);
					EMFUtils.createEReference("patternDiff", ecRule, (EClass) Pattern_DiffRoot, 0, 1, true);
					packNew.getEClassifiers().add(ecRule);	
					resource.getContents().add(packNew);
				
				}
				//metamodel.add(packNew);
			}			
			
			
			// save result in new file
			//String      mmpath  = fileURI.devicePath().replaceAll("DiffMM.ecore", "RuleMM.ecore");
			URI         path    = null;
			path    = appendTextToFileNameInTheURI(dsdiffFileURI,"DiffMM.ecore","RuleMM.ecore");//URI.createURI("file://" + mmpath);
			Resource    newfile = resourceSet.createResource(path);		
			//newfile.getContents().addAll(resource1.getContents());
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		return null;
	}
	
	//*********generate 2Way DsDiffMM and 2Way DsRuleMM
	public Resource generate2WayDsRuleMMOld(URI dsdiffFileURI, String rootClassName)
	{
		if(dsdiffFileURI!=null)
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(dsdiffFileURI, true);
			
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) 
			{
				if (obj instanceof EPackage) 
				{						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}
			
			List<IMMExtension> extensions = extensions();			
			EPackage packNew= EcoreFactory.eINSTANCE.createEPackage();
			EPackage pack = metamodel.get(0);
			packNew.setName(pack.getName().replaceAll("DiffMM","RuleMM"));
			packNew.setNsPrefix(pack.getNsPrefix().replaceAll("DiffMM","RuleMM"));
			packNew.setNsURI(pack.getNsURI().replaceAll("DiffMM","RuleMM"));					
			
			List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());				
			if(classifiers!=null)
			{					
				EClass ecRule = EcoreFactory.eINSTANCE.createEClass();
				ecRule.setName("Rule");					
				EMFUtils.createEAttribute("name", ecRule, EcorePackage.eINSTANCE.getEString(), 
						1, 1, false, false, true, true);
				EMFUtils.createEAttribute("constraints", ecRule, EcorePackage.eINSTANCE.getEString(), 
						0, -1, false, false, true, true);	
				
				EObject Root= null;
				if(rootClassName!=null && rootClassName!="") {
					Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
				}
				else {
					Root = EMFUtils.getTheRoot(pack);
				}
				System.out.println(Root);					
				
				//Create Patterns and find the Type of the Rule.RLHS					
				for (EClassifier diffClass : classifiers) 
				{
					if (diffClass instanceof EClass)
					{
						EClass srcClass = (EClass)diffClass;
						EClass patternRuleClass = 
								EMFUtils.createEClass("Pattern_"+diffClass.getName(), !srcClass.isAbstract(), packNew, srcClass);

						EMFUtils.createEAttribute("ID_Pattern", patternRuleClass, EcorePackage.eINSTANCE.getEInt(),
								1, 1, false, false, true, true);
						
						//if(!diffClass.getName().equals("DomainSpecificDiff")) 
						{
							EMFUtils.createEAttribute("filter", patternRuleClass, EcorePackage.eINSTANCE.getEBoolean(), 
									1, 1, false, false, true, true);
							EAttribute attrIsForbidden = 
									EMFUtils.createEAttribute("isForbidden", patternRuleClass, 
											EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, true, true);
							attrIsForbidden.setDefaultValue(false);	
						}						
					}
				}										
				//We will point to Root instead of Pattern_Root
				EMFUtils.createEReference("pattern", ecRule, (EClass) Root, 0, 1, true);
				packNew.getEClassifiers().add(ecRule);	
				resource.getContents().add(packNew);			
			}
			
			// save result in new file
			URI         path    = null;
			path    = appendTextToFileNameInTheURI(dsdiffFileURI,"DiffMM.ecore","RuleMM.ecore");
			Resource    newfile = resourceSet.createResource(path);	
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		return null;
	}
		
	public Resource generate2WayDsDiffMMOld(URI ecoreFileURI, String rootClassName)
	{
		if(ecoreFileURI!=null)
		{
			String diffMMPostfix = "2WayDiffMM"; //Uses Custom EMap (for serialization purpose)
			//CLONE the MM
			// read the resource inside the file
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(ecoreFileURI, true);
			
			// read all metamodels from the content and add to the newly created resource set 	
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) {
				if (obj instanceof EPackage) {						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}			
			
			// extend the MM 
			List<IMMExtension> extensions = extensions2WayDiffMM();
			
			for (EPackage pack : metamodel) {
				pack.setName(pack.getName()+diffMMPostfix);
				pack.setNsPrefix(pack.getNsPrefix()+diffMMPostfix);
				pack.setNsURI(pack.getNsURI()+diffMMPostfix);
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//Add two Enum to the Meta-Model
				if(classifiers!=null)
				{					
					EEnum eeClassDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeClassDiffKind.setName("DiffKind");
					for(DiffKind cDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(cDiffKind.name());
					    eEnumLiteral.setLiteral(cDiffKind.name());
					    eEnumLiteral.setValue(cDiffKind.ordinal()); 
					    eeClassDiffKind.getELiterals().add(eEnumLiteral);	
					}		
					pack.getEClassifiers().add(eeClassDiffKind);
								
					/*
					EEnum eeAscDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeAscDiffKind.setName("DiffKind");
					for(DiffKind aDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aDiffKind.name());
					    eEnumLiteral.setLiteral(aDiffKind.name());
					    eEnumLiteral.setValue(aDiffKind.ordinal()); 
					    eeAscDiffKind.getELiterals().add(eEnumLiteral);	
					}	
					pack.getEClassifiers().add(eeAscDiffKind);
					*/				
					EObject Root=null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					// Create a SemanticDiff (DomainSpecificDiff) class
					EClass dsdDiffClass = EMFUtils.createEClass("DomainSpecificDiff", true, pack);
					EMFUtils.createEAttribute("name", dsdDiffClass, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, false, false);
					pack.getEClassifiers().add(dsdDiffClass);
					EMFUtils.createEReference("domainspecificdiffs", (EClass) Root, dsdDiffClass, 0, -1, true, false);	//(EClass) pack.getEClassifier("DomainSpecificDiff")									
				

					// Create a SemanticConflict class
					EClass SemanticConflictClass = EMFUtils.createEClass("SemanticConflict", true, pack);
					EMFUtils.createEAttribute("name", SemanticConflictClass, EcorePackage.eINSTANCE.getEString(), 
							1, 1, false, false, false, false);
					pack.getEClassifiers().add(SemanticConflictClass);
					EMFUtils.createEReference("semanticconflicts", (EClass) Root, SemanticConflictClass, 0, -1, true, false);								
				
					
				
					//Extend Meta-Model
					for (EClassifier cl : classifiers) {
						extensions.forEach(extension -> extension.extend(cl));
						if (cl instanceof EClass) {
							List<EStructuralFeature> features = new ArrayList<>(((EClass)cl).getEStructuralFeatures());
							for (EStructuralFeature feature : features) {
								extensions.forEach(extension -> extension.extend(feature));
							}
						}
					}
					
					// Add a reference from SemanticDiff (DomainSpecificDiff) class to some other classes 				
					
					List<EClassifier>  classifiersToBeLinkedFrodmDsDiff = 
							findClassifiersToBeLinkedFromSemanticObject(Root, classifiers, pack.getEClassifiers());	
					
					for(EClassifier clr : classifiersToBeLinkedFrodmDsDiff) {
							EMFUtils.createEReference(dsdDiffClass.getName()+"_"+clr.getName(), dsdDiffClass, clr, 0, -1, false);//@@@@@ change true to false    //"domainspecificdiffs"					
					}
					
					
					//Add a reference from SemanticConflictClass class to all other Diff classes  
					
					for(EClassifier c : pack.getEClassifiers()) {
						if(!c.eClass().toString().toLowerCase().contains("eenum")) {
							for(EAttribute a:((EClass)c).getEAllAttributes()) {
								if(a.getEType().getName().equals("DiffKind") || a.getEType().getName().equals("DiffKind")) {
									EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+c.getName(), SemanticConflictClass, c, 0, -1, false, false);
									break;
								}
							}
						}
					}
					
					EMFUtils.createEReference(SemanticConflictClass.getName()+"_"+dsdDiffClass.getName(), 
							SemanticConflictClass, dsdDiffClass, 0, -1, false, false);
					
				}
			}			
			
						
			URI         path    = appendTextToFileNameInTheURI(ecoreFileURI,".ecore",diffMMPostfix + ".ecore");
			Resource    newfile = resourceSet.createResource(path);
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			return newfile;
		}
		
		return null;
	}
		
	//*************************************

	public URI appendTextToFileNameInTheURI(URI fileURI, String textToDelete, String textToAdd)
	{
		String      mmpath  = "";
		for(int i=0; i<fileURI.segments().length-1; i++)
		{
			mmpath+=fileURI.segment(i)+"/";
		}
		String fileName= fileURI.segment(fileURI.segments().length-1).replace(textToDelete,"");
		mmpath="file:/"+fileURI.device()+"/"+mmpath+fileName+textToAdd;
		
		return URI.createURI(mmpath);
	}	
	
	
	//*************************************
	/****
	public Resource extend2(URI ecoreFileURI, String rootClassName) 
	{
		Resource	DsDiffMM = generateDsDiffMMOld(ecoreFileURI, rootClassName );
		Resource	DsRuleMM = generateDsRuleMMOld(DsDiffMM.getURI(), rootClassName);
		return null;
	}
	****/
	
	/** The following two methods are obsolete 
	 * @param ecore
	 * @return ifile with the extended meta-model
	 */
	public IFile extend(IFile ecore) {

		if (ecore!=null && ecore.exists() && ecore.getFileExtension().equals("ecore")) {

			// read ecore
			List<EPackage> metamodel = new ArrayList<EPackage>();
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(fileURI, true);	
			for (EObject obj : resource.getContents()) {
				if (obj instanceof EPackage) {						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}
		
			// extend metamodel
			List<IMMExtension> extensions = extensions();
			for (EPackage pack : metamodel) {
				pack.setName(pack.getName()+"Augmented");
				pack.setNsPrefix(pack.getNsPrefix()+"Augmented");
				pack.setNsURI(pack.getNsURI()+"Augmented");
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//Add two Enum to the Meta-Model
				if(classifiers!=null)
				{					
					EEnum eeClassOp = EcoreFactory.eINSTANCE.createEEnum();
					eeClassOp.setName("ClassOp");
					for(DiffKind cOp:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(cOp.name());
					    eEnumLiteral.setLiteral(cOp.name());
					    eEnumLiteral.setValue(cOp.ordinal()); 
					    eeClassOp.getELiterals().add(eEnumLiteral);	
					}					
										
					EEnum eeAscOp = EcoreFactory.eINSTANCE.createEEnum();
					eeAscOp.setName("AscOp");
					for(DiffKind ascOp:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(ascOp.name());
					    eEnumLiteral.setLiteral(ascOp.name());
					    eEnumLiteral.setValue(ascOp.ordinal()); 
					    eeAscOp.getELiterals().add(eEnumLiteral);	
					}					
					
					pack.getEClassifiers().add(eeClassOp);
					pack.getEClassifiers().add(eeAscOp);
				}
				
				//Extend Meta-Model
				for (EClassifier cl : classifiers) {
					extensions.forEach(extension -> extension.extend(cl));
					if (cl instanceof EClass) {
						List<EStructuralFeature> features = new ArrayList<>(((EClass)cl).getEStructuralFeatures());
						for (EStructuralFeature feature : features) {
							extensions.forEach(extension -> extension.extend(feature));
						}
					}
				}
				
				//Add Domain-Specific Diffs 
				if(classifiers!=null)
				{
					EClass dsdDiffClass = EMFUtils.createEClass("DomainSpecificDiff", false, pack);
					pack.getEClassifiers().add(dsdDiffClass);
					
					List<DSDIFF> dsdDiffs= new ArrayList<DSDIFF>();
					
					DSDIFF dsdDiff= new DSDIFF();
					dsdDiff.Name="MoveUp";
					DiffRef diffRef= new DiffRef();
					diffRef.Name="ghost";
					diffRef.targetClassName="Ghost";
					diffRef.lowerBound=1;
					diffRef.upperBound=1;
					diffRef.Containment=false;
					dsdDiff.DRefs.add(diffRef);					
					dsdDiffs.add(dsdDiff);
					
					dsdDiff= new DSDIFF();
					dsdDiff.Name="GhostKillingPacman";
					diffRef= new DiffRef();
					diffRef.Name="ghost";
					diffRef.targetClassName="Ghost";
					diffRef.lowerBound=1;
					diffRef.upperBound=1;
					diffRef.Containment=false;
					dsdDiff.DRefs.add(diffRef);
					diffRef= new DiffRef();
					diffRef.Name="delpacman";
					diffRef.targetClassName="DiffPacman";
					diffRef.lowerBound=1;
					diffRef.upperBound=1;
					diffRef.Containment=false;
					dsdDiff.DRefs.add(diffRef);					
					dsdDiffs.add(dsdDiff);					

					dsdDiff= new DSDIFF();
					dsdDiff.Name="PacmanEatingPellet";
					diffRef= new DiffRef();
					diffRef.Name="pacman";
					diffRef.targetClassName="Pacman";
					diffRef.lowerBound=1;
					diffRef.upperBound=1;
					diffRef.Containment=false;
					dsdDiff.DRefs.add(diffRef);
					diffRef= new DiffRef();
					diffRef.Name="delpelle";
					diffRef.targetClassName="DiffPellet";
					diffRef.lowerBound=1;
					diffRef.upperBound=1;
					diffRef.Containment=false;
					dsdDiff.DRefs.add(diffRef);					
					dsdDiffs.add(dsdDiff);
					
					for(DSDIFF dsdD:dsdDiffs)
					{
						EClass dsdDiffC = EMFUtils.createEClass(dsdD.Name, true, pack, (EClass) pack.getEClassifier("DomainSpecificDiff"));// dsdDiffClass);
						pack.getEClassifiers().add(dsdDiffC);
						for(DiffRef dR:dsdD.DRefs)
						{
							EMFUtils.createEReference(dR.Name, (EClass) pack.getEClassifier(dsdD.Name), 
									pack.getEClassifier(dR.targetClassName), dR.lowerBound, dR.upperBound, dR.Containment);
						}						
					}

					EMFUtils.createEReference("domainspecificdiffs", (EClass) pack.getEClassifier("Root"), 
							(EClass) pack.getEClassifier("DomainSpecificDiff"), 0, -1, true);				
					
				}
			}
			
			
			
			// save result in new file
			String      mmpath  = ecore.getLocation().toOSString().replaceAll(".ecore", "Augmented.ecore");
			URI         path    = URI.createURI("file://" + mmpath);
			Resource    newfile = resourceSet.createResource(path);
			newfile.getContents().addAll(resource.getContents());
			try { newfile.save(null); } catch (IOException e) { e.printStackTrace(); }
			
			// return ifile
			IWorkspace workspace    = ResourcesPlugin.getWorkspace();
			String wslocation       = workspace.getRoot().getLocation().toOSString();	
			IPath  location         = Path.fromOSString(mmpath); 
			IPath  relativelocation = location.makeRelativeTo(Path.fromOSString(wslocation));
			IFile ifile = workspace.getRoot().getFile(relativelocation);
			return ifile;
		}
		
		return null;
	}

	public Resource generateDsDiffMMByInheritance(URI ecoreFileURI, String rootClassName)
	{
		if(ecoreFileURI!=null)
		{
			//CLONE the MM
			// read the resource inside the file
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			//URI fileURI = URI.createFileURI(ecore.getFullPath().toOSString());
			Resource resource = resourceSet.getResource(ecoreFileURI, true);
			
			// read all metamodels from the content and add to the newly created resource set 	
			List<EPackage> metamodel = new ArrayList<EPackage>();
			for (EObject obj : resource.getContents()) {
				if (obj instanceof EPackage) {						
					EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
					metamodel.add((EPackage)obj);
				}
			}			
			
			// extend the MM 
			List<IMMExtension> extensions = extensions();
					
			
			for (EPackage pack : metamodel) {
				EPackage packNew= EcoreFactory.eINSTANCE.createEPackage();
				packNew.setName(pack.getName()+"DiffMM");
				packNew.setNsPrefix(pack.getNsPrefix()+"DiffMM");
				packNew.setNsURI(pack.getNsURI()+"DiffMM");
				List<EClassifier> classifiers = new ArrayList<>(pack.getEClassifiers());
				
				//Add two Enum to the Meta-Model
				if(classifiers!=null)
				{					
					EEnum eeClassDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeClassDiffKind.setName("DiffKind");
					for(DiffKind cDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						eEnumLiteral.setName(cDiffKind.name());
					    eEnumLiteral.setLiteral(cDiffKind.name());
					    eEnumLiteral.setValue(cDiffKind.ordinal()); 
					    eeClassDiffKind.getELiterals().add(eEnumLiteral);	
					}					
					packNew.getEClassifiers().add(eeClassDiffKind);	
					
					/*
					EEnum eeAscDiffKind = EcoreFactory.eINSTANCE.createEEnum();
					eeAscDiffKind.setName("DiffKind");
					for(DiffKind aDiffKind:DiffKind.values())
					{
						EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
						
						eEnumLiteral.setName(aDiffKind.name());
					    eEnumLiteral.setLiteral(aDiffKind.name());
					    eEnumLiteral.setValue(aDiffKind.ordinal()); 
					    eeAscDiffKind.getELiterals().add(eEnumLiteral);	
					}					
					
					
					packNew.getEClassifiers().add(eeAscDiffKind);
					*/
					EObject Root=null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					EClass dsdDiffClass = EMFUtils.createEClass("DomainSpecificDiff", true, packNew);
					EMFUtils.createEAttribute("name", dsdDiffClass, EcorePackage.eINSTANCE.getEString(), 1, 1, false, false, false, false);
					packNew.getEClassifiers().add(dsdDiffClass);
					EMFUtils.createEReference("domainspecificdiffs", (EClass) Root, dsdDiffClass, 0, -1, true);	//(EClass) pack.getEClassifier("DomainSpecificDiff")							
				
					//Extend Meta-Model
					for (EClassifier cl : classifiers) {
						//extensions.forEach(extension -> extension.extend(cl));						
						if (cl instanceof EClass) {
							EClass srcClass = (EClass)cl;
							if (!srcClass.isAbstract()) { 
								EClass diffClass = EMFUtils.createEClass("Diff" + srcClass.getName(), true, packNew, srcClass); 
								EMFUtils.createEAttribute("diff_kind", diffClass,eeClassDiffKind, 1, 1, false, false, false, false); //packNew.getEClassifier("ClassOp")			
								for(EAttribute attr:srcClass.getEAllAttributes())
								{
									EMFUtils.createEAttribute("new_"+attr.getName(), diffClass,attr.getEType(), attr.getLowerBound(), -1, false, false, false, false);
								}
							}
						} else if (cl instanceof EReference) {
							EReference reference=(EReference)cl;
							EClass      srcClass  = reference.getEContainingClass();
							EClassifier tarClass  = reference.getEType();				
							if(!srcClass.getName().contains("Root"))
							{	
								String      name     = "Diff" + srcClass.getName() + "_" + reference.getName(); 
								EClassifier diffRefClass = packNew.getEClassifier(name);
								if (diffRefClass==null || !(diffRefClass instanceof EClass)) {
									diffRefClass = EMFUtils.createEClass(name, true, packNew);
									EMFUtils.createEAttribute("diff_kind", (EClass)diffRefClass,eeClassDiffKind, 1, 1, false, false, false, false);	//packNew.getEClassifier("AscOp")
									
									EMFUtils.createEReference("diff" + reference.getName(), srcClass, diffRefClass, 0, 
											reference.getUpperBound()==-1? -1 : 2*reference.getUpperBound(), true);
									EMFUtils.createEReference("eType", (EClass)diffRefClass, tarClass, 1, 1, false);
								}
							}
						}	
						
						//%%%%%%%%%%%%% Need to revise
						/*if (cl instanceof EClass) {
							List<EStructuralFeature> features = new ArrayList<>(((EClass)cl).getEStructuralFeatures());
							for (EStructuralFeature feature : features) {
								extensions.forEach(extension -> extension.extend(feature));
							}
						}*/
					}
					
					// In the future it need to be changed in order to create reference
					// 	from dsd to that classes which are super class or do not inherited
					//  i.e. we do not need to have association to sub classes
					
					for (EClassifier clr : classifiers) {
						if(!clr.equals(Root) &&  clr.getInstanceClassName() == null  && !clr.eClass().toString().toLowerCase().contains("eenum"))
							EMFUtils.createEReference(dsdDiffClass.getName()+"_"+clr.getName(), dsdDiffClass, clr, 0, -1, false);//@@@@@ change true to false    //"domainspecificdiffs"					
					}
				}
				resource.getContents().add(packNew);	
			}	
					
			URI         path    = appendTextToFileNameInTheURI(ecoreFileURI,".ecore","DiffMM.ecore");
			Resource    newfile = resourceSet.createResource(path);
			newfile.getContents().addAll(resource.getContents());
			try 
			{ 
				newfile.save(null); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
			
			return newfile;
		}	
		return null;
	}
	
}
