package com.zadahmad.dsemfcompare.editor.client.MergeAgent;
import java.io.File;
import java.io.FileOutputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.*;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.kdm.source.*;
import org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.action.BlockUnit;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.modisco.omg.kdm.code.CodeElement;
import org.eclipse.modisco.omg.kdm.code.CodeItem;
import org.eclipse.modisco.omg.kdm.code.CodeModel;
import org.eclipse.modisco.omg.kdm.code.Extends;
import org.eclipse.modisco.omg.kdm.code.HasValue;
import org.eclipse.modisco.omg.kdm.code.Implements;
import org.eclipse.modisco.omg.kdm.code.Imports;
import org.eclipse.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.modisco.omg.kdm.code.Package;
import org.eclipse.modisco.omg.kdm.code.ParameterKind;
import org.eclipse.modisco.omg.kdm.code.ParameterUnit;
import org.eclipse.modisco.omg.kdm.code.Signature;
import org.eclipse.modisco.omg.kdm.code.StorableUnit;
import org.eclipse.modisco.omg.kdm.code.TemplateType;
import org.eclipse.modisco.omg.kdm.code.TemplateUnit;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.kdm.Segment;
import org.junit.Test;

import dsmcompare.mmextension.utils.EMFUtils;
import refactoring.RefactoringFactory;
import refactoring.RefactoringPackage;
import refactoring2WayDiffMM.Refactoring2WayDiffMMFactory;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

import org.eclipse.modisco.java.*;
/*import org.eclipse.modisco.java.composition.discoverer;*/
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.generation.files.GenerateJavaExtended;

public class TransformCodeToModel {
	
	public class MapKdmItemRefItem{
		refactoring.EPackage refPackage;
		Object kdmItem;
		Object refItem;
		boolean isNew = false;
		public MapKdmItemRefItem(refactoring.EPackage p, Object k, Object r) {
			refPackage = p;
			kdmItem =k;
			refItem = r;
		}
	}

	ArrayList<MapKdmItemRefItem> mapKdmItemRefItemList = new ArrayList<MapKdmItemRefItem>();

	String wsPath=System.getProperty("user.dir");		
	String dubleSlash = "\\";	
	String backSlash = "/";
	String underscore = "_";
	
	String 		ref_eNSURI 		= RefactoringPackage.eINSTANCE.eNS_URI;
	Object 		ref_eIN 		= RefactoringPackage.eINSTANCE;
	//EFactory 	refFactory_eIN	= RefactoringFactory.eINSTANCE;
	
	String 		kdm_eNSURI 		= org.eclipse.modisco.omg.kdm.core.CorePackage.eINSTANCE.eNS_URI;
	Object 		kdm_eIN 		= org.eclipse.modisco.omg.kdm.core.CorePackage.eINSTANCE; 
	//EFactory 	kdmFactory_eIN	= org.eclipse.modisco.omg.kdm.core.CoreFactory.eINSTANCE;	
	

	//************************************************************
	
