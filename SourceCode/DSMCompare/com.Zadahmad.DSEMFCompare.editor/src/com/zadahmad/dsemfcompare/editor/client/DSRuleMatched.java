package com.zadahmad.dsemfcompare.editor.client;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class DSRuleMatched { 
	public DSRuleSpec 		dsRuleSpec		= new DSRuleSpec();
	public boolean			isMached		= false;
	public int 				countOfMatchs	= 0;
	public EObject  		RootR;
	public EObject  		RootD;
	public MRN 				RootM;	
	List<MatchVariant>		matchVariant= new ArrayList<MatchVariant>();
	Resource 				ruleRes;
}
