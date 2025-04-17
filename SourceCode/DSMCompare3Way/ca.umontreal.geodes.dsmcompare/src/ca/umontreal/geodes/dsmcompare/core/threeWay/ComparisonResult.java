package ca.umontreal.geodes.dsmcompare.core.threeWay;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Conflict;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers;

public class ComparisonResult implements Serializable {
	public Comparison comparison3Way = null;
	public Comparison comparisonCaDSMDiff = null;
	public ArrayList<Diff> differences3Way = new ArrayList<Diff>();
	public ArrayList<Conflict> conflicts = new ArrayList<Conflict>();
	public Resource diff012 = null; //diff model v0(ca), v1, v2
	public Resource v012 = null; //Merged version
	
	
	IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
	public IBatchMerger merger = new BatchMerger(mergerRegistry);
	
	//public  ArrayList<FineDiff>					fineDiffs 					=	new ArrayList<FineDiff>();//Combination of fineDiffReferences and fineDiffAttributes
	public	ArrayList<FineDiffReference> 			fineDiffReferences			=	new ArrayList<FineDiffReference>();
	public  ArrayList<FineDiffAttribute> 			fineDiffAttributes			=	new ArrayList<FineDiffAttribute>();
	public 	ArrayList<FineDiffAttributeGroup>		fineDiffAttributeGroups	=	new	ArrayList<FineDiffAttributeGroup>();
	
	public Comparison getComparison3Way() {
		return comparison3Way;
	}
	
	public Comparison getComparisonCaDSMDiff() {
		return comparisonCaDSMDiff;
	}
	
	public void setDifferences(ArrayList<Diff> diffs) {
		differences3Way.clear();
		differences3Way = diffs;
	}
	
	public void setComparison3Way(Comparison comparison) {
		comparison3Way=comparison;
		differences3Way.clear();
		for(Diff diff: comparison3Way.getDifferences())
			differences3Way.add(diff);
		

		conflicts.clear();
		for(Conflict conflict: comparison3Way.getConflicts())
			conflicts.add(conflict);
	}
	
	public void setComparisonCaDSMDiff(Comparison comparison) {
		comparisonCaDSMDiff=comparison;
	}		
		
	public 	Set<ClassDiffGroup> classDiffGroups =	new	HashSet<ClassDiffGroup>();
	public 	Set<AssociationDiffGroup> associationDiffGroups =	new	HashSet<AssociationDiffGroup>();
	
	
	public void calculateDependencies() {
		for(FineDiffReference fineDiffReference:fineDiffReferences ) {
			ArrayList<FineDiffReference> dependsOn = new ArrayList<FineDiffReference>();
			try {
					dependsOn.addAll(fineDiffReferences.stream().filter(f-> 
						f.diffReferenceChangeType != DiffReferenceChangeType.ReferenceChange &&
						fineDiffReference.leftContainerMatch == f.value||
						fineDiffReference.rightContainerMatch == f.value||
						fineDiffReference.originContainerMatch == f.value)
						.collect(Collectors.toList()));
					if(fineDiffReference.changeKind == FineDiffChangeKind.MovedFrom) {
						dependsOn.addAll(fineDiffReferences.stream().filter(f-> 
							fineDiffReference.originContainerMatchMovedFrom == f.value||
							fineDiffReference.leftContainerMatchMovedFrom == f.value||
							fineDiffReference.rightContainerMatchMovedFrom == f.value)
							.collect(Collectors.toList()));
					}
			}
			catch(Exception ex) {	
				
			}
			if(dependsOn.size()>0) {
				fineDiffReference.dependsOn.addAll(dependsOn);
			}			
		}
	}
	