	private void transformClassOrInterfaceUnit(AbstractCodeElement aClass, refactoring.EPackage refPackage) {
		if(aClass instanceof TemplateUnit) {
			try {
				aClass = ((TemplateUnit) aClass).getCodeElement().stream().filter(elem->elem  instanceof ClassUnit).collect(Collectors.toList()).get(0);
			}catch(Exception ex) {
				System.out.println("aClass instanceof TemplateUnit: "+ex.getLocalizedMessage());
			}
		}	
		
		if(aClass instanceof InterfaceUnit)
		{
			InterfaceUnit  cuInterface = (InterfaceUnit) aClass;
			refactoring.Interface rInterface=RefactoringFactory.eINSTANCE.createInterface();
			mapKdmItemRefItemList.add(new MapKdmItemRefItem(refPackage, aClass, rInterface));
			String nestedName=aClass.getName();	
			rInterface.setName(nestedName);					
			EObject ctr = aClass.eContainer();
			if(!(ctr!=null && ctr.eClass().getName().equals("ClassUnit")))
				refPackage.getInterfaces().add(rInterface);
			else {//Need to find the parent in package and then assign the new class to it
				EObject parent = findParentEClass(ctr, refPackage);
				if(parent == refPackage)
					refPackage.getInterfaces().add(rInterface);
				else
					((refactoring.EClass)parent).getNested_interfaces().add(rInterface);				
			}			
			for(CodeItem codeItem:cuInterface.getCodeElement()) {
				if(codeItem instanceof MethodUnit) {
					rInterface.getEoperations().add(processEoperation((MethodUnit)codeItem));
				}	
			}	
			//processCodeRelationshipInterface(refPackage, aClass, rInterface);
			//interfaceRelationshipList.addAll(aClass.getCodeRelation());
		}		
		else if(aClass instanceof ClassUnit) {
			ClassUnit  cuClass = (ClassUnit) aClass;
			refactoring.EClass rClass=RefactoringFactory.eINSTANCE.createEClass();
			mapKdmItemRefItemList.add(new MapKdmItemRefItem(refPackage, aClass, rClass));
			String nestedName=aClass.getName();	
			rClass.setName(nestedName);					
			EObject ctr = aClass.eContainer();
			if(!(ctr!=null && ctr.eClass().getName().equals("ClassUnit")))
				refPackage.getEclassifiers().add(rClass);
			else {//Need to find the parent in package and then assign the new class to it
				EObject parent = findParentEClass(ctr, refPackage);
				if(parent == refPackage)
					refPackage.getEclassifiers().add(rClass);
				else
					((refactoring.EClass)parent).getNested_classes().add(rClass);				
			}				
			for(CodeItem codeItem:cuClass.getCodeElement()) {
				if(codeItem instanceof TemplateUnit) {
					try {
						codeItem=((TemplateUnit) codeItem).getCodeElement().stream().filter(f->f instanceof MethodUnit).collect(Collectors.toList()).get(0);
					}catch(Exception ex) {
						
						//%%% codeItem can be instanceof ClassUnit
						//%%% Needs to be processed								
						System.out.println("codeItem instanceof TemplateUnit, Exception: "+ ex.getLocalizedMessage());
						continue;
					}
				}
				if(codeItem instanceof ClassUnit || codeItem instanceof InterfaceUnit) 
					transformClassOrInterfaceUnit(codeItem, refPackage);
				else if(codeItem instanceof StorableUnit) {
					refactoring.EAttribute eAttribute = RefactoringFactory.eINSTANCE.createEAttribute();
					eAttribute.setName(codeItem.getName());
					if(((StorableUnit) codeItem).getType() !=null)
						eAttribute.setEtype(((StorableUnit) codeItem).getType().getName());
					rClass.getEattributes().add(eAttribute);
				}
				else if(codeItem instanceof MethodUnit) {
					rClass.getEoperations().add(processEoperation((MethodUnit)codeItem));
				}					
			}
			//processCodeRelationship(refPackage, aClass, rClass);
			//interfaceRelationshipList.addAll(aClass.getCodeRelation());
		}
	}
	
