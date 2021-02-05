package com.zadahmad.dsemfcompare.editor;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.conflict.DefaultConflictDetector;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.equi.DefaultEquiEngine;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.req.DefaultReqEngine;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


 @SuppressWarnings("all")
 public class DsEMFComparator {
	public 	EList<Diff> compareCore(final ResourceSet newResourceSet, final ResourceSet oldResourceSet) 
	{
	    final DefaultComparisonScope comparisonScope = this.getComparisonScope(newResourceSet, oldResourceSet,null);
	    final EMFCompare configuredEmfComparator = this.getConfiguredEmfCompareObjectBuilder().build();
	    final Comparison comparison = configuredEmfComparator.compare(comparisonScope);
	    return comparison.getDifferences();
	}
	  
	public 	Comparison compareCore2(final ResourceSet newResourceSet, final ResourceSet oldResourceSet) {
		  
		    final DefaultComparisonScope comparisonScope = this.getComparisonScope(newResourceSet, oldResourceSet,null);
		    final EMFCompare configuredEmfComparator = this.getConfiguredEmfCompareObjectBuilder().build();
		    final Comparison comparison = configuredEmfComparator.compare(comparisonScope);
		    return comparison;
		  }
	
	public 	Comparison compareCoreThreeWay(final ResourceSet left, final ResourceSet right, final ResourceSet origin) {
		  
	    final DefaultComparisonScope comparisonScope = this.getComparisonScope(left, right, origin);
	    final EMFCompare configuredEmfComparator = this.getConfiguredEmfCompareObjectBuilder().build();
	    final Comparison comparison = configuredEmfComparator.compare(comparisonScope);
	    return comparison;
	  }
		  
	private EMFCompare.Builder getConfiguredEmfCompareObjectBuilder() {
			  
		    EMFCompare.Builder _builder = EMFCompare.builder();	   
		    _builder.setMatchEngineFactoryRegistry(this.getMatchEngineFactoryRegistry());
		    _builder.setDiffEngine(this.getCustomDiffEngine());
		    _builder.setEquivalenceEngine(this.getCustomEquivalenceEngine());
		    _builder.setRequirementEngine(this.getCustomRequirementEngine());
		    _builder.setConflictDetector(this.getCustomConflictDetector());
		    return _builder;	    
		  }
		  
	private DefaultComparisonScope getComparisonScope(final ResourceSet newResourceSet, final ResourceSet oldResourceSet, final ResourceSet origin) {
			  
		    DefaultComparisonScope _defaultComparisonScope = new DefaultComparisonScope(newResourceSet, oldResourceSet, null);
		        
		    return _defaultComparisonScope;
		  }
		  
	private DefaultReqEngine getCustomRequirementEngine() {
			  
		    return new DefaultReqEngine() {
		      @Override
		      public void computeRequirements(final Comparison comparison, final Monitor monitor) {
		        return;
		      }
		    };
		  }
		  
	private DefaultEquiEngine getCustomEquivalenceEngine() {
			  
		    return new DefaultEquiEngine() {
		      @Override
		      public void computeEquivalences(final Comparison comparison, final Monitor monitor) {
		        return;
		      }
		    };
		  }
		  
	private DefaultConflictDetector getCustomConflictDetector() {
			  
		    return new DefaultConflictDetector() {
		      @Override
		      public void detect(final Comparison comparison, final Monitor monitor) {
		        return;
		      }
		    };
		  }
		  
	private DefaultDiffEngine getCustomDiffEngine() {
			  
		    DsDiffBuilder _customDiffBuilder = new DsDiffBuilder();
		    return new DefaultDiffEngine(_customDiffBuilder) {
		      @Override
		      protected FeatureFilter createFeatureFilter() {
		        return new DsFeatureFilter();
		      }
		    };
		  }
		  
	private IdentifierEObjectMatcher getCustomMatcher() {
			  
		    final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
		    final Function<EObject, String> _function = (EObject it) -> {
		      final Object FALL_BACK_TO_OTHER_MATCHERS = null;
		      String _switchResult = null;
		      boolean _matched = false;
		      if (!_matched) {
		        _switchResult = ((String)FALL_BACK_TO_OTHER_MATCHERS);
		      }
		      return _switchResult;
		    };
		    return new IdentifierEObjectMatcher(matcher, _function);
		  }
		  
	private MatchEngineFactoryRegistryImpl getMatchEngineFactoryRegistry() {
			  
		    IdentifierEObjectMatcher _customMatcher = this.getCustomMatcher();
		    DefaultComparisonFactory _comparisonFactory = this.getComparisonFactory();
		    final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(_customMatcher, _comparisonFactory);
		    matchEngineFactory.setRanking(20);
		    final MatchEngineFactoryRegistryImpl matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		    matchEngineRegistry.add(matchEngineFactory);
		    return matchEngineRegistry;
		  }
		  
	private DefaultComparisonFactory getComparisonFactory() {
			  
		    DefaultEqualityHelperFactory _defaultEqualityHelperFactory = new DefaultEqualityHelperFactory();
		    return new DefaultComparisonFactory(_defaultEqualityHelperFactory);
		  }
		
 }