	public void calculateConflicts() {
		//Conflicts differences of Reference type
		for(FineDiffReference fineDiffReference:fineDiffReferences ) {
			fineDiffReference.conflictWithReferenceDiffs = new ArrayList<FineDiffReference>();
			List<FineDiffReference> conflictsWith = null;
					conflictsWith=fineDiffReferences.stream().filter(
							f-> !fineDiffReference.equals(f) &&
								!fineDiffReference.diff.equals(f.diff)&&
								fineDiffReference.diffKind.equals(f.diffKind) &&
								fineDiffReference.value.equals(f.value))
							.collect(Collectors.toList());
					if(conflictsWith!=null && conflictsWith.size()>0) {
						fineDiffReference.conflictWithReferenceDiffs.addAll(conflictsWith);
					}
		}
		
		//Pseudo conflicts differences of Reference type
		List<FineDiffReference> fineDiffRefs=fineDiffReferences.stream().filter(
				ff->ff.diffReferenceChangeType == 
				DiffReferenceChangeType.ReferenceChange).collect(Collectors.toList());
		
		
		for(FineDiffReference fineDiffReference:fineDiffRefs) {			
			if(fineDiffReference.pseudoConflict ==null) {
				String refNameOriginal = fineDiffReference.reference.getName();
				Object valueBeforeChangeF = null;
				List<EReference> refTypeOriginals = null;
				EReference refTypeOriginal = null;
				//PSEUDO ADD
				if(fineDiffReference.originContainerMatch==null)
					valueBeforeChangeF = null;
				else
				{
					refTypeOriginals = fineDiffReference.originContainerMatch.eClass().getEAllReferences().stream().filter(
						r->r.getName().contains(refNameOriginal)).collect(Collectors.toList());			
					if(refTypeOriginals.size()<1)
						valueBeforeChangeF = null;
					else {
						refTypeOriginal= refTypeOriginals.get(0);
						valueBeforeChangeF = fineDiffReference.originContainerMatch.eGet(refTypeOriginal);
					}
				}
				
				final Object valueBeforeChange = valueBeforeChangeF;
					List<FineDiffReference> pseudoRefShared = null;
					List<FineDiffReference> pseudoRefConflicts = new ArrayList<FineDiffReference>();
					List<FineDiffReference> pseudoRefADDConflicts = null;
					List<FineDiffReference> pseudoRefDELConflicts = null;
					List<FineDiffReference> pseudoRefMOVConflicts = null; // Reference change (move/replace)
				
				
				try {
					pseudoRefShared = fineDiffRefs.stream().filter(
							f-> f.pseudoConflict == null 
							&& !fineDiffReference.equals(f)
							&& !fineDiffReference.diff.equals(f.diff)
							&& fineDiffReference.diffKind.equals(f.diffKind) 
							&& fineDiffReference.diff.getSource() !=f.diff.getSource() 
							&& fineDiffReference.reference.equals(f.reference)).collect(Collectors.toList());
				}catch(Exception ex) {
					pseudoRefShared = null;
				}			
				
				
				if(pseudoRefShared!=null && pseudoRefShared.size()>0) {	
						if(fineDiffReference.diffKind == DifferenceKind.ADD) {
						try {
							pseudoRefADDConflicts=pseudoRefShared.stream().filter(
									f-> //(valueBeforeChange == null || ((List<Object>)valueBeforeChange).size() == 0 ) && 								
										((fineDiffReference.originContainerMatch != null && fineDiffReference.originContainerMatch.equals(f.originContainerMatch))
										 &&	(fineDiffReference.leftContainerMatch != null 	&& fineDiffReference.leftContainerMatch.equals(f.leftContainerMatch)) 
										 &&	(fineDiffReference.rightContainerMatch != null 	&& fineDiffReference.rightContainerMatch.equals(f.rightContainerMatch)))
							).collect(Collectors.toList());
							pseudoRefConflicts.addAll(pseudoRefADDConflicts);
							
						}catch(Exception ex) {
							pseudoRefADDConflicts = null;
						}
					}else if(fineDiffReference.diffKind == DifferenceKind.DELETE) {
						try {
							pseudoRefDELConflicts =pseudoRefShared.stream().filter(
									f-> fineDiffReference.value.equals(f.value) 
									&& fineDiffReference.originValueMatch.equals(f.originValueMatch)
									//&& valueBeforeChange == fineDiffReference.originValueMatch	
									&& valueBeforeChange.toString().contains(fineDiffReference.originValueMatch.toString())
									).collect(Collectors.toList());
							pseudoRefConflicts.addAll(pseudoRefDELConflicts);
						}catch(Exception ex) {
							pseudoRefDELConflicts = null;
						}
					}else if(fineDiffReference.diffKind == DifferenceKind.CHANGE || fineDiffReference.diffKind == DifferenceKind.MOVE ) {
						try {
							pseudoRefMOVConflicts = pseudoRefShared.stream().filter(
									f-> fineDiffReference.originValueMatch.equals(f.originValueMatch) 
									//&& valueBeforeChange != fineDiffReference.originValueMatch
									&& !valueBeforeChange.toString().contains(fineDiffReference.originValueMatch.toString())
									).collect(Collectors.toList());
							pseudoRefConflicts.addAll(pseudoRefMOVConflicts);
						}catch(Exception ex) {
							pseudoRefMOVConflicts = null;
						}
					}
				}
				if(pseudoRefConflicts!=null && pseudoRefConflicts.size()>0) {
					fineDiffReference.pseudoConflict = pseudoRefConflicts.get(0);
					fineDiffReference.pseudoConflict.pseudoConflict = fineDiffReference;
				}
			}
		}		
		
		//Pseudo conflicts differences of Class type
		List<FineDiffReference> fineDiffClasses=fineDiffReferences.stream().filter(
				ff->ff.diffReferenceChangeType == 
				DiffReferenceChangeType.ClassChange).collect(Collectors.toList());	
		
		for(FineDiffReference fineDiffClass:fineDiffClasses) {
			if(fineDiffClass.pseudoConflict ==null) {
				List<FineDiffReference> pseudoClassShared = null;
				List<FineDiffReference> pseudoClassConflicts = new ArrayList<FineDiffReference>();
				List<FineDiffReference> pseudoClassADDConflicts = null;
				List<FineDiffReference> pseudoClassDELConflicts = null;
				List<FineDiffReference> pseudoClassMOVConflicts = null; // Reference change (move/replace)
				
				try {
					pseudoClassShared = fineDiffClasses.stream().filter(
							f-> !fineDiffClass.equals(f) &&
							!fineDiffClass.diff.equals(f.diff)&&
							//f.diffReferenceChangeType == DiffReferenceChangeType.ClassChange &&
							fineDiffClass.diffKind.equals(f.diffKind) &&
							fineDiffClass.diff.getSource() !=f.diff.getSource()).collect(Collectors.toList());
				}catch(Exception ex) {
					pseudoClassShared = null;
				}
				if(fineDiffClass.diffKind == DifferenceKind.ADD ) {
					try {
						pseudoClassADDConflicts = pseudoClassShared.stream().filter(f->
									fineDiffClass.leftValueMatch.equals(f.leftValueMatch)
									&& fineDiffClass.leftContainerMatch.equals(f.leftContainerMatch)
									&& fineDiffClass.rightValueMatch.equals(f.rightValueMatch)
									&& fineDiffClass.rightContainerMatch.equals(f.rightContainerMatch)
									&& fineDiffClass.originContainerMatch.equals(f.originContainerMatch)).collect(Collectors.toList());
						pseudoClassConflicts.addAll(pseudoClassADDConflicts);
					}catch(Exception ex) {
						pseudoClassADDConflicts = null;
					}
				} else if(fineDiffClass.diffKind == DifferenceKind.DELETE ) {	
					try {
						pseudoClassDELConflicts = pseudoClassShared.stream().filter(
								f->fineDiffClass.value.equals(f.value)).collect(Collectors.toList());
						pseudoClassConflicts.addAll(pseudoClassDELConflicts);
					}catch(Exception ex) {
						pseudoClassDELConflicts = null;
					}
				} else if(fineDiffClass.diffKind == DifferenceKind.MOVE ) {
					try {
						pseudoClassMOVConflicts = pseudoClassShared.stream().filter(
								f->fineDiffClass.leftValueMatch.equals(f.leftValueMatch)
								&& fineDiffClass.leftContainerMatch.equals(f.leftContainerMatch)
								&& fineDiffClass.rightValueMatch.equals(f.rightValueMatch)
								&& fineDiffClass.rightContainerMatch.equals(f.rightContainerMatch)
								&& (fineDiffClass.originContainerMatch == null 
									|| ( fineDiffClass.originContainerMatch != null && fineDiffClass.originContainerMatch.equals(f.originContainerMatch)))
								&& fineDiffClass.originValueMatch.equals(f.originValueMatch)).collect(Collectors.toList());
						pseudoClassConflicts.addAll(pseudoClassMOVConflicts);
					}catch(Exception ex) {
						pseudoClassMOVConflicts = null;
					}
				}		
								
				try {
					if(pseudoClassConflicts!=null && pseudoClassConflicts.size()>0) {
						fineDiffClass.pseudoConflict = pseudoClassConflicts.get(0);
						fineDiffClass.pseudoConflict.pseudoConflict = fineDiffClass;
					}
				}catch(Exception ex) {
					System.out.println("ComparisonResult: 197 - pseudoConflicts = pseudoConflictsStream.collect(Collectors.toList());");
					System.out.println("Exception: "+ex);
				}
			}
		}

		//Conflicts differences of Attribute type
		for(FineDiffAttribute fineDiffAttribute:fineDiffAttributes ) {
			FineDiffReference conflictsWithReference = null;
			
			try {
					conflictsWithReference=fineDiffReferences.stream().filter(f->
						f.diffReferenceChangeType != DiffReferenceChangeType.ReferenceChange &&
						fineDiffAttribute.leftContainerMatch == f.value||
						fineDiffAttribute.rightContainerMatch == f.value||
						fineDiffAttribute.originContainerMatch == f.value)
						.collect(Collectors.toList()).get(0);
			}
			catch(Exception ex) {				
			}
			if(conflictsWithReference!=null) {
				//fineDiffAttribute.conflictWithReferenceDiffs.add(conflictsWithReference);
				conflictsWithReference.conflictWithAttributeDiffs.add(fineDiffAttribute);
			}			
		}
		
		//Pseudo conflicts differences of Attribute type
		/*
		for(FineDiffAttribute fineDiffAttribute:fineDiffAttributes ) {
			if(fineDiffAttribute.pseudoConflict ==null) {
				List<FineDiffAttribute> pseudoConflicts=null;
				
				try {
					pseudoConflicts=fineDiffAttributes.stream().filter(f->
							!fineDiffAttribute.equals(f) &&
							fineDiffAttribute.diff.getSource() != f.diff.getSource() &&
							fineDiffAttribute.originContainerMatch == f.originContainerMatch &&
							fineDiffAttribute.attributeName == f.attributeName &&
							fineDiffAttribute.value.toString().trim().equalsIgnoreCase(f.value.toString().trim()))
							.collect(Collectors.toList());
				}
				catch(Exception ex) {				
				}
				if(pseudoConflicts!=null && pseudoConflicts.size()>0) {
					fineDiffAttribute.pseudoConflict = pseudoConflicts.get(0);
					fineDiffAttribute.pseudoConflict.pseudoConflict = fineDiffAttribute;
				}	
			}
		}
		*/
		
	}
	
