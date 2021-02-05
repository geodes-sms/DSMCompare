package com.zadahmad.dsemfcompare.editor.client;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

//MRN : Match of Rule and DSDiff Node
//The algorithm starts from the root of the rule model 
// and the corresponding root element in the DSDiff model
// for each references outgoing references from the rule node:
//		calculate the incoming and outgoing reference types and 
//      even the values of the attributes of the end-point objects 
//      then selects from DSDiff model elements covering those features 
//      and stores them in the following MRN structure
//The algorithm select the next candidate according to  
//  the Rule node reference and also the candidates inside the MRN
public class MRN {
	public EReference 	Ref;         //The EReference with which we arrived this node									
	public Class		Clas;        //Type of the class of the rule node
	public EObject    	ruleNode;    //The rule node
	public EObject	  	matchedNode; //The corresponding (matched) DSDiff Node
	public List<MRN>	refMRN= new ArrayList<MRN>(); // The array of MRN related to the cross-references
	
	public EReference 	getRef(){return Ref;}
	public Class 		getClas(){return Clas;}
	public EObject 		getRuleNode(){return ruleNode;}
}
