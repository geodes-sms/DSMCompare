package com.zadahmad.dsemfcompare.editor;

import java.io.IOException;

import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

 @SuppressWarnings("all")
 public class DsDiffBuilder extends DiffBuilder 
 {
	@Override
	  public void attributeChange(final Match match, final EAttribute attribute, final Object value, final DifferenceKind kind, final DifferenceSource source) 
	  {
		super.attributeChange(match, attribute, value, kind, source);
	  }
	
	@Override
	  public void referenceChange(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) 
	  {
		/*boolean _isGhostKillingPacman=false;
		  _isGhostKillingPacman = PacmanSpecificDiffKind.isGhostKillingPacman(match, reference, value, kind, source);
		  
		  if (_isGhostKillingPacman) {
		        final ReferenceChange referenceChange = CompareFactory.eINSTANCE.createReferenceChange();
		        referenceChange.setMatch(match);
		        referenceChange.setReference(reference);
		        referenceChange.setValue(value);
		        referenceChange.setKind(DifferenceKind.CHANGE);
		        referenceChange.setSource(source);
		      }
		  else*/
			  super.referenceChange(match, reference, value, kind, source);
	  }
	
	  @Override
	  public void resourceAttachmentChange(final Match match, final String uri, final DifferenceKind kind, final DifferenceSource source) {
	    return;
	  }
	  
	  @Override
	  public void resourceLocationChange(final MatchResource matchResource, final String baseLocation, final String changedLocation, final DifferenceKind kind, final DifferenceSource source) {
	    return;
	  }
	  
	  @Override
	  public void featureMapChange(final Match match, final EAttribute attribute, final Object value, final DifferenceKind kind, final DifferenceSource source) {
	    return;
	  }
	
}