	public refactoring.EOperation processEoperation(MethodUnit codeItem) {
		refactoring.EOperation eOperation = RefactoringFactory.eINSTANCE.createEOperation();		
		Signature signature = (Signature) ((MethodUnit)codeItem).getCodeElement().stream().filter(c->c instanceof Signature).collect(Collectors.toList()).get(0);
		
		String signatureString = "";
		String signatureStringTypes = "";
		if(signature!=null) {
			try {
				String returnType = signature.getParameterUnit().stream().filter(c->c.getKind().toString().equals("return")).collect(Collectors.toList()).get(0).getType().getName();
				eOperation.setEtype(returnType);
			}catch(Exception ex) {								
			}
			List<ParameterUnit> parameterUnits = signature.getParameterUnit().stream().filter(c->!c.getKind().toString().equals("return")).collect(Collectors.toList());
			
			for(int i= 0 ; i<parameterUnits.size()-1; i++) {
				ParameterUnit p= parameterUnits.get(i);
				if(p.getType() != null) 
				{
					signatureString+=p.getName()+":"+p.getType().getName()+", ";
					signatureStringTypes +=p.getType().getName()+", ";
				}
				else 
				{
					signatureString+=p.getName()+":"+", ";
					signatureStringTypes += "";
				}
			}
			if(parameterUnits.size()>0) {
				ParameterUnit p= parameterUnits.get(parameterUnits.size()-1);
				if(p.getType() != null)
				{
					signatureString+=p.getName()+":"+p.getType().getName();
					signatureStringTypes+=p.getType().getName();
				}
				else
				{
					signatureString+=p.getName()+":";
					signatureStringTypes += "";
				}
			}
			
			eOperation.setEparameters(signatureString);
		}	
		
		BlockUnit blockUnit = null;
		String mtdBody = "";
		if(((MethodUnit)codeItem).getCodeElement()!=null && ((MethodUnit)codeItem).getCodeElement().stream().filter(c->c instanceof BlockUnit).collect(Collectors.toList()).size()>0)
			blockUnit = (BlockUnit) ((MethodUnit)codeItem).getCodeElement().stream().filter(c->c instanceof BlockUnit).collect(Collectors.toList()).get(0);
		if(blockUnit!=null) {		
			//Process BlockUnit
			Stack<AbstractCodeElement> sB= new Stack<AbstractCodeElement>();
			ArrayList<AbstractCodeElement> visited= new ArrayList<AbstractCodeElement>();							
			for(AbstractCodeElement c:blockUnit.getCodeElement())
				if(c!=null)
					sB.add(c);
			while(!sB.isEmpty()) {
				AbstractCodeElement v = sB.pop();
				visited.add(v);
				String vName= v.getName()!=null && !v.getName().trim().equals("") ? v.getName() : "";
				if(!vName.equals(""))
					mtdBody+=vName + "; ";
				
				if(v instanceof ActionElement) {
					EList<AbstractActionRelationship> aElems = ((ActionElement) v).getActionRelation();
					if(aElems.size()>0 && aElems.get(0).getTo()!=null) {
						mtdBody+=aElems.get(0).getTo().getName() + "; ";
					}
					
					for(AbstractCodeElement c:((ActionElement) v).getCodeElement())
						if(c!=null && !visited.contains(c))
							sB.add(c);
				}
				
				/*
				if(v instanceof CodeElement) {
					
				}else if(v instanceof CodeElement) {
					
				}else if(v instanceof StorableUnit) {
					refactoring.EAttribute eAttribute = RefactoringFactory.eINSTANCE.createEAttribute();
					eAttribute.setName(codeItem.getName());
					eAttribute.setEtype(((StorableUnit) codeItem).getType().getName());
					rClass.getEattributes().add(eAttribute);
				}*/

				
			}							
		}
		
		signatureStringTypes = signatureStringTypes.replaceAll("[^A-Za-z0-9]", "_");
		//signatureStringTypes = signatureStringTypes.replace("<","&amp;lt");
		//signatureStringTypes = signatureStringTypes.replace(">","&amp;gt;");
		String operationName = codeItem.getName() + "(" + "" + ")";
		String idKDM = codeItem.getName() + "___" + signatureStringTypes + "___";
		
		eOperation.set__idKDM(idKDM);
		
		eOperation.setName(operationName);//eOperation.setName(operationName);
		eOperation.setMethodBody(mtdBody);
		return eOperation;	
	}
	
	
	public EObject findParentEClass(EObject ctr, refactoring.EPackage refPackage) {
		ArrayList<String> parents = new ArrayList<String>();
		while(ctr!=null && ctr.eClass().getName().equals("ClassUnit")) {
			String parentName= EMFUtils.getAttrValueByAttrNameNullDefault(ctr, "name").toString();
			parents.add(parentName);
			ctr=ctr.eContainer();
		}
		Collections.reverse(parents);
		EObject parent = refPackage;
		for(String p:parents) {
			try {
			parent = refPackage.eContents().stream().filter(f->EMFUtils.getAttrValueByAttrNameNullDefault(f, "name").equals(p)).collect(Collectors.toList()).get(0);
			}
			catch(Exception ex) {
				System.out.println("parent couldn't find: " + p);
			}
		}
		return parent;
	}
	

