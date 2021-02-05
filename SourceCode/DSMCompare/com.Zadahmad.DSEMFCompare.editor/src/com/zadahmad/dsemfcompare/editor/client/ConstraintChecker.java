package com.zadahmad.dsemfcompare.editor.client;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import bsh.EvalError;
import bsh.Interpreter;
import bsh.NameSpace;

public class ConstraintChecker {
			Interpreter 		bsh 			= 	null;
	public 	ArrayList<String>   NSsClass		=	null;
	public 	ArrayList<String>   NSsPackage		=	null;
	public 	MatchVariant 		matchVariant    =   null;
	public 	ArrayList<String>	Constraints 	=	null;
	public  String				itemFunction	= 	null;
	
	 
	public ConstraintChecker(ArrayList<String> _NSsPackage, ArrayList<String> _NSsClass, ArrayList<String>	_Constraints)
	{
		 bsh = new Interpreter();
		 NSsClass=_NSsClass;
		 NSsPackage=_NSsPackage;
		 setNSsClass();
		 Constraints=_Constraints;
		 itemFunction	=	
				 "	public Object Item(int ID_PatternValue, String valAttrName) \r\n" + 
				 "	{\r\n" + 
				 "		for(MVItem m: matchVariant.matchList)\r\n" + 
				 "		{\r\n" + 
				 "			EAttribute attrID_Pattern= DsModelComparatorTest.getEAttributeByName(m.nodeRule,\"ID_Pattern\");\r\n" + 
				 "			if (m.nodeRule.eGet(attrID_Pattern).toString().equals(ID_PatternValue.toString()))\r\n" + 
				 "				{\r\n"
				 + "				return m.nodeDSD.eGet(DsModelComparatorTest.getEAttributeByName(m.nodeDSD,valAttrName));\r\n"
				 + "			}\r\n" + 
				 "		}\r\n" + 
				 "\r\n" + 
				 "	    return null;\r\n" + 
				 "	}";
	}
	
	void setNSsClass()
	{
		NameSpace bsNs = bsh.getNameSpace(); 
		NSsClass.forEach(c->bsNs.importClass(c));
		NSsPackage.forEach(p->bsNs.importPackage(p));
	}
	
	
	
	public boolean checkByBeanShell()
	{
		try {
			bsh.set("matchVariant", matchVariant);
		} catch (EvalError e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for(int i=0; i<Constraints.size(); i++)	
		{
			try 
			{				
			 	return (boolean) bsh.eval(itemFunction + Constraints.get(i));
			} catch (EvalError e) 
			{
				e.printStackTrace();
			}
		}
		return false;
	}

}

/*
 
		 //NameSpace bsNs = bsh.getNameSpace();   
		 
		 //bsNs.importClass("org.eclipse.emf.ecore.EObject");     		// Import basic class to NameSpace collection of the Interpreter
		 //bsNs.importClass("org.eclipse.emf.ecore.EAttribute");
		 //bsNs.importPackage("com.zadahmad.dsemfcompare.editor.tests");
	bsNs.importClass("com.zadahmad.dsemfcompare.editor.tests.*"); //com.zadahmad.dsemfcompare.editor.tests.DsModelComparatorTest
 	bsNs.importPackage("org.eclipse.emf.ecore");			  // Import a package
 	System.out.println(bsh.getNameSpace());
 	Object result=bsh.eval("EObject item(int ID_Pattern) { EObject obj=null; EAttribute attr=null; MVItem m= new MVItem(); System.out.println(\"m= \" + m);  return obj;} item(2);");
 */