	// modification on the different or same attributes in different versions
	public void calculateFineDiffAttributeGroupAndConflict() {		
		Map<EObject, List<FineDiffAttribute>> fineDiffAttributeGroupedByOriginContainerMatch =
				fineDiffAttributes.stream().filter(f->!f.attributeName.toLowerCase().contains("idkdm")).collect(Collectors.groupingBy(f -> f.originContainerMatch));
		
		for (Entry<EObject, List<FineDiffAttribute>> entry : fineDiffAttributeGroupedByOriginContainerMatch.entrySet()) {
			EObject originContainerMatch = entry.getKey();
			List<FineDiffAttribute> allModifiedAttributesOfClassInstance = entry.getValue(); //fineDiffAttributeList	
			Map<Object, List<FineDiffAttribute>> fineDiffAttributeGroupedByAttributeName =
					allModifiedAttributesOfClassInstance.stream().collect(Collectors.groupingBy(f -> f.attributeName));
			
			for (Entry<Object, List<FineDiffAttribute>> entryAttr : fineDiffAttributeGroupedByAttributeName.entrySet()) {
				FineDiffAttributeGroup fdag = new FineDiffAttributeGroup();
				fdag.originContainerMatch = originContainerMatch;
				fineDiffAttributeGroups.add(fdag);				
				Map<Object, List<FineDiffAttribute>> mpTemp= new HashMap();
				mpTemp.put(entryAttr.getKey(), entryAttr.getValue());
				fdag.attributesGroupByName = mpTemp;
				
				List<FineDiffReference> conflictsWithClassDiff = null;
				
				try {
						conflictsWithClassDiff=fineDiffReferences.stream().filter(f->
							f.diffReferenceChangeType == DiffReferenceChangeType.ClassChange &&
							originContainerMatch == f.originValueMatch).collect(Collectors.toList());
				}
				catch(Exception ex) {				
				}
				if(conflictsWithClassDiff!=null) {
					fdag.conflictWithClassDiffs.addAll(conflictsWithClassDiff);
					//conflictsWithClassDiff.forEach(f->{f.conflictWithAttributeDiffs.add(fineDiffAttribute);});//It need to be removed 
					conflictsWithClassDiff.forEach(f->{f.conflictWithFineDiffAttributeGroup = fdag;});
				}				
			}			
		}
		
		/*
		ArrayList<FineDiffAttribute> visited = new ArrayList<FineDiffAttribute>();
		
		for(FineDiffAttribute fineDiffAttribute:fineDiffAttributes ) {
			if(!visited.contains(fineDiffAttribute)) {
				visited.add(fineDiffAttribute);
				
				List<FineDiffAttribute> allModifiedAttributesOfClassInstance = new ArrayList<FineDiffAttribute>();
				allModifiedAttributesOfClassInstance=fineDiffAttributes.stream().filter(f->
					fineDiffAttribute.originContainerMatch == f.originContainerMatch)
					.collect(Collectors.toList());
				
				if(allModifiedAttributesOfClassInstance!=null) {
					FineDiffAttributeGroup fdag = new FineDiffAttributeGroup();
					fdag.originContainerMatch = fineDiffAttribute.originContainerMatch;
					for(FineDiffAttribute c:allModifiedAttributesOfClassInstance ) {//It need to be removed 
						visited.add(c);
					}
					fdag.allModifiedAttributesOfClassInstance.addAll(allModifiedAttributesOfClassInstance);
					fineDiffAttributeGroups.add(fdag);
				}
				
				for(FineDiffAttributeGroup fdag:fineDiffAttributeGroups) {
					fdag.attributesGroupByName = 
							fdag.allModifiedAttributesOfClassInstance.stream().collect(Collectors.groupingBy(f -> f.attributeName));	
					
					List<FineDiffReference> conflictsWithClassDiff = null;
					
					try {
							conflictsWithClassDiff=fineDiffReferences.stream().filter(f->
								f.diffReferenceChangeType == DiffReferenceChangeType.ClassChange &&
								fineDiffAttribute.originContainerMatch == f.originValueMatch)
								.collect(Collectors.toList());
					}
					catch(Exception ex) {				
					}
					if(conflictsWithClassDiff!=null) {
						fdag.conflictWithClassDiffs.addAll(conflictsWithClassDiff);
						//conflictsWithClassDiff.forEach(f->{f.conflictWithAttributeDiffs.add(fineDiffAttribute);});//It need to be removed 
						conflictsWithClassDiff.forEach(f->{f.conflictWithFineDiffAttributeGroup = fdag;});
					}	
				}
			}						
		}
		*/
	}

	//*************CREATE DS-FINE-GRANULAR-DIFFS************* 	
	public ArrayList<FineDiffReference> sortFineDiffReferenceByDependencies(ArrayList<FineDiffReference> diffs, boolean throwOnCycle /*= false */)
	 {
	     var sorted = new ArrayList<FineDiffReference>();
	     var visited = new HashSet<FineDiffReference>();

	     for( FineDiffReference item : diffs )
	         visit(item, visited, sorted, throwOnCycle);

	     return sorted;
	 }

	private void visit(FineDiffReference item, HashSet<FineDiffReference> visited, 
			 ArrayList<FineDiffReference> sorted, boolean throwOnCycle )
	 {
	     if(!visited.contains(item))
	     {
	         visited.add(item);

	         //for( FineDiffReference dep : item.dependsOn )
         	// 	Visit( dep, visited, sorted, throwOnCycle );
	         for(FineDiffReference d:item.dependsOn)
	             visit( d, visited, sorted, throwOnCycle);

	         sorted.add(item);
	     }
	     else
	     {
	         if( throwOnCycle && !sorted.contains(item) )
	             System.out.println( "Cyclic dependency found: " + item.toString() );
	     }
	 }
}