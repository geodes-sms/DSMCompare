package com.zadahmad.dsemfcompare.editor;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Objects;



 @SuppressWarnings("all")
 public class DsFeatureFilter extends FeatureFilter 
 {
	
	  @Override
	  public boolean checkForOrderingChanges(final EStructuralFeature feature) {
	    return false;
	  }
	  
	  @Override
	  protected boolean isIgnoredAttribute(final EAttribute attribute) {
	    return false;	  
	  }
	  @Override
	  protected boolean isIgnoredReference(final Match match, final EReference reference) 
	  {
		  boolean r1=false;
		  return r1;	  
	  }
	  
 }