	public void processCodeRelationship(refactoring.EPackage refPackage, AbstractCodeElement aClass, refactoring.EClass rClass) {
		for(AbstractCodeRelationship codeRelationship:aClass.getCodeRelation()) {
			if(codeRelationship instanceof Extends && codeRelationship.getTo() != null) {				
				String classToName = codeRelationship.getTo().getName();
				if(codeRelationship.getTo() instanceof ClassUnit) {
					try {
	
						if(rClass.getExtends()==null || rClass.getExtends().trim()=="")
							rClass.setExtends(classToName);
						else
							rClass.setExtends(rClass.getExtends() + ", " + classToName);//rClass.getExtends()
						
						refactoring.EClass classTo = (refactoring.EClass)
								mapKdmItemRefItemList.stream().filter(f->(KDMEntity)f.kdmItem==codeRelationship.getTo()).collect(Collectors.toList()).get(0).refItem;
								//refPackage.getEclassifiers().stream().filter(f->classToName.contains(f.getName())).collect(Collectors.toList()).get(0);
						rClass.getEsupertypes().add(classTo);
						
					}catch(Exception ex) {							
						refactoring.EClass classTo = RefactoringFactory.eINSTANCE.createEClass();
						classToName = classToName.split("<")[0];
						classTo.setName(classToName);
						refPackage.getEclassifiers().add(classTo);
						rClass.getEsupertypes().add(classTo);
						mapKdmItemRefItemList.add(new MapKdmItemRefItem(refPackage, codeRelationship.getTo(), classTo));
						
						//System.out.println("Error classTo set: " + rClass.getName() +":" + classToName + " -> " + ex.getLocalizedMessage());
					}
				}
				else if(codeRelationship.getTo() instanceof InterfaceUnit  && codeRelationship.getTo() != null) {
					//Class do not extends Interface
					//It seems it is MODisco's mistake or we need to investigate more
					try {
						
						if(rClass.getExtends()==null || rClass.getExtends().trim()=="")
							rClass.setExtends(classToName);
						else
							rClass.setExtends(rClass.getExtends() + ", " + classToName);//rClass.getExtends()
						
						refactoring.EClass classTo = (refactoring.EClass)
								mapKdmItemRefItemList.stream().filter(f->((KDMEntity)f.kdmItem).getName().equals(codeRelationship.getTo().getName())).collect(Collectors.toList()).get(0).refItem;
								//refPackage.getEclassifiers().stream().filter(f->classToName.contains(f.getName())).collect(Collectors.toList()).get(0);
						rClass.getEsupertypes().add(classTo);
						
					}catch(Exception ex) {							
						refactoring.EClass classTo = RefactoringFactory.eINSTANCE.createEClass();
						classToName = classToName.split("<")[0];
						classTo.setName(classToName);
						refPackage.getEclassifiers().add(classTo);
						rClass.getEsupertypes().add(classTo);
						mapKdmItemRefItemList.add(new MapKdmItemRefItem(refPackage, codeRelationship.getTo(), classTo));
						
						//System.out.println("Error classTo set: " + rClass.getName() +":" + classToName + " -> " + ex.getLocalizedMessage());
					}
					
				}
			}
			else if(codeRelationship instanceof Implements && codeRelationship.getTo() != null && codeRelationship.getTo() instanceof InterfaceUnit) {					
				String interfaceImplementedName = codeRelationship.getTo().getName();
				try {
					if(rClass.getImplements()==null || rClass.getImplements().trim()=="")
						rClass.setImplements(interfaceImplementedName);
					else 
					{
						rClass.setImplements(rClass.getImplements() + ", " + interfaceImplementedName); //rClass.getImplements()
					}
					
					refactoring.Interface interfaceTo = (refactoring.Interface)
							mapKdmItemRefItemList.stream().filter(f->(KDMEntity)f.kdmItem==codeRelationship.getTo()).collect(Collectors.toList()).get(0).refItem;

					rClass.getInterfaces().add(interfaceTo);
					//rClass.appendToInterfaceSet(interfaceImplementedName);
				}catch(Exception ex) {	
					refactoring.Interface interfaceTo= RefactoringFactory.eINSTANCE.createInterface();
					interfaceImplementedName = interfaceImplementedName.split("<")[0];
					interfaceTo.setName(interfaceImplementedName);
					refPackage.getInterfaces().add(interfaceTo);
					rClass.getInterfaces().add(interfaceTo);
					mapKdmItemRefItemList.add(new MapKdmItemRefItem(refPackage, codeRelationship.getTo(), interfaceTo));
					
					//System.out.println("Error classTo(Interface) set: " + rClass.getName() +":" + interfaceImplementedName + " -> " + ex.getLocalizedMessage());
				}
			} else if(!(codeRelationship instanceof Imports) && 
					!(codeRelationship instanceof HasValue) && 
					!(codeRelationship.getTo() instanceof TemplateType) && 
					codeRelationship.getTo() != null) {
				System.out.println("codeRelationship : " + codeRelationship.eClass() + " " + codeRelationship.getFrom() + " --> " + codeRelationship.getTo());
			}
		}
	}
	
