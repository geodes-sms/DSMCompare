package dsmcompare.mmextension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
import dsmcompare.mmextension.utils.EMFUtils.DiffKind;

public class MMExtensionWithCustomMap {
	
	/**
	 * List of metamodel extensions.
	 */
	private List<IMMExtension> extensionsDiffMM () {
		List<IMMExtension> extensions = new ArrayList<>();
		extensions.add(new DiffClassWithCustomMap());
		extensions.add(new DiffReferenceWithCustomMap());
		return extensions;
	}
	
	private List<IMMExtension> extensionsDiffMMEMap () {
		List<IMMExtension> extensions = new ArrayList<>();
		extensions.add(new DiffClassEMap());
		extensions.add(new DiffReferenceEMap());
		return extensions;
	}
	

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
	
	public Resource generateDsDiffMM(URI ecoreFileURI, String rootClassName, boolean isOperational)
	{
		if(ecoreFileURI!=null)
		{
			String diffMMPostfix = "DiffMM"; //Uses Custom EMap (for serialization purpose)
			if(isOperational) {
				diffMMPostfix = "DiffMMO";//O for Operation, Manipulation (this MM will be used for manipulation purpose using  built-in EMap)
			}
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
			List<IMMExtension> extensions = extensionsDiffMM();
			if(isOperational) {
				extensions = extensionsDiffMMEMap();
			}
			
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
					
					pack.getEClassifiers().add(eeClassDiffKind);
					pack.getEClassifiers().add(eeAscDiffKind);
					
					if(!isOperational) {
						//For CustomMapType (Serialization)
						EMFUtils.createCustomMapType(EcorePackage.eINSTANCE.getEString(), eeClassDiffKind	, 	pack, 1, 1, "DiffKind", true);
						EMFUtils.createCustomMapType(EcorePackage.eINSTANCE.getEString(), eeAscDiffKind		, 	pack, 1, 1, "DiffKind", true);
					}
					
					EObject Root=null;
					if(rootClassName!=null && rootClassName!="") {
						Root = EMFUtils.getEObjectByClassName(pack,rootClassName);
					}
					else {
						Root = EMFUtils.getTheRoot(pack);
					}
					
					EClass dsdDiffClass = EMFUtils.createEClass("DomainSpecificDiff", true, pack);
					EMFUtils.createEAttribute("name", dsdDiffClass, EcorePackage.eINSTANCE.getEString(), 1, 1, false, false, false, false);
					EAttribute attrIsForbidden = EMFUtils.createEAttribute("isForbidden", dsdDiffClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, false, false);
					attrIsForbidden.setDefaultValue(false);
					pack.getEClassifiers().add(dsdDiffClass);
					EMFUtils.createEReference("domainspecificdiffs", (EClass) Root, dsdDiffClass, 0, -1, true);	//(EClass) pack.getEClassifier("DomainSpecificDiff")									
				
				
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
					
					// In the future it need to be changed in order to create reference
					// 	from dsd to that classes which are super class or do not inherited
					//  i.e. we do not need to have association to sub classes
					
					for(EClassifier clr : classifiers) {
						if(!clr.equals(Root) &&  (clr.getInstanceClassName() == null 
								/*|| clr.getInstanceTypeName().equalsIgnoreCase("java.util.Map$Entry")*/)&& !clr.eClass().toString().toLowerCase().contains("eenum"))
							EMFUtils.createEReference(dsdDiffClass.getName()+"_"+clr.getName(), dsdDiffClass, clr, 0, -1, false);//@@@@@ change true to false    //"domainspecificdiffs"					
					}
					
					List<EClassifier> clrMaps=pack.getEClassifiers().stream().filter(
							c->c != null && c.getName().startsWith("_map")).collect(Collectors.toList());///*c.getInstanceTypeName()!=null && c.getInstanceTypeName().equalsIgnoreCase("java.util.Map$Entry")*/
					
					for(EClassifier clr:clrMaps) {
						EMFUtils.createEReference(dsdDiffClass.getName()+"_"+clr.getName(), dsdDiffClass, clr, 0, -1, false);
					}
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

	public Resource generateDsRuleMM(URI dsdiffFileURI, String rootClassName, boolean isOperational)
	{
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
			
			List<IMMExtension> extensions = extensionsDiffMM();
			
			
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
					EMFUtils.createEAttribute("name", ecRule, EcorePackage.eINSTANCE.getEString(), 1, 1, false, false, false, false);
					EMFUtils.createEAttribute("constraints", ecRule, EcorePackage.eINSTANCE.getEString(), 0, -1, false, false, false, false);	
					
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
					
					//Create Patterns and find the Type of the Rule.RLHS					
					for (EClassifier diffClass : classifiers) 
					{
						if (diffClass instanceof EClass)
						{
							EClass srcClass = (EClass)diffClass;
							EClass patternRuleClass = 
									EMFUtils.createEClass("Pattern_"+diffClass.getName(), !srcClass.isAbstract(), packNew, srcClass);
							//For Custom map
							if(diffClass.getInstanceTypeName() != null && diffClass.getInstanceTypeName().equalsIgnoreCase("java.util.Map$Entry"))
								patternRuleClass.setInstanceTypeName("java.util.Map$Entry");
							EMFUtils.createEAttribute("ID_Pattern", patternRuleClass, EcorePackage.eINSTANCE.getEInt(), 1, 1, false, false, false, false);
							//EMFUtils.createEAttribute("ID_Pattern", pCl, EcorePackage.eINSTANCE.getEInt(), 1, 1, true);
							//EAttribute Id = EMFUtils.getIdEAttribute(pCl);
							//if(Id!=null)
							//	Id.setID(false);
							EMFUtils.createEAttribute("filter", patternRuleClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, false, false);
							//EMFUtils.createEReference("pattern"+cl.getName(), ecRule, (EClass) pCl, 1, -1, true);
							//EMFUtils.createEReference("pattern", ecRule, (EClass) pCl, 1, -1, true);
							if(srcClass.getName()==((EClass) Root).getName())
							{
								Pattern_Root=patternRuleClass;
							}
						}
					}					
					
					EMFUtils.createEReference("pattern", ecRule, (EClass) Pattern_Root, 1, 1, true);
					packNew.getEClassifiers().add(ecRule);	
					resource.getContents().add(packNew);
				
				}
				//metamodel.add(packNew);
			}			
			
			
			// save result in new file
			//String      mmpath  = fileURI.devicePath().replaceAll("DiffMM.ecore", "RuleMM.ecore");
			URI         path    = null;
			if(isOperational)
				path    = appendTextToFileNameInTheURI(dsdiffFileURI,"DiffMMO.ecore","RuleMMO.ecore");
			else
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
	
	//*************************************
	public Resource extend2(URI ecoreFileURI, String rootClassName) 
	{
		Resource	DsDiffMM = generateDsDiffMM(ecoreFileURI, rootClassName, false );
		Resource	DsRuleMM = generateDsRuleMM(DsDiffMM.getURI(), rootClassName, false);
		return null;
	}
	
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
			List<IMMExtension> extensions = extensionsDiffMM();
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
			List<IMMExtension> extensions = extensionsDiffMM();
					
			
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
					
					packNew.getEClassifiers().add(eeClassDiffKind);
					packNew.getEClassifiers().add(eeAscDiffKind);
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
									EMFUtils.createEAttribute("diff_kind", (EClass)diffRefClass,eeAscDiffKind, 1, 1, false, false, false, false);	//packNew.getEClassifier("AscOp")
									
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
