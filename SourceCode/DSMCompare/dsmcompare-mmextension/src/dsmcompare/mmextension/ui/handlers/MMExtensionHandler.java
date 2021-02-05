package dsmcompare.mmextension.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import dsmcompare.mmextension.MMExtension;

public class MMExtensionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IFile            ecore  = this.getSelectedFile(event);
		if (ecore==null) return Status.CANCEL_STATUS;

		MMExtension extender    = new MMExtension();
		IFile       mmextension = extender.extend(ecore);
		try { mmextension.refreshLocal(IFile.DEPTH_ZERO, new NullProgressMonitor()); } catch (CoreException e) { e.printStackTrace(); }
		MessageDialog.openInformation(window.getShell(), "DSMCompare", "Result saved in " + mmextension.getName());
		
		return Status.OK_STATUS;
	}
	
	// it returns the file selected in the workspace
	protected IFile getSelectedFile (ExecutionEvent event) {
		IFile      file      = null;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
	    if (selection instanceof IStructuredSelection) {
	    	Object first = ((IStructuredSelection)selection).getFirstElement();
	    	if (first==null) 
	    		return null;
	    	IAdapterManager man = Platform.getAdapterManager();
	    	if (man==null) return null;
	        file         = man.getAdapter(first, IFile.class);
	        if (file == null) 
	            if (first instanceof IAdaptable)
	                file = (IFile)((IAdaptable)first).getAdapter(IFile.class);
	    }
	    return file;
	}
}