	public void processCodeRelationshipInterface(refactoring.EPackage refPackage, AbstractCodeElement aClass, refactoring.Interface rInterface) {
		for(AbstractCodeRelationship codeRelationship:aClass.getCodeRelation()) {
			if(codeRelationship instanceof Extends) {	
				
				String interfaceToName = codeRelationship.getTo().getName();
				try {

					if(rInterface.getExtends()==null || rInterface.getExtends().trim()=="")
						rInterface.setExtends(interfaceToName);
					else
						rInterface.setExtends(rInterface.getExtends() + ", " + interfaceToName);//rInterface.getExtends()
					
					refactoring.Interface interfaceTo = (refactoring.Interface)
							mapKdmItemRefItemList.stream().filter(f->(KDMEntity)f.kdmItem==codeRelationship.getTo()).collect(Collectors.toList()).get(0).refItem;
							//refPackage.getEclassifiers().stream().filter(f->classToName.contains(f.getName())).collect(Collectors.toList()).get(0);
					rInterface.getEsupertypes().add(interfaceTo);
					
				}catch(Exception ex) {	
					refactoring.Interface interfaceTo= RefactoringFactory.eINSTANCE.createInterface();
					interfaceToName = interfaceToName.split("<")[0];
					interfaceTo.setName(interfaceToName);
					refPackage.getInterfaces().add(interfaceTo);
					rInterface.getEsupertypes().add(interfaceTo);
					mapKdmItemRefItemList.add(new MapKdmItemRefItem(refPackage, codeRelationship.getTo(), interfaceTo));

					//System.out.print("Error interfaceTo set: " + rInterface.getName() +":" + interfaceToName + " -> " + ex.getLocalizedMessage());
				}			
			}
		}
	}

	//************************************************************
	public static void modelDiscovery(String projectName, String savePath){
		try {
			
			IWorkspace iWS = ResourcesPlugin.getWorkspace();
			IProject[] projects = iWS.getRoot().getProjects();
	
		    System.out.println(projects[0].getName());
			IProject project = 
				ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IJavaProject javaProject = JavaCore.create(project);
			/*DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();*/
			DiscoverKDMSourceAndJavaModelFromJavaProject javaDiscoverer = new DiscoverKDMSourceAndJavaModelFromJavaProject();
			javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
			Resource javaResource = javaDiscoverer.getTargetModel();
			FileOutputStream fout = new FileOutputStream(new File(savePath));
			javaResource.save(fout, null);
			fout.close();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public void generateJava(String javaModelFilepath, String generatedCodeFolderPath){
		try {
			GenerateJavaExtended javaGenerator = new GenerateJavaExtended(URI.createFileURI(javaModelFilepath),
					new File(generatedCodeFolderPath),
					new ArrayList<Object>());
			javaGenerator.doGenerate(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String[] args) {
		modelDiscovery("toyProject","please_Results/");
	}
	
	//@Test
	public void execute() {
		modelDiscovery("Proj1","modelToCodeResults/");
	}
	
	
}
