package mainPkg;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
//import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.emf.compare.domain.ICompareEditingDomain;
import org.eclipse.emf.compare.domain.impl.EMFCompareEditingDomain;
import org.eclipse.emf.compare.ide.ui.internal.configuration.EMFCompareConfiguration;
//org.eclipse.emf.compare.edit_4.3.1.201...
import org.eclipse.emf.compare.ide.ui.internal.editor.ComparisonEditorInput;
import org.eclipse.emf.compare.ide.ui.internal.editor.ComparisonScopeEditorInput;
//org.eclipse.emf.compare.ide.ui_4.4.1.201709090201.jar
import org.eclipse.compare.CompareConfiguration;

//import org.eclipse.emf.compare.ide.ui.internal.editor.ComparisonEditorInput;

//import org.eclipse.compare.CompareConfiguration;

import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;


public class dsCompareUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    @SuppressWarnings("restriction")
	public void showUI(IComparisonScope scope, Comparison comparison)
	{   	
	    AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);  
	    
		EMFCompareConfiguration configuration =  new EMFCompareConfiguration(new CompareConfiguration());//CompareConfiguration config = new CompareConfiguration();
		ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(scope.getLeft(), scope.getRight(), null);
		EMFCompare comparator = EMFCompare.builder().setPostProcessorRegistry(EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry()).build();
	      
		CompareEditorInput input = new ComparisonScopeEditorInput(configuration, editingDomain, adapterFactory, comparator, scope);
		
    	IWorkbenchWindow wnd = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    	IEditorPart editor = wnd.getActivePage().findEditor(input);
    	try {
			editor.init((IEditorSite) editor.getSite(), input);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		CompareUI.openCompareDialog(input);	 
		//CompareUI.openCompareEditor(input);	
		
	}
    
    public void showUI(Notifier left, Notifier right, Notifier ancestor) {
        EMFCompare comparator = EMFCompare.builder().build();
        IComparisonScope scope = EMFCompare.createDefaultScope(left, right, ancestor);
     
        ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(left, right, ancestor);
        AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        CompareEditorInput input = new ComparisonScopeEditorInput((EMFCompareConfiguration) new CompareConfiguration(), 
            editingDomain, adapterFactory, comparator, scope);
     
        CompareUI.openCompareDialog(input); // or CompareUI.openCompareEditor(input);
    }
    
    
    public void showUIPreComputed(Notifier left, Notifier right, Notifier ancestor) {
        EMFCompare comparator = EMFCompare.builder().build();
        Comparison comparison = comparator.compare(EMFCompare.createDefaultScope(left, right, ancestor));
     
        ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(left, right, ancestor);
        AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        CompareEditorInput input = new ComparisonEditorInput((EMFCompareConfiguration) new CompareConfiguration(), comparison, editingDomain, adapterFactory);
     
        CompareUI.openCompareDialog(input); // or CompareUI.openCompareEditor(input);
    }
    
}






//ComparisonEditorInput(EMFCompareConfiguration configuration, Comparison comparison, ICompareEditingDomain editingDomain, AdapterFactory adapterFactory) 
//EMFCompareConfiguration configuration= new EMFCompareConfiguration();		    
//CompareEditorInput input = new ComparisonEditorInput(new CompareConfiguration(), comparison, editingDomain, adapterFactory);		    
//CompareEditorInput input = new EMFCompareConfiguration(new CompareConfiguration(), comparison, editingDomain, adapterFactory);
//CompareEditorInput input = new EMFCompareConfiguration(new CompareConfiguration());
//CompareUI.openCompareDialog(input); // or CompareUI.openCompareEditor(input);		
// Launch EMFCompare UI with input.
//ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(left, right, null);
//AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
//IComparisonScope scope = new DefaultComparisonScope(left, right, null);	 
