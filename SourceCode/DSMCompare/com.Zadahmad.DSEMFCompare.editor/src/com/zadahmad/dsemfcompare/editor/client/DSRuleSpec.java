package com.zadahmad.dsemfcompare.editor.client;


import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import java.util.ArrayList;
import java.util.List;

public class DSRuleSpec {
	public String 				EClassName; //Name of DSDiff class should to created
	public List<EObject> 		dsDiffReqs				= new ArrayList<EObject>();    	// List of RHS elements in the Rule, especially they have ID_Patterns 
	public List<EClassifier> 	dsDiffReqEClassifiers	= new ArrayList<EClassifier>();	// List of RHS classifiers should be linked to DSDiff class
	public String 				filePath;   //Rule file path
}
